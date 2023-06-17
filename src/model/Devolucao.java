package model;

import java.time.LocalDateTime;
import utils.Utils;

public class Devolucao {

    private int id;
    private int id_reserva;
    private String livro;
    private String usuario;
    private LocalDateTime data_reserva;
    private LocalDateTime data_entrega;

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
     * @return the id_reserva
     */
    public int getId_reserva() {
        return id_reserva;
    }

    /**
     * @param id_reserva the id_reserva to set
     */
    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
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

    public String dataReservaTostringsql() {
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

    public String dataReservaTostring() {
        String data;
        Utils date = new Utils();

        data = date.formatarDataHora(data_reserva);
        return data;
    }

    public String dataEntregaTostring() {
        String data;
        Utils date = new Utils();

        data = date.formatarDataHora(data_entrega);
        return data;
    }

}
