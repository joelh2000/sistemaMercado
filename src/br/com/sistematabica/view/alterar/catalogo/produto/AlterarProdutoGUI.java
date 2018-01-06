
package br.com.sistematabica.view.alterar.catalogo.produto;

import br.com.sistematabica.controller.ProdutoController;
import br.com.sistematabica.model.Produto;
import br.com.sistematabica.view.Style;
import javax.swing.JOptionPane;

/** Tela Swing onde vai setar os dados de um produto selecionado para que possa fazer a alteração
 * 
 * @author Joel Henrique Silva Santos
 * @author Evelyn Mayara da Silva Santos
 * @author Lucas Gabriel Silva Santos
 * 
 * @version 1.01
 * 
 */
public class AlterarProdutoGUI extends javax.swing.JFrame {


    
    private static Produto produtoAtual;
    private Style style = new Style();
    
    /**
     * Creates new form CadastrarGerenteGUI
     */
    public AlterarProdutoGUI() {
        initComponents();
    }
    
    /** Construtor que vai receber como parametro um produto que vai setar na view
     * 
     * @author Joel Henrique Silva Santos
     * @author Evelyn Mayara da Silva Santos
     * @author Lucas Gabriel Silva Santos
     * 
     * @param produto Produto
     * 
     * 
     */
    
    public AlterarProdutoGUI(Produto produto) {
        this();

        produtoAtual = produto;
        
        this.txtCodBarras.setText(produto.getCodigoBarras());
        this.txtDescricao.setText(produto.getDescricao());
        this.txtEstoque.setText(produto.getEstoque()+"");
        this.txtNome.setText(produto.getNome());
        this.txtValor.setText(""+produto.getValor());

    }



    /** Método que vai pegar os valores que estiver na view para um objeto produto e retorna
     * 
     * @author Joel Henrique Silva Santos
     * @author Evelyn Mayara da Silva Santos
     * @author Lucas Gabriel Silva Santos
     * 
     * @return Produto
     * 
     */
    
    public Produto objectConta() {
        
        Produto produtoNew = new Produto();
        
        produtoNew.setCodigoBarras(this.txtCodBarras.getText());
        produtoNew.setDescricao(this.txtDescricao.getText());
        produtoNew.setEstoque(Integer.parseInt(this.txtEstoque.getText()));
        produtoNew.setNome(this.txtNome.getText());
        produtoNew.setValor(Double.parseDouble(this.txtValor.getText()));
        produtoNew.setCodigo(produtoAtual.getCodigo());
        
        this.produtoAtual = produtoNew;

        return produtoNew;
    }
    
