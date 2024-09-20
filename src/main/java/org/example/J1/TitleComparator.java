package J1;

import java.util.*;

public class TitleComparator implements Comparator<Book>{

    public int compare(Book a, Book b) {
        return a.getTitle().compareTo(b.getTitle());
    }
}