package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BuscarAlunoPorNome {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        System.out.println("Insira o nome do lado para mostrar os dados ");
        Scanner sc = new Scanner(System.in);
        String nomeDesejado = sc.nextLine();

        // 2. Buscar todos os alunos
        String sql = "SELECT * FROM alunos WHERE name = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, nomeDesejado);
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
        sc.close();
        connection.close();
        statement.close();
        

    }
    
}
