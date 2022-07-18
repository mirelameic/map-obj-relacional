package model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import connection.ConnectionBD;
import model.bean.Artista;

public class ArtistaDAO{
    public void insert(Artista artista){
        Connection con = ConnectionBD.openConnection();
        PreparedStatement stmt = null;

        try{
            stmt = con.prepareStatement(
                "INSERT INTO ARTISTA "
                +"(nome, descricao, estilo_principal, periodo_art, pais_origem, data_nascimento, data_morte) " 
                + "VALUES(?, ?, ?, ?, ?, ?, ?)");
        
            stmt.setString(1, artista.getNome());
            stmt.setString(2, artista.getDescricao());
            stmt.setString(3, artista.getEstiloPrincipal());
            stmt.setString(4, artista.getPeriodoArt());
            stmt.setString(5, artista.getPaisOrig());
            stmt.setDate(6, artista.getDataNasc());
            stmt.setDate(7, artista.getDataMorte());
            stmt.executeUpdate();
            System.out.println("Artista inserido com sucesso!");

        }catch (SQLException e) {
            System.out.println("ExceptionDAO :(");
        }finally{
            ConnectionBD.closeConnection(con, stmt);
        }
    }
}
