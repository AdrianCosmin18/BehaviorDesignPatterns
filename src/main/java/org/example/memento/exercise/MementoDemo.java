package org.example.memento.exercise;

public class MementoDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee employee = new Employee();
        employee.setName("John Wick");
        employee.setPhone("345-534-345");
        employee.setAddress("111 main street");

        System.out.println("Employee before save:      " + employee);
        caretaker.save(employee);
        employee.setPhone("44444444444");
        caretaker.save(employee);
        System.out.println("Employee after changes phone number save:      " + employee);
        employee.setPhone("5555555555");
        caretaker.revert(employee);
        System.out.println("Reverts to last save point:       " + employee);
        caretaker.revert(employee);
        System.out.println("Reverted to original:              " + employee);
    }
}
