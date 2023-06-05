package ekrani.edit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import programa.Predmet;
import programa.School;
import programa.Teacher;
import sort.Sort;

public class AddTeacher extends javax.swing.JFrame {

    public AddTeacher() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Добавяне на учител");
   }

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
        cbbPredmet = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        cbbPredmet.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbbPredmet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "а", "б", "в" }));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtChasove, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbbPredmet, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlAllLayout.setVerticalGroup(
            pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAllLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeacherOrStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        String name = txtName.getText();
        if(!nameChecker(name)) return;
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
        if(School.teachers.contains(new Teacher(name))){
            return;
        }
        
        School.teachers.add(new Teacher(name, new Predmet(predmet, br)));
        System.out.println(School.teachers);
        School.addTeachersToFile();
        
        this.dispose();
        new Edit().setVisible(true);
    }//GEN-LAST:event_btnEnterActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    public void setLblTeacherOrStudent(String label){
        lblTeacherOrStudent.setText(label);
    }
    
    public void setCbbPredmet(String[] arr)
    {
        cbbPredmet.removeAllItems();
        new Sort().sort(arr);
        for(int i = 0; i < arr.length; ++i){
            cbbPredmet.addItem(arr[i]);
        }
        
    }
    
    public boolean nameChecker(String name){
        Pattern p = Pattern.compile("[А-Я][а-я]+[ ][А-Я][а-я]+");
        Matcher m = p.matcher(name);
        return m.matches();
    }
    
    public static void Run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnter;
    private javax.swing.JComboBox<String> cbbPredmet;
    private javax.swing.JLabel lblChasove;
    private javax.swing.JLabel lblPredmet;
    private javax.swing.JLabel lblTeacherOrStudent;
    private javax.swing.JPanel pnlAll;
    private javax.swing.JTextField txtChasove;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
