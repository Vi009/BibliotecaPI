package model;

public class Livros {

    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private int num_cop_disp;
    private String categoria;

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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return the num_cop_disp
     */
    public int getNum_cop_disp() {
        return num_cop_disp;
    }

    /**
     * @param num_cop_disp the num_cop_disp to set
     */
    public void setNum_cop_disp(int num_cop_disp) {
        this.num_cop_disp = num_cop_disp;
    }

    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
