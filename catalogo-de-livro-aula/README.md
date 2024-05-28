## Pesquisa em List

Exercício de tentar implementar essa proposta antes e assistir à vídeo aula.

1. Catálogo de Livros
Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. Cada livro possui atributos como título, autor e ano de publicação. Implemente os seguintes métodos:

`adicionarLivro(String titulo, String autor, int anoPublicacao)`: Adiciona um livro ao catálogo.
`pesquisarPorAutor(String autor)`: Pesquisa livros por autor e retorna uma lista com os livros encontrados.
`pesquisarPorIntervaloAnos(int anoInicial, int anoFinal)`: Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
`pesquisarPorTitulo(String titulo)`: Pesquisa livros por título e retorna o primeiro livro encontrado.

2. Soma de Números
Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

`adicionarNumero(int numero)`: Adiciona um número à lista de números.
`calcularSoma()`: Calcula a soma de todos os números na lista e retorna o resultado.
`encontrarMaiorNumero()`: Encontra o maior número na lista e retorna o valor.
`encontrarMenorNumero()`: Encontra o menor número na lista e retorna o valor.
`exibirNumeros()`: Retorna uma lista contendo todos os números presentes na lista.

## Ordenação em List

1. Ordenação de Pessoas
Crie uma classe chamada "OrdenacaoPessoas" que possui uma lista de objetos do tipo "Pessoa" como atributo. Cada pessoa possui atributos como nome, idade e altura. Implemente os seguintes métodos:

`adicionarPessoa(String nome, int idade, double altura)`: Adiciona uma pessoa à lista.
`ordenarPorIdade()`: Ordena as pessoas da lista por idade usando a interface Comparable.
`ordenarPorAltura()`: Ordena as pessoas da lista por altura usando um Comparator personalizado.

2. Ordenação de Números
Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

`adicionarNumero(int numero)`: Adiciona um número à lista.
`ordenarAscendente()`: Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
`ordenarDescendente()`: Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
