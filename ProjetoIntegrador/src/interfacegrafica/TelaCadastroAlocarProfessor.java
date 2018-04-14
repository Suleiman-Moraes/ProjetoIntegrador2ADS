/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import dados.AlocarProfessor;
import dados.Curso;
import dados.Disciplina;
import dados.Professor;
import dados.Turma;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.AlocarProfessorDAO;
import persistencia.CursoDAO;
import persistencia.DisciplinaDAO;
import persistencia.ProfessorDAO;
import persistencia.TurmaDAO;

public class TelaCadastroAlocarProfessor extends javax.swing.JFrame {

    private AlocarProfessor alocar = null;
    String nomeDoArquivoCurso = TelaPrincipal.nomeArq+"\\curso.csv";
    String nomeDoArquivoTurma = TelaPrincipal.nomeArq+"\\turma.csv";
    String nomeDoArquivoDisciplina = TelaPrincipal.nomeArq+"\\disciplina.csv";
    String nomeDoArquivoAlocar = TelaPrincipal.nomeArq+"\\alocar.csv";
    String nomeDoArquivoProfessor = TelaPrincipal.nomeArq+"\\professor.csv";
    
    public TelaCadastroAlocarProfessor() throws Exception {
        initComponents();
        listaComboboxCurso();
    }
    public TelaCadastroAlocarProfessor(AlocarProfessor alocar) throws Exception {
        initComponents();
        listaComboboxCurso();
        this.alocar = new AlocarProfessor(alocar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxCurso = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDisciplina = new javax.swing.JComboBox<>();
        jButtonVoltar = new javax.swing.JButton();
        jButtonConcluir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxTurma = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxProfesor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alocar Professor");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "ALOCAR PROFESSOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CÓDIGO DO CURSO:");

        jComboBoxCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CURSO" }));
        jComboBoxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCursoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CÓDIGO DA DISCIPLINA:");

        jComboBoxDisciplina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISCIPLINA" }));
        jComboBoxDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDisciplinaActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonConcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonConcluir.setText("CONCLUIR CADASTRO");
        jButtonConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("SEMESTRE DA TURMA:");

        jComboBoxTurma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TURMA" }));
        jComboBoxTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTurmaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("PROFESSORES QUALIFICADOS:");

        jComboBoxProfesor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxProfesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROFESSOR" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addComponent(jComboBoxDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConcluir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        int x = JOptionPane.showConfirmDialog(rootPane, "Sair sem \"Salvar\" ??\nTodos os dados não salvos serão perdidios", "ALERTA", JOptionPane.YES_NO_OPTION);
        if(x == 0 || x == -1){
            chamaTelaPrincipal();
        }
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirActionPerformed
        try {
            pegaLadrao();
            recebeCampos();
            salvaDados();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConcluirActionPerformed

    private void jComboBoxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCursoActionPerformed
        try {
            zeraComboBox();
            
//            listaComboboxTurma();
            listaComboboxProfessor();
            listaComboboxDisciplina();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jComboBoxCursoActionPerformed

    private void jComboBoxTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTurmaActionPerformed
//        try {
//            jComboBoxDisciplina.removeAllItems();
//            jComboBoxDisciplina.addItem("DISCIPLINA");
//            listaComboboxDisciplina();
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_jComboBoxTurmaActionPerformed

    private void jComboBoxDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDisciplinaActionPerformed
//        try {
//            jComboBoxTurma.removeAllItems();
//            jComboBoxTurma.addItem("TURMA");
//            
//            listaComboboxTurma();
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_jComboBoxDisciplinaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroAlocarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAlocarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAlocarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAlocarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCadastroAlocarProfessor().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TelaCadastroAlocarProfessor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    private void chamaTelaPrincipal(){
        TelaCrudAlocarProfessor tela = new TelaCrudAlocarProfessor();
        tela.setLocationRelativeTo(rootPane);
        tela.setVisible(true);
        dispose();
    }
    private void recebeCampos(){
        try {
            alocar = new AlocarProfessor(Integer.parseInt(jComboBoxDisciplina.getItemAt(jComboBoxDisciplina.getSelectedIndex())),
                    Integer.parseInt(jComboBoxCurso.getItemAt(jComboBoxCurso.getSelectedIndex())),
                    jComboBoxTurma.getItemAt(jComboBoxTurma.getSelectedIndex()),
                    jComboBoxProfesor.getItemAt(jComboBoxProfesor.getSelectedIndex()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void salvaDados() throws Exception{
        try {
            AlocarProfessorDAO salva = new AlocarProfessorDAO(nomeDoArquivoAlocar, nomeDoArquivoDisciplina, nomeDoArquivoCurso, nomeDoArquivoTurma);
            salva.incluir(alocar);
            JOptionPane.showMessageDialog(rootPane, "Cadastro completo!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            chamaTelaPrincipal();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void pegaLadrao() throws Exception{
        try {
            if(jComboBoxProfesor.getSelectedIndex() == 0)throw new Exception("Escolha um professor.");
            if(jComboBoxDisciplina.getSelectedIndex() == 0)throw new Exception("Escolha um Disciplina.");
            if(jComboBoxCurso.getSelectedIndex() == 0)throw new Exception("Escolha um curso.");
            if(jComboBoxTurma.getSelectedIndex() == 0)throw new Exception("Escolha uma turma.");
        } catch (Exception e) {
            throw e;
        }
    }
    private void listaComboboxCurso() throws Exception {
        CursoDAO cursoDao = new CursoDAO(nomeDoArquivoCurso);
        ArrayList<Curso> cursolista = new ArrayList<Curso>();
        cursolista = cursoDao.recuperar();
        for (int i = 0; i < cursolista.size(); i++) {
            jComboBoxCurso.addItem(cursolista.get(i).getCodigo()+"");
        }
    }
    private void listaComboboxDisciplina() throws Exception {
        DisciplinaDAO disciplina = new DisciplinaDAO(nomeDoArquivoDisciplina);
        ArrayList<Disciplina> disciplinal = new ArrayList<Disciplina>();
        disciplinal = disciplina.recuperar(nomeDoArquivoCurso);
        for (int i = 0; i < disciplinal.size(); i++) {
            if(disciplinal.get(i).getCodigoDoCurso()== Integer.parseInt(jComboBoxCurso.getItemAt(jComboBoxCurso.getSelectedIndex())))
                jComboBoxDisciplina.addItem(disciplinal.get(i).getCodigo()+"");
        }
    }
    private void listaComboboxTurma() throws Exception {
        TurmaDAO turma = new TurmaDAO(nomeDoArquivoTurma);
        ArrayList<Turma> listaTurma = new ArrayList<Turma>();
        listaTurma = turma.recuperar(nomeDoArquivoDisciplina, nomeDoArquivoCurso);
        for (int i = 0; i < listaTurma.size(); i++) {
            if(listaTurma.get(i).getCodigoDaDisciplina()== Integer.parseInt(jComboBoxDisciplina.getItemAt(jComboBoxDisciplina.getSelectedIndex())))
                jComboBoxTurma.addItem(listaTurma.get(i).getSemestre());
        }
    }
    private void listaComboboxProfessor() throws Exception {
        ProfessorDAO prof = new ProfessorDAO(nomeDoArquivoProfessor);
        ArrayList<Professor> listaProf = new ArrayList<Professor>();
        listaProf = prof.recuperar();
        for (int i = 0; i < listaProf.size(); i++) {
            for (int j = 0; j < listaProf.get(i).getCurso().size(); j++) {
                if(listaProf.get(i).getCurso().get(j) == jComboBoxTurma.getItemAt(jComboBoxTurma.getSelectedIndex()))
                jComboBoxProfesor.addItem(listaProf.get(i).getNome());
            }
        }
    }
    private void zeraComboBox(){
        jComboBoxDisciplina.removeAllItems();
        jComboBoxDisciplina.addItem("DISCIPLINA");
        
//        jComboBoxTurma.removeAllItems();
//        jComboBoxTurma.addItem("TURMA");
        
        jComboBoxProfesor.removeAllItems();
        jComboBoxProfesor.addItem("PROFESSOR");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButtonConcluir;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxCurso;
    private javax.swing.JComboBox<String> jComboBoxDisciplina;
    private javax.swing.JComboBox<String> jComboBoxProfesor;
    private javax.swing.JComboBox<String> jComboBoxTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}
