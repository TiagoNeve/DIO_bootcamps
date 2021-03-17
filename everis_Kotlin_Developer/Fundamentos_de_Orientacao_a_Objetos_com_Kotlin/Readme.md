# Fundamentos de Orientação a Objetos com Kotlin

## Descrição

    Tudo que você precisa saber sobre o principal paradigma de programação com exemplos práticos utilizando Kotlin e melhore seu reaproveitamento e estrutura de código.

## Conceito e prática sobre classe
### Apresentação do conteúdo do curso
    Resumo do que acontecerá no curso e requisitos básicos.
### Determinando o projeto prático
    informações sobre o update do projeto e que o mesmo pode crescer
### Introdução a Orientação a objetos em Kotlin
    Permitir que consiga abstrair do mundo real objetos ou items que podem ser aplicados num programa. Em que um objeto possui atributos próprios mas que generalizando todos esses objetos possuis as mesmas propriedades mas com valores diferentes.
### Classe pública e classe privada
    Classe é a forma de declarar um objeto e demonstrar nele seus atributos e funções. Formas de organizar melhor o código dando atributos e funções a uma abstração de algo real, no estilo mundo das ideias, dessa foram é possível criar um objeto a partir dessa classe que herda todos os atributos desta classe.
### Entendendo sobre classes na prática e criando o projeto
    O instrutor clonou o seu repositório, porém esse repositório está completo, por esse motivo criari um projeto novo para seguir o fluxo
    Arquivo POM -> Onde o Mavem gerencia as dependências, propriedades, puglins.
    Criar uma classe simples no arquivo Kotlin. Utilizando sempre a estrutura de packages.
    Sempre que for criar um arquivo kotlin é necessário deixar no início do arquivo de qual package esse arquivo é, dessa forma a estrutura fica bem organizada.0
    var nome: String -> Dessa forma fica explicito que será usado um String
    val -> semi-constant que recebe o valor uma única vez e não pode ser alterado depois.
    Para se criar um objeto em Kotlin é necessário instanciar a classe numa variável ou constante.
### O que são membros de uma classe
    A classe pode ter variáveis, funções ou contructores -> Esses são os membros da classes
### Membros das classes na prática - Parte 1
    É possível criar um inner class para gerar uma classe dentro de outra classe, para chama-la é necessário instanciar na chamada e acessar logo em seguida o atributo. Esse conceito de inner class é muito utilizado no consumo de api's quando o json vem com atributos internos, dessa forma com essa construção de inner class deixa o código melhor estruturado e mais em comunhão com a aplicação.
### Membros das classes na prática - Parte 2
    É possível alterar o conteúdo de um objeto chamando o atributo e alterando, para impedir que o atributo seja alterado é necessário definir um variável private. Mas isso vai impedir que seja setado um novo valor e também que seja pegado esse valor, então para impedir apenas o setamento é necessário atribuir debaixo da variável o atributo:
    private set
### Membros das classes na prática - Parte 3
    Utilizar constructores para manter um padrão de construir objectos das classes.
    possível ter funções dentro das classes, essas funções são chamadas de métodos.
    As funções permitem ter comportamentos 
    E as variáveis permitem as classes terem atributos
### Membros das classes na prática - Parte 4
    Para criar um constructor primário deve-se declarar as variáveis entre parenteses, somente a classe deve saber como e se pode mexer nos valores e atributos da classe.
### Conceitos sobre data class
    Data class -> Armazena dados sem poder modificalos, somente consulta-los.
    Ela pode implementar interfaces. basicamente você pega o valor e adiciona em uma variável e o sistema pode modificar essa variável em questão, apra não ter que mecher diretamente nos data classes.