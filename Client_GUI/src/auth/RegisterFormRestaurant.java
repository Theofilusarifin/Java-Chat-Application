/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package auth;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI-PC
 */
public class RegisterFormRestaurant extends javax.swing.JFrame {

    Socket s;
    BufferedReader msgFromServer;
    DataOutputStream msgToServer;
    String ownerData;

    public RegisterFormRestaurant() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public RegisterFormRestaurant(String _ownerData) {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            //buat penerima dan pengirim dari socket
            msgFromServer = new BufferedReader(new InputStreamReader(LoginForm.s.getInputStream()));
            msgToServer = new DataOutputStream(LoginForm.s.getOutputStream());

            // tangkap data owner yang dikirim dari registrasi owner
            ownerData = _ownerData;
        } catch (Exception ex) {
            System.out.println("FormRegisterRestaurant Constructor, Error: " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPhone = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtCloseMinute = new javax.swing.JTextField();
        btnRegisterRestaurant = new javax.swing.JButton();
        lblPhone1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtTablesCount = new javax.swing.JTextField();
        lblBackToLogin = new javax.swing.JLabel();
        lblResgisterRest = new javax.swing.JLabel();
        lblPhone2 = new javax.swing.JLabel();
        txtOpenMinute = new javax.swing.JTextField();
        txtPeoplePerTable = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtOpenHour = new javax.swing.JTextField();
        txtRestaurantName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAddress = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtCloseHour = new javax.swing.JTextField();
        lblQstion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 26, 74));

        lblPhone.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setText("Phone Number");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(":");

        txtPhone.setBackground(new java.awt.Color(242, 242, 242));
        txtPhone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtCloseMinute.setBackground(new java.awt.Color(242, 242, 242));
        txtCloseMinute.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnRegisterRestaurant.setBackground(new java.awt.Color(244, 203, 14));
        btnRegisterRestaurant.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegisterRestaurant.setForeground(new java.awt.Color(2, 26, 74));
        btnRegisterRestaurant.setText("REGISTER");
        btnRegisterRestaurant.setBorderPainted(false);
        btnRegisterRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterRestaurantActionPerformed(evt);
            }
        });

        lblPhone1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPhone1.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone1.setText("Tables Count");

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(2, 26, 74));
        btnBack.setText("BACK");
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtTablesCount.setBackground(new java.awt.Color(242, 242, 242));
        txtTablesCount.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblBackToLogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblBackToLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblBackToLogin.setText("Login");
        lblBackToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackToLoginMouseClicked(evt);
            }
        });

        lblResgisterRest.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblResgisterRest.setForeground(new java.awt.Color(255, 255, 255));
        lblResgisterRest.setText("Register Restaurant Data");

        lblPhone2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPhone2.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone2.setText("Peoples per Table");

        txtOpenMinute.setBackground(new java.awt.Color(242, 242, 242));
        txtOpenMinute.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtPeoplePerTable.setBackground(new java.awt.Color(242, 242, 242));
        txtPeoplePerTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Restaurant Name");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(":");

        lblAddress.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address");

        txtOpenHour.setBackground(new java.awt.Color(242, 242, 242));
        txtOpenHour.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtRestaurantName.setBackground(new java.awt.Color(242, 242, 242));
        txtRestaurantName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Open Hour");

        txtAreaAddress.setBackground(new java.awt.Color(242, 242, 242));
        txtAreaAddress.setColumns(20);
        txtAreaAddress.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAreaAddress.setRows(5);
        jScrollPane1.setViewportView(txtAreaAddress);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Close Hour");

        txtCloseHour.setBackground(new java.awt.Color(242, 242, 242));
        txtCloseHour.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblQstion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblQstion.setForeground(new java.awt.Color(255, 255, 255));
        lblQstion.setText("Restaurant already registered?");
        lblQstion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQstion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQstionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRestaurantName)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPhone2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPhone1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPhone, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtTablesCount, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPeoplePerTable, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCloseHour, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCloseMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtOpenHour, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtOpenMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(lblQstion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBackToLogin)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblResgisterRest)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnRegisterRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblResgisterRest)
                .addGap(27, 27, 27)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPhone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOpenHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtOpenMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCloseHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCloseMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 17, Short.MAX_VALUE)
                .addComponent(lblPhone1)
                .addGap(5, 5, 5)
                .addComponent(txtTablesCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPhone2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPeoplePerTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegisterRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBackToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQstion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterRestaurantActionPerformed
        try {
            if (txtRestaurantName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "You must fill your name");

            } else if (txtAreaAddress.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "You must fill your name");

            } else if (txtPhone.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "You must fill your name");

            } else if (txtRestaurantName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "You must fill your name");

            } else if (txtRestaurantName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "You must fill your name");

            }
            msgToServer.writeBytes("REGISTER//" + ownerData + "\n");

            String result;
            result = msgFromServer.readLine();

            String[] messages = null;
            messages = result.split(";-;");

            String status = "";
            status = messages[0];

            if (status.equals("RegSuccess")) {
                msgToServer.writeBytes("REGISTER_RESTAURANT//"
                        + txtRestaurantName.getText() + ";-;" + txtAreaAddress.getText() + ";-;" + txtPhone.getText() + ";-;"
                        + txtOpenHour.getText() + ":" + txtOpenMinute.getText() + ":00" + ";-;"
                        + txtCloseHour.getText() + ":" + txtCloseMinute.getText() + ":00" + ";-;"
                        + txtTablesCount.getText() + ";-;" + txtPeoplePerTable.getText() + ";-;" + ownerData + "\n");

                String answer;
                answer = msgFromServer.readLine();

                String[] msgs = null;
                msgs = answer.split(";-;");

                String msg = "";
                msg = msgs[0];

                if (msg.equals("RegSuccess")) {
                    JOptionPane.showMessageDialog(this, "Congratulations!!!, Your Restaurant " + msgs[1] + " has been successfully registered.");

                } else if (msg.equals("RegFailed")) {
                    JOptionPane.showMessageDialog(this, "Sorry, your Registration Failed, Restaurant with name " + msgs[1] + " has been taken.");
                }

            } else if (status.equals("RegFailed")) {
                JOptionPane.showMessageDialog(this, "Sorry " + messages[1] + ", Your Registration Failed, Your username has been taken.");
            }

        } catch (IOException e) {
            System.out.println("RegisterForm btnRegister, Error; " + e);
            Logger.getLogger(RegisterFormRestaurant.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnRegisterRestaurantActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new RegisterFormOwner(ownerData).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void lblBackToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackToLoginMouseClicked
        new LoginForm(LoginForm.s).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackToLoginMouseClicked

    private void lblQstionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQstionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblQstionMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RegisterFormRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegisterFormRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegisterFormRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegisterFormRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegisterFormRestaurant().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegisterRestaurant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBackToLogin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPhone1;
    private javax.swing.JLabel lblPhone2;
    private javax.swing.JLabel lblQstion;
    private javax.swing.JLabel lblResgisterRest;
    private javax.swing.JTextArea txtAreaAddress;
    private javax.swing.JTextField txtCloseHour;
    private javax.swing.JTextField txtCloseMinute;
    private javax.swing.JTextField txtOpenHour;
    private javax.swing.JTextField txtOpenMinute;
    private javax.swing.JTextField txtPeoplePerTable;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JTextField txtTablesCount;
    // End of variables declaration//GEN-END:variables
}
