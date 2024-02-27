
import java.util.Optional;
import javax.swing.JOptionPane;
import model.Global;
import model.Usuarios;

public class Login extends javax.swing.JFrame {

    private final String localPathImage = System.getProperty("user.dir") + "\\src\\imagem\\";
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        btnTrocarSenha.setVisible(false);
        
        CarregarLista();
        
        ShowPrimeiroCadastro();
        
        txtEmail.setText("lincon@gmail.com");
        txtSenha.setText("123");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPrimeiroCadastro = new javax.swing.JButton();
        btnTrocarSenha = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tela de Login");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("E-mail:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Senha:");

        btnPrimeiroCadastro.setText("Primeiro Cadastro");
        btnPrimeiroCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroCadastroActionPerformed(evt);
            }
        });

        btnTrocarSenha.setText("Esqueci a senha");
        btnTrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSenha)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPrimeiroCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTrocarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrimeiroCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrocarSenha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        String email = txtEmail.getText().toLowerCase().trim();
        String senha = txtSenha.getText().toLowerCase().trim();
        
        if(!senha.equals("") && !email.equals("")){
            
            Optional<Usuarios> user = Global.ListaUsuarios.stream().filter(x -> x.getEmail().equals(email) && x.getSenha().equals(senha)).findFirst();
            Usuarios usuario = user.orElse(null);
            
            if(usuario != null){
                ListaUsuarios lista = new ListaUsuarios(this);
                lista.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario e senha invalidos!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
   
        } else {
            JOptionPane.showMessageDialog(null, "Preencha seu e-mail e senha para prosseguir!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnPrimeiroCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroCadastroActionPerformed
        
        PrimeiroCadastro cadastro = new PrimeiroCadastro(this, btnPrimeiroCadastro, btnTrocarSenha);
        cadastro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPrimeiroCadastroActionPerformed

    private void btnTrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocarSenhaActionPerformed
        TrocarSenha senha = new TrocarSenha(this);
        senha.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrocarSenhaActionPerformed

    private void ShowPrimeiroCadastro(){
   
	btnLogin.getLocation();
	btnPrimeiroCadastro.getLocation();
	
	if(!Global.ListaUsuarios.isEmpty()){
		
            btnPrimeiroCadastro.setVisible(false);
            btnLogin.setLocation(150, 182); 
            btnTrocarSenha.setVisible(true);
	}        
    }
    
    private void CarregarLista(){
    	
	Usuarios user1 = new Usuarios();
	user1.setId(1);
	user1.setNome("Lincon");
	user1.setEmail("lincon@gmail.com");
	user1.setSenha("123");
	user1.setTelefone("(12) 98745-1212");
	user1.setImagem("");
	
	Usuarios user2 = new Usuarios(2,"Miriã", "miri@gmail.com", "123", "(12) 99001-4512", (localPathImage + "logo02.png"));
	Usuarios user3 = new Usuarios(3,"Heitor", "heitor@gmail.com", "123", "(12) 98745-3265", "");
	Usuarios user4 = new Usuarios(4,"Lincon", "linconviana@gmail.com", "123", "(12) 98745-3265", (localPathImage + "logo01.png") );
	
	Global.ListaUsuarios.add(user1);
	Global.ListaUsuarios.add(user2);
	Global.ListaUsuarios.add(user3);
	Global.ListaUsuarios.add(user4);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPrimeiroCadastro;
    private javax.swing.JButton btnTrocarSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
