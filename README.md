# Projeto de Programação Orientada a Objetos: Relação entre Livro e Autor

## Descrição do Projeto

Este projeto foi desenvolvido como parte da disciplina de Programação Orientada a Objetos (POO) do curso de Tecnologia em Análise e Desenvolvimento de Sistemas no Instituto Federal do Ceará - Campus Boa Viagem. O objetivo do projeto é modelar e implementar a relação entre livros e autores utilizando os conceitos de POO.

## Estrutura do Projeto

O projeto está organizado nas seguintes classes:

### Classe `Autor`

A classe `Autor` representa um autor de livros. Ela contém os seguintes atributos e métodos:

- **Atributos:**
  - `nome` (String): O nome do autor.
  - `sobrenome` (String): O sobrenome do autor.
  - `dataNascimento` (LocalDate): A data de nascimento do autor.

- **Métodos:**
  - Construtores para inicializar os atributos.
  - Métodos getters e setters para acessar e modificar os atributos.
  - Método `toString()` para retornar uma representação em string do autor.

### Classe `Livro`

A classe `Livro` representa um livro. Ela contém os seguintes atributos e métodos:

- **Atributos:**
  - `titulo` (String): O título do livro.
  - `isbn` (String): O ISBN do livro.
  - `autor` (Autor): O autor do livro (relação muitos-para-um).

- **Métodos:**
  - Construtores para inicializar os atributos.
  - Métodos getters e setters para acessar e modificar os atributos.
  - Método `toString()` para retornar uma representação em string do livro.

### Classe `Main`

A classe `Main` contém o método `main` e é responsável por criar instâncias das classes `Autor` e `Livro`, demonstrando a relação entre elas.

## Requisitos

- Java JDK 8 ou superior
- IDE de sua escolha (Eclipse, IntelliJ, NetBeans, etc.)

## Como Executar o Projeto

1. Clone este repositório para sua máquina local:
    ```bash
    git clone https://github.com/seu-usuario/projeto-poo-livro-autor.git
    ```

2. Abra o projeto em sua IDE de preferência.

3. Compile e execute a classe `Main` para ver o projeto em ação.

## Exemplo de Uso

A classe `Main` demonstra a criação de objetos `Autor` e `Livro`, bem como a exibição das informações desses objetos. Aqui está um exemplo de como o código pode ser utilizado:

```java
public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel", "Guerreiro", LocalDate.of(1995, 5, 15));
        Livro livro = new Livro("Aprendendo Java", "123-456-789", autor);

        System.out.println(livro);
    }
}
