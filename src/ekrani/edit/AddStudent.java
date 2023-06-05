/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ekrani.edit;

import ekrani.edit.Edit;
import linkedList.LinkedList;
import programa.Predmet;
import programa.School;
import programa.Student;
import sort.Sort;

/**
 *
 * @author user
 */
public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form Add
     */
    public AddStudent() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Добавяне на предмет");
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
        lblTeacherOrStudent = new javax.swing.JLabel();
        lblPredmet = new javax.swing.JLabel();
        lblChasove = new javax.swing.JLabel();
        txtChasove = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        cbbTeacherOrStudent = new javax.swing.JComboBox<>();
        cbbPredmet = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlAll.setBackground(new java.awt.Color(205, 165, 87));
        pnlAll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31), 4));

        lblTeacherOrStudent.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblTeacherOrStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeacherOrStudent.setText("Въведете клас/учител");
        lblTeacherOrStudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31), 2));

        lblPredmet.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPredmet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPredmet.setText("Въведете предмет");
        lblPredmet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31), 2));

        lblChasove.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblChasove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChasove.setText("Въведете брой часове");
        lblChasove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31), 2));

        txtChasove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChasoveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(177, 142, 73));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBack.setText("Назад");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEnter.setBackground(new java.awt.Color(177, 142, 73));
        btnEnter.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEnter.setText("Напред");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        cbbTeacherOrStudent.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbbTeacherOrStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "а", "б", "в" }));

        cbbPredmet.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbbPredmet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "а", "б", "в" }));

        javax.swing.GroupLayout pnlAllLayout = new javax.swing.GroupLayout(pnlAll);
        pnlAll.setLayout(pnlAllLayout);
        pnlAllLayout.setHorizontalGroup(
            pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAllLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAllLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAllLayout.createSequentialGroup()
                        .addGroup(pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblChasove, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(lblPredmet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTeacherOrStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtChasove, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(cbbTeacherOrStudent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbPredmet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlAllLayout.setVerticalGroup(
            pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAllLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTeacherOrStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(cbbTeacherOrStudent))
                .addGap(18, 18, 18)
                .addGroup(pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPredmet, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(cbbPredmet))
                .addGap(18, 18, 18)
                .addGroup(pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChasove, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChasove, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtChasoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChasoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChasoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new Edit().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed

        String student = cbbTeacherOrStudent.getSelectedItem() + "";
        String predmet = cbbPredmet.getSelectedItem() + "";
        int br;
        try
        {
            br = Integer.parseInt(txtChasove.getText());
        }
        catch(NumberFormatException e)
        {
            return;
        }
        Student s = School.getStudent(student);
        LinkedList <Predmet> predmeti = s.getPredmeti();
        if (predmeti.get(new Predmet(predmet)) == null)
        {
            predmeti.add(new Predmet(predmet, br));
        }
        School.addStudentsToFile();

        this.dispose();
        new Edit().setVisible(true);
    }//GEN-LAST:event_btnEnterActionPerformed

    public void setLblTeacherOrStudent(String label){
        lblTeacherOrStudent.setText(label);
    }
    
    public void setCbbTeacherOrStudent(String []arr){
        cbbTeacherOrStudent.removeAllItems();
        for(int i = 0; i < arr.length; ++i){
            cbbTeacherOrStudent.addItem(arr[i]);
        }
    }
    
    public void setCbbPredmet(String[] arr)
    {
        cbbPredmet.removeAllItems();
        new Sort().sort(arr);
        for(int i = 0; i < arr.length; ++i){
            cbbPredmet.addItem(arr[i]);
        }
    }
    
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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnter;
    private javax.swing.JComboBox<String> cbbPredmet;
    private javax.swing.JComboBox<String> cbbTeacherOrStudent;
    private javax.swing.JLabel lblChasove;
    private javax.swing.JLabel lblPredmet;
    private javax.swing.JLabel lblTeacherOrStudent;
    private javax.swing.JPanel pnlAll;
    private javax.swing.JTextField txtChasove;
    // End of variables declaration//GEN-END:variables
}
