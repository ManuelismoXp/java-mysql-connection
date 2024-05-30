import java.sql.Connection;
import java.sql.PreparedStatement;

import conexao.Conexao;

public class App {
    public static void main(String[] args) throws Exception {
        Connection con = Conexao.getConexao();

        PreparedStatement ps;

        String sql = "Escrever-tua-query";

        ps = con.prepareStatement(sql);

        ps.execute();

        ps.close();
    }
}
