package ekrani.edit;

import ekrani.NachalnaStranica;
import fileHandler.FileOperations;
import programa.School;
import sort.Sort;

public class Edit extends javax.swing.JFrame {

    public Edit() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAll4 = new javax.swing.JPanel();
        pnlWelcome3 = new javax.swing.JPanel();
        pnlSmth3 = new javax.swing.JPanel();
        pnlSmth4 = new javax.swing.JPanel();
        lblEdit = new javax.swing.JLabel();
        btnBack3 = new javax.swing.JButton();
        pnlTeacherAndStudent = new javax.swing.JPanel();
        pnlStudent = new javax.swing.JPanel();
        btnAddStudent = new javax.swing.JButton();
        btnRemoveStudent = new javax.swing.JButton();
        btnEditPredmetStudent = new javax.swing.JButton();
        btnEditChasoveStudent = new javax.swing.JButton();
        lblStudent = new javax.swing.JLabel();
        pnlTeacher = new javax.swing.JPanel();
        btnAddTeacher = new javax.swing.JButton();
        btnRemoveTeacher = new javax.swing.JButton();
        btnEditPredmetTeacher = new javax.swing.JButton();
        btnEditChasoveTeacher = new javax.swing.JButton();
        lblTeacher = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Редактиране");
        setResizable(false);

