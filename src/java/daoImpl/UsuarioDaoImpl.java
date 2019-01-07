package daoImpl;

import dao.UsuarioDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

public class UsuarioDaoImpl implements UsuarioDao {
    
    private Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    
    public UsuarioDaoImpl(){
        con = new ConexaoBD().conectandoBanco();
    }

    @Override
    public boolean inserir(Usuario usuario) {
        String sql = "INSERT INTO usuario(nome,ra,senha) VALUES(?,?,?)";
        
        try{
            pst = con.prepareStatement(sql);
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getRa());
            pst.setString(3, usuario.getSenha());
            pst.execute();
            pst.close();
        
            return true;
            
        }catch(Exception ex){
            Logger.getLogger(UsuarioDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean Excluir(Usuario usuario) {
        String sql = "DELETE FROM usuario WHERE ra = ?";
        
        try{
            st =con.createStatement();
            st.execute(sql);
            st.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
