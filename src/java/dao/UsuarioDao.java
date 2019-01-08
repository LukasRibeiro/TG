package dao;

import model.Usuario;

public interface UsuarioDao {
    public boolean inserir(Usuario usuario);
    public boolean Excluir(Usuario usuario);
    public boolean findByNomeUsuario(Usuario usuario);
    public Usuario findByRa(String ra);
}