        pnlAll4.setBackground(new java.awt.Color(205, 165, 87));
        pnlAll4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31), 4));

        pnlWelcome3.setBackground(new java.awt.Color(224, 194, 135));
        pnlWelcome3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31), 2));
        pnlWelcome3.setPreferredSize(new java.awt.Dimension(100, 107));

        pnlSmth3.setBackground(new java.awt.Color(205, 165, 87));
        pnlSmth3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31)));

        javax.swing.GroupLayout pnlSmth3Layout = new javax.swing.GroupLayout(pnlSmth3);
        pnlSmth3.setLayout(pnlSmth3Layout);
        pnlSmth3Layout.setHorizontalGroup(
            pnlSmth3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );
        pnlSmth3Layout.setVerticalGroup(
            pnlSmth3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlSmth4.setBackground(new java.awt.Color(205, 165, 87));
        pnlSmth4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31)));

        javax.swing.GroupLayout pnlSmth4Layout = new javax.swing.GroupLayout(pnlSmth4);
        pnlSmth4.setLayout(pnlSmth4Layout);
        pnlSmth4Layout.setHorizontalGroup(
            pnlSmth4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        pnlSmth4Layout.setVerticalGroup(
            pnlSmth4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblEdit.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEdit.setText("Какво искате да редактирате?");
        lblEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31)));

        javax.swing.GroupLayout pnlWelcome3Layout = new javax.swing.GroupLayout(pnlWelcome3);
        pnlWelcome3.setLayout(pnlWelcome3Layout);
        pnlWelcome3Layout.setHorizontalGroup(
            pnlWelcome3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWelcome3Layout.createSequentialGroup()
                .addComponent(pnlSmth4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlSmth3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlWelcome3Layout.setVerticalGroup(
            pnlWelcome3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSmth3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSmth4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlWelcome3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnBack3.setBackground(new java.awt.Color(177, 142, 73));
        btnBack3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBack3.setText("Назад");
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });

        pnlTeacherAndStudent.setBackground(new java.awt.Color(205, 165, 87));

        pnlStudent.setBackground(new java.awt.Color(224, 194, 135));
        pnlStudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31), 2));

        btnAddStudent.setBackground(new java.awt.Color(177, 142, 73));
        btnAddStudent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAddStudent.setText("Добавяне");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        btnRemoveStudent.setBackground(new java.awt.Color(177, 142, 73));
        btnRemoveStudent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRemoveStudent.setText("Премахване");
        btnRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveStudentActionPerformed(evt);
            }
        });

        btnEditPredmetStudent.setBackground(new java.awt.Color(177, 142, 73));
        btnEditPredmetStudent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEditPredmetStudent.setText("Промяна на предмет");
        btnEditPredmetStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPredmetStudentActionPerformed(evt);
            }
        });

        btnEditChasoveStudent.setBackground(new java.awt.Color(177, 142, 73));
        btnEditChasoveStudent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEditChasoveStudent.setText("Промяна на брой часове");
        btnEditChasoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditChasoveStudentActionPerformed(evt);
            }
        });

        lblStudent.setBackground(new java.awt.Color(205, 165, 87));
        lblStudent.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudent.setText("Клас");
        lblStudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31)));

        javax.swing.GroupLayout pnlStudentLayout = new javax.swing.GroupLayout(pnlStudent);
        pnlStudent.setLayout(pnlStudentLayout);
        pnlStudentLayout.setHorizontalGroup(
            pnlStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditChasoveStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(btnEditPredmetStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoveStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddStudent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlStudentLayout.setVerticalGroup(
            pnlStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditPredmetStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditChasoveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlTeacher.setBackground(new java.awt.Color(224, 194, 135));
        pnlTeacher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31), 2));

        btnAddTeacher.setBackground(new java.awt.Color(177, 142, 73));
        btnAddTeacher.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAddTeacher.setText("Добавяне");
        btnAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeacherActionPerformed(evt);
            }
        });

        btnRemoveTeacher.setBackground(new java.awt.Color(177, 142, 73));
        btnRemoveTeacher.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRemoveTeacher.setText("Премахване");
        btnRemoveTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveTeacherActionPerformed(evt);
            }
        });

        btnEditPredmetTeacher.setBackground(new java.awt.Color(177, 142, 73));
        btnEditPredmetTeacher.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEditPredmetTeacher.setText("Промяна на предмет");
        btnEditPredmetTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPredmetTeacherActionPerformed(evt);
            }
        });

        btnEditChasoveTeacher.setBackground(new java.awt.Color(177, 142, 73));
        btnEditChasoveTeacher.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEditChasoveTeacher.setText("Промяна на брой часове");
        btnEditChasoveTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditChasoveTeacherActionPerformed(evt);
            }
        });

        lblTeacher.setBackground(new java.awt.Color(205, 165, 87));
        lblTeacher.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblTeacher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeacher.setText("Учител");
        lblTeacher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(151, 125, 31)));

        javax.swing.GroupLayout pnlTeacherLayout = new javax.swing.GroupLayout(pnlTeacher);
        pnlTeacher.setLayout(pnlTeacherLayout);
        pnlTeacherLayout.setHorizontalGroup(
            pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTeacherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditChasoveTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(btnEditPredmetTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoveTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddTeacher, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTeacherLayout.setVerticalGroup(
            pnlTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeacherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditPredmetTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditChasoveTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlTeacherAndStudentLayout = new javax.swing.GroupLayout(pnlTeacherAndStudent);
        pnlTeacherAndStudent.setLayout(pnlTeacherAndStudentLayout);
        pnlTeacherAndStudentLayout.setHorizontalGroup(
            pnlTeacherAndStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTeacherAndStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 20, Short.MAX_VALUE)
                .addComponent(pnlTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTeacherAndStudentLayout.setVerticalGroup(
            pnlTeacherAndStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTeacherAndStudentLayout.createSequentialGroup()
                .addComponent(pnlStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addComponent(pnlTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnShow.setBackground(new java.awt.Color(177, 142, 73));
        btnShow.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnShow.setText("Показване на програма");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAll4Layout = new javax.swing.GroupLayout(pnlAll4);
        pnlAll4.setLayout(pnlAll4Layout);
        pnlAll4Layout.setHorizontalGroup(
            pnlAll4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTeacherAndStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlAll4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAll4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlWelcome3, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                    .addGroup(pnlAll4Layout.createSequentialGroup()
                        .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnShow)))
                .addContainerGap())
        );
        pnlAll4Layout.setVerticalGroup(
            pnlAll4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAll4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlWelcome3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTeacherAndStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAll4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAll4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAll4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed
        this.dispose();
        new NachalnaStranica().setVisible(true);
    }//GEN-LAST:event_btnBack3ActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        AddStudent obj = new AddStudent();
        obj.setLblTeacherOrStudent("Въведете клас");
        obj.setCbbTeacherOrStudent(generateStudent());
        obj.setCbbPredmet(School.Predmeti);
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnRemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveStudentActionPerformed
        Remove obj = new Remove();
        obj.setLblTeacherOrStudent("Изберете клас");
        obj.setCbbTeacherOrStudent(generateStudent());
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btnRemoveStudentActionPerformed

    private void btnEditPredmetStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPredmetStudentActionPerformed
        EditPredmet obj = new EditPredmet();
        obj.setLblTeacherOrStudent("Изберете клас");
        obj.setCbbTeacherOrStudent(generateStudent());
        obj.setCbbPredmet(School.Predmeti);
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btnEditPredmetStudentActionPerformed

    private void btnEditChasoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditChasoveStudentActionPerformed
        EditChasove obj = new EditChasove();
        obj.setLblTeacherOrStudent("Изберете клас");
        obj.setCbbTeacherOrStudent(generateStudent());
        obj.setCbbPredmet(School.Predmeti);
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btnEditChasoveStudentActionPerformed

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed
        AddTeacher obj = new AddTeacher();
        obj.setLblTeacherOrStudent("Въведете име на учител");
        obj.setCbbPredmet(School.Predmeti);
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btnAddTeacherActionPerformed

    private void btnRemoveTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveTeacherActionPerformed
        Remove obj = new Remove();
        obj.setLblTeacherOrStudent("Изберете учител");
        obj.setCbbTeacherOrStudent(generateTeachers());
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btnRemoveTeacherActionPerformed

    private void btnEditPredmetTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPredmetTeacherActionPerformed
        EditPredmet obj = new EditPredmet();
        obj.setLblTeacherOrStudent("Изберете учител");
        obj.setCbbTeacherOrStudent(generateTeachers());
        obj.setCbbPredmet(School.Predmeti);
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btnEditPredmetTeacherActionPerformed

    private void btnEditChasoveTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditChasoveTeacherActionPerformed
        EditChasove obj = new EditChasove();
        obj.setLblTeacherOrStudent("Изберете учител");
        obj.setCbbTeacherOrStudent(generateTeachers());
        obj.setCbbPredmet(School.Predmeti);
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btnEditChasoveTeacherActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        FileOperations.saveInfo();
        new School().generateSchedule();
    }//GEN-LAST:event_btnShowActionPerformed

    public static String[] generateStudent(){
        String arr[] = new String [15];
        int ind = 0;
        for(int i = 8; i <= 12; ++i){
            for(char j = 'А'; j <= 'В'; ++j){   
                arr[ind++] = i + " " + j;
            }
        }
        return arr;
    }
    
    public static String[] generateTeachers()   
    {
        String arr[] = new String[School.teachers.size()];
        for (int i = 0; i < School.teachers.size(); ++i)
        {
            arr[i] = School.teachers.get(i).getName();
        }
        new Sort().sort(arr);
        return arr;
    }
    
    public static void Run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnBack3;
    private javax.swing.JButton btnEditChasoveStudent;
    private javax.swing.JButton btnEditChasoveTeacher;
    private javax.swing.JButton btnEditPredmetStudent;
    private javax.swing.JButton btnEditPredmetTeacher;
    private javax.swing.JButton btnRemoveStudent;
    private javax.swing.JButton btnRemoveTeacher;
    private javax.swing.JButton btnShow;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblStudent;
    private javax.swing.JLabel lblTeacher;
    private javax.swing.JPanel pnlAll4;
    private javax.swing.JPanel pnlSmth3;
    private javax.swing.JPanel pnlSmth4;
    private javax.swing.JPanel pnlStudent;
    private javax.swing.JPanel pnlTeacher;
    private javax.swing.JPanel pnlTeacherAndStudent;
    private javax.swing.JPanel pnlWelcome3;
    // End of variables declaration//GEN-END:variables
}
