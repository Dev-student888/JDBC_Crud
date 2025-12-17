/* URIs para consulta: 
 * COMO CRIAR UMA CONEXÃO JDBC COM BANCO DE DADOS MYSQL EM JAVA: https://youtu.be/70s7JsiaBRc?si=WnYXi3tNwndC9M02
 * Java - Como criar campo de senha dentro de um JOptionPane: https://youtu.be/46QVIwa4tiM?si=slOcsWRdSQiGNoBl
 * jpasswordfield show password: https://www.google.com/search?q=jpasswordfield+show+password&hl=pt-BR&pli=1
 * Aula 1497 java - JPasswordField e setEchoChar Swing: https://youtu.be/AD9Y9Yji8Gw?si=C295lAruvQYmOxVF 
 * no JOptionPane.showConfirmDialog, Cancel retorna 0 ou 1? - Pesquisa Google: https://www.google.com/search?q=no+JOptionPane.showConfirmDialog%2C+Cancel+retorna+0+ou+1%3F&oq=no+JOptionPane.showConfirmDialog%2C+Cancel+retorna+0+ou+1%3F&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCTQwNzQ5ajBqMagCALACAA&sourceid=chrome&ie=UTF-8 
 * Qual a diferença entre String.valueOf.isBlank e String.valueOf.isEmpty ? - Pesquisa Google: https://www.google.com/search?q=Qual+a+diferen%C3%A7a+entre+String.valueOf.isBlank+e+String.valueOf.isEmpty+%3F&sca_esv=b83ae5ae575c3e79&sxsrf=AE3TifM4wqx0fZRkgvbCWhWbENNdnioFpw%3A1765638229113&ei=VYA9aYq4BuHX1sQPqqLPuQo&ved=0ahUKEwjKtsr76rqRAxXhq5UCHSrRM6cQ4dUDCBE&uact=5&oq=Qual+a+diferen%C3%A7a+entre+String.valueOf.isBlank+e+String.valueOf.isEmpty+%3F&gs_lp=Egxnd3Mtd2l6LXNlcnAiSVF1YWwgYSBkaWZlcmVuw6dhIGVudHJlIFN0cmluZy52YWx1ZU9mLmlzQmxhbmsgZSBTdHJpbmcudmFsdWVPZi5pc0VtcHR5ID8yBBAjGCdI3qAEUOgNWOyaBHACeACQAQCYAaoKoAHYxQGqARIwLjE2LjMyLjQuNC4xMC40LjK4AQPIAQD4AQGYAkqgAovlAcICBxAjGLADGCfCAggQABiwAxjvBcICCxAAGIAEGLEDGIMBwgIFEAAYgATCAggQABiABBixA8ICDhAAGIAEGLEDGIoFGI0GwgIKEAAYgAQYQxiKBcICEBAuGIAEGNEDGEMYxwEYigXCAgsQABiABBiSAxiKBcICCxAAGIAEGLEDGIoFwgIREAAYgAQYsQMYyQMYigUYjQbCAgoQABiABBgUGIcCwgIOEAAYgAQYsQMYgwEYigXCAgYQABgWGB7CAgUQABjvBcICCBAAGIAEGKIEwgIFECEYoAGYAwCIBgGQBgeSBxEyLjcuMjguMTYuNi45LjQuMqAHk8sEsgcRMC43LjI4LjE2LjYuOS40LjK4B7rkAcIHEDItMi4xNS4yNi4yNi40LjHIB9oZgAgA&sclient=gws-wiz-serp 
 * Como redirecionar o botão do JOptionPane.showmessagedialog | Java | Solucionado: https://cursos.alura.com.br/forum/topico-como-redirecionar-o-botao-do-joptionpane-showmessagedialog-273330 
 * como mudar o ícone no JOptionPane Java através do java swing - Pesquisa Google: https://www.google.com/search?q=como+mudar+o+%C3%ADcone+no+JOptionPane+Java+atrav%C3%A9s+do+java+swing&sca_esv=16c626bee280b6be&sxsrf=AE3TifN9_u-u2ZPHVDZeU0dUiGARInDUTg%3A1765933681058&ei=cQJCaaelA-Op1sQP6NyxiAY&ved=0ahUKEwjnoYbOt8ORAxXjlJUCHWhuDGEQ4dUDCBE&uact=5&oq=como+mudar+o+%C3%ADcone+no+JOptionPane+Java+atrav%C3%A9s+do+java+swing&gs_lp=Egxnd3Mtd2l6LXNlcnAiPmNvbW8gbXVkYXIgbyDDrWNvbmUgbm8gSk9wdGlvblBhbmUgSmF2YSBhdHJhdsOpcyBkbyBqYXZhIHN3aW5nMgUQABjvBTIFEAAY7wUyBRAAGO8FMgUQABjvBUj-lQFQowlY04gBcAN4AJABAJgB7QKgAfEjqgEIMC4xMy43LjO4AQPIAQD4AQGYAhqgAuIpwgIIEAAYsAMY7wXCAgsQABiABBiwAxiiBMICCxAAGLADGKIEGIkFwgIFECEYoAHCAggQABiABBiiBMICBRAhGJ8FmAMAiAYBkAYFkgcKMy4xMi44LjIuMaAH30WyBwowLjEyLjguMi4xuAeVKcIHCjItNS4xMy41LjPIB_IDgAgA&sclient=gws-wiz-serp
 * como redimensionar o ícone para colocá-lo no JOptionPane do Java 21 através do java swing - Pesquisa Google: https://www.google.com/search?q=como+redimensionar+o+%C3%ADcone+para+coloc%C3%A1-lo+no+JOptionPane+do+Java+21+atrav%C3%A9s+do+java+swing&sca_esv=16c626bee280b6be&sxsrf=AE3TifMYBHyRLHvdU5eBbID6Hbav5ORK5Q%3A1765937341083&ei=vRBCaczqBIPD5OUPjK3wkAw 
 * sintaxe de JOptionPane.showMessageDialog - Pesquisa Google: https://www.google.com/search?q=sintaxe+de+JOptionPane.showMessageDialog&oq=sintaxe+de+JOptionPane.showMessageDialog&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCTE5MDgwajBqMagCALACAA&sourceid=chrome&ie=UTF-8
 * como usar joptionpane showoptiondialog no java 21 - Pesquisa Google: https://www.google.com/search?q=como+usar+joptionpane+showoptiondialog+no+java+21&sca_esv=16c626bee280b6be&sxsrf=AE3TifOcue-5C_5WVlU-LYjf3kaF-GYzFA%3A1765932779537&ei=6_5BaZurIM3a5OUPuJvz-Qw&ved=0ahUKEwjbzJWgtMORAxVNLbkGHbjNPM8Q4dUDCBE&uact=5&oq=como+usar+joptionpane+showoptiondialog+no+java+21&gs_lp=Egxnd3Mtd2l6LXNlcnAiMWNvbW8gdXNhciBqb3B0aW9ucGFuZSBzaG93b3B0aW9uZGlhbG9nIG5vIGphdmEgMjEyBRAAGO8FMgUQABjvBTIFEAAY7wUyCBAAGKIEGIkFSPdJUNILWL03cAF4AZABAJgBuwKgAa4SqgEHMC41LjUuMbgBA8gBAPgBAZgCC6AClBLCAgoQABiwAxjWBBhHwgIGEAAYFhgewgIIEAAYgAQYogTCAgUQIRigAZgDAIgGAZAGBJIHBzEuMy42LjGgB40nsgcHMC4zLjYuMbgH8hHCBwcyLTEuNy4zyAewAYAIAA&sclient=gws-wiz-serp
 * Java JOptionPane - GeeksforGeeks: https://www.geeksforgeeks.org/java/java-joptionpane/ 
 */

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import DAO.UsuarioDAO;
import entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        Usuario u = new Usuario();
        // Mudar o ícone nos 2 (dois) últimos métodos JOptionPane.showOptionDialog 
        // Seu código vai aqui! 
        // Array de Strings para JOptionPane.showOptionDialog ao final do código.
        String[] opcao = {"OK"};
        // Aplicar Regex para validar nome, login, email e senha. 
        // Seu código vai aqui!
        
        u.setNome(JOptionPane.showInputDialog("Digite seu nome completo:"));
        u.setLogin(JOptionPane.showInputDialog("Digite seu nome de usuário:"));
        u.setEmail(JOptionPane.showInputDialog("Digite seu email:"));
        
        JLabel labelSenha = new JLabel("Digite a senha:");
        JPasswordField jpfSenha = new JPasswordField();
        JOptionPane.showConfirmDialog(null, new Object[]{labelSenha, jpfSenha}, "Input", JOptionPane.OK_CANCEL_OPTION);
        
        while(String.valueOf(jpfSenha.getPassword()).equals(null) || String.valueOf(jpfSenha.getPassword()).isBlank()){
            int i = JOptionPane.showConfirmDialog(null, "Senha inválida!\nSua senha não pode estar vazia!\nPor favor, tente novamente!", "Aviso", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            if (i == JOptionPane.CANCEL_OPTION || i == JOptionPane.CLOSED_OPTION){
                break;
            } else{
                int c = JOptionPane.showConfirmDialog(null, new Object[]{labelSenha, jpfSenha}, "Input", JOptionPane.OK_CANCEL_OPTION);
                if (c == JOptionPane.CANCEL_OPTION || c == JOptionPane.CLOSED_OPTION){
                    break;
                }
            }
            
        }

        if (String.valueOf(jpfSenha.getPassword()).equals(null) || String.valueOf(jpfSenha.getPassword()).isBlank()){
            JOptionPane.showMessageDialog(null, "Operação de cadastro cancelada!", "Aviso", JOptionPane.OK_OPTION);
            return;
        } else {
            String senha = new String(jpfSenha.getPassword());
            // System.out.println(jpfSenha.getPassword());
            u.setSenha(senha);
            // Mudar o ícone neste JOptionPane.showOptionDialog abaixo
            JOptionPane.showOptionDialog(null, "Senha cadastrada com sucesso!", "Senha Cadastrada", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);

            new UsuarioDAO().cadastrarUsuario(u);
            // Mudar o ícone neste JOptionPane.showOptionDialog abaixo também
            JOptionPane.showOptionDialog(null, "Usuário cadastrado com sucesso!", "Cadastro Bem Sucedido", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);
        }
        
    }
}