    public String ClickedUrlIcon() {
    
        return null;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlIformacoesGerais = new javax.swing.JPanel();
        lblNomeCompleto = new javax.swing.JLabel();
        lblOutroTelefone = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        txtCodBarras = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        lblCPF1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextPane();
        txtEstoque = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        lblButtonSalvar = new javax.swing.JLabel();
        lblButtonVoltar = new javax.swing.JLabel();
        lblSalvar = new javax.swing.JLabel();
        lblVoltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar cliente");
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(54, 52, 66));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIformacoesGerais.setBackground(new java.awt.Color(54, 52, 66));
        pnlIformacoesGerais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeCompleto.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeCompleto.setText("Nome:");
        pnlIformacoesGerais.add(lblNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblOutroTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblOutroTelefone.setText("Estoque:");
        pnlIformacoesGerais.add(lblOutroTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lblCPF.setForeground(new java.awt.Color(255, 255, 255));
        lblCPF.setText("Descrição:");
        pnlIformacoesGerais.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        lblDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lblDataNascimento.setText("Codigo de barras:");
        pnlIformacoesGerais.add(lblDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, -1, -1));

        try {
            txtCodBarras.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("# ###### ######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnlIformacoesGerais.add(txtCodBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 71, 210, -1));
        pnlIformacoesGerais.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 210, -1));

        lblCPF1.setForeground(new java.awt.Color(255, 255, 255));
        lblCPF1.setText("Valor:");
        pnlIformacoesGerais.add(lblCPF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jScrollPane1.setViewportView(txtDescricao);

        pnlIformacoesGerais.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 70));
        pnlIformacoesGerais.add(txtEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 110, 20));
        pnlIformacoesGerais.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 90, -1));

        lblButtonSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        lblButtonSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonSalvar.setText("Salvar");
        lblButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonSalvarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonSalvarMouseExited(evt);
            }
        });
        pnlIformacoesGerais.add(lblButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 96, 35));

        lblButtonVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblButtonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        lblButtonVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblButtonVoltar.setText("Voltar");
        lblButtonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblButtonVoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblButtonVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblButtonVoltarMouseExited(evt);
            }
        });
        pnlIformacoesGerais.add(lblButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 97, 35));

        lblSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistematabica/imagens/sistema/icones/backgroundVerdeClaro.png"))); // NOI18N
        lblSalvar.setText("jLabel2");
        lblSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalvarMouseClicked(evt);
            }
        });
        pnlIformacoesGerais.add(lblSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 97, 36));

        lblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistematabica/imagens/sistema/icones/backgroundVermelhoClaro.png"))); // NOI18N
        lblVoltar.setText("jLabel2");
        pnlIformacoesGerais.add(lblVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 97, 36));

        pnlPrincipal.add(pnlIformacoesGerais, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 222, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblButtonSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonSalvarMouseClicked

       if((!this.txtCodBarras.getText().equals("")) && 
                (!this.txtEstoque.getText().equals("")) && 
                (!this.txtValor.getText().equals("")) && 
                (!this.txtNome.getText().equals(""))
            ) {
            
            try{
            
                Produto produto = new Produto();

                produto.setCodigoBarras(this.txtCodBarras.getText());
                produto.setDescricao(this.txtDescricao.getText());
                produto.setEstoque(Integer.parseInt(this.txtEstoque.getText()));
                produto.setNome(this.txtNome.getText());
                produto.setValor(Double.parseDouble(this.txtValor.getText()));
                produto.setCodigo(produtoAtual.getCodigo());

                ProdutoController produtoController = new ProdutoController();
                produtoController.atualizar(produto);
                produtoController.showTela();
                
            }catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Campo invalido, digite só numeros!");
            }

        }else {
            JOptionPane.showMessageDialog(null, "Ops, um campo esta vazio!");
        }
        
        this.dispose();
        

    }//GEN-LAST:event_lblButtonSalvarMouseClicked

    private void lblButtonSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonSalvarMouseEntered
        style.jLabelEditImage(lblSalvar, "/br/com/sistematabica/imagens/sistema/icones/backgroundVerdeEscuro.png");
    }//GEN-LAST:event_lblButtonSalvarMouseEntered

    private void lblButtonSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonSalvarMouseExited
        style.jLabelEditImage(lblSalvar, "/br/com/sistematabica/imagens/sistema/icones/backgroundVerdeClaro.png");
    }//GEN-LAST:event_lblButtonSalvarMouseExited

    private void lblButtonVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonVoltarMouseClicked
        this.dispose();
        ProdutoController produtoController = new ProdutoController();
        produtoController.showTela();
    }//GEN-LAST:event_lblButtonVoltarMouseClicked

    private void lblButtonVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonVoltarMouseEntered
        style.jLabelEditImage(lblVoltar, "/br/com/sistematabica/imagens/sistema/icones/backgroundVermelhoEscuro.png");
    }//GEN-LAST:event_lblButtonVoltarMouseEntered

    private void lblButtonVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblButtonVoltarMouseExited
        style.jLabelEditImage(lblVoltar, "/br/com/sistematabica/imagens/sistema/icones/backgroundVermelhoClaro.png");
    }//GEN-LAST:event_lblButtonVoltarMouseExited

    private void lblSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalvarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSalvarMouseClicked

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
            java.util.logging.Logger.getLogger(AlterarProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarProdutoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblButtonSalvar;
    private javax.swing.JLabel lblButtonVoltar;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCPF1;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblOutroTelefone;
    private javax.swing.JLabel lblSalvar;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JPanel pnlIformacoesGerais;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JFormattedTextField txtCodBarras;
    private javax.swing.JTextPane txtDescricao;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
