# Projeto de consumo de API de filmes (EM CONSTRUÇÃO)

Este projeto foi desenvolvido como parte de uma imersão Java oferecida pela Alura. O objetivo era aprender a usar o Java para consumir uma API externa de filmes, usando as bibliotecas ...

## Sobre a API

A API utilizada neste projeto é a [The Movie Database API](https://developers.themoviedb.org/3), que fornece dados sobre filmes, séries, atores e gêneros. Para usar a API, é necessário se cadastrar no site e obter uma chave de acesso (API key).

## Funcionalidades do projeto

O projeto permite realizar as seguintes operações:

- Listar os filmes mais populares do momento
- Buscar filmes por título ou gênero
- Exibir os detalhes de um filme selecionado, como sinopse, elenco, avaliação e trailer
- Adicionar ou remover filmes da lista de favoritos
- Salvar os dados dos filmes favoritos em um banco de dados local usando o Room

## Como executar o projeto

Para executar o projeto, é necessário ter instalado o Java 11 ou superior e o Android Studio. Depois, siga os seguintes passos:

- Clone o repositório do GitHub: `git clone https://github.com/seu-usuario/projeto-filmes.git`
- Abra o projeto no Android Studio e aguarde a sincronização do Gradle
- Crie um arquivo chamado `apikey.properties` na raiz do projeto e adicione a seguinte linha: `API_KEY = "sua-chave-de-acesso"`
- Execute o projeto em um emulador ou dispositivo físico

## Screenshots do projeto

Aqui estão algumas imagens da interface do projeto:

![Tela inicial](screenshots/home.png)
![Tela de busca](screenshots/search.png)
![Tela de detalhes](screenshots/details.png)
![Tela de favoritos](screenshots/favorites.png)

## Agradecimentos

Agradeço à Alura por proporcionar essa imersão Java e aos instrutores e mentores que auxiliaram no desenvolvimento do projeto. Também agradeço à The Movie Database por disponibilizar a API de filmes
