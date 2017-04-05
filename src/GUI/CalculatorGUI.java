/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Calculator.Calculation;

/**
 *
 * @author Thien
 */
public class CalculatorGUI extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorGUI
     */
    public CalculatorGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aField = new javax.swing.JTextField();
        bField = new javax.swing.JTextField();
        plusButton = new javax.swing.JButton();
        mulButton = new javax.swing.JButton();
        divButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TwoLineCalculator");

        aField.setText("2");
        aField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aFieldActionPerformed(evt);
            }
        });

        bField.setText("1");
        bField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFieldActionPerformed(evt);
            }
        });

        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        mulButton.setText("x");
        mulButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulButtonActionPerformed(evt);
            }
        });

        divButton.setText("/");
        divButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divButtonActionPerformed(evt);
            }
        });

        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        resultLabel.setText("Result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bField, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(plusButton)
                            .addGap(18, 18, 18)
                            .addComponent(minusButton)
                            .addGap(18, 18, 18)
                            .addComponent(mulButton)
                            .addGap(18, 18, 18)
                            .addComponent(divButton))
                        .addComponent(aField)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(bField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plusButton)
                    .addComponent(minusButton)
                    .addComponent(mulButton)
                    .addComponent(divButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aFieldActionPerformed

    private void bFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bFieldActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        try{
            String a = aField.getText();
            String b = bField.getText();
            Double result = Calculation.plus(a, b);
            String str_result = String.valueOf(result);
            str_result = "Result: " + str_result;
            resultLabel.setText(str_result);
        }catch (Exception e){
            resultLabel.setText("Result: error");
        }
    }//GEN-LAST:event_plusButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        try{
            String a = aField.getText();
            String b = bField.getText();
            Double result = Calculation.minus(a, b);
            String str_result = String.valueOf(result);
            str_result = "Result: " + str_result;
            resultLabel.setText(str_result);
        }catch(Exception e){
            resultLabel.setText("Result: error");
        }   
    }//GEN-LAST:event_minusButtonActionPerformed

    private void mulButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulButtonActionPerformed
        try{
            String a = aField.getText();
            String b = bField.getText();
            Double result = Calculation.mul(a, b);
            String str_result = String.valueOf(result);
            str_result = "Result: " + str_result;
            resultLabel.setText(str_result);
        }catch(Exception e){
            resultLabel.setText("Result: error");
        }
        
    }//GEN-LAST:event_mulButtonActionPerformed

    private void divButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divButtonActionPerformed
        try {
            String a = aField.getText();
            String b = bField.getText();
            Double result = Calculation.div(a, b);
            String str_result = String.valueOf(result);
            str_result = "Result: " + str_result;
            resultLabel.setText(str_result);
        }catch(Exception e){
             resultLabel.setText("Result: error");
        }
    }//GEN-LAST:event_divButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aField;
    private javax.swing.JTextField bField;
    private javax.swing.JButton divButton;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton mulButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JLabel resultLabel;
    // End of variables declaration//GEN-END:variables
}
