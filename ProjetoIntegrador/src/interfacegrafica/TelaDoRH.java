package interfacegrafica;

import util.Validacao;
import dados.Professor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.ProfessorDAO;

public class TelaDoRH extends javax.swing.JFrame {
    
    String nomeDoArquivoProfessor = TelaPrincipal.nomeArq+"\\professor.csv";
    /*D:\Mada\2ADS\ProjetoIntegrador\ProjetoIntegrador\src\arquivodedados*/
    ProfessorDAO banco = new ProfessorDAO(nomeDoArquivoProfessor);
    String butao = "";
    
    public TelaDoRH() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablelListagem = new javax.swing.JTable();
        jButtonAceitar = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonVisualizar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recursos Humanos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "RECURSOS HUMANOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jTextFieldNome.setEditable(false);
        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("NOME DO PROFESSOR:");

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
        jLabelMensagenDeErro.setForeground(java.awt.Color.red);
        jLabelMensagenDeErro.setText("ESCOLHA SUA OPÇÃO");
        jLabelMensagenDeErro.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, java.awt.Color.red));

        jTablelListagem.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTablelListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "ENDEREÇO", "TELEFONE", "TITULAÇÃO MÁXIMA", "CURSOS VINCULADOS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablelListagem.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTablelListagem);
        if (jTablelListagem.getColumnModel().getColumnCount() > 0) {
            jTablelListagem.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTablelListagem.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTablelListagem.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTablelListagem.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTablelListagem.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jButtonAceitar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAceitar.setText("ACEITAR");
        jButtonAceitar.setEnabled(false);
        jButtonAceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAvancar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonOpcoes)
                        .addGap(41, 41, 41)
                        .addComponent(jLabelMensagenDeErro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jButtonAceitar)))
                .addContainerGap())
            .addComponent(jScrollPane2)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOpcoes)
                    .addComponent(jLabelMensagenDeErro)
                    .addComponent(jButtonAceitar)))
        );

        jButtonAdicionar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAdicionar.setText("ADICIONAR NOVO PROFESSOR");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonVisualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVisualizar.setText("VISUALIZAR PROFESSOR");
        jButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEditar.setText("EDITAR CADASTRO DE PROFESSOR");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonDeletar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDeletar.setText("EXCLUIR CADASTRO DE PROFESSOR");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setLocationRelativeTo(rootPane);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        liberaCampo(false);
        mensagemErro1();
        TelaRhCadastrarProfessor tela = new TelaRhCadastrarProfessor();
        tela.setLocationRelativeTo(rootPane);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jTextFieldNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyTyped
        try {
            Validacao x = new Validacao();
            if(jTextFieldNome.getText().length() >= 50) evt.consume();
            if(!x.validaCampoTexto(String.valueOf(evt.getKeyChar()))) evt.consume();
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNomeKeyTyped

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        liberaCampo(false);
        mensagemErro1();
        butao = "deletar";
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        liberaCampo(false);
        mensagemErro1();
        butao = "editar";
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed
        try {
            liberaCampo(false);
            mensagemErro1();
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
            if(butao.equals("editar")) edicao();
            else if(butao.equals("deletar")) deletar();
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDoRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDoRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDoRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDoRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDoRH().setVisible(true);
            }
        });
    }
    private void liberaCampo(boolean condicao){
        //1Painel
        jButtonAdicionar.setEnabled(condicao);
        jButtonVisualizar.setEnabled(condicao);
        jButtonDeletar.setEnabled(condicao);
        jButtonEditar.setEnabled(condicao);
        jButtonVoltar.setEnabled(condicao);
        //2Painel
        jButtonAvancar.setEnabled(!condicao);
        jButtonOpcoes.setEnabled(!condicao);
        jTextFieldNome.setEditable(!condicao);
        //Apagar texto
        jTextFieldNome.setText("");
    }
    private void mensagemErro1(){
        jLabelMensagenDeErro.setText("DIGITE O NOME NO CAMPO DE BUSCA");
    }
    private void mensagemErro2(){
        jLabelMensagenDeErro.setText("ESCOLHA SUA OPÇÃO");
    }
    private void mensagemErro3(){
        jLabelMensagenDeErro.setText("NÃO ENCONTRADO");
    }
    private void mostraSoUm() throws Exception{
        try {
            if(jTextFieldNome.getText().isEmpty()) throw new Exception("Campo Vazio.");
            Professor prof = banco.visualizar(jTextFieldNome.getText().toLowerCase());
            saida1(prof);
        } catch (Exception e) {
            mensagemErro3();
            throw e;
        }
    }
    private void saida1(Professor prof){
        DefaultTableModel model = (DefaultTableModel) jTablelListagem.getModel();
        model.setNumRows(0);
        
        String[] saida = new String[5];
        saida[0] = prof.getNome();
        saida[1] = prof.getEndereco();
        saida[2] = prof.getTelefone() + "";
        saida[3] = prof.getTitulacaoMaxima();
        saida[4] = "";
        for (int i = 0; i < prof.getCurso().size(); i++) {
            if(i == prof.getCurso().size()-1) saida[4] +=prof.getCurso().get(i);
            else saida[4] +=prof.getCurso().get(i)+", ";
        }
        model.addRow(saida);
    }
    private void visualizar() throws Exception{
        try {
            jTextFieldNome.setEditable(false);
            jButtonAvancar.setEnabled(false);
            ArrayList<Professor> lista = banco.recuperar();
            saida2(lista);
        } catch (Exception e) {
            mensagemErro3();
            throw e;
        }
    }
    private void saida2(ArrayList<Professor> prof){
        DefaultTableModel model = (DefaultTableModel) jTablelListagem.getModel();
        model.setNumRows(0);
        
        for (int i = 0; i < prof.size(); i++) {
            String[] saida = new String[5];
            saida[0] = prof.get(i).getNome();
            saida[1] = prof.get(i).getEndereco();
            saida[2] = prof.get(i).getTelefone() + "";
            saida[3] = prof.get(i).getTitulacaoMaxima();
            saida[4] = "";
            for (int j = 0; j < prof.get(i).getCurso().size(); j++) {
                if(j == prof.get(i).getCurso().size()-1) saida[4] +=prof.get(i).getCurso().get(j);
                else saida[4] +=prof.get(i).getCurso().get(j)+", ";
            }
            model.addRow(saida);
        }
    }
    private void editar() throws Exception{
        mostraSoUm();
        jButtonAceitar.setEnabled(true);
    }
    private void selecionaLogin() throws Exception{
        switch(butao){
            case "editar":
                editar();
                break;
            case "deletar":
                editar();
                break;
            case "visualizar":
                visualizar();
                break;
            default:
               //
              
        }
    }
    private void deletar(){
        try {
            jButtonAceitar.setEnabled(false);
            Professor prof = banco.visualizar(jTextFieldNome.getText().toLowerCase());
            banco.excluir(prof.getNome().toLowerCase());
            visualizar();
        } catch (Exception e) {
            mensagemErro3();
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void edicao(){
        try {
            jButtonAceitar.setEnabled(false);
            Professor prof = banco.visualizar(jTextFieldNome.getText().toLowerCase());
            banco.excluir(prof.getNome().toLowerCase());
            TelaRhCadastrarProfessor tela = new TelaRhCadastrarProfessor(prof);
            tela.setLocationRelativeTo(rootPane);
            tela.setVisible(true);
            dispose();
        } catch (Exception e) {
            mensagemErro3();
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceitar;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAvancar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonEditar;
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
