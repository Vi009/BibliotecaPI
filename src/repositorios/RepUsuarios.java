package repositorios;

import com.mysql.jdbc.MySQLConnection;
import conn.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Usuarios;

public class RepUsuarios {

    Connection con;

    public boolean inserir(Usuarios usuarios) {

        con = ConexaoMySql.getConexao();

        String sql = "insert into usuarios (no_usuario,"
                + "endereco,bairro,cidade,UF, telefone,email,sexo) values "
                + "(?,?,?,?,?,?,?,?)";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, usuarios.getNome());
            stmt.setString(2, usuarios.getEndereço());
            stmt.setString(3, usuarios.getBairro());
            stmt.setString(4, usuarios.getCidade());
            stmt.setString(5, usuarios.getUF());
            stmt.setString(6, usuarios.getTelefone());
            stmt.setString(7, usuarios.getEmail());
            stmt.setString(8, usuarios.getSexo());

            stmt.execute();
            con.commit();
            ConexaoMySql.fecharConexao();

            return true;
        } catch (Exception ex) {
            try {
                con.rollback();
                System.err.println(ex.getMessage());
                return false;
            } catch (SQLException exSql) {
                System.err.println(exSql.getMessage());
            }
        }

        return true;
    }

    public List<Usuarios> retornar() {

        con = ConexaoMySql.getConexao();
        List<Usuarios> usuarios = new ArrayList<>();

        String sql = "select * from usuarios order by id desc";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                Usuarios usuario = new Usuarios();

                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("no_usuario"));
                usuario.setEndereço(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setUF(rs.getString("UF"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSexo(rs.getString("sexo"));

                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            return null;
        }

        ConexaoMySql.fecharConexao();

        return usuarios;
    }

    public boolean atualizar(Usuarios usuario) {

        con = ConexaoMySql.getConexao();
        String sql = "update usuarios set no_usuario = ?, "
                + "endereco = ?,bairro = ?, cidade = ?,UF = ?, telefone = ?, email = ?, sexo = ? where id = ?";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEndereço());
            stmt.setString(3, usuario.getBairro());
            stmt.setString(4, usuario.getCidade());
            stmt.setString(5, usuario.getUF());
            stmt.setString(6, usuario.getTelefone());
            stmt.setString(7, usuario.getEmail());
            stmt.setString(8, usuario.getSexo());
            stmt.setInt(9, usuario.getId());
            stmt.execute();

            con.commit();
            ConexaoMySql.fecharConexao();

            return true;

        } catch (SQLException ex) {
            try {
                con.rollback();
                System.err.println(ex);
                return false;
            } catch (SQLException ex1) {
                System.err.println(ex1);
            }

            return false;
        }

    }

    public List<Usuarios> pesquisar(String valor, String tipoPesquisa) {
        //mudar quando acrescentar pesquisar na tela
        con = ConexaoMySql.getConexao();
        List<Usuarios> usuarios = new ArrayList<>();

        String sql = "";

            sql = "select * from usuarios where no_usuario like '%" + valor + "%'";
         
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                Usuarios usuario = new Usuarios();

                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("no_usuario"));
                usuario.setEndereço(rs.getString("endereco"));
                usuario.setBairro(rs.getString("bairro"));
                usuario.setCidade(rs.getString("cidade"));
                usuario.setUF(rs.getString("UF"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSexo(rs.getString("sexo"));

                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            return null;
        }

        ConexaoMySql.fecharConexao();

        return usuarios;
    }

    public boolean excluir(int id) {

        con = ConexaoMySql.getConexao();
        String sql = "delete from usuarios where id = ?";

        try {

            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.execute();
            con.commit();
            ConexaoMySql.fecharConexao();

            return true;
        } catch (SQLException ex) {

            return false;
        }

    }

}
