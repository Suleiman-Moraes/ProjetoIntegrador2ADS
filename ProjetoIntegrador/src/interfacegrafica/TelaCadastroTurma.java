/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import util.Validacao;
import dados.Curso;
import dados.Disciplina;
import dados.Turma;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.CursoDAO;
import persistencia.DisciplinaDAO;
import persistencia.TurmaDAO;

public class TelaCadastroTurma extends javax.swing.JFrame {

    private Turma turma = null;
    String nomeDoArquivoCurso = TelaPrincipal.nomeArq+"\\curso.csv";
    String nomeDoArquivoTurma = TelaPrincipal.nomeArq+"\\turma.csv";
    String nomeDoArquivoDisciplina = TelaPrincipal.nomeArq+"\\disciplina.csv";
    public TelaCadastroTurma() throws Exception {
        initComponents();
        listaCombobox();
    }
    public TelaCadastroTurma(Turma turma) throws Exception {
        initComponents();
        listaCombobox();
        this.turma = new Turma(turma);
        edicao();
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
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSemestre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxSegunda = new javax.swing.JCheckBox();
        jCheckBoxTerca = new javax.swing.JCheckBox();
        jCheckBoxQuarta = new javax.swing.JCheckBox();
        jCheckBoxQuinta = new javax.swing.JCheckBox();
        jCheckBoxSexta = new javax.swing.JCheckBox();
        jCheckBoxSabado = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldHEntrada = new javax.swing.JTextField();
        jTextFieldHSaida = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jButtonConcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Turma");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "CADASTRO DE TURMA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ANO:");

        jTextFieldAno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("SEMESTRE:");

        jTextFieldSemestre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSemestreKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("DIAS DA SEMANA:");

        jCheckBoxSegunda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBoxSegunda.setText("SEGUNDA - FEIRA");

        jCheckBoxTerca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBoxTerca.setText("TERÇA - FEIRA");

        jCheckBoxQuarta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBoxQuarta.setText("QUARTA - FEIRA");

        jCheckBoxQuinta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBoxQuinta.setText("QUINTA - FEIRA");

        jCheckBoxSexta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBoxSexta.setText("SEXTA - FEIRA");

        jCheckBoxSabado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBoxSabado.setText("SÁBADO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("HORÁRIO ENTRADA:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("HORÁRIO SAÍDA:");

        jTextFieldHEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldHEntrada.setText("HH:MM");
        jTextFieldHEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHEntradaKeyTyped(evt);
            }
        });

        jTextFieldHSaida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldHSaida.setText("HH:MM");
        jTextFieldHSaida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHSaidaKeyTyped(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldHEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldHSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxSegunda)
                                    .addComponent(jCheckBoxQuinta)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonVoltar)
                                .addGap(210, 210, 210)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBoxSexta)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBoxSabado))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBoxTerca)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBoxQuarta)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButtonConcluir))))
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
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBoxSegunda)
                    .addComponent(jCheckBoxTerca)
                    .addComponent(jCheckBoxQuarta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxQuinta)
                    .addComponent(jCheckBoxSexta)
                    .addComponent(jCheckBoxSabado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldHEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnoKeyTyped
        try {
            int x = Integer.parseInt(String.valueOf(evt.getKeyChar()));
            if(jTextFieldAno.getText().length() >= 4) evt.consume();
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldAnoKeyTyped

    private void jTextFieldHEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHEntradaKeyTyped
        try {
            Validacao x = new Validacao();
            if(jTextFieldHEntrada.getText().length() >= 5) evt.consume();
            if(!x.validaHora(String.valueOf(evt.getKeyChar()))) evt.consume();
            
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldHEntradaKeyTyped

    private void jTextFieldHSaidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHSaidaKeyTyped
        try {
            Validacao x = new Validacao();
            if(jTextFieldHSaida.getText().length() >= 5) evt.consume();
            if(!x.validaHora(String.valueOf(evt.getKeyChar()))) evt.consume();
            
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldHSaidaKeyTyped

    private void jTextFieldSemestreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSemestreKeyTyped
        try {
            Validacao x = new Validacao();
            if(jTextFieldSemestre.getText().length() >= 11) evt.consume();
            if(!x.validaCampoLetraNumero(String.valueOf(evt.getKeyChar()))) evt.consume();
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldSemestreKeyTyped

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
            jComboBoxDisciplina.removeAllItems();
            jComboBoxDisciplina.addItem("DISCIPLINA");
            listaCombobox2();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jComboBoxCursoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCadastroTurma().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TelaCadastroTurma.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    private void validahora(String teste) throws Exception{
        int cont = 0;
        
        for (int i = 0; i < teste.length(); i++) 
            if (teste.charAt(i) == ':') cont++;
        
        Validacao x = new Validacao();
        if(cont != 1 || teste.length() != 5 || teste.charAt(2) != ':' || !x.validaHora(teste))throw new Exception("Formato inválido para hora");
    }
    private void chamaTelaPrincipal(){
        TelaCrudTurma tela = new TelaCrudTurma();
        tela.setLocationRelativeTo(rootPane);
        tela.setVisible(true);
        dispose();
    }
    private void recebeCampos(){
        try {
            turma = new Turma(Integer.parseInt(jTextFieldAno.getText()), jTextFieldSemestre.getText(),
                    diasDaSemana(), jTextFieldHEntrada.getText(), jTextFieldHSaida.getText(),
                    Integer.parseInt(jComboBoxCurso.getItemAt(jComboBoxCurso.getSelectedIndex())), 
                    Integer.parseInt(jComboBoxDisciplina.getItemAt(jComboBoxDisciplina.getSelectedIndex())));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private String diasDaSemana() throws Exception{
        String tudo = "";
        if(!(jCheckBoxSegunda.isSelected()||jCheckBoxTerca.isSelected()||jCheckBoxQuarta.isSelected()||jCheckBoxQuinta.isSelected()||jCheckBoxSexta.isSelected()||jCheckBoxSabado.isSelected()))throw new Exception("Necessário ter ao menos um dia da semana.");
        if(jCheckBoxSegunda.isSelected()) tudo += jCheckBoxSegunda.getText()+" ";
        if(jCheckBoxTerca.isSelected()) tudo += jCheckBoxTerca.getText()+" ";
        if(jCheckBoxQuarta.isSelected()) tudo += jCheckBoxQuarta.getText()+" ";
        if(jCheckBoxQuinta.isSelected()) tudo += jCheckBoxQuinta.getText()+" ";
        if(jCheckBoxSexta.isSelected()) tudo += jCheckBoxSexta.getText()+" ";
        if(jCheckBoxSabado.isSelected()) tudo += jCheckBoxSabado.getText();
        return tudo;
    }
    private void salvaDados() throws Exception{
        try {
            TurmaDAO salva = new TurmaDAO(nomeDoArquivoTurma);
            salva.incluir(turma, nomeDoArquivoDisciplina, nomeDoArquivoCurso);
            JOptionPane.showMessageDialog(rootPane, "Cadastro completo!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            chamaTelaPrincipal();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void pegaLadrao() throws Exception{
        try {
            if(jTextFieldAno.getText().isEmpty() || jTextFieldHEntrada.getText().isEmpty() || jTextFieldHSaida.getText().isEmpty() || jTextFieldSemestre.getText().isEmpty())throw new Exception("Não permitido campos vazio.");
            if(jComboBoxCurso.getSelectedIndex() == 0)throw new Exception("Escolha um curso.");
            if(jComboBoxDisciplina.getSelectedIndex() == 0)throw new Exception("Escolha um Disciplina.");
        } catch (Exception e) {
            throw e;
        }
    }
    private void listaCombobox() throws Exception {
        CursoDAO cursoDao = new CursoDAO(nomeDoArquivoCurso);
        ArrayList<Curso> cursolista = new ArrayList<Curso>();
        cursolista = cursoDao.recuperar();
        for (int i = 0; i < cursolista.size(); i++) {
            jComboBoxCurso.addItem(cursolista.get(i).getCodigo()+"");
        }
    }
    private void listaCombobox2() throws Exception {
        DisciplinaDAO disciplina = new DisciplinaDAO(nomeDoArquivoDisciplina);
        ArrayList<Disciplina> disciplinal = new ArrayList<Disciplina>();
        disciplinal = disciplina.recuperar(nomeDoArquivoCurso);
        for (int i = 0; i < disciplinal.size(); i++) {
            if(disciplinal.get(i).getCodigoDoCurso()== Integer.parseInt(jComboBoxCurso.getItemAt(jComboBoxCurso.getSelectedIndex())))
                jComboBoxDisciplina.addItem(disciplinal.get(i).getCodigo()+"");
        }
    }
    private void edicao() {
        jTextFieldAno.setText(turma.getAno()+"");
        jTextFieldHEntrada.setText(turma.getHorarioEntrada());
        jTextFieldHSaida.setText(turma.getHorarioSaida());
        jTextFieldSemestre.setText(turma.getSemestre());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButtonConcluir;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JCheckBox jCheckBoxQuarta;
    private javax.swing.JCheckBox jCheckBoxQuinta;
    private javax.swing.JCheckBox jCheckBoxSabado;
    private javax.swing.JCheckBox jCheckBoxSegunda;
    private javax.swing.JCheckBox jCheckBoxSexta;
    private javax.swing.JCheckBox jCheckBoxTerca;
    private javax.swing.JComboBox<String> jComboBoxCurso;
    private javax.swing.JComboBox<String> jComboBoxDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldHEntrada;
    private javax.swing.JTextField jTextFieldHSaida;
    private javax.swing.JTextField jTextFieldSemestre;
    // End of variables declaration//GEN-END:variables

    
}
