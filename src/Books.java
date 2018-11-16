public class Books {
    private String bookName, bookAuthor;
    int price;

    public Books(String bookName, String bookAuthor, double price) {
        setBookName(bookName);
        setBookAuthor(bookAuthor);
        setPrice(price);

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Books books) {
        if (this.getPrice() > bookss.getPrice())

            return 1;

        else
            return -1;
    }

  
}