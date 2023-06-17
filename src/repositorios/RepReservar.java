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
import javax.swing.JOptionPane;
import model.Livros;
import model.Reservas;
import model.Usuarios;
import utils.Utils;

public class RepReservar {

    Connection con;

    Utils util = new Utils();

    public boolean inserir(Reservas reservas) {

        con = ConexaoMySql.getConexao();

        String sql = "insert into reservas (id_livro,id_usuario,data_reserva,"
                + "data_devolucao)"
                + " values (?,?,?,?)";

        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, reservas.getId_livro());
            stmt.setInt(2, reservas.getId_usuario());
            stmt.setString(3, reservas.dataReservaTostringsql());
            stmt.setString(4, reservas.dataEntregaTostringsql());

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

    public List<Reservas> retornarLivro() {

        con = ConexaoMySql.getConexao();
        List<Reservas> reservas = new ArrayList<>();

        String sql = "select r.*,l.titulo,l.categoria,l.num_copias_disp from reservas r, livros l where r.id_livro = l.id order by id desc";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                Reservas r = new Reservas();

                r.setLivro(rs.getString("titulo"));
                r.setCategoria(rs.getString("categoria"));
                r.setCop_disp(rs.getInt("num_copias_disp"));

                reservas.add(r);
            }
        } catch (SQLException ex) {
            return null;
        }

        ConexaoMySql.fecharConexao();

        return reservas;
    }

    public List<Reservas> retornarUsuario() {

        con = ConexaoMySql.getConexao();
        List<Reservas> reservas = new ArrayList<>();

        String sql = "select r.*,u.no_usuario,u.telefone,u.status from reservas r, usuarios u where r.id_usuario = u.id order by id desc";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                Reservas r = new Reservas();

                r.setUsuario(rs.getString("no_usuario"));
                r.setTelefone(rs.getString("telefone"));

                reservas.add(r);
            }
        } catch (SQLException ex) {
            return null;
        }

        ConexaoMySql.fecharConexao();

        return reservas;
    }

    public List<Reservas> retornarTabela() {

        con = ConexaoMySql.getConexao();
        List<Reservas> reservas = new ArrayList<>();

        String sql = "select r.*, l.titulo,u.no_usuario from reservas r, livros l, usuarios u where r.id_livro = l.id and r.id_usuario = u.id order by id desc";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                Reservas r = new Reservas();

                r.setId(rs.getInt("id"));
                r.setLivro(rs.getString("titulo"));
                r.setUsuario(rs.getString("no_usuario"));
                r.setData_reserva(rs.getTimestamp("data_reserva").toLocalDateTime());
                r.setData_entrega(rs.getTimestamp("data_devolucao").toLocalDateTime());

                reservas.add(r);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }

        ConexaoMySql.fecharConexao();

        return reservas;
    }

    public List<Reservas> retornarTabelaMulta() {

        con = ConexaoMySql.getConexao();
        List<Reservas> reservas = new ArrayList<>();

        String sql = "select r.*,u.no_usuario from reservas r, usuarios u where r.id_usuario = u.id and r.multa = 1 order by id desc";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                Reservas r = new Reservas();

                r.setId(rs.getInt("id"));
                r.setData_entrega(rs.getTimestamp("data_devolucao").toLocalDateTime());
                r.setUsuario(rs.getString("no_usuario"));

                reservas.add(r);
            }
        } catch (SQLException ex) {
            return null;
        }

        ConexaoMySql.fecharConexao();

        return reservas;
    }

    public boolean finalizar(int id) {

        con = ConexaoMySql.getConexao();

        String sql = "update reservas r, usuarios u  set r.multa = ?, r.status = ?, u.status = ? where r.id = '" + id + "' and r.id_usuario = u.id";

        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, 0);
            stmt.setInt(2, 0);
            stmt.setInt(3, 0);

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

    public boolean inserirMulta() {

        con = ConexaoMySql.getConexao();

        String sql = "update reservas r,usuarios u set r.multa = ?, u.status = ? "
                + "where r.id_usuario = u.id and r.status = 1 and r.data_devolucao < current_date() order by r.id desc";

        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, 1);
            stmt.setInt(2, 1);

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

    public List<Reservas> pesquisarLivro(String valor, String tipoPesquisa) {
        //mudar quando acrescentar pesquisar na tela
        con = ConexaoMySql.getConexao();
        List<Reservas> reservas = new ArrayList<>();

        String sql = "";

        if (tipoPesquisa.equals("titulo")) {
            sql = "select * from livros l where l.id = '" + valor + "'";
        }

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                Reservas r = new Reservas();

                r.setLivro(rs.getString("titulo"));
                r.setCategoria(rs.getString("categoria"));
                r.setCop_disp(rs.getInt("num_copias_disp"));

                reservas.add(r);
            }
        } catch (SQLException ex) {
            return null;
        }

        ConexaoMySql.fecharConexao();

        return reservas;
    }

    public List<Usuarios> pesquisarUsuario(String valor) {
        //mudar quando acrescentar pesquisar na tela
        con = ConexaoMySql.getConexao();
        List<Usuarios> usuario = new ArrayList<>();

        String sql = "select * from usuarios  where id = '" + valor + "'";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                Usuarios u = new Usuarios();

                u.setNome(rs.getString("no_usuario"));
                u.setTelefone(rs.getString("telefone"));
                u.setMulta(rs.getInt("status"));

                usuario.add(u);

            }
        } catch (SQLException ex) {
            return null;
        }

        ConexaoMySql.fecharConexao();

        return usuario;
    }
    
}
