import connection.ConnectionBD;

public class Main{
    public static void main(String[] args){
        ConnectionBD connection = new ConnectionBD();
        connection.conect("postgres", "postgres", "gato44");
    }
}
