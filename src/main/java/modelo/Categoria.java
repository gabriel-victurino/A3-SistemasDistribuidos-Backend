package modelo;

import java.io.Serializable;

public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    private int idCategoria;
    private String nome;
    private String tamanho;
    private String embalagem;

    public Categoria() {
        this(0, "", "", "");
    }

    public Categoria(int idCategoria, String nome, String tamanho, String embalagem) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.tamanho = tamanho;
        this.embalagem = embalagem;
    }

    // Métodos GET e SET
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.idCategoria = IdCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    /**
     * Retorna os dados da categoria em uma string.
     *
     * @return Uma string com os dados da categoria.
     */
    @Override
    public String toString() {
        return this.nome;
    }

}
