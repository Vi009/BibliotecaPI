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
import model.Funcionarios;

public class RepFuncionarios {

    Connection con;

    public boolean inserir(Funcionarios funcionarios) {

        con = ConexaoMySql.getConexao();

        String sql = "insert into funcionarios (no_funcionario,"
                + "cargo, telefone, email ,sexo, endereço, bairro, cidade, UF, senha) values "
                + "(?,?,?,?,?,?,?,?,?,md5(?))";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, funcionarios.getNome());
            stmt.setString(2, funcionarios.getCargo());
            stmt.setString(3, funcionarios.getTelefone());
            stmt.setString(4, funcionarios.getEmail());
            stmt.setString(5, funcionarios.getSexo());
            stmt.setString(6, funcionarios.getEndereço());
            stmt.setString(7, funcionarios.getBairro());
            stmt.setString(8, funcionarios.getCidade());
            stmt.setString(9, funcionarios.getUF());
            stmt.setString(10, funcionarios.getSenha());

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

    public List<Funcionarios> retornar() {

        con = ConexaoMySql.getConexao();
        List<Funcionarios> funcionarios = new ArrayList<>();

        String sql = "select * from funcionarios order by id desc";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                Funcionarios funcionario = new Funcionarios();

                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("no_funcionario"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setSexo(rs.getString("sexo"));
                funcionario.setEndereço(rs.getString("endereço"));
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setUF(rs.getString("UF"));

                funcionarios.add(funcionario);
            }
        } catch (SQLException ex) {
            return null;
        }

        ConexaoMySql.fecharConexao();

        return funcionarios;
    }

    public boolean atualizar(Funcionarios funcionario) {

        con = ConexaoMySql.getConexao();
        String sql = "update funcionarios set no_funcionario = ?, "
                + "cargo = ?,telefone = ?, email = ?,sexo = ?, endereço = ?, bairro = ?, cidade = ?, UF = ? where id = ?";
        try {
            con.setAutoCommit(false);
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCargo());
            stmt.setString(3, funcionario.getTelefone());
            stmt.setString(4, funcionario.getEmail());
            stmt.setString(5, funcionario.getSexo());
            stmt.setString(6, funcionario.getEndereço());
            stmt.setString(7, funcionario.getBairro());
            stmt.setString(8, funcionario.getCidade());
            stmt.setString(9, funcionario.getUF());
            stmt.setInt(10, funcionario.getId());

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

    public List<Funcionarios> pesquisar(String valor, String tipoPesquisa) {
        //mudar quando acrescentar pesquisar na tela
        con = ConexaoMySql.getConexao();
        List<Funcionarios> funcionarios = new ArrayList<>();

        String sql = "";

        if (tipoPesquisa.equals("nome")) {
            sql = "select * from funcionarios where no_funcionario like '%" + valor + "%'";
        } else if (tipoPesquisa.equals("cargo")) {
            sql = "select *from funcionarios where cargo like '%" + valor + "%'";
        }

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                Funcionarios funcionario = new Funcionarios();

                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("no_funcionario"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setSexo(rs.getString("sexo"));
                funcionario.setEndereço(rs.getString("endereço"));
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setUF(rs.getString("UF"));

                funcionarios.add(funcionario);
            }
        } catch (SQLException ex) {
            return null;
        }

        ConexaoMySql.fecharConexao();

        return funcionarios;
    }

    public boolean excluir(int id) {

        con = ConexaoMySql.getConexao();
        String sql = "delete from funcionarios where id = ?";

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

    public int entrar(String funcionario, String senha) {
        con = ConexaoMySql.getConexao();
        int ret = 0;

        String sql = "select count(*) as total from funcionarios where no_funcionario = '" + funcionario + "' and senha = md5('" + senha + "') ";

        try {
            Statement stmtt = con.createStatement();

            ResultSet rs = stmtt.executeQuery(sql);

            while (rs.next()) {
                ret = rs.getInt("total");
            }

            ConexaoMySql.fecharConexao();

            return ret;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return ret;
        }
    }
    
     public String logado(String funcionario, String senha){
      
      con = ConexaoMySql.getConexao();
      String ret="";
      
      String sql = "select no_funcionario from funcionarios where no_funcionario = '"+funcionario+"' and senha = md5('"+senha+"')";
      
      try{
          Statement stmt = con.createStatement();
          ResultSet rs = stmt.executeQuery(sql);

          while(rs.next()){
              ret = rs.getString("no_funcionario");
          }
        
        
         
          
      }catch(SQLException ex){
          return ret;
      }
      
      ConexaoMySql.fecharConexao();
      return ret;
  }
   
    
    
}
   
