package br.com.app.feature.telas;

//Importação da conexão JAVA e SQL por meio do conector j-8.0.31.jar
import br.com.app.feature.dal.ModuloConexao;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author GUSTAVO
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void Produtos() {
    }

//Criação da tela Principal//
    public TelaPrincipal() {
        initComponents();
        conexao = ModuloConexao.conector();
        System.out.println(conexao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taInformacoes = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        taPreco = new javax.swing.JTextArea();
        lblTtopo = new javax.swing.JLabel();
        btnCadastrarNaLista = new javax.swing.JButton();
        btnRemoverDaLista = new javax.swing.JButton();
        btnListaCompleta = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        taNomeProduto = new javax.swing.JTextArea();
        btnListaDePromocao = new javax.swing.JButton();
        lblNomeProduto = new javax.swing.JLabel();
        lblnformacoes = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        separadorVisual = new javax.swing.JSeparator();
        logo = new javax.swing.JLabel();
        btnOkNomeProduto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundo.setBackground(new java.awt.Color(255, 255, 255));

        taInformacoes.setBackground(new java.awt.Color(204, 204, 204));
        taInformacoes.setColumns(20);
        taInformacoes.setLineWrap(true);
        taInformacoes.setRows(5);
        taInformacoes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jScrollPane2.setViewportView(taInformacoes);

        jScrollPane3.setBackground(new java.awt.Color(204, 204, 204));

        taPreco.setBackground(new java.awt.Color(204, 204, 204));
        taPreco.setColumns(20);
        taPreco.setLineWrap(true);
        taPreco.setRows(5);
        taPreco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jScrollPane3.setViewportView(taPreco);

        lblTtopo.setBackground(new java.awt.Color(255, 0, 0));
        lblTtopo.setFont(new java.awt.Font("Book Antiqua", 2, 18)); // NOI18N
        lblTtopo.setForeground(new java.awt.Color(204, 0, 0));
        lblTtopo.setText("Cadastrar ou Remover Produtos");

        btnCadastrarNaLista.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrarNaLista.setForeground(new java.awt.Color(51, 102, 255));
        btnCadastrarNaLista.setText("Cadastrar");
        btnCadastrarNaLista.setBorder(null);
        btnCadastrarNaLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarNaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarNaListaActionPerformed(evt);
            }
        });

        btnRemoverDaLista.setBackground(new java.awt.Color(255, 255, 255));
        btnRemoverDaLista.setForeground(new java.awt.Color(255, 0, 0));
        btnRemoverDaLista.setText("Remover");
        btnRemoverDaLista.setBorder(null);
        btnRemoverDaLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnListaCompleta.setBackground(new java.awt.Color(204, 204, 204));
        btnListaCompleta.setForeground(new java.awt.Color(0, 0, 0));
        btnListaCompleta.setText("Exibir Lista Completa");
        btnListaCompleta.setBorder(null);
        btnListaCompleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaCompletaActionPerformed(evt);
            }
        });

        taNomeProduto.setBackground(new java.awt.Color(204, 204, 204));
        taNomeProduto.setColumns(20);
        taNomeProduto.setLineWrap(true);
        taNomeProduto.setRows(5);
        taNomeProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        taNomeProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        taNomeProduto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                taNomeProdutoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(taNomeProduto);

        btnListaDePromocao.setBackground(new java.awt.Color(204, 204, 204));
        btnListaDePromocao.setForeground(new java.awt.Color(0, 0, 0));
        btnListaDePromocao.setText("Exibir Lista de Promoção");
        btnListaDePromocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaDePromocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaDePromocaoActionPerformed(evt);
            }
        });

        lblNomeProduto.setText("Nome do Produto");

        lblnformacoes.setText("Informações ");

        lblPreco.setText("Preço");

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/app/feature/icones/sitewareLogo.png"))); // NOI18N

        btnOkNomeProduto.setBackground(new java.awt.Color(204, 204, 204));
        btnOkNomeProduto.setForeground(new java.awt.Color(0, 0, 0));
        btnOkNomeProduto.setText("Ok");
        btnOkNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkNomeProdutoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fundoLayout.createSequentialGroup()
                            .addComponent(lblNomeProduto)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                            .addComponent(lblTtopo)
                            .addGap(17, 17, 17)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                        .addComponent(lblnformacoes)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                        .addComponent(lblPreco)
                        .addGap(52, 52, 52)
                        .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(fundoLayout.createSequentialGroup()
                                .addComponent(btnRemoverDaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadastrarNaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fundoLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(btnOkNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addGap(0, 181, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fundoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separadorVisual)
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListaDePromocao)
                            .addComponent(btnListaCompleta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPreco)
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addComponent(lblTtopo)
                        .addGap(18, 18, 18)
                        .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(fundoLayout.createSequentialGroup()
                                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(fundoLayout.createSequentialGroup()
                                        .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNomeProduto)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblnformacoes)))
                                    .addGroup(fundoLayout.createSequentialGroup()
                                        .addComponent(btnOkNomeProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2))))
                .addGap(18, 18, 18)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoverDaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarNaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separadorVisual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListaCompleta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnListaDePromocao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// As linhas Abaixo fazem a consulta ao Banco de Dados MySQL
    // e trazem a tabela do banco.
    private void btnListaCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaCompletaActionPerformed

        String sql = "describe table tbproduto";
        try {

            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Consulta ao banco inexistente");

            }catch (Excpetion e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
        }

    }//GEN-LAST:event_btnListaCompletaActionPerformed
//As linhas abaixo fazem a consulta ao banco de dados Mysql e 
// trazem a tabela de produtos em promoção


    private void btnListaDePromocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaDePromocaoActionPerformed
        String sql = "describe table tbpromocao";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

        } catch (Excpetion e) {
            JOptionPane.showMessageDialog(null, e);
    }//GEN-LAST:event_btnListaDePromocaoActionPerformed

    private void taNomeProdutoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_taNomeProdutoAncestorAdded
// TODO add your handling code here:
    }//GEN-LAST:event_taNomeProdutoAncestorAdded
// as Linhas abaixo fazem a inclusão do nome escrito pelo usuario e incluem ao banco de dados

    private void btnOkNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkNomeProdutoActionPerformed
        String sql = "select * from tbproduto insert into tbproduto where nomeprdt=?";

        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, btnOkNomeProduto.getText());
            rs = pst.executeQuery();


    }//GEN-LAST:event_btnOkNomeProdutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sql = "select * from tbproduto insert into tbproduto where infoprdt=?";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

        } catch (Excpetion e) {
            JOptionPane.showMessageDialog(null, e);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String sql = "select * from tbproduto insert into tbproduto where precoprdt=?";

        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, btnOkNomeProduto.getText());
            rs = pst.executeQuery();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCadastrarNaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarNaListaActionPerformed
       
        




    }//GEN-LAST:event_btnCadastrarNaListaActionPerformed
    
    
       
    

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarNaLista;
    private javax.swing.JButton btnListaCompleta;
    private javax.swing.JButton btnListaDePromocao;
    private javax.swing.JButton btnOkNomeProduto;
    private javax.swing.JButton btnRemoverDaLista;
    private javax.swing.JPanel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTtopo;
    private javax.swing.JLabel lblnformacoes;
    private javax.swing.JLabel logo;
    private javax.swing.JSeparator separadorVisual;
    private javax.swing.JTextArea taInformacoes;
    private javax.swing.JTextArea taNomeProduto;
    private javax.swing.JTextArea taPreco;
    // End of variables declaration//GEN-END:variables
}
