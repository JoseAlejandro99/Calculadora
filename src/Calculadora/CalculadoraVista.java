package Calculadora;
//@author Jose Alejandro

public class CalculadoraVista extends javax.swing.JFrame {

    double valor1, valor2;

    String signo = "";
    String texfield;

    double resultado;

    String Error1 = "Infinity";
    String Error2 = "NaN";

    public CalculadoraVista() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIgual = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnNum7 = new javax.swing.JButton();
        btnNum8 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnBorrarCampo = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDivicion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldOperaciones = new javax.swing.JLabel();
        jLabelOperaciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIgual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setPreferredSize(new java.awt.Dimension(60, 60));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnNum0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum0.setText("0");
        btnNum0.setMaximumSize(new java.awt.Dimension(80, 80));
        btnNum0.setMinimumSize(new java.awt.Dimension(80, 80));
        btnNum0.setPreferredSize(new java.awt.Dimension(80, 80));
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum0ActionPerformed(evt);
            }
        });

        btnPunto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPunto.setText(".");
        btnPunto.setPreferredSize(new java.awt.Dimension(60, 60));
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnNum1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum1.setText("1");
        btnNum1.setPreferredSize(new java.awt.Dimension(60, 60));
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum2.setText("2");
        btnNum2.setPreferredSize(new java.awt.Dimension(60, 60));
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum2ActionPerformed(evt);
            }
        });

        btnNum3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum3.setText("3");
        btnNum3.setPreferredSize(new java.awt.Dimension(60, 60));
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum3ActionPerformed(evt);
            }
        });

        btnNum4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum4.setText("4");
        btnNum4.setPreferredSize(new java.awt.Dimension(60, 60));
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum4ActionPerformed(evt);
            }
        });

        btnNum5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum5.setText("5");
        btnNum5.setPreferredSize(new java.awt.Dimension(60, 60));
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum5ActionPerformed(evt);
            }
        });

        btnNum6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum6.setText("6");
        btnNum6.setPreferredSize(new java.awt.Dimension(60, 60));
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum6ActionPerformed(evt);
            }
        });

        btnNum7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum7.setText("7");
        btnNum7.setPreferredSize(new java.awt.Dimension(60, 60));
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum7ActionPerformed(evt);
            }
        });

        btnNum8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum8.setText("8");
        btnNum8.setPreferredSize(new java.awt.Dimension(60, 60));
        btnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum8ActionPerformed(evt);
            }
        });

        btnNum9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNum9.setText("9");
        btnNum9.setPreferredSize(new java.awt.Dimension(60, 60));
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum9ActionPerformed(evt);
            }
        });

        btnBorrarCampo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBorrarCampo.setText("CE");
        btnBorrarCampo.setPreferredSize(new java.awt.Dimension(60, 60));
        btnBorrarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCampoActionPerformed(evt);
            }
        });

        btnBorrarTodo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBorrarTodo.setText("C");
        btnBorrarTodo.setPreferredSize(new java.awt.Dimension(60, 60));
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBorrar.setText("<=");
        btnBorrar.setPreferredSize(new java.awt.Dimension(119, 60));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnSuma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSuma.setText("+");
        btnSuma.setPreferredSize(new java.awt.Dimension(60, 60));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnResta.setText("-");
        btnResta.setPreferredSize(new java.awt.Dimension(60, 60));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnMultiplicar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMultiplicar.setText("X");
        btnMultiplicar.setPreferredSize(new java.awt.Dimension(60, 60));
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnDivicion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDivicion.setText("/");
        btnDivicion.setPreferredSize(new java.awt.Dimension(60, 60));
        btnDivicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivicionActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldOperaciones.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldOperaciones.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldOperaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jTextFieldOperaciones.setText("0");

        jLabelOperaciones.setBackground(new java.awt.Color(255, 255, 255));
        jLabelOperaciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelOperaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOperaciones.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldOperaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(jLabelOperaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnNum0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBorrarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDivicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            String Valor0 = jTextFieldOperaciones.getText();
            if (Valor0.equals("0")) {
                jTextFieldOperaciones.setText("0");
            } else {
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "0");
            }
        }

    }//GEN-LAST:event_btnNum0ActionPerformed

    private void btnBorrarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCampoActionPerformed
        //@author Jose Alejandro
        jTextFieldOperaciones.setText("0");
        valor1 = 0.0;
    }//GEN-LAST:event_btnBorrarCampoActionPerformed

    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            String valor01 = jTextFieldOperaciones.getText();
            if (valor01.equals("0")) {
                jTextFieldOperaciones.setText("");
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "1");
            } else {
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "1");
            }
        }
    }//GEN-LAST:event_btnNum1ActionPerformed

    private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            String valor02 = jTextFieldOperaciones.getText();
            if (valor02.equals("0")) {
                jTextFieldOperaciones.setText("");
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "2");
            } else {
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "2");
            }
        }
    }//GEN-LAST:event_btnNum2ActionPerformed

    private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            String valor02 = jTextFieldOperaciones.getText();
            if (valor02.equals("0")) {
                jTextFieldOperaciones.setText("");
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "3");
            } else {
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "3");
            }
        }
    }//GEN-LAST:event_btnNum3ActionPerformed

    private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            String valor02 = jTextFieldOperaciones.getText();
            if (valor02.equals("0")) {
                jTextFieldOperaciones.setText("");
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "4");
            } else {
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "4");
            }
        }
    }//GEN-LAST:event_btnNum4ActionPerformed

    private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            String valor02 = jTextFieldOperaciones.getText();
            if (valor02.equals("0")) {
                jTextFieldOperaciones.setText("");
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "5");
            } else {
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "5");
            }
        }
    }//GEN-LAST:event_btnNum5ActionPerformed

    private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            String valor02 = jTextFieldOperaciones.getText();
            if (valor02.equals("0")) {
                jTextFieldOperaciones.setText("");
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "6");
            } else {
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "6");
            }
        }
    }//GEN-LAST:event_btnNum6ActionPerformed

    private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            String valor02 = jTextFieldOperaciones.getText();
            if (valor02.equals("0")) {
                jTextFieldOperaciones.setText("");
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "7");
            } else {
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "7");
            }
        }
    }//GEN-LAST:event_btnNum7ActionPerformed

    private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed
        // TODO add your handling code here:
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            String valor02 = jTextFieldOperaciones.getText();
            if (valor02.equals("0")) {
                jTextFieldOperaciones.setText("");
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "8");
            } else {
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "8");
            }
        }
    }//GEN-LAST:event_btnNum8ActionPerformed

    private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            String valor02 = jTextFieldOperaciones.getText();
            if (valor02.equals("0")) {
                jTextFieldOperaciones.setText("");
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "9");
            } else {
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + "9");
            }
        }
    }//GEN-LAST:event_btnNum9ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            String valorConPunto = jTextFieldOperaciones.getText();
            String valorPunto = ".";
            int buscar = valorConPunto.indexOf(valorPunto);
            if (buscar != -1) {
            } else {
                jTextFieldOperaciones.setText(jTextFieldOperaciones.getText() + ".");
            }
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        // TODO add your handling code here:
        jLabelOperaciones.setText("0");
        jTextFieldOperaciones.setText("0");
        valor1 = 0.0;
        valor2 = 0.0;

    }//GEN-LAST:event_btnBorrarTodoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            String cadena = jTextFieldOperaciones.getText();
            if (cadena.length() > 1) {
                cadena = cadena.substring(0, cadena.length() - 1);
                jTextFieldOperaciones.setText(cadena);
            } else {
                jTextFieldOperaciones.setText("0");
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jTextFieldOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOperacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOperacionesActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            // Codigo de boton Sumar
            String cadena = jLabelOperaciones.getText();

            if (cadena.equals("0")) {
                texfield = jTextFieldOperaciones.getText();

                if (texfield.length() == 1) {
                    jLabelOperaciones.setText(texfield);
                } else {
                    String Uvalor = texfield.substring(texfield.length() - 2, texfield.length());
                    if (Uvalor.equals(".0")) {
                        String Rfinal = texfield;
                        Rfinal = Rfinal.substring(0, Rfinal.length() - 2);
                        jLabelOperaciones.setText(Rfinal);
                    } else {
                        jLabelOperaciones.setText(texfield);
                    }
                }
                jTextFieldOperaciones.setText("0");
            } else {
                String Rfinal = Calculadora();
                String resultadofinal = Rfinal.substring(Rfinal.length() - 2, Rfinal.length());

                if (resultadofinal.equals(".0")) {
                    Rfinal = Rfinal.substring(0, Rfinal.length() - 2);
                    jLabelOperaciones.setText(Rfinal);
                    jTextFieldOperaciones.setText("0");

                } else {
                    jLabelOperaciones.setText(Rfinal);
                    jTextFieldOperaciones.setText("0");
                }
            }
            signo = "+";
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void jTextFieldOperacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldOperacionesKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldOperacionesKeyTyped

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            // Codigo de boton Restar
            String cadena = jLabelOperaciones.getText();

            if (cadena.equals("0")) {
                texfield = jTextFieldOperaciones.getText();

                if (texfield.length() == 1) {
                    jLabelOperaciones.setText(texfield);
                } else {
                    String Uvalor = texfield.substring(texfield.length() - 2, texfield.length());
                    if (Uvalor.equals(".0")) {
                        String Rfinal = texfield;
                        Rfinal = Rfinal.substring(0, Rfinal.length() - 2);
                        jLabelOperaciones.setText(Rfinal);
                    } else {
                        jLabelOperaciones.setText(texfield);
                    }
                }
                jTextFieldOperaciones.setText("0");
            } else {
                String Rfinal = Calculadora();
                String resultadofinal = Rfinal.substring(Rfinal.length() - 2, Rfinal.length());

                if (resultadofinal.equals(".0")) {
                    Rfinal = Rfinal.substring(0, Rfinal.length() - 2);
                    jLabelOperaciones.setText(Rfinal);
                    jTextFieldOperaciones.setText("0");

                } else {
                    jLabelOperaciones.setText(Rfinal);
                    jTextFieldOperaciones.setText("0");
                }
            }
            signo = "-";
        }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            // Codigo de boton Multiplicar
            String cadena = jLabelOperaciones.getText();

            if (cadena.equals("0")) {
                texfield = jTextFieldOperaciones.getText();

                if (texfield.length() == 1) {
                    jLabelOperaciones.setText(texfield);
                } else {
                    String Uvalor = texfield.substring(texfield.length() - 2, texfield.length());
                    if (Uvalor.equals(".0")) {
                        String Rfinal = texfield;
                        Rfinal = Rfinal.substring(0, Rfinal.length() - 2);
                        jLabelOperaciones.setText(Rfinal);
                    } else {
                        jLabelOperaciones.setText(texfield);
                    }
                }
                jTextFieldOperaciones.setText("0");
            } else {
                String Rfinal = Calculadora();
                String resultadofinal = Rfinal.substring(Rfinal.length() - 2, Rfinal.length());

                if (resultadofinal.equals(".0")) {
                    Rfinal = Rfinal.substring(0, Rfinal.length() - 2);
                    jLabelOperaciones.setText(Rfinal);
                    jTextFieldOperaciones.setText("0");

                } else {
                    jLabelOperaciones.setText(Rfinal);
                    jTextFieldOperaciones.setText("0");
                }
            }
            signo = "x";
        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDivicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivicionActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            // Codigo de boton Dividir
            String cadena = jLabelOperaciones.getText();

            if (cadena.equals("0")) {
                texfield = jTextFieldOperaciones.getText();

                if (texfield.length() == 1) {
                    jLabelOperaciones.setText(texfield);
                } else {
                    String Uvalor = texfield.substring(texfield.length() - 2, texfield.length());
                    if (Uvalor.equals(".0")) {
                        String Rfinal = texfield;
                        Rfinal = Rfinal.substring(0, Rfinal.length() - 2);
                        jLabelOperaciones.setText(Rfinal);
                    } else {
                        jLabelOperaciones.setText(texfield);
                    }
                }
                jTextFieldOperaciones.setText("0");
            } else {
                String Rfinal = Calculadora();
                String resultadofinal = Rfinal.substring(Rfinal.length() - 2, Rfinal.length());

                if (resultadofinal.equals(".0")) {
                    Rfinal = Rfinal.substring(0, Rfinal.length() - 2);
                    jLabelOperaciones.setText(Rfinal);
                    jTextFieldOperaciones.setText("0");

                } else {
                    jLabelOperaciones.setText(Rfinal);
                    jTextFieldOperaciones.setText("0");
                }
            }
            signo = "/";
        }
    }//GEN-LAST:event_btnDivicionActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        //@author Jose Alejandro
        if (jTextFieldOperaciones.getText().equals(Error1) || jTextFieldOperaciones.getText().equals(Error2)) {

        } else {
            //fomula del boton igual
            texfield = Calculadora();
            String resultadofinal = texfield.substring(texfield.length() - 2, texfield.length());
            if (jLabelOperaciones.getText().equals("0")) {
            } else {
                if (resultadofinal.equals(".0")) {
                    String Rfinal = texfield.substring(0, texfield.length() - 2);
                    jTextFieldOperaciones.setText(Rfinal);
                    jLabelOperaciones.setText("0");
                } else {
                    jTextFieldOperaciones.setText(texfield);
                    jLabelOperaciones.setText("0");
                }
            }
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    public String Calculadora() {
        //@author Jose Alejandro
        valor1 = Double.parseDouble(jTextFieldOperaciones.getText());
        valor2 = Double.parseDouble(jLabelOperaciones.getText());
        if (signo.equals("-")) {
            resultado = valor2 - valor1;
        }
        if (signo.equals("+")) {
            resultado = valor2 + valor1;
        }
        if (signo.equals("x")) {
            resultado = valor2 * valor1;
        }
        if (signo.equals("/")) {
            resultado = valor2 / valor1;
        }
        return Double.toString(resultado);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //@author Jose Alejandro
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
            java.util.logging.Logger.getLogger(CalculadoraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraVista().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarCampo;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnDivicion;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabelOperaciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTextFieldOperaciones;
    // End of variables declaration//GEN-END:variables
    //@author Jose Alejandro
}
