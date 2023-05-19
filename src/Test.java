public class Test {

    public static void main(String[] args) {
        QUOTEREADER.readDataFromFile("quotes.txt");
        QUOTEREADER.listAllQuotes();
        QUOTEREADER.addNewQuote("Mihai Eminescu", "Cand vine iarna");
        QUOTEREADER.listAllQuotes();
        QUOTEREADER.deleteQuote("Mihai Eminescu");
        QUOTEREADER.listAllQuotes();
        QUOTEREADER.addNewQuote("Oscar Wilde", "Always forgive your enemies; nothing annoys them so much.");
        System.out.println(QUOTEREADER.getAuthorByQuote("Cand vine iarna"));
        System.out.println(QUOTEREADER.getQuoteByAuthor("Oscar Wilde"));

    }
}
