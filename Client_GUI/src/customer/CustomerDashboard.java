package customer;

public class CustomerDashboard extends javax.swing.JFrame {

    public CustomerDashboard() {
        initComponents();
    }
    
    public CustomerDashboard(String customerName) {
        initComponents();
        lblCustName.setText(customerName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblContact = new javax.swing.JLabel();
        lblReservation = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCustName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblContact.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblContact.setForeground(new java.awt.Color(255, 255, 255));
        lblContact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContact.setText("Contact");

        lblReservation.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblReservation.setForeground(new java.awt.Color(255, 255, 255));
        lblReservation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReservation.setText("Reservation");

        lblDashboard.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDashboard.setText("Dashboard");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ezbooking");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReservation, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(lblContact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(lblReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(390, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(483, Short.MAX_VALUE)))
        );

        lblCustName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCustName.setForeground(new java.awt.Color(255, 255, 255));
        lblCustName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCustName.setText("Cust Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(401, 401, 401)
                .addComponent(lblCustName, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblCustName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblCustName;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblReservation;
    // End of variables declaration//GEN-END:variables
}