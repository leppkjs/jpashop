package jpabook.jpashop.controller;

import jpabook.jpashop.domain.item.Book;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class BookForm {
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    private String author;
    private String isbn;

    public BookForm(Book book) {
        id = book.getId();
        name = book.getName();
        price = book.getPrice();
        stockQuantity = book.getStockQuantity();
        author = book.getAuthor();
        isbn = book.getIsbn();
    }
}
