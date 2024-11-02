package org.example;

public class Book {

  String title;
  String author;
  int id;

  public Book(String title, String author, int id) {
    this.title = title;
    this.author = author;
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "タイトル: " + title + ", 著者： " + author + ", id: " + id;
  }

}
