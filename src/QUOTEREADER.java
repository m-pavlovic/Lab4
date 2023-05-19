// all imports

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class QUOTEREADER {

    // static field - key:value data structure
    public static HashMap<String, String> quotes = new HashMap<>();



    // reads data from file and fills appropriate data structure

    public static void readDataFromFile(String filePath)  {
        filePath = "src/quotes.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
            String line = br.readLine();
            while (line != null) {
                String[] quote = line.split(": ");
                quotes.put(quote[0], quote[1]);
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    // get quote by author
    public static String getQuoteByAuthor(String author) {
        return quotes.get(author);
    }

    // get author by quote
    public static String getAuthorByQuote(String quote) {
        for (Map.Entry<String, String> entry : quotes.entrySet()) {
            if (entry.getValue().equals(quote))
                return entry.getKey();
        }
        return null;
    }

    // add new quote
    public static void addNewQuote(String author, String quote) {
        quotes.put(author, quote);
    }

    // delete a quote
    public static void deleteQuote(String author) {
        quotes.remove(author);



    }

    // getters for static field
    public static HashMap<String, String> getQuotes() {
        return (HashMap<String, String>) quotes;
    }


    // list all quotes
    public static void listAllQuotes(){
        for (Map.Entry<String, String> entry : quotes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
