public enum API {
    IMDB_TOP_MOVIES("https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json",
            new ExtratorConteudoIMDB()),
    NASA("https://api.nasa.gov/planetary/apod?api_key=WnklMPK7cwdKHgZfFX9ZGVq21E8CF2e1Y8qUE5Cm&start_date=2022-06-12&end_date=2022-06-14",
            new ExtratorConteudoNasa()),
    LOCAL("http://localhost:8080/linguagens", new ExtratorConteudoLocal());

    private String url;
    private ExtratorConteudo extrator;

    API(String url, ExtratorConteudo extrator) {
        this.url = url;
        this.extrator = extrator;
    }

    public String getUrl() {
        return url;
    }

    public ExtratorConteudo getExtrator() {
        return extrator;
    }

}
