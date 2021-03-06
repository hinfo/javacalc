/*
 * Project Calculator
 */
package view;

/**
 *
 * @author henrique
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    double valorInicial = 0.0;
    double valorFinal = 0.0;
    double resultado = 0.0;
    double memory = 0.0;
    double memMinus = 0.0;
    String operation;
    String re = "\\d";
    public Principal() {
        initComponents();
        TFDisplay.setText("");
        TFDisplay.requestFocus();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnDec = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnPerc = new javax.swing.JButton();
        btnCalc = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnMemAdd = new javax.swing.JButton();
        btnMemMinus = new javax.swing.JButton();
        btnMemClear = new javax.swing.JButton();
        TFMemory = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TFDisplay = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Calculator");
        setResizable(false);

        btn1.setMnemonic(java.awt.event.KeyEvent.VK_1);
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setMnemonic(java.awt.event.KeyEvent.VK_4);
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setMnemonic(java.awt.event.KeyEvent.VK_7);
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn2.setMnemonic(java.awt.event.KeyEvent.VK_2);
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn5.setMnemonic(java.awt.event.KeyEvent.VK_5);
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn8.setMnemonic(java.awt.event.KeyEvent.VK_8);
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btnZero.setMnemonic(java.awt.event.KeyEvent.VK_0);
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnDec.setMnemonic(java.awt.event.KeyEvent.VK_DECIMAL);
        btnDec.setText(".");
        btnDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecActionPerformed(evt);
            }
        });

        btn3.setMnemonic(java.awt.event.KeyEvent.VK_3);
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setMnemonic(java.awt.event.KeyEvent.VK_6);
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn9.setMnemonic(java.awt.event.KeyEvent.VK_9);
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnMinus.setMnemonic(java.awt.event.KeyEvent.VK_MINUS);
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnAdd.setMnemonic(java.awt.event.KeyEvent.VK_PLUS);
        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnMulti.setMnemonic(java.awt.event.KeyEvent.VK_ASTERISK);
        btnMulti.setText("*");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnDiv.setMnemonic(java.awt.event.KeyEvent.VK_SLASH);
        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnPerc.setText("%");
        btnPerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercActionPerformed(evt);
            }
        });

        btnCalc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCalc.setMnemonic(java.awt.event.KeyEvent.VK_ENTER);
        btnCalc.setText("=");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        btnClear.setMnemonic(java.awt.event.KeyEvent.VK_ESCAPE);
        btnClear.setText("ESC");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnMemAdd.setText("M+");
        btnMemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemAddActionPerformed(evt);
            }
        });

        btnMemMinus.setText("M-");
        btnMemMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemMinusActionPerformed(evt);
            }
        });

        btnMemClear.setText("MC");
        btnMemClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemClearActionPerformed(evt);
            }
        });

        TFMemory.setEditable(false);
        TFMemory.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TFMemory.setText("0.00");

        jLabel1.setText("Memory");

        TFDisplay.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        TFDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TFDisplay.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        TFDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFDisplayKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(TFDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(195, 195, 195)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TFMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnMulti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnZero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMinus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPerc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnMemMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMemClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMemAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(TFMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(TFDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMemAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMemMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPerc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMemClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        TFDisplay.setText(TFDisplay.getText() + 1);
    }//GEN-LAST:event_btn1ActionPerformed
   
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        TFDisplay.requestFocus();
        TFDisplay.setText("");
        valorInicial = 0.0;
    }//GEN-LAST:event_btnClearActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        TFDisplay.setText(TFDisplay.getText() + 2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        TFDisplay.setText(TFDisplay.getText() + 3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        TFDisplay.setText(TFDisplay.getText() + 4);

    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        TFDisplay.setText(TFDisplay.getText() + 5);

    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
                TFDisplay.setText(TFDisplay.getText() + 6);

    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
                TFDisplay.setText(TFDisplay.getText() + 7);

    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
                TFDisplay.setText(TFDisplay.getText() + 8);

    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        TFDisplay.setText(TFDisplay.getText() + 9);

    }//GEN-LAST:event_btn9ActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        TFDisplay.setText(TFDisplay.getText() + 0);

    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (TFDisplay.getText().equals("")){
            return;
        } 
        valorInicial = Double.parseDouble(TFDisplay.getText());
        TFDisplay.setText("");
        operation = "add";
        TFDisplay.requestFocus();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        if (TFDisplay.getText().equals("")){
            return;
            
        }
//        System.out.println(operation);
        valorFinal = Double.parseDouble(TFDisplay.getText());
//        System.out.println("final = " +valorFinal);
//        System.out.println("inicial = " + valorInicial);
//        System.out.println("memory = " + memory );
//        
//        System.out.println(operation);
//        System.out.println("final = " +valorFinal);
//        System.out.println("inicial = " + valorInicial);
//        System.out.println("memory = " + memory );
        
        switch (operation){
            case "add":
                resultado = valorInicial + valorFinal;
                TFDisplay.setText(""+resultado);
                break;
            case "minus":
                resultado = valorInicial - valorFinal;
                TFDisplay.setText(""+resultado);
                break;
            case "multiply":
                resultado = valorInicial * valorFinal;
                TFDisplay.setText(""+resultado);
                break;
            case "div":
                resultado = valorInicial / valorFinal;
                TFDisplay.setText(""+resultado);
                break;
            default:
                resultado = 0.0;
                TFDisplay.setText(""+resultado);
        }
//        TFDisplay.requestFocus();
        

    }//GEN-LAST:event_btnCalcActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        if (TFDisplay.getText().equals("")){
            return;
        }
        valorInicial = Double.parseDouble(TFDisplay.getText());
        TFDisplay.requestFocus();
        TFDisplay.setText("");
        operation = "minus";
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnPercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercActionPerformed
        
        if (TFDisplay.getText().equals("")){
            return;
        } else if (valorInicial == 0.0){
            return;
        }
        
        valorFinal = Double.parseDouble(TFDisplay.getText());
        if (operation.equals("add")){
            resultado = valorInicial + (valorInicial * (valorFinal/100));
            TFDisplay.setText(resultado+"");
        } else if (operation.equals("minus")){
            resultado = valorInicial - (valorInicial * (valorFinal/100));
            TFDisplay.setText(""+resultado);
        } else {
            TFDisplay.setText("0.00");
        }
        TFDisplay.requestFocus();
        
        
        
        
    }//GEN-LAST:event_btnPercActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        if (TFDisplay.getText().equals("")){
            return;
        }
        valorInicial = Double.parseDouble(TFDisplay.getText());
        TFDisplay.setText("");
        operation = "multiply";
        TFDisplay.requestFocus();
        
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        if (TFDisplay.getText().equals("")){
            return;
        }
        valorInicial = Double.parseDouble(TFDisplay.getText());
        TFDisplay.requestFocus();
        TFDisplay.setText("");
        operation = "div";
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnMemAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemAddActionPerformed
       if (TFDisplay.getText().equals("")){
            return;
        }
        memory += Double.parseDouble(TFDisplay.getText());
        TFMemory.setText(""+memory);
        TFDisplay.requestFocus();
    }//GEN-LAST:event_btnMemAddActionPerformed

    private void btnMemMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemMinusActionPerformed
       if (TFDisplay.getText().equals("")){
            return;
        } else if (memory == 0.0){
            return;
        }
       memory -= Double.parseDouble(TFDisplay.getText());
       TFMemory.setText(""+memory);
       TFDisplay.requestFocus();
    }//GEN-LAST:event_btnMemMinusActionPerformed

    private void btnMemClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemClearActionPerformed
       if (TFDisplay.getText().equals("")){
            return;
       }
       
       memory = 0.00;
       
       TFMemory.setText("0.00");
       TFDisplay.requestFocus();
        
    }//GEN-LAST:event_btnMemClearActionPerformed

    private void btnDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecActionPerformed
        if (TFDisplay.getText().equals("")){
            return;
        }
        TFDisplay.setText(TFDisplay.getText()+ ".");
    }//GEN-LAST:event_btnDecActionPerformed

    private void TFDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFDisplayKeyTyped
        String validos = "0123456789.";
        if (!validos.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_TFDisplayKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField TFDisplay;
    private javax.swing.JTextField TFMemory;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDec;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnMemAdd;
    private javax.swing.JButton btnMemClear;
    private javax.swing.JButton btnMemMinus;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPerc;
    private javax.swing.JButton btnZero;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
