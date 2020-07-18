package Collection;

import java.util.HashSet;

class A {
    public boolean equals(Object obj) {
        return true;
    }
}

class B {
    public int haseCode() {
        return 1;
    }
}

class C {
    public int haseCoe() {
        return 2;
    }
    public boolean equals(Object obj) {
        return true;
    }
}

public class HashSetTest {
    public static void main(String[] args) {
        HashSet books = new HashSet();

        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        books.add(new C());
        books.add(new C());
        System.out.println(books);
    }
}
