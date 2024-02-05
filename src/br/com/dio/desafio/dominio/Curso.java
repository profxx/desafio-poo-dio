package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public java.lang.String getTitulo() {
        return titulo;
    }

    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    public java.lang.String getDescricao() {
        return descricao;
    }

    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Curso{" +
                "titulo=" + titulo +
                ", descricao=" + descricao +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
