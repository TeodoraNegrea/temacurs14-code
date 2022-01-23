package ro.fasttrackit.temacurs14.ex;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Quote> quoteList = new ArrayList<>();

    QuoteService quoteService = new QuoteService(quoteList);
       System.out.println(quoteService.getAllQuotes());
        System.out.println(quoteService.getQuotesForAuthor("Benjamin Franklin"));
    }
}
