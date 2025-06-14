/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screentime;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
/**
 *
 * @author ASUS BLU11
 */
public class MainLayer extends javax.swing.JFrame {
    private ManagementEmployees me;
    private ProjectManagement pm;
    private static ArrayList<Employee> employees;
    private static ArrayList<Project> projects;
    
    public MainLayer(ManagementEmployees me, ProjectManagement pm) {
        this.me = me;
        this.pm = pm;
        this.employees = me != null ? me.getEmployees() : new ArrayList<>();
        this.projects = pm != null ? pm.getProjects() : new ArrayList<>();
        initComponents();
        setLocationRelativeTo(null);

        // Add action listeners to the buttons
        BtnHome.addActionListener(evt -> BtnHomeActionPerformed(evt));
        BtnManagementEmployees.addActionListener(evt -> BtnManagementEmployeesActionPerformed(evt));
        BtnProjectManagement.addActionListener(evt -> BtnProjectManagementActionPerformed(evt));
        BtnScreenTimeTracker.addActionListener(evt -> BtnScreenTimeTrackerActionPerformed(evt));
    }
    
    public MainLayer() {
        this(null, null); // Untuk back navigation
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        BtnProjectManagement = new javax.swing.JButton();
        BtnManagementEmployees = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        BtnScreenTimeTracker = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(684, 569));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(684, 569));
        jPanel1.setLayout(null);

        BtnProjectManagement.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        BtnProjectManagement.setForeground(new java.awt.Color(204, 0, 153));
        BtnProjectManagement.setText("Project Management");
        BtnProjectManagement.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 102)));
        BtnProjectManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProjectManagementActionPerformed(evt);
            }
        });
        jPanel1.add(BtnProjectManagement);
        BtnProjectManagement.setBounds(220, 190, 230, 50);

        BtnManagementEmployees.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        BtnManagementEmployees.setForeground(new java.awt.Color(204, 0, 153));
        BtnManagementEmployees.setText("Management Employees");
        BtnManagementEmployees.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 102)));
        BtnManagementEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManagementEmployeesActionPerformed(evt);
            }
        });
        jPanel1.add(BtnManagementEmployees);
        BtnManagementEmployees.setBounds(220, 280, 230, 50);

        BtnHome.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        BtnHome.setForeground(new java.awt.Color(204, 0, 153));
        BtnHome.setText("Home");
        BtnHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 102)));
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(BtnHome);
        BtnHome.setBounds(220, 100, 224, 50);

        BtnScreenTimeTracker.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        BtnScreenTimeTracker.setForeground(new java.awt.Color(204, 0, 153));
        BtnScreenTimeTracker.setText("Screen Time Tracker");
        BtnScreenTimeTracker.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 102)));
        BtnScreenTimeTracker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnScreenTimeTrackerActionPerformed(evt);
            }
        });
        jPanel1.add(BtnScreenTimeTracker);
        BtnScreenTimeTracker.setBounds(220, 370, 230, 50);

        jLabel1.setForeground(new java.awt.Color(255, 102, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/screentime/c1e7ef455823cd344bf00bee7456833d.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnManagementEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManagementEmployeesActionPerformed
        ManagementEmployees ManagementEmployees = new ManagementEmployees();
        ManagementEmployees.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnManagementEmployeesActionPerformed

    private void BtnProjectManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProjectManagementActionPerformed
        ProjectManagement ProjectManagement = new ProjectManagement();
        ProjectManagement.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnProjectManagementActionPerformed

    private void BtnScreenTimeTrackerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnScreenTimeTrackerActionPerformed
        if (me != null && pm != null && me.getEmployees() != null && pm.getProjects() != null) {
                new ScreenTimee(me.getEmployees(), pm.getProjects()).setVisible(true);
                this.dispose();
        } else {
                JOptionPane.showMessageDialog(this, "Gagal memuat data karyawan atau proyek!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnScreenTimeTrackerActionPerformed

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
    }//GEN-LAST:event_BtnHomeActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        SwingUtilities.invokeLater(() -> {
            ManagementEmployees me = new ManagementEmployees();
            ProjectManagement pm = new ProjectManagement();
            new MainLayer(me, pm).setVisible(true);
        });
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
            java.util.logging.Logger.getLogger(MainLayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnManagementEmployees;
    private javax.swing.JButton BtnProjectManagement;
    private javax.swing.JButton BtnScreenTimeTracker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
