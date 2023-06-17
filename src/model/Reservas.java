package model;

import java.time.LocalDateTime;
import utils.Utils;

public class Reservas {

    private int id;
    private int id_livro;
    private String livro;
    private String categoria;
    private int id_usuario;
    private String usuario;
    private String telefone;
    private LocalDateTime data_reserva;
    private LocalDateTime data_entrega;
    private int status;
    private int cop_disp;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the id_livro
     */
    public int getId_livro() {
        return id_livro;
    }

    /**
     * @param id_livro the id_livro to set
     */
    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    /**
     * @return the livro
     */
    public String getLivro() {
        return livro;
    }

    /**
     * @param livro the livro to set
     */
    public void setLivro(String livro) {
        this.livro = livro;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the data_reserva
     */
    public LocalDateTime getData_reserva() {
        return data_reserva;
    }

    /**
     * @param data_reserva the data_reserva to set
     */
    public void setData_reserva(LocalDateTime data_reserva) {
        this.data_reserva = data_reserva;
    }

    /**
     * @return the data_entrega
     */
    public LocalDateTime getData_entrega() {
        return data_entrega;
    }

    /**
     * @param data_entrega the data_entrega to set
     */
    public void setData_entrega(LocalDateTime data_entrega) {
        this.data_entrega = data_entrega;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the cop_disp
     */
    public int getCop_disp() {
        return cop_disp;
    }

    /**
     * @param cop_disp the cop_disp to set
     */
    public void setCop_disp(int cop_disp) {
        this.cop_disp = cop_disp;
    }

    public String dataReservaTostringsql() {
        String data;
        Utils date = new Utils();

        data = date.formatarDataHoraSQL(data_reserva);
        return data;
    }

    public String dataReservaTostring() {
        String data;
        Utils date = new Utils();

        data = date.formatarDataHoraSQL(data_reserva);
        return data;
    }

    public String dataEntregaTostringsql() {
        String data;
        Utils date = new Utils();

        data = date.formatarDataHoraSQL(data_entrega);
        return data;
    }

    public String dataEntregaTostring() {
        String data;
        Utils date = new Utils();

        data = date.formatarDataHora(data_entrega);
        return data;
    }
}
