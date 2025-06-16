import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import DAO.UsuarioDAO;
import entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        Usuario u = new Usuario();
        u.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
        u.setLogin(JOptionPane.showInputDialog("Digite seu nome de usuário:"));
        u.setEmail(JOptionPane.showInputDialog("Digite seu email:"));
        JLabel labelSenha = new JLabel("Digite a senha:");
        JPasswordField jpfSenha = new JPasswordField();
        JOptionPane.showConfirmDialog(null, new Object[]{labelSenha, jpfSenha}, null, JOptionPane.OK_CANCEL_OPTION);
        String senha = new String(jpfSenha.getPassword());
        // System.out.println(jpfSenha.getPassword());
        u.setSenha(senha);

        new UsuarioDAO().cadastrarUsuario(u);
        
    }
}
