# FiapRideEstudos — Java POO

Projeto desenvolvido durante os estudos de **Programação Orientada a Objetos (POO)** da FIAP.

## Aula 2 — Métodos e Comportamentos

Nesta aula, a classe `Livro` foi evoluída para possuir comportamentos que permitem alterar seu estado de forma controlada.

### Objeto `Livro`

O objeto `Livro` representa um livro no mundo real e possui as seguintes características:

* `titulo` — título do livro.
* `quantidadeDePaginas` — quantidade de páginas.
* `generoLiterario` — gênero literário.

### Métodos

Foram adicionados dois métodos à classe:

#### `adicionarPaginas(int quantidade)`

Adiciona páginas ao livro.

A quantidade informada deve ser maior que zero. Caso contrário, a operação é interrompida e uma mensagem de erro é exibida.

Exemplo:

```java
livro1.adicionarPaginas(50);
```

#### `removerPaginas(int quantidade)`

Remove páginas do livro.

Existem duas regras:

* A quantidade deve ser maior que zero.
* Não é possível remover mais páginas do que o livro possui.

Exemplo:

```java
livro1.removerPaginas(100);
```

### Regras de negócio

Os métodos utilizam validações para impedir alterações inválidas no estado do objeto.

Exemplos:

```java
livro1.adicionarPaginas(-20);
```

A operação é rejeitada porque a quantidade é inválida.

```java
livro1.removerPaginas(500);
```

A operação é rejeitada caso o livro não possua páginas suficientes.

### Exemplo de execução

```java
Livro livro1 = new Livro();

livro1.titulo = "O Hobbit";
livro1.quantidadeDePaginas = 310;
livro1.generoLiterario = "Fantasia";

livro1.adicionarPaginas(50);
livro1.adicionarPaginas(-20);

livro1.removerPaginas(100);
livro1.removerPaginas(500);
```

Nesse exemplo, o objeto começa com 310 páginas. Após adicionar 50, passa a ter 360. A tentativa de adicionar `-20` é rejeitada. Depois, 100 páginas são removidas, resultando em 260 páginas. A tentativa de remover 500 páginas também é rejeitada.

## Tecnologias

* Java
* Eclipse
* Git e GitHub

## Estrutura do projeto

```text
FiapRideEstudos
└── src
    └── br.com.fiapride
        ├── main
        │   └── SistemaPrincipal.java
        └── model
            └── Livro.java
```

## Objetivo da Aula

Aplicar o conceito de **métodos e comportamentos** em um objeto, permitindo que seus atributos sejam alterados por meio de ações com regras de negócio e validações.
