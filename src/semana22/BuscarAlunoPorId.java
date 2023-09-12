package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BuscarAlunoPorId {
        public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        
        Scanner sc = new Scanner(System.in);
        int idDesejado = sc.nextInt();

        // 2. Buscar todos os alunos
        String sql = "SELECT * FROM alunos WHERE id = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(idDesejado, 1);

        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");

            System.out.println(id + "," + nome + "," + email + "," + ativo);
        }

        // 3. Fechar a conexão
        rs.close();
        connection.close();
        statement.close();
        

    }
}
