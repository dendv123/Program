/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ekrani.show;

import ekrani.NachalnaStranica;
import ekrani.NachalnaStranica;

/**
 *
 * @author user
 */
public class StudentsStranica extends javax.swing.JFrame {

    /**
     * Creates new form StudentsStranica
     */
    public StudentsStranica() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAll = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        pnlWelcome = new javax.swing.JPanel();
        pnlSmth = new javax.swing.JPanel();
        pnlSmth1 = new javax.swing.JPanel();
        lblChoose = new javax.swing.JLabel();
        cbbStudent = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlAll.setBackground(new java.awt.Color(205, 165, 87));
        pnlAll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31), 4));

        btnBack.setBackground(new java.awt.Color(177, 142, 73));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBack.setText("Назад");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        pnlWelcome.setBackground(new java.awt.Color(224, 194, 135));
        pnlWelcome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31), 2));
        pnlWelcome.setPreferredSize(new java.awt.Dimension(100, 107));

        pnlSmth.setBackground(new java.awt.Color(205, 165, 87));
        pnlSmth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31)));

        javax.swing.GroupLayout pnlSmthLayout = new javax.swing.GroupLayout(pnlSmth);
        pnlSmth.setLayout(pnlSmthLayout);
        pnlSmthLayout.setHorizontalGroup(
            pnlSmthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        pnlSmthLayout.setVerticalGroup(
            pnlSmthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlSmth1.setBackground(new java.awt.Color(205, 165, 87));
        pnlSmth1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31)));

        javax.swing.GroupLayout pnlSmth1Layout = new javax.swing.GroupLayout(pnlSmth1);
        pnlSmth1.setLayout(pnlSmth1Layout);
        pnlSmth1Layout.setHorizontalGroup(
            pnlSmth1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        pnlSmth1Layout.setVerticalGroup(
            pnlSmth1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblChoose.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblChoose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChoose.setText("Изберете клас");
        lblChoose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31)));

        javax.swing.GroupLayout pnlWelcomeLayout = new javax.swing.GroupLayout(pnlWelcome);
        pnlWelcome.setLayout(pnlWelcomeLayout);
        pnlWelcomeLayout.setHorizontalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWelcomeLayout.createSequentialGroup()
                .addComponent(pnlSmth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(pnlSmth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlWelcomeLayout.setVerticalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSmth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSmth1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChoose, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        cbbStudent.setBackground(new java.awt.Color(224, 194, 135));
        cbbStudent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbbStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a", "b", "c" }));

        javax.swing.GroupLayout pnlAllLayout = new javax.swing.GroupLayout(pnlAll);
        pnlAll.setLayout(pnlAllLayout);
        pnlAllLayout.setHorizontalGroup(
            pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAllLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlAllLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbStudent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlAllLayout.setVerticalGroup(
            pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbbStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new NachalnaStranica().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void Run() {
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
            java.util.logging.Logger.getLogger(StudentsStranica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsStranica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsStranica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsStranica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsStranica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cbbStudent;
    private javax.swing.JLabel lblChoose;
    private javax.swing.JPanel pnlAll;
    private javax.swing.JPanel pnlSmth;
    private javax.swing.JPanel pnlSmth1;
    private javax.swing.JPanel pnlWelcome;
    // End of variables declaration//GEN-END:variables
}
