package Serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerailizeTest {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Reyan Ali";
        employee.address = "Phokka Kuan, Ambehta Peer";
        employee.SSN = 11122333;
        employee.number = 101;

        try {
            FileOutputStream fileOut = new FileOutputStream("./employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee);
            out.close();
            fileOut.close();
            System.out.println("Serailized data is saved to ./employee.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
