/* URIs para consulta: 
 * COMO CRIAR UMA CONEXÃO JDBC COM BANCO DE DADOS MYSQL EM JAVA: https://youtu.be/70s7JsiaBRc?si=WnYXi3tNwndC9M02
 * Java - Como criar campo de senha dentro de um JOptionPane: https://youtu.be/46QVIwa4tiM?si=slOcsWRdSQiGNoBl
 * jpasswordfield show password: https://www.google.com/search?q=jpasswordfield+show+password&hl=pt-BR&pli=1
 * Aula 1497 java - JPasswordField e setEchoChar Swing: https://youtu.be/AD9Y9Yji8Gw?si=C295lAruvQYmOxVF 
 */

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
        JOptionPane.showConfirmDialog(null, new Object[]{labelSenha, jpfSenha}, "Input", JOptionPane.OK_CANCEL_OPTION);
        
        while(String.valueOf(jpfSenha.getPassword()).equals(null) || String.valueOf(jpfSenha.getPassword()).equals("")){
            JOptionPane.showConfirmDialog(null, new Object[]{labelSenha, jpfSenha}, "Input", JOptionPane.OK_CANCEL_OPTION);
        }

        String senha = new String(jpfSenha.getPassword());
        // System.out.println(jpfSenha.getPassword());
        u.setSenha(senha);

        new UsuarioDAO().cadastrarUsuario(u);
        
    }
}
