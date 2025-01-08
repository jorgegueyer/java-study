package es.jorgegueyer.dev.chapter8;

public interface ReadonlyBook {

    int getId();

    String getTitle();

    String getAuthor();

    String toString();

    Price getPrice();
}
