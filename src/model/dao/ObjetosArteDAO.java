package model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import connection.ConnectionBD;
import model.bean.ObjetosArte;

public class ObjetosArteDAO{

    public void insert(ObjetosArte objetoArte){

        Connection con = ConnectionBD.openConnection();
        PreparedStatement stmt = null;

        try{
            stmt = con.prepareStatement(
                "INSERT INTO OBJETOS_ARTE "
                + "(num_id, titulo, nome_artista, descricao, ano_criacao, periodo_art, pais_cultura, estilo, tipo, status) " 
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        
            stmt.setInt(1, objetoArte.getNumID());
            stmt.setString(2, objetoArte.getTitulo());
            stmt.setString(3, objetoArte.getNomeArtista());
            stmt.setString(4, objetoArte.getDescricao());
            stmt.setDate(5, objetoArte.getAnoCriacao());
            stmt.setString(6, objetoArte.getPeriodoArt());
            stmt.setString(7, objetoArte.getPaisCultura());
            stmt.setString(8, objetoArte.getEstilo());
            stmt.setObject(9, objetoArte.getTipo());
            stmt.setObject(10, objetoArte.getStatus());
            stmt.executeUpdate();
            System.out.println("ObjetoArte inserido com sucesso!");

        }catch (SQLException e){
            System.out.println("Exception insert ObjetosArteDAO");
        }finally{
            ConnectionBD.closeConnection(con, stmt);
        }
    }
}
