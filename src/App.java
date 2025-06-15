import javax.swing.JOptionPane;

import DAO.UsuarioDAO;
import entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        Usuario u = new Usuario();
        u.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
        u.setLogin(JOptionPane.showInputDialog("Digite seu nome de usuário:"));
        u.setEmail(JOptionPane.showInputDialog("Digite seu email:"));
        u.setSenha(JOptionPane.showInputDialog("Digite sua senha:"));

        new UsuarioDAO().cadastrarUsuario(u);
        
    }
}
