package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletarAluno {
     public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        System.out.println("Insira o id do lado para deletar seus dados ");
        Scanner sc = new Scanner(System.in);
        int idDesejado = sc.nextInt();

        // 2. Buscar todos os alunos
        String sql = "DELETE FROM alunos WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idDesejado);
        statement.executeUpdate();

        // 3. Fechar a conexão
        sc.close();
        connection.close();
        statement.close();
        

    }
    
}
