package modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Movimentacao implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String tipo;
    private LocalDateTime dataMovimentacao;
    private int quantidade;
    private int produtoId;

    /**
     * Construtor vazio.
     */
    public Movimentacao() {
        this(0, "", LocalDateTime.now(), 0, 0);
    }

    public Movimentacao(int id, String tipo, LocalDateTime dataMovimentacao, int quantidade, int produtoId) {
        this.id = id;
        this.tipo = tipo;
        this.dataMovimentacao = dataMovimentacao;
        this.quantidade = quantidade;
        this.produtoId = produtoId;
    }

    // Métodos GET e SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDateTime dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

}
