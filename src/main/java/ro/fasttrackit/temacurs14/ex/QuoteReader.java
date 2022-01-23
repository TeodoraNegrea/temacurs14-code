package ro.fasttrackit.temacurs14.ex;


import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class QuoteReader {
    public static void main(String[] args) throws Exception {
        List<Quote> quotes = readQuote(("file/quotes.txt"));
        System.out.print(quotes);
        readQuoteFile();
        writeQuote(quotes);

    }


    private static void readQuoteFile() throws Exception {
        System.out.println("----All file: ");
        Scanner fileScanner = new Scanner(new File("file", "quotes.txt"));
        while (fileScanner.hasNext()) {
            System.out.println(fileScanner.nextLine());

        }
    }
        private static void writeQuote(List<Quote> quotes) throws Exception {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("file/quotesBeautiful.txt"))) {
                for (Quote quote : quotes) {
                    writer.write(quoteToLine(quote));
                    writer.newLine();
                }
            }
        }


    private static String quoteToLine(Quote quotes) {
        return quotes.getId() + " " + quotes.getAuthor() + " has the quote : " + quotes.getQuote();
    }

    private static List<Quote> readQuote(String filePath) throws Exception {
        List<Quote> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int id = 0;
            while ((line = reader.readLine()) != null) {
                id++;
                result.add(readQuoteFromLine(line, id));
            }
        }
        return result;
    }

    private static Quote readQuoteFromLine(String line, int id) {
        String[] tokens = line.split(Pattern.quote("~"));
        System.out.println(id);
        System.out.println(line);
        int[] array = new int[id];


         return new Quote(id, tokens[0], tokens[1], false);
    }
}

