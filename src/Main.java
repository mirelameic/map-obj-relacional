import java.sql.Connection;
import java.sql.Date;
import connection.ConnectionBD;
import model.bean.Artista;
import model.dao.ArtistaDAO;

public class Main{
    public static void main(String[] args){
        //Connection connection = ConnectionBD.openConnection();
        //ConnectionBD.closeConnection(connection);

        Artista artista = new Artista();
        ArtistaDAO artistaDAO = new ArtistaDAO();

        artista.setNome("teste");
        artista.setDescricao("descricao");
        artista.setEstiloPrincipal("estiloPrincipal");
        artista.setPeriodoArt("periodoArt");
        artista.setPaisOrig("paisOrigem");
        artista.setDataNasc(Date.valueOf("2015-03-31"));
        artista.setDataMorte(Date.valueOf("2015-03-31"));

        artistaDAO.insert(artista);
        artista.setDescricao("nova descricao");
        artistaDAO.update(artista);
        //artistaDAO.delete(artista);
    }
}
