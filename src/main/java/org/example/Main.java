package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Library library = new Library();
    Scanner scanner = new Scanner(System.in);

    for (; ; ) {
      searchLibrary(scanner, library);

      System.out.println("再度検索しますか？(y / n)");
      String yesOrNo = scanner.next();

      if (yesOrNo.equals("n")) {
        System.out.println("検索を終了します");
        scanner.close();
        break;
      } else if (!yesOrNo.equals("y")) {
        System.out.println("無効な入力です。検索を終了します");
        scanner.close();
        break;
      }
    }
  }

  private static void searchLibrary(Scanner scanner, Library library) {
    System.out.println("タイトル検索は1,著者名検索は2,id検索は3を入力してください： ");
    int inputNumber = scanner.nextInt();

    if (inputNumber == 1) {
      // タイトル検索の処理
      System.out.println("検索したいタイトルを入力してください： ");
      String filteringWordInTitle = scanner.next();
      List<Book> booksListFilteredByTitle = library.findBookByTitle(filteringWordInTitle);
      for (Book book : booksListFilteredByTitle) {
        System.out.println(book);
      }
    } else if (inputNumber == 2) {
      // 著者名検索の処理
      System.out.println("検索したい著者名を入力してください： ");
      String filteringWordInAuthor = scanner.next();
      List<Book> bookListFilteredByAuthor = library.findBookByAuthor(filteringWordInAuthor);
      for (Book book : bookListFilteredByAuthor) {
        System.out.println(book);
      }
    } else if (inputNumber == 3) {
      // id検索の処理
      System.out.println("検索したいidを入力してください： ");
      int filteringId = scanner.nextInt();
      Book bookFilteredById = library.findBookById(filteringId);
      System.out.println(bookFilteredById);
    } else {
      System.out.println("無効な入力です。");
    }
  }
}

