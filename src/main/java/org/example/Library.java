package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

  public List<Book> library = new ArrayList<>();

  public Library() {
    library.add(new Book("静かな森", "山田太郎", 101));
    library.add(new Book("湖の謎", "ジェーン・スミス", 102));
    library.add(new Book("未知への旅", "佐藤花子", 103));
    library.add(new Book("星々の彼方", "エミリー・ブラウン", 104));
    library.add(new Book("忘れられた物語", "田中健一", 105));
    library.add(new Book("暗闇のささやき", "サラ・ウィルソン", 106));
    library.add(new Book("最後の王国", "高橋一郎", 107));
    library.add(new Book("過去の響き", "エマ・マルティネス", 108));
    library.add(new Book("不死鳥の復活", "鈴木二郎", 109));
    library.add(new Book("山の影", "ソフィア・トンプソン", 110));
    library.add(new Book("時を超えて", "伊藤美咲", 111));
    library.add(new Book("海の秘密", "リンダ・クラーク", 112));
    library.add(new Book("魔法の森", "佐々木幸子", 113));
    library.add(new Book("彼方からの声", "メアリー・ルイス", 114));
    library.add(new Book("地平線を追って", "中村真司", 115));
    library.add(new Book("北の空の下で", "パトリシア・ホール", 116));
    library.add(new Book("風の伝説", "村上大輔", 117));
    library.add(new Book("影の王国", "ローラ・エルナンデス", 118));
    library.add(new Book("大地の歌", "リチャード・キング", 119));
    library.add(new Book("永遠の探求", "松本光", 120));
  }

  public List<Book> findBookByTitle(String title) {
    List<Book> booksListFilteredByTitle = library.stream()
        .filter(book -> book.getTitle().contains(title))
        .toList();

    if (title.isEmpty()) {
      System.out.println("検索語句を入力してください");
      return Collections.emptyList();
    } else if (booksListFilteredByTitle.isEmpty()) {
      System.out.println("条件にマッチする本はありませんでした");
      return booksListFilteredByTitle;
    } else {
      return booksListFilteredByTitle;
    }
  }

  public List<Book> findBookByAuthor(String author) {
    List<Book> bookListFilteredByAuthor = library.stream()
        .filter(book -> book.getAuthor().contains(author))
        .toList();

    if (author.isEmpty()) {
      System.out.println("検索語句を入力してください");
      return Collections.emptyList();
    } else if (bookListFilteredByAuthor.isEmpty()) {
      System.out.println("条件にマッチする本はありませんでした");
      return bookListFilteredByAuthor;
    } else {
      return bookListFilteredByAuthor;
    }
  }

  public Book findBookById(int id) {
    return library.stream()
        .filter(book -> book.getId() == id)
        .findFirst()
        .orElse(new Book("該当なし", "該当なし", -1));
  }
}
