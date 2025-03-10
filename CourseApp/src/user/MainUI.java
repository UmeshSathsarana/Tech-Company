/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user;

/**
 *
 * @author icbt
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuEmployee = new javax.swing.JMenuItem();
        mnuDepartment = new javax.swing.JMenuItem();
        mnuCLose = new javax.swing.JMenuItem();
        mnuLogin = new javax.swing.JMenu();
        mnuLogout = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuHelp1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Course App");

        mnuFile.setText("File");

        mnuEmployee.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuEmployee.setText("Employee");
        mnuEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEmployeeActionPerformed(evt);
            }
        });
        mnuFile.add(mnuEmployee);

        mnuDepartment.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuDepartment.setText("Department");
        mnuDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDepartmentActionPerformed(evt);
            }
        });
        mnuFile.add(mnuDepartment);

        mnuCLose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuCLose.setText("Close");
        mnuCLose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCLoseActionPerformed(evt);
            }
        });
        mnuFile.add(mnuCLose);

        jMenuBar1.add(mnuFile);

        mnuLogin.setText("Login");

        mnuLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuLogout.setText("Logout");
        mnuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogoutActionPerformed(evt);
            }
        });
        mnuLogin.add(mnuLogout);

        jMenuBar1.add(mnuLogin);

        mnuHelp.setText("Help");

        mnuHelp1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuHelp1.setText("About");
        mnuHelp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHelp1ActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuHelp1);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCLoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCLoseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuCLoseActionPerformed

    private void mnuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogoutActionPerformed
        // TODO add your handling code here:
        LoginUI logUI= new LoginUI();
        logUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuLogoutActionPerformed

    private void mnuEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEmployeeActionPerformed
        // TODO add your handling code here:
        EmployeeUI eui=new EmployeeUI();
        eui.setVisible(true);
        
    }//GEN-LAST:event_mnuEmployeeActionPerformed

    private void mnuDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDepartmentActionPerformed
        // TODO add your handling code here:
         DepartmentUI eui=new DepartmentUI();
        eui.setVisible(true);
    }//GEN-LAST:event_mnuDepartmentActionPerformed

    private void mnuHelp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHelp1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_mnuHelp1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuCLose;
    private javax.swing.JMenuItem mnuDepartment;
    private javax.swing.JMenuItem mnuEmployee;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuItem mnuHelp1;
    private javax.swing.JMenu mnuLogin;
    private javax.swing.JMenuItem mnuLogout;
    // End of variables declaration//GEN-END:variables
}
