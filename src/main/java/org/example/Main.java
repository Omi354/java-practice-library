package org.example;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    Library library = new Library();

    // ここにタイトル検索ワードを入力
    String filteringWordInTitle = "hoo";
    List<Book> booksListFilteredByTitle = library.findBookByTitle(filteringWordInTitle);
    for (Book book : booksListFilteredByTitle) {
      System.out.println(book);
    }

    // ここに著者名検索ワードを入力
    String filteringWordInAuthor = "foo";
    List<Book> bookListFilteredByAuthor = library.findBookByAuthor(filteringWordInAuthor);
    for (Book book : bookListFilteredByAuthor) {
      System.out.println(book);
    }

    // ここに検索idを入力
    int filteringId = 1;
    Book bookFilteredById = library.findBookById(filteringId);
    System.out.println(bookFilteredById);

  }
}

