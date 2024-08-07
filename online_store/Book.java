class Book extends Product {
    private String author;
    private int pages;

    public Book(String name, double price, String author, int pages) {
        super(name, price, "Book");
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String getDescription() {
        return "Book: " + name + ", Author: " + author + ", Pages: " + pages;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}
