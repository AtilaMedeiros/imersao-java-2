# Consumindo e criando API com Java

Este projeto foi desenvolvido como parte de uma #imersãoJava 2 oferecida pela Alura. O objetivo era aprender a usar o Java para consumir uma API externas, criar figurinas a partir dos links das fotos e no final criar nossa propria API com banco de dados MongoDb.


## 📙 Sobre a API

Utilizei as seguintes API de terceiros:

- https://api.nasa.gov/
- https://imdb-api.com/
- https://linguagens-lavor.fly.dev/linguagens

Utilizei nossa própria API:

- https://lavor-linguagens.fly.dev/linguagens


## 1 Dia

Construi uma aplicação do zero para consumir a API do IMDb e exibir os filmes mais populares, destacando seus pôsteres e visualizando sua classificação... Tudo isso sem usar nenhuma biblioteca externa!

Aproveitei a oportunidade para deixar a saída dos dados mais bonitinha usando:
- emojis com código UTF-8 
- mostrar a nota do filme como estrelinhas 
- decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!


## 2 Dia

Nesta segunda aula criei um gerador de figurinhas explorando outras bibliotecas nativas do Java, para que possamos enviar por Whatsapp os nossos filmes preferidos!

Aproveitei a oportunidade para:
- Criar diretório de saída das imagens
- Centralizar o texto na figurinha
- Colocar a fonte Comic Sans ou a Impact, a fonte usada em memes.
- Inclui imagem nas figurinhas

## 3 Dia

Consumimos a API da Nasa e incluímos as figurinhas nas fotos.

Aproveitei a oportunidade para:
- transformei a class Conteúdo em um record
- Criei o extrator de conteúdo para API da Nasa
- Criei exceção para o clienteHttp
- Alterei alguns "for" para Stream da programação funcional
- Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado


## 4 Dia

Construi uma API REST para expor nosso próprio conteúdo, utilizando ferramentas profissionais como o Spring Framework e um banco de dados NoSQL MongoDb e Postman.

## 5 Dia

 Tornei a aplicação acessível por qualquer pessoa, fazendo o deploy na nuvem em https://lavor-linguagens.fly.dev/linguagens. 

 Criei uma imagem do projeto linguagens para Mac M1 arquitetura arm64 e hospedei no site https://hub.docker.com/repository/docker/atilamedeiros/linguagemapi/general.

## Screenshots do projeto

Aqui estão algumas imagens da interface do projeto:

<div>
<img src="https://github.com/AtilaMedeiros/imersao-java-2/blob/main/fotos_projeto/senhor-dos-aneis.jpg" width="250">
<img src="https://github.com/AtilaMedeiros/imersao-java-2/blob/main/fotos_projeto/batman.jpg" width="250">
<img src="https://github.com/AtilaMedeiros/imersao-java-2/blob/main/fotos_projeto/poderoso-chefao.jpg" width="250">
</div>
<div>
<img src="https://github.com/AtilaMedeiros/imersao-java-2/blob/main/fotos_projeto/terminal_formatado.jpg" width="250">
<img src="https://github.com/AtilaMedeiros/imersao-java-2/blob/main/fotos_projeto/criando-nossa-API.jpg" width="250">
<img src="https://github.com/AtilaMedeiros/imersao-java-2/blob/main/fotos_projeto/imagem-docker.jpg" width="250">
</div>
<div>
<img src="https://github.com/AtilaMedeiros/imersao-java-2/blob/main/fotos_projeto/MongoDb.jpg" width="250">
<img src="https://github.com/AtilaMedeiros/imersao-java-2/blob/main/fotos_projeto/Deploy-Fly.jpg" width="250">
<img src="https://github.com/AtilaMedeiros/imersao-java-2/blob/main/fotos_projeto/postman.jpg" width="230">

</div>





## Agradecimentos

Agradeço à Alura por proporcionar essa imersão Java e aos instrutores e mentores que auxiliaram no desenvolvimento do projeto. 