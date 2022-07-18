package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD{
    Connection conexao = null;
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/";

    public Connection conect(String dbname, String user, String password){
        try{
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL+dbname, user, password);
            System.out.println("Connection Established");
            conexao.close();
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Exception :(");
        }

        return conexao;
    }
}
