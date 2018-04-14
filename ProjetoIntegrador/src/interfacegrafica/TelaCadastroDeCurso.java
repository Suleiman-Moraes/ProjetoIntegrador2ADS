package interfacegrafica;

import util.Validacao;
import dados.Curso;
import javax.swing.JOptionPane;
import persistencia.CursoDAO;

public class TelaCadastroDeCurso extends javax.swing.JFrame {

    private Curso curso = null;
    String nomeDoArquivoCurso = TelaPrincipal.nomeArq+"\\curso.csv";
    public TelaCadastroDeCurso() {
        initComponents();
    }
    public TelaCadastroDeCurso(Curso curso) {
        initComponents();
        this.curso = new Curso(curso);
        edicao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jButtonVoltar = new javax.swing.JButton();
        jButtonConcluirCadastro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCoordenador = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Curso");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "CADASTRO DE CURSO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CÓDIGO:");

        jTextFieldCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DESCRIÇÃO:");

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextAreaDescricao.setRows(5);
        jTextAreaDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), new javax.swing.border.MatteBorder(null)), "Descrição", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jTextAreaDescricao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextAreaDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaDescricaoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaDescricao);

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonConcluirCadastro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonConcluirCadastro.setText("CONCLUIR CADASTRO");
        jButtonConcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirCadastroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("COORDENADOR:");

        jTextFieldCoordenador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldCoordenador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCoordenadorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCoordenador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConcluirCadastro)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCoordenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConcluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        int x = JOptionPane.showConfirmDialog(rootPane, "Sair sem \"Salvar\" ??\nTodos os dados não salvos serão perdidios", "ALERTA", JOptionPane.YES_NO_OPTION);
        if(x == 0 || x == -1){
            chamaTelaPrincipal();
        }
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonConcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirCadastroActionPerformed
        try {
            recebeCampos();
            salvaDados();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConcluirCadastroActionPerformed

    private void jTextAreaDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDescricaoKeyTyped
        try {
            Validacao x = new Validacao();
            if(jTextAreaDescricao.getText().length() >= 400) evt.consume();
            if(!x.validaCampoTexto(String.valueOf(evt.getKeyChar()))) evt.consume();
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextAreaDescricaoKeyTyped

    private void jTextFieldCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyTyped
        try {
            int x = Integer.parseInt(String.valueOf(evt.getKeyChar()));
            if(jTextFieldCodigo.getText().length() >= 9) evt.consume();
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCodigoKeyTyped

    private void jTextFieldCoordenadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCoordenadorKeyTyped
        try {
            Validacao x = new Validacao();
            if(jTextFieldCoordenador.getText().length() >= 50) evt.consume();
            if(!x.validaCampoTexto(String.valueOf(evt.getKeyChar()))) evt.consume();
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCoordenadorKeyTyped

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
            java.util.logging.Logger.getLogger(TelaCadastroDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroDeCurso().setVisible(true);
            }
        });
    }
    private void recebeCampos() throws Exception{
        try {
            if(jTextFieldCodigo.getText().isEmpty() || jTextAreaDescricao.getText().isEmpty() || jTextFieldCoordenador.getText().isEmpty())
                throw new Exception("Não permitido campos vazio.");
            curso = new Curso(Integer.parseInt(jTextFieldCodigo.getText()), jTextAreaDescricao.getText(), jTextFieldCoordenador.getText());
        } catch (Exception e) {
            throw e;
        }
    }
    private void salvaDados() throws Exception{
        try {
            CursoDAO salva = new CursoDAO(nomeDoArquivoCurso);
            if(salva.visualizar(Integer.parseInt(jTextFieldCodigo.getText())) != null)throw new Exception("2 Cursos não podem ter o mesmo código.");
            salva.incluir(curso);
            JOptionPane.showMessageDialog(rootPane, "Cadastro completo!", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            chamaTelaPrincipal();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void chamaTelaPrincipal(){
        TelaCrudCadastrarCurso tela = new TelaCrudCadastrarCurso();
        tela.setLocationRelativeTo(rootPane);
        tela.setVisible(true);
        dispose();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConcluirCadastro;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCoordenador;
    // End of variables declaration//GEN-END:variables

    private void edicao() {
        jTextFieldCodigo.setText(curso.getCodigo()+"");
        jTextAreaDescricao.setText(curso.getDescricao());
        jTextFieldCoordenador.setText(curso.getCoordenado().getNome());
    }
}
