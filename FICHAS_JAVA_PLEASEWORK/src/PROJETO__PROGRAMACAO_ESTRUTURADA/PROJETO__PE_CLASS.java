package PROJETO__PROGRAMACAO_ESTRUTURADA;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PROJETO__PE_CLASS {


    // A prioridade neste exercício é transferir o conteúdo do ficheiro csv para uma matriz.
    // Para tal vou implementar uma funçao para aferir o número de linhas desta matriz, depois outra para aferir o seu número de colunas e finalmente uma terceira função, designada de tranferFile2Matrix, para preencher a matriz com os valores lidos do ficheiro:

    /**********************************************************
     * Método que retorna o número de linhas totais de um ficheiro, EXCLUINDO O CABEÇALHO
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Número de Linhas Totais
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarLinhasFicheiro(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);

        int contagemLinhas = 0;

        while (scanner.hasNextLine()) {
            scanner.nextLine();
            contagemLinhas++;
        }
        contagemLinhas = contagemLinhas - 1; // Excluir a linha do cabeçalho da contagem
        return contagemLinhas;
    }

    /**********************************************************
     * Método que retorna o número de colunas totais de um ficheiro
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Número de Colunas Totais
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarColunasFicheiro(String caminhoFicheiro, String delimitador) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);

        int contagemColunas = 0;

        String linha = scanner.nextLine();
        String[] itensLinha = linha.split(delimitador);

        contagemColunas = itensLinha.length;

        return contagemColunas;
    }

    /**********************************************************
     * Método que armazena numa matriz o conteudo de um ficheiro
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Matriz String[][] preenchida com o conteudo
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static String[][] transferFile2Matrix(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);

        // Contar numero de linhas do ficheiro (excluindo o cabecalho)
        int numeroLinhas = (contarLinhasFicheiro(caminhoFicheiro)); ///

        // Contar número de colunas do ficheiro
        int numeroColunas = contarColunasFicheiro(caminhoFicheiro, ";");

        // Declarar uma matriz com o tamanho adequado
        String[][] matrizTotal = new String[numeroLinhas][numeroColunas];

        String linhaAtual = scanner.nextLine();
        int linhaMatriz = 0;

        while (scanner.hasNextLine()) {
            linhaAtual = scanner.nextLine();
            String[] itensLinha = linhaAtual.split(";");

            for (int i = 0; i < itensLinha.length; i++) {
                matrizTotal[linhaMatriz][i] = itensLinha[i];
            }

            linhaMatriz++;
        }

        return matrizTotal;
    }

    /**********************************************************
     * Método que imprime uma matriz de Strings na consola
     * @param matriz - a matriz String[][] que se quer imprimir
     * @return Matriz String[][] preenchida com o conteudo
     */
    public static void imprimirMatriz(String[][] matriz) {
        // Imprimir a matriz na consola
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    /**********************************************************
     * Método que soma os elementos da coluna mais à direita de uma matriz de Strings, ie, na posição [matrixFile[0].length-1]) de cada linha, sendo que os converte para double
     * @param matriz - a matriz String[][] que se quer imprimir
     * @return somatório dos elementos descritos acima
     */
    public static double somatorioUltimaColunaMatrix(String[][] matriz) {
        double somatorio = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            somatorio = somatorio + Double.parseDouble(matriz[linha][matriz[0].length - 1]);
        }
        return somatorio;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////

    // Começa a janela main, onde vou implementar os menus, chamar as funçoes definidas acima, e responder ao enunciado proposto:

    public static void main(String[] args) throws FileNotFoundException {


        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);

        // Obter o caminho do ficheiro:
        File myFilePath = new File("src/PROJETO__PROGRAMACAO_ESTRUTURADA/GameStart_V2.csv");

        // Inicializar o scanner para leitura do ficheiro:
        Scanner myScanner = new Scanner(myFilePath);

        // Transferir o conteúdo do ficheiro csv para uma matriz:
        String[][] matrixFile = transferFile2Matrix("src/PROJETO__PROGRAMACAO_ESTRUTURADA/GameStart_V2.csv");


        // Começar o menu!
        // Imprimir na consola a introdução ao menu:
//        System.out.println("");
//        System.out.println("--- **  * -------------*------------- *  ** ---");
//        System.out.println("************ --  * GAMESTART *  -- ************");
//        System.out.println("--- **  * -------------*------------- *  ** ---");
//        System.out.println("____ Os videojogos da sua vida estão aqui! ____");
//        System.out.println("");

        String userType;
        System.out.print("\nINTRODUZA O TIPO DE UTILIZADOR ( A - ADMIN || C - CLIENTE ): ");
        userType = input.next();

        ///////////// Caso o utilizador escolha o menu ADMIN:

        if (userType.equals("A") || userType.equals("a")) { //Abre o menu ADMIN a despistar o "case sensitive" do input do utilizador

            int opcaoMenuAdmin;
            String passAdminInput, passAdmin = "1"; //souADMINyay123

            System.out.print("INTRODUZA A SUA PASSWORD: ");
            passAdminInput = input.next();

            // Se a password não for a string predefinida, é pedido novo input ao utilizador
            if (!passAdminInput.equals(passAdmin)) {
                System.out.print("PASSWORD ERRADA! REINTRODUZA A SUA PASSWORD: ");
                passAdminInput = input.next();
            } else {
                System.out.println("- BEM-VINDO, SR/A. ADMINISTRADOR/A!");
            }

            do {
                System.out.println("\n*** OPÇÕES A IMPLEMENTAR: ");

                System.out.println("1 - Imprimir o conteudo do ficheiro na consola");
                System.out.println("2 - Imprimir quantas vendas foram executadas e o seu valor total");
                System.out.println("3 - Imprimir o lucro total (20% de lucro por jogo)");
                System.out.println("4 - Imprimir todas as informações associadas a um cliente (nome, contacto, e-mail)");
                System.out.println("5 - Imprimir qual o jogo mais caro e os clientes que o compraram");
                //System.out.println("6 - Imprimir qual o cliente (nome, contacto, email), que mais dinheiro gastou na loja, e respetivos jogos adquiridos");
                System.out.println("0 - Sair");

                System.out.print(" --- Indique o número da operação pretendida: ");
                opcaoMenuAdmin = input.nextInt();

                switch (opcaoMenuAdmin) {
                    case 1:  //Imprimir o conteúdo do ficheiro na consola
                        System.out.println("\n  » Conteúdo do ficheiro " + myFilePath + ":\n");
                        imprimirMatriz(matrixFile);

                        // Também podia usar um scanner no conteúdo do ficheiro e imprimir linha por linha:
//                        String linha;
//                        while (myScanner.hasNextLine()){
//                            linha = myScanner.nextLine();
//                            System.out.println(linha);
//                        }

                        break;

                    case 2:
                        // O número de vendas corresponde ao número de linhas da matriz criada a partir dos dados do ficheiro
                        //Note-se que as funções de criar a dita matriz já excluem a linha do cabeçalho
                        System.out.println("Foram efectuadas " + matrixFile.length + " vendas.");

                        // O valor total das vendas corresponde ao somatório dos elementos da matrixFile que estão na última coluna:

                        System.out.println("Valor total das vendas: " + somatorioUltimaColunaMatrix(matrixFile) + " Euros.");
                        break;

                    case 3:
                        System.out.println("Lucro do total das vendas: " + (0.2 * somatorioUltimaColunaMatrix(matrixFile)) + " Euros.");
                        break;

                    case 4: //Imprimir dados através do IdCliente (coluna de índice 1 na matrixIndice):
                        int idCliente;
                        System.out.print("INTRODUZA IdCliente (NÚMERO ENTRE 1 E 60): ");
                        idCliente = input.nextInt();

                        for (int linha = 0; linha < matrixFile.length; linha++) {
                            if (Integer.parseInt(matrixFile[linha][1]) == idCliente) {
                                System.out.println("Nome do cliente: " + matrixFile[linha][2]);
                                System.out.println("Telefone: " + matrixFile[linha][3] + "| " + "E-mail: " + matrixFile[linha][4]);
                                break;
                                //Dado que o mesmo cliente pode aparecer em mais que uma linha, interessa sair da estrutura if assim que ela é verificada uma primeira vez
                            }
                        }
                        break;

                    case 5: //Imprima qual o jogo mais caro e os clientes que o compraram
                        //Neste caso interessa determinar o valor máximo (depois de convertido para double) da coluna mais à direita da matrixFile
                        //Tratar a coluna [] mais à direita como um array:

                        //Assumir um elemento qualquer da coluna referida para termo de comparação, neste caso o primeiro a contar do topo:
                        double valorMaisCaro = Double.parseDouble(matrixFile[0][matrixFile[0].length - 1]);
                        String jogoMaisCaro = "";
                        String clientesMaisCaros = "";

                        for (int indice = 0; indice < matrixFile.length; indice++) {
                            if (Double.parseDouble(matrixFile[indice][matrixFile[0].length - 1]) > valorMaisCaro) {
                                valorMaisCaro = Double.parseDouble(matrixFile[indice][matrixFile[0].length - 1]);
                                jogoMaisCaro = matrixFile[indice][matrixFile[0].length - 2];

                            }
                        }

                        System.out.println("O jogo mais caro é '" + jogoMaisCaro + "', e tem um custo de " + valorMaisCaro + "Euros.");
                        System.out.println("Foi adquirido pelos clientes: "++".");


                        break;


                    case 0:
                        break;

                    default: //Aplicar caso o utilizador não introduza nenhum dos inteiros do menu apresentado
                        System.out.println("Opção inválida; introduza o número de uma opção válida.");
                }


            } while (opcaoMenuAdmin != 0);


        } //chaveta a fechar o if do menu do Administrador

        ///////////// Caso o utilizador escolha o menu CLIENTE:

        if (userType.equals("C") || userType.equals("c")) { //Abre o menu ADMIN a despistar o "case sensitive" do input do utilizador

            int opcaoMenuCliente;
            String passClienteInput, passCliente = "2"; //souCLIENTEyay123

            System.out.print("INTRODUZA A SUA PASSWORD: ");
            passClienteInput = input.next();

            // Se a password não for a string predefinida, é pedido novo input ao utilizador
            if (!passClienteInput.equals(passCliente)) {
                System.out.print("PASSWORD ERRADA! REINTRODUZA A SUA PASSWORD: ");
                passClienteInput = input.next();
            } else {
                System.out.println("- BEM-VINDO, SR/A. CLIENTE!");
            }

            do {
                System.out.println("\n*** OPÇÕES A IMPLEMENTAR: ");

                System.out.println("1 - Registo na loja online");
                System.out.println("2 - Reserva de lugar de estacionamento");
                System.out.println("3 - Lista dos videojogos disponíveis");
                System.out.println("4 - Pesquisa por Editora");
                System.out.println("0 - Sair");

                System.out.print(" --- Indique o número da operação pretendida: ");
                opcaoMenuCliente = input.nextInt();

                switch (opcaoMenuCliente) {
                    case 1:
                       break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 0:
                        break;

                    default: //Aplicar caso o utilizador não introduza nenhum dos inteiros do menu apresentado
                        System.out.println("Opção inválida; introduza o número de uma opção válida.");
                }
            } while (opcaoMenuCliente != 0);

        } //fecho da condição if do utilizador ser cliente


    }
}












