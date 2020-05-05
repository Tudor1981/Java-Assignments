public class Book {

    private String bookName;
    private long isbnNumber;
    private String authorName;
    private String publisher;

    public Book(String bookName, long isbnNumber, String authorName, String publisher) {
        if (bookName != null && !bookName.isEmpty()) {
            this.bookName = bookName;
        }else {
            this.bookName = "Unknown";
        }
        if (isbnNumber > 0) {
            this.isbnNumber = isbnNumber;
        }
        if (authorName != null && !authorName.isEmpty()) {
            this.authorName = authorName;
        }else {
            this.authorName = "Unknown";
        }
        if (publisher != null && !publisher.isEmpty()) {
            this.publisher = publisher;
        }else {
            this.publisher = "Unknown";
        }
    }

    public String getBookName() {
        return bookName;
    }

    public long getIsbnNumber() {
        return isbnNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setBookName(String bookName) {
        if (bookName != null && !bookName.isEmpty()) {
            this.bookName = bookName;
        }else {
            this.bookName = "Unknown";
        }
    }

    public void setIsbnNumber(long isbnNumber) {
        if (isbnNumber > 0) {
            this.isbnNumber = isbnNumber;
        }else {
            this.isbnNumber = 0;
        }
    }

    public void setAuthorName(String authorName) {
        if (authorName != null && !authorName.isEmpty()) {
            this.authorName = authorName;
        }else {
            this.authorName = "Unknown";
        }
    }

    public void setPublisher(String publisher) {
        if (publisher != null && !publisher.isEmpty()) {
            this.publisher = publisher;
        }else {
            this.publisher = "Unknown";
        }
    }

    public String getBookInfo(){
        String result;
        result = "Book name: " + this.bookName + ";\n";
        result += "ISBN number: " + this.isbnNumber + ";\n";
        result += "Author name: " + this.authorName + ";\n";
        result += "Publisher: " + this.publisher + ".";
        return result;
    }
}
