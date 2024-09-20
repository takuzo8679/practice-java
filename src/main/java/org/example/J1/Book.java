package J1;

import java.util.*;

public class Book
        implements Comparable<Book>, Cloneable, Comparator<Book>{
    private String title;
    private Date publishDate;
    private String comment;

    public Book clone() {
        return new Book(title, publishDate, comment);
    }

    public boolean equals(Book o) {
        if (o == this) return true;
        if (o == null) return false;
        if (!(o instanceof Book)) return false;
        if (publishDate.toString().equals(o.getTitle())) return true;

        return false;
    }

    public int compare(Book a, Book b) {
        return -1 * a.getTitle().compareTo(b.getTitle());
    }

    public int compareTo (Book obj) {
        if (publishDate.equals(obj.getPublishDate())) return 0;
        if (publishDate.before(obj.getPublishDate())) return -1;
        return 1;
    }

    Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    public String toString() {
        //   return String.format("%s // %s // %s",title, publishDate, comment);
        return comment;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getPublishDate() {
        return this.publishDate;
    }
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
    public String getComment() {
        return this.comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
}
