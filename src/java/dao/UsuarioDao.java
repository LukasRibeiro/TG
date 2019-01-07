package dao;

import model.Usuario;

public interface UsuarioDao {
    public boolean inserir(Usuario usuario);
    public boolean Excluir(Usuario usuario);
    public Usuario findByNomeUsuario(String nome, String senha);
    public Usuario findByRa(String ra);
}
