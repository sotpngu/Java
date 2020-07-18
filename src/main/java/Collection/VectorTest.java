package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

    public static void main(String[] args) {
        Vector v = new Vector( 3, 2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("Capacity after four additions: " + v.capacity());

        v.addElement(new Double(5.3423));
        System.out.println("Current capacity: " + v.capacity());

        System.out.println("First element: " + v.firstElement() );
        System.out.println("Last element: " + v.lastElement() );
        System.out.println(v.contains(new Integer(3)));

        Enumeration vEnum = v.elements();
        while (vEnum.hasMoreElements()) {
            System.out.println(vEnum.nextElement());
        }
    }
}
