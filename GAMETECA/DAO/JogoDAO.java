
package DAO;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Jogo;

/**
 *
 * @author Pancaldi
 */
public class JogoDAO {
    private final Connection connection;
    
    public JogoDAO(Connection connection){
            this.connection = connection;
    }

    public void insert(Jogo jogo) throws SQLException{
        
        String sql = "insert into jogo(nome_jogo, genero_jogo, ano_jogo, desenvolvedora_jogo, distribuidora_jogo, progresso_jogo) values("
                + "'" + jogo.getNomeJogo() + "', '" + jogo.getGeneroJogo() + "', '" + jogo.getAnoLancamentoJogo() + "', '" + jogo.getDesenvolvedoraJogo() + "', '" + jogo.getDistribuidoraJogo() + "', '" + jogo.getProgessoJogo() + "');" ;
    
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
    }

}
