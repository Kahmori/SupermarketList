package main.java.main;

import java.util.Scanner;

import main.java.implementation.Supermarket;
import main.java.implementation.SupermarketArray;

public class Main {

  private static int SIZE = 10;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Supermarket supermarket = new SupermarketArray(SIZE);
    int opcao;
    do{
      System.out.println("\nLista de Compras");
      System.out.println("1 - Inserir");
      System.out.println("2 - Listar");
      System.out.println("3 - Remover");
      System.out.println("4 - Saída");
      System.out.println("\nEscolha uma opção: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("Digite o item a ser inserido: ");
          String item = scanner.next();
          supermarket.add(item);
          break;
        case 2:
          supermarket.print();
          break;
        case 3:
          System.out.println("Digite o item a ser removido: ");
          int index = scanner.nextInt();
          supermarket.delete(index);
          break;
        case 4:
          System.out.println("Saindo do programa...");
          break;
        default:
          System.out.println("Opção inválida. Por favor, escolha novamente.");
          break;
      } 
      
    } while (opcao != 4);
    scanner.close(); 
  }
}
