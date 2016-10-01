package my.javaapplicationcalculator;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CalculatorJFrame extends javax.swing.JFrame {

    public CalculatorJFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMainWindow = new javax.swing.JLabel();
        jButtonDigit3 = new javax.swing.JButton();
        jButtonDigit7 = new javax.swing.JButton();
        jButtonDigit5 = new javax.swing.JButton();
        jButtonDigit6 = new javax.swing.JButton();
        jButtonDigit1 = new javax.swing.JButton();
        jButtonDigit4 = new javax.swing.JButton();
        jButtonDigit2 = new javax.swing.JButton();
        jButtonDigit8 = new javax.swing.JButton();
        jButtonDigit0 = new javax.swing.JButton();
        jButtonDigit9 = new javax.swing.JButton();
        jButtonNegativePositiveNumber = new javax.swing.JButton();
        jButtonPercent = new javax.swing.JButton();
        jButtonAllClear = new javax.swing.JButton();
        jButtonMultiplication = new javax.swing.JButton();
        jButtonSubtraction = new javax.swing.JButton();
        jButtonAddition = new javax.swing.JButton();
        jButtonDigit16 = new javax.swing.JButton();
        jButtonDigit17 = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabelMainWindow.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMainWindow.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabelMainWindow.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMainWindow.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMainWindow.setText("0");
        jLabelMainWindow.setToolTipText("");
        jLabelMainWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelMainWindow.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelMainWindow.setName(""); // NOI18N
        jLabelMainWindow.setOpaque(true);

        jButtonDigit3.setBackground(new java.awt.Color(153, 153, 153));
        jButtonDigit3.setText("3");
        jButtonDigit3.setContentAreaFilled(false);
        jButtonDigit3.setOpaque(true);
        jButtonDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDigitActionPerformed(evt);
            }
        });

        jButtonDigit7.setBackground(new java.awt.Color(153, 153, 153));
        jButtonDigit7.setText("7");
        jButtonDigit7.setContentAreaFilled(false);
        jButtonDigit7.setOpaque(true);
        jButtonDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDigitActionPerformed(evt);
            }
        });

        jButtonDigit5.setBackground(new java.awt.Color(153, 153, 153));
        jButtonDigit5.setText("5");
        jButtonDigit5.setContentAreaFilled(false);
        jButtonDigit5.setOpaque(true);
        jButtonDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDigitActionPerformed(evt);
            }
        });

        jButtonDigit6.setBackground(new java.awt.Color(153, 153, 153));
        jButtonDigit6.setText("6");
        jButtonDigit6.setContentAreaFilled(false);
        jButtonDigit6.setOpaque(true);
        jButtonDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDigitActionPerformed(evt);
            }
        });

        jButtonDigit1.setBackground(new java.awt.Color(153, 153, 153));
        jButtonDigit1.setText("1");
        jButtonDigit1.setContentAreaFilled(false);
        jButtonDigit1.setOpaque(true);
        jButtonDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDigitActionPerformed(evt);
            }
        });

        jButtonDigit4.setBackground(new java.awt.Color(153, 153, 153));
        jButtonDigit4.setText("4");
        jButtonDigit4.setContentAreaFilled(false);
        jButtonDigit4.setOpaque(true);
        jButtonDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDigitActionPerformed(evt);
            }
        });

        jButtonDigit2.setBackground(new java.awt.Color(153, 153, 153));
        jButtonDigit2.setText("2");
        jButtonDigit2.setContentAreaFilled(false);
        jButtonDigit2.setOpaque(true);
        jButtonDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDigitActionPerformed(evt);
            }
        });

        jButtonDigit8.setBackground(new java.awt.Color(153, 153, 153));
        jButtonDigit8.setText("8");
        jButtonDigit8.setContentAreaFilled(false);
        jButtonDigit8.setOpaque(true);
        jButtonDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDigitActionPerformed(evt);
            }
        });

        jButtonDigit0.setBackground(new java.awt.Color(153, 153, 153));
        jButtonDigit0.setText("0");
        jButtonDigit0.setContentAreaFilled(false);
        jButtonDigit0.setOpaque(true);
        jButtonDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDigitActionPerformed(evt);
            }
        });

        jButtonDigit9.setBackground(new java.awt.Color(153, 153, 153));
        jButtonDigit9.setText("9");
        jButtonDigit9.setContentAreaFilled(false);
        jButtonDigit9.setOpaque(true);
        jButtonDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDigitActionPerformed(evt);
            }
        });

        jButtonNegativePositiveNumber.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNegativePositiveNumber.setText("+/-");
        jButtonNegativePositiveNumber.setContentAreaFilled(false);
        jButtonNegativePositiveNumber.setOpaque(true);
        jButtonNegativePositiveNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperationActionPerformed(evt);
            }
        });

        jButtonPercent.setBackground(new java.awt.Color(102, 102, 102));
        jButtonPercent.setText("%");
        jButtonPercent.setContentAreaFilled(false);
        jButtonPercent.setOpaque(true);

        jButtonAllClear.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAllClear.setText("AC");
        jButtonAllClear.setContentAreaFilled(false);
        jButtonAllClear.setOpaque(true);

        jButtonMultiplication.setBackground(new java.awt.Color(255, 153, 0));
        jButtonMultiplication.setText("x");
        jButtonMultiplication.setContentAreaFilled(false);
        jButtonMultiplication.setOpaque(true);
        jButtonMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMathematicalOperationsActionPerformed(evt);
            }
        });

        jButtonSubtraction.setBackground(new java.awt.Color(255, 153, 0));
        jButtonSubtraction.setText("-");
        jButtonSubtraction.setContentAreaFilled(false);
        jButtonSubtraction.setOpaque(true);
        jButtonSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMathematicalOperationsActionPerformed(evt);
            }
        });

        jButtonAddition.setBackground(new java.awt.Color(255, 153, 0));
        jButtonAddition.setText("+");
        jButtonAddition.setContentAreaFilled(false);
        jButtonAddition.setOpaque(true);
        jButtonAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMathematicalOperationsActionPerformed(evt);
            }
        });

        jButtonDigit16.setBackground(new java.awt.Color(255, 153, 0));
        jButtonDigit16.setText("=");
        jButtonDigit16.setContentAreaFilled(false);
        jButtonDigit16.setOpaque(true);

        jButtonDigit17.setBackground(new java.awt.Color(153, 153, 153));
        jButtonDigit17.setText(",");
        jButtonDigit17.setContentAreaFilled(false);
        jButtonDigit17.setOpaque(true);

        jButtonDivision.setBackground(new java.awt.Color(255, 153, 0));
        jButtonDivision.setText("/");
        jButtonDivision.setContentAreaFilled(false);
        jButtonDivision.setOpaque(true);
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMathematicalOperationsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMainWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAllClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNegativePositiveNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonDigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDigit17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDigit16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelMainWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNegativePositiveNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAllClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDigit16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDigit17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean numberOfInput = false;
    private double displayValue;
    public double getDisplayValue(String stringDisplayValue){
        return Double.parseDouble(stringDisplayValue);
    }
    public void setDisplayValue(double doubleDisplayValue){
        NumberFormat nf = new DecimalFormat("#.#####");
        jLabelMainWindow.setText(nf.format(doubleDisplayValue));
    }
        
    

    
    private void jButtonDigitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDigitActionPerformed
        String currentDigit = evt.getActionCommand();
        if (numberOfInput){
            String textCurrentInLabel = jLabelMainWindow.getText();
            jLabelMainWindow.setText(textCurrentInLabel + currentDigit);
        }
        else{
            if (currentDigit.equalsIgnoreCase("0"))
                return;
            else
                jLabelMainWindow.setText(currentDigit);
        }
        numberOfInput = true;
    }//GEN-LAST:event_jButtonDigitActionPerformed
    
    private void jButtonMathematicalOperationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMathematicalOperationsActionPerformed
        
    }//GEN-LAST:event_jButtonMathematicalOperationsActionPerformed

    private void jButtonOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperationActionPerformed
        String mathematicalOperation = evt.getActionCommand();
        if (mathematicalOperation.equalsIgnoreCase("+/-")){
            displayValue = getDisplayValue(jLabelMainWindow.getText());
            setDisplayValue(displayValue * (-1));
        }
    }//GEN-LAST:event_jButtonOperationActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CalculatorJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddition;
    private javax.swing.JButton jButtonAllClear;
    private javax.swing.JButton jButtonDigit0;
    private javax.swing.JButton jButtonDigit1;
    private javax.swing.JButton jButtonDigit16;
    private javax.swing.JButton jButtonDigit17;
    private javax.swing.JButton jButtonDigit2;
    private javax.swing.JButton jButtonDigit3;
    private javax.swing.JButton jButtonDigit4;
    private javax.swing.JButton jButtonDigit5;
    private javax.swing.JButton jButtonDigit6;
    private javax.swing.JButton jButtonDigit7;
    private javax.swing.JButton jButtonDigit8;
    private javax.swing.JButton jButtonDigit9;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonMultiplication;
    private javax.swing.JButton jButtonNegativePositiveNumber;
    private javax.swing.JButton jButtonPercent;
    private javax.swing.JButton jButtonSubtraction;
    private javax.swing.JLabel jLabelMainWindow;
    // End of variables declaration//GEN-END:variables
}
