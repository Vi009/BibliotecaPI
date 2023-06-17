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
import model.Livros;

public class RepLivros {

    Connection con;

    public boolean inserir(Livros livros) {

        con = ConexaoMySql.getConexao();

        String sql = "insert into livros (titulo,"
                + "autor,editora,num_copias_disp,categoria) values "
                + "(?,?,?,?,?)";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, livros.getTitulo());
            stmt.setString(2, livros.getAutor());
            stmt.setString(3, livros.getEditora());
            stmt.setInt(4, livros.getNum_cop_disp());
            stmt.setString(5, livros.getCategoria());

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

    public List<Livros> retornar() {

        con = ConexaoMySql.getConexao();
        List<Livros> livros = new ArrayList<>();

        String sql = "select * from livros order by id desc";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                Livros livro = new Livros();

                livro.setId(rs.getInt("id"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setEditora(rs.getString("editora"));
                livro.setNum_cop_disp(rs.getInt("num_copias_disp"));
                livro.setCategoria(rs.getString("categoria"));

                livros.add(livro);
            }
        } catch (SQLException ex) {
            return null;
        }

        ConexaoMySql.fecharConexao();

        return livros;
    }

    public boolean atualizar(Livros livro) {

        con = ConexaoMySql.getConexao();
        String sql = "update livros set titulo = ?, "
                + "autor = ?,editora = ?, num_copias_disp = ?,categoria = ? where id = ?";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getEditora());
            stmt.setInt(4, livro.getNum_cop_disp());
            stmt.setString(5, livro.getCategoria());
            stmt.setInt(6, livro.getId());

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

    public List<Livros> pesquisar(String valor, String tipoPesquisa) {

        con = ConexaoMySql.getConexao();
        List<Livros> livros = new ArrayList<>();

        String sql = "";

        if (tipoPesquisa.equals("titulo")) {
            sql = "select * from livros where titulo like '%" + valor + "%'";
        } else if (tipoPesquisa.equals("autor")) {
            sql = "select * from livros where autor like '%" + valor + "%'";
        } else if (tipoPesquisa.equals("categoria")) {
            sql = "select * from livros where categoria like '%" + valor + "%'";
        } else if (tipoPesquisa.equals("id")) {
            sql = "select * from livros where id like '%" + valor + "%'";
        }

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                Livros livro = new Livros();

                livro.setId(rs.getInt("id"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setEditora(rs.getString("editora"));
                livro.setNum_cop_disp(rs.getInt("num_copias_disp"));
                livro.setCategoria(rs.getString("categoria"));

                livros.add(livro);
            }
        } catch (SQLException ex) {
            return null;
        }

        ConexaoMySql.fecharConexao();

        return livros;
    }

    public boolean excluir(int id) {

        con = ConexaoMySql.getConexao();
        String sql = "delete from livros where id = ?";

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

    public Livros pesquisarLivros(String valor) {

        con = ConexaoMySql.getConexao();

        String sql = "select * from livros where titulo = '" + valor + "'";
        Livros l = new Livros();

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                l.setId(rs.getInt("id"));
                l.setTitulo(rs.getString("titulo"));
                l.setAutor(rs.getString("autor"));
                l.setEditora(rs.getString("editora"));
                l.setNum_cop_disp(rs.getInt("num_copias_disp"));
                l.setCategoria(rs.getString("categoria"));
            }

            ConexaoMySql.fecharConexao();
            return l;

        } catch (SQLException ex) {
            return null;
        }

    }

}
