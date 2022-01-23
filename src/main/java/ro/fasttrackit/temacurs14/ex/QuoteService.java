package ro.fasttrackit.temacurs14.ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class QuoteService {
    private final List<Quote> quotes;

    public QuoteService(Collection<Quote> quotes) {
        this.quotes = quotes == null
                ? new ArrayList<>()
                : new ArrayList<>(quotes);
    }

    public List<Quote> getAllQuotes() {
        List<Quote> listaNoua = new ArrayList<Quote>();
        for (Quote quote : quotes) {
            if (quote.getQuote().equals(quotes)) {
                listaNoua.add(quote);
            }
        }
        return listaNoua;
    }

    public List<Quote> getQuotesForAuthor(String author) {
        List<Quote> listaNoua = new ArrayList<>();
        for (Quote item : quotes) {
            if (author == null || author.equalsIgnoreCase(item.getAuthor())) {
                listaNoua.add(item);
            }
        }
        return listaNoua;
    }
   /* public List<String> getAuthors(){
        List<String> listaNoua = new ArrayList<>();
        for(Quote quote :quotes){

        }
    }*/
}
