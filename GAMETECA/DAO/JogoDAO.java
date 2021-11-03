
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
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Jogo> lista = new ArrayList<>();
    
    
    public JogoDAO(Connection connection){
            this.connection = connection;
    }

    public void insert(Jogo jogo) throws SQLException{
        
        String sql = "insert into jogo(nome_jogo, genero_jogo, ano_jogo, desenvolvedora_jogo, distribuidora_jogo, progresso_jogo) values("
                + "'" + jogo.getNomeJogo() + "', '" + jogo.getGeneroJogo() + "', '" + jogo.getAnoLancamentoJogo() + "', '" + jogo.getDesenvolvedoraJogo() + "', '" + jogo.getDistribuidoraJogo() + "', '" + jogo.getProgessoJogo() + "');" ;
    
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
    }
     public ArrayList<Jogo> ListarJogoUsuario(){
        String sql = "select * from Jogo";
        //chamar o banco //
        
        try {
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Jogo objJogo = new Jogo();
                objJogo.setIdJogo(rs.getInt("IdJogo"));
                objJogo.setNomeJogo(rs.getString("nome_jogo"));
                objJogo.setGeneroJogo(rs.getString("genero_jogo"));
                objJogo.setAnoLancamentoJogo(rs.getInt("ano_jogo"));
                objJogo.setDesenvolvedoraJogo(rs.getString("desenvolvedora_jogo"));
                objJogo.setDistribuidoraJogo(rs.getString("distribuidora_jogo"));
                objJogo.setProgessoJogo(rs.getFloat("progresso_jogo"));
                
                
                lista.add(objJogo);
                
                
            }
            
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "JogoDAO Listar: " + erro);
                                
            
        }
        
        return lista;
         
    }

}
