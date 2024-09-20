package J1;
import java.util.*;

public class Exe {
    public static void main(String[]args) {

        List<Monster> mList = new ArrayList<>();
        mList.add(new Monster("お化けきのこ", 10, false));
        mList.add(new Monster("ゴブリン", 25, false));
        mList.add(new Monster("ドラゴン", 120, true));
        System.out.println(mList);
        System.out.println("////////////////////////////////////////////");
        ////////////////////////////////////////////


        Book book1 = new Book("1Title", new Date("2024/09/12"), "1Comment");
        Book book2 = new Book(book1.getPublishDate().toString(), new Date("2024/09/10"), "2Comment");
        Book book3 = new Book("3Title", new Date("2024/09/11"), "3Comment");
        // System.out.println(book2.getPublishDate().toString());
        // System.out.println(book1.equals(book1));
        // System.out.println(book1 == book2);
        // System.out.println(book1.equals(book2));

        // Set<Book> list = new HashSet<>();
        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);

        // Collections.sort(new ArrayList<>(list));
        Collections.sort(list);
        System.out.println(list);
        // Collections.sort(new ArrayList<>(list), book1);

        Collections.sort(list, new TitleComparator());
        System.out.println(list);

        list.remove(book1);
        // System.out.println(list);

        // System.out.println(book3.clone());

    }
}
