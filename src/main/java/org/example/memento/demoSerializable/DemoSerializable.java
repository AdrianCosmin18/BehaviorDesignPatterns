package org.example.memento.demoSerializable;

import org.example.memento.exercise.Employee;

import java.io.*;

public class DemoSerializable {

    private static Employee deserialize() {
        Employee emp = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException| IOException e) {
            e.printStackTrace();
        }
        return emp;
    }

    private static void serialize(Employee emp) {
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Adrian Cosmin");
        emp.setAddress("111 E code street");
        emp.setPhone("888-555-1212");

        serialize(emp);

        Employee newEmp = deserialize();
        System.out.println(newEmp.getName());

    }
}



// serializare => obiect Java convertit in sir de bytes pt =>
// - a fi salvat in fisier
// - a fi trimis pe retea
// - a fi stocat in memorie pt mai tarziu

// deserializare => bytes transf inapoi in ob. Java


// FileOutputStream => scrie bytes intr-un fisier pe disc
// ObjectOutputStream => scrie obiecte Java peste orice OutputStream (fisier, retea, etc)