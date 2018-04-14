package interfacegrafica;

import dados.Aluno;
import dados.Curso;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.AlocarProfessorDAO;
import persistencia.AlunoDAO;

public class TelaCrudAlocarProfessor extends javax.swing.JFrame {

    String nomeDoArquivoCurso = TelaPrincipal.nomeArq+"\\curso.csv";
    String nomeDoArquivoTurma = TelaPrincipal.nomeArq+"\\turma.csv";
    String nomeDoArquivoDisciplina = TelaPrincipal.nomeArq+"\\disciplina.csv";
    String nomeDoArquivoAlocar = TelaPrincipal.nomeArq+"\\alocar.csv";
    String nomeDoArquivoProfessor = TelaPrincipal.nomeArq+"\\professor.csv";
    AlocarProfessorDAO banco = new AlocarProfessorDAO(nomeDoArquivoProfessor, nomeDoArquivoDisciplina, nomeDoArquivoCurso, nomeDoArquivoTurma);
    String butao = "";

    public TelaCrudAlocarProfessor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonAvancar = new javax.swing.JButton();
        jButtonOpcoes = new javax.swing.JButton();
        jLabelMensagenDeErro = new javax.swing.JLabel();
        jButtonAceitar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablelListagem = new javax.swing.JTable();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonVisualizar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coordenador");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "ALOCAR PROFESSOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jTextFieldNome.setEditable(false);
        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("NÚMERO DE MATRÍCULA:");

