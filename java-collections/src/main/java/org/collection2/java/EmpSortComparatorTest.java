package org.collection2.java;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {
    private int id;
    private String name;

    public EmployeeTest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class EmpSortComparatorTest {

    @Test
    public void testEmployeeSorting() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(2, "Ansu"));
        list.add(new Employee(5, "shdh"));
        list.add(new Employee(3, "Shyam"));
        list.add(new Employee(3, "Hari"));
        list.add(new Employee(3, "Naru"));
        list.add(new Employee(6, "Baru"));


        Comparator<Employee> comparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Collections.sort(list, comparator);


        assertEquals("Ansu", list.get(0).getName());
        assertEquals("Baru", list.get(1).getName());
        assertEquals("Hari", list.get(2).getName());
        assertEquals("Naru", list.get(3).getName());
        assertEquals("shyam", list.get(4).getName());
        assertEquals("Shdh", list.get(5).getName());
    }
}


