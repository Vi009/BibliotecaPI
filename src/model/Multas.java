
package model;

import java.sql.Date;

public class Multas {
    private int id;
    private int id_usuario;
    private double valor;
    private Date data_multa;

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
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the data_multa
     */
    public Date getData_multa() {
        return data_multa;
    }

    /**
     * @param data_multa the data_multa to set
     */
    public void setData_multa(Date data_multa) {
        this.data_multa = data_multa;
    }
}
