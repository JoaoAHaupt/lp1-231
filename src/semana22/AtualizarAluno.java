package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class AtualizarAluno {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        // 2. Executar a consulta e usar os resultados
        

        // Não concatenar pq o cara pode fazer uma SQL INJECTION, que apaga a data base
        //String sqlInjection = "-- DROP TABLE alunos; --";
        System.out.println("Insira o id e as mudanças que os dados sofrerão(nome, email e atividade) ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String nome = sc.nextLine();
        String email = sc.nextLine();
        boolean ativo = sc.nextBoolean();
        

        

        String sql = "UPDATE alunos SET nome = ?, email = ?, ativo = ? WHERE id = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, nome);
        statement.setString(2, email);
        statement.setBoolean(3, ativo);
        statement.setInt(4, id);


        int deuCerto = statement.executeUpdate();

        if (deuCerto > 0) {
            System.out.println("Dados foram atualizados");
        } else {
            System.out.println("Aluno com id = " + id + " não existe no banco de dados." );
        }

        // 3. Fechar conexão
        sc.close();
        statement.close();
        connection.close();
    }

}
