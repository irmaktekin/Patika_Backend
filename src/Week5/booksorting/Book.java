package Week5.booksorting;

import java.util.Comparator;
import java.util.Date;

public class Book implements Comparable<Book> {
    private  String bookName;
    private  int pageNumber;
    private String authorName;
    private Date publishDate;

    public Book(String bookName, int pageNumber, String authorName, Date publishDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

//It sorts without checking the capital letters.

    @Override
    public int compareTo(Book o) {
        return this.getBookName().compareToIgnoreCase(o.getBookName());
    }
}
