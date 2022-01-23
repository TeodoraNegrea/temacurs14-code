package ro.fasttrackit.temacurs14.ex;

import java.util.Collection;
import java.util.Objects;

public class Quote  {
    private final int id;
    private final String author;
    private final String quote;
    private boolean favourite;

    public Quote(int id, String author, String quote, boolean favourite) {
        this.id = id;
        this.author = author;
        this.quote = quote;
        this.favourite = true;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote1 = (Quote) o;
        return id == quote1.id && favourite == quote1.favourite && Objects.equals(author, quote1.author) && Objects.equals(quote, quote1.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, quote, favourite);
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                ", favourite=" + favourite +
                '}';
    }

}
