
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.Global;
import model.Usuarios;
import utils.JTableRenderer;


public class ListaUsuarios extends javax.swing.JFrame {

    private JFrame login;
    private final String localPathImage = System.getProperty("user.dir") + "\\src\\imagem\\";
    private Usuarios usuario;
    
    public ListaUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public ListaUsuarios(JFrame login) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.login = login;
        CarregarTabela();
    }
    
    private void CarregarTabela(){
        
        DefaultTableModel model = (DefaultTableModel) jTableUsuarios.getModel();
        model.setNumRows(0);
        model.setRowCount(0);
        
        jTableUsuarios.getColumnModel().getColumn(0).setMinWidth(0);
        jTableUsuarios.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableUsuarios.getColumnModel().getColumn(3).setMinWidth(0);
        jTableUsuarios.getColumnModel().getColumn(3).setMaxWidth(0);
        jTableUsuarios.getColumnModel().getColumn(5).setMinWidth(0);
        jTableUsuarios.getColumnModel().getColumn(5).setMaxWidth(0);
        
        jTableUsuarios.getColumnModel().getColumn(1).setMinWidth(240);
        jTableUsuarios.getColumnModel().getColumn(1).setMaxWidth(240);
        jTableUsuarios.getColumnModel().getColumn(2).setMinWidth(260);
        jTableUsuarios.getColumnModel().getColumn(2).setMaxWidth(260);
        jTableUsuarios.getColumnModel().getColumn(4).setMinWidth(120);
        jTableUsuarios.getColumnModel().getColumn(4).setMaxWidth(120);
        jTableUsuarios.getColumnModel().getColumn(6).setMinWidth(25);
        jTableUsuarios.getColumnModel().getColumn(6).setMaxWidth(25);
        
        JTableRenderer render = new JTableRenderer();
        jTableUsuarios.getColumnModel().getColumn(6).setCellRenderer(render);
        String image = localPathImage + "avatar.png";
        Icon icon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        
        for(Usuarios user : Global.ListaUsuarios){
            model.addRow(new Object[]{
                user.getId(),
                user.getNome(),
                user.getEmail(),
                user.getSenha(),
                user.getTelefone(),
                user.getImagem(),
                icon
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtTelefone = new javax.swing.JFormattedTextField();
        btnCadastrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimparFormulario = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Lista de usuarios");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("E-mail:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Senha:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");

        btnAtualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAtualizar.setText("Atualizar");

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");

        btnLimparFormulario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimparFormulario.setText("Limpar Formulario");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Imagem");

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Email", "Senha", "Telefone", "Imagem", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuarios);
        if (jTableUsuarios.getColumnModel().getColumnCount() > 0) {
            jTableUsuarios.getColumnModel().getColumn(0).setResizable(false);
            jTableUsuarios.getColumnModel().getColumn(1).setResizable(false);
            jTableUsuarios.getColumnModel().getColumn(2).setResizable(false);
            jTableUsuarios.getColumnModel().getColumn(3).setResizable(false);
            jTableUsuarios.getColumnModel().getColumn(4).setResizable(false);
            jTableUsuarios.getColumnModel().getColumn(5).setResizable(false);
            jTableUsuarios.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addGap(84, 84, 84)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addGap(32, 32, 32)
                                .addComponent(btnAtualizar)
                                .addGap(33, 33, 33)
                                .addComponent(btnExcluir)
                                .addGap(36, 36, 36)
                                .addComponent(btnLimparFormulario))
                            .addComponent(jScrollPane1))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimparFormulario))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.login.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        
        int id = Integer.parseInt(jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 0).toString());
        String nome = jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 1).toString();
        String email = jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 2).toString();
        String senha = jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 3).toString();
        String telefone = jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 4).toString();
        String imagem = jTableUsuarios.getValueAt(jTableUsuarios.getSelectedRow(), 5).toString();
        
        usuario = new Usuarios();   
        usuario.setId(id);
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setTelefone(telefone);
        usuario.setImagem(imagem);
        
        txtNome.setText(nome);
        txtEmail.setText(email);
        txtTelefone.setText(telefone);
        
        if(!usuario.getImagem().isEmpty()){
            lblImagem.setIcon(new ImageIcon(new ImageIcon(usuario.getImagem()).getImage().getScaledInstance(100, 105, Image.SCALE_DEFAULT)));
        } else {
            lblImagem.setIcon(new ImageIcon(new ImageIcon(localPathImage + "avatar.png").getImage().getScaledInstance(100, 105, Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_jTableUsuariosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimparFormulario;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