        jButtonAvancar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAvancar.setText("AVANÇAR");
        jButtonAvancar.setEnabled(false);
        jButtonAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvancarActionPerformed(evt);
            }
        });

        jButtonOpcoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonOpcoes.setText("VOLTAR PARA OPÇÕES");
        jButtonOpcoes.setEnabled(false);
        jButtonOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpcoesActionPerformed(evt);
            }
        });

        jLabelMensagenDeErro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelMensagenDeErro.setText("ESCOLHA SUA OPÇÃO");
        jLabelMensagenDeErro.setToolTipText("");
        jLabelMensagenDeErro.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, java.awt.Color.gray));

        jButtonAceitar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAceitar.setText("ACEITAR");
        jButtonAceitar.setEnabled(false);
        jButtonAceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceitarActionPerformed(evt);
            }
        });

        jTablelListagem.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTablelListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "ENDEREÇO", "TELEFONE", "CURSO", "MATRÍCULA", "SITUAÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablelListagem.setEnabled(false);
        jTablelListagem.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTablelListagem);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNome)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAvancar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButtonOpcoes)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelMensagenDeErro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAceitar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAvancar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelMensagenDeErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonOpcoes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAceitar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        jButtonAdicionar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAdicionar.setText("ALOCAR NOVO PROFESSOR");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonVisualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVisualizar.setText("VISUALIZAR TURMA COM PROFESSORES");
        jButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarActionPerformed(evt);
            }
        });

        jButtonDeletar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDeletar.setText("RETIRAR PROFESSOR");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVoltar.setText("VOLTAR PARA TELA PRINCIPAL");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        chamaTelaDaSecretaria();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        liberaCampo(true);
        mensagemErro2();
        chamaTelaCadastro();
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jTextFieldNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyTyped
         try {
            int x = Integer.parseInt(String.valueOf(evt.getKeyChar()));
            if(jTextFieldNome.getText().length() >= 50) evt.consume();
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNomeKeyTyped

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        liberaCampo(false);
        mensagemErro1();
        butao = "deletar";
        
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed
        try {
            liberaCampo(false);
            mensagemErro2();
            butao = "visualizar";
            selecionaLogin();
        } catch (Exception e) {
            mensagemErro3();
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

    private void jButtonOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpcoesActionPerformed
        liberaCampo(true);
        mensagemErro2();
    }//GEN-LAST:event_jButtonOpcoesActionPerformed

    private void jButtonAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvancarActionPerformed
        try {
            if(jTextFieldNome.getText().isEmpty())throw new Exception("Campo vazio.");
            selecionaLogin();
        } catch (Exception e) {
            mensagemErro3();
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAvancarActionPerformed

    private void jButtonAceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceitarActionPerformed
        try {
            if(butao.equals("editar")){
                chamaTelaCadastro(deletar());
            }
            else if(butao.equals("deletar")) {
                deletar();
                saida2(visualizar());
            }
        } catch (Exception e) {
            mensagemErro3();
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAceitarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCrudAlocarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCrudAlocarProfessor().setVisible(true);
        });
    }

    private void chamaTelaCadastro(){
        TelaCadastraAluno tela = new TelaCadastraAluno();
        tela.setLocationRelativeTo(rootPane);
        tela.setVisible(true);
        dispose();
    }
    private void chamaTelaCadastro(Aluno aluno) throws Exception{
        TelaCadastraAluno tela = new TelaCadastraAluno(aluno);
        tela.setLocationRelativeTo(rootPane);
        tela.setVisible(true);
        dispose();
    }
    private void chamaTelaDaSecretaria(){
        TelaDaSecretaria tela = new TelaDaSecretaria();
        tela.setLocationRelativeTo(rootPane);
        tela.setVisible(true);
        dispose();
    }
    private void liberaCampo(boolean condicao){
        //1Painel
        jButtonAdicionar.setEnabled(condicao);
        jButtonVisualizar.setEnabled(condicao);
        jButtonDeletar.setEnabled(condicao);
        jButtonVoltar.setEnabled(condicao);
        //2Painel
        jButtonAvancar.setEnabled(!condicao);
        jButtonOpcoes.setEnabled(!condicao);
        jTextFieldNome.setEditable(!condicao);
        //Apagar texto
        jTextFieldNome.setText("");
    }
    private void mensagemErro1(){
        jLabelMensagenDeErro.setText("DIGITE A MATRICULA NO CAMPO DE BUSCA");
    }
    private void mensagemErro2(){
        jLabelMensagenDeErro.setText("ESCOLHA SUA OPÇÃO");
    }
    private void mensagemErro3(){
        jLabelMensagenDeErro.setText("NÃO ENCONTRADO");
    }
    private void selecionaLogin() throws Exception{
        switch(butao){
            case "editar":
                saidaUm(mostraSoUm());
                jButtonAceitar.setEnabled(true);
                break;
            case "deletar":
                saidaUm(mostraSoUm());
                jButtonAceitar.setEnabled(true);
                break;
            case "visualizar":
                saida2(visualizar());
                break;
            default:
        }
    }
    private Aluno mostraSoUm() throws Exception{
        try {
            if(jTextFieldNome.getText().isEmpty()) throw new Exception("Campo Vazio.");
            if(banco.visualizar(Integer.parseInt(jTextFieldNome.getText())) == null)throw new Exception("Não Encontrado.");
            Aluno aluno = banco.visualizar(Integer.parseInt(jTextFieldNome.getText()));
            return aluno;
        } catch (Exception e) {
            mensagemErro3();
            throw e;
        }
    }
    private void saidaUm(Aluno aluno){
        DefaultTableModel model = (DefaultTableModel) jTablelListagem.getModel();
        model.setNumRows(0);
        
        String[] saida = new String[6];
        saida[0] = aluno.getNome();
        saida[1] = aluno.getEndereco();
        saida[2] = aluno.getTelefone()+"";
        saida[3] = aluno.getCurso();
        saida[4] = aluno.getMatricula()+"";
        saida[5] = aluno.getSituacao();
        
        model.addRow(saida);
    }
    private Aluno deletar(){
        try {
            jButtonAceitar.setEnabled(false);
            Aluno aluno = banco.visualizar(Integer.parseInt(jTextFieldNome.getText()));
            banco.excluir(aluno.getMatricula());
            return aluno;
        } catch (Exception e) {
            mensagemErro3();
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    private ArrayList<Aluno> visualizar() throws Exception{
        try {
            jTextFieldNome.setEditable(false);
            jButtonAvancar.setEnabled(false);
            ArrayList<Aluno> lista = banco.recuperar();
            return lista;
        } catch (Exception e) {
            mensagemErro3();
            throw e;
        }
    }
    private void saida2(ArrayList<Aluno> aluno){
        DefaultTableModel model = (DefaultTableModel) jTablelListagem.getModel();
        model.setNumRows(0);
        
        for (int i = 0; i < aluno.size(); i++) {
            String[] saida = new String[6];
            saida[0] = aluno.get(i).getNome();
            saida[1] = aluno.get(i).getEndereco();
            saida[2] = aluno.get(i).getTelefone()+"";
            saida[3] = aluno.get(i).getCurso();
            saida[4] = aluno.get(i).getMatricula()+"";
            saida[5] = aluno.get(i).getSituacao();
            model.addRow(saida);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceitar;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAvancar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonOpcoes;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelMensagenDeErro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablelListagem;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

}
