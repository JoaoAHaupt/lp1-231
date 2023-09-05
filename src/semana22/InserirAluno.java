package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;
import com.mysql.cj.xdevapi.PreparableStatement;

public class InserirAluno {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        // 2. Executar a consulta e usar os resultados
        int id = 1;

        // Não concatenar pq o cara pode fazer uma SQL INJECTION, que apaga a data base
        String sqlInjection = "-- DROP TABLE alunos; --";

        String nome = "Latorre Pereira";
        String email = "latorre.pereira@terra.com";
        boolean ativo = true;

        String sql = "INSERT INTO alunos VALUES(?, ?, ?, ?);";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.setString(2, nome);
        statement.setString(3, email);
        statement.setBoolean(4, ativo);

        statement.executeUpdate();

        // 3. Fechar conexão
        statement.close();
        connection.close();
    }

}
