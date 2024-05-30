package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private static final String url = "jdbc:mysql://localhost:3306/nome-da-tua-base-de-dados";
    private static final String user = "utilizador-da-tua-base-de-dados";
    private static final String password = "palavra-passe-do-teu-utilizador";

    private static Connection conn;

    public static Connection getConexao(){

        try {

            if(conn == null){
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }


}