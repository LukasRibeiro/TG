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

public class UsuarioDaoImpl extends ConexaoBD implements UsuarioDao {
    
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
    
    @Override
    public boolean findByNomeUsuario(Usuario usuario){
        
        String sql = "SELECT * FROM usuario WHERE nome = ? and senha = ?";
        
        try{
            pst = this.con.prepareStatement(sql);
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getSenha());
            rs = this.pst.executeQuery();
            
            while(rs.next()){
                return true;
                /*
                usuario.setId(this.rs.getInt("id"));
                usuario.setNome(this.rs.getString("nome"));
                usuario.setRa(this.rs.getString("ra"));
                usuario.setSenha(this.rs.getString("senha")); */
            }
            this.fechaBanco(con, pst, rs);
            
    }catch(Exception e){
        System.out.print("\nerro ao encontrar usuario pelo nome");
        this.fechaBanco(con, pst, rs);
        }
        return false;
    }
        
    @Override
    public Usuario findByRa(String ra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
    
    
    
    
    
    
    
    
    
  