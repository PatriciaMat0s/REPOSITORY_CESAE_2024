
//7. Crie uma classe chamada "Livro" com os seguintes atributos: título, autor, categoria, número de páginas e ISBN.
//   Em seguida, crie um método na classe "Livro" chamado "exibirDetalhes" que imprime na consola todos os atributos do livro. De seguida, crie dois objetos da classe "Livro" e invoque o método "exibirDetalhes" para cada um deles

package EX07;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int numPaginas;
    private String isbn;


    public Livro(String titulo, String autor, String categoria, int numPaginas, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }


    public void exibirDetalhes() {

        System.out.println("Detalhes do livro: ");
        System.out.println("Titulo: "+ this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Numero paginas: "+this.numPaginas);
        System.out.println("ISBN: "+this.isbn);
    }


}
