package Collection;

import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {

    public static void main(String[] args) {

        Collection books = new HashSet();
        books.add(new String("轻量级java EE实践"));
        books.add(new String("三体"));
        books.forEach(item -> {
            System.out.println(item);
        });
    }
}
