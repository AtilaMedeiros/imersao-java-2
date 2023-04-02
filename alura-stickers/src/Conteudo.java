public record Conteudo(String titulo, String urlImagem, String imDbRating) {

    public Conteudo(String titulo, String urlImagem) {
        this(titulo, urlImagem, " ");

    }

}
