package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Conexao
 */
public class Conexao {
    
    private static final String url = "jdbc:postgresql://localhost:5432/teste_db";
    private static final String user = "postgres";
    private static final String password = "";

    private static Connection conn;

    public static Connection getConexao(){

        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            } else {
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

}
