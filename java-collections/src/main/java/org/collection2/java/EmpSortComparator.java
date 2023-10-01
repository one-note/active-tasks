package org.collection2.java;

import java.util.*;


public class EmpSortComparator {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(2,"Ansu"));
        list.add(new Employee(5,"shdh"));
        list.add(new Employee(3,"Shyam"));
        list.add(new Employee(3,"Hari"));
        list.add(new Employee(3,"Naru"));
        list.add(new Employee(6,"Baru"));

        System.out.println(list);
        for (Employee emp:list
             ) {
            System.out.println(emp);
        }
        Comparator <Employee> comparator = new Comparator<org.collection2.java.Employee>() {
            @Override
            public int compare(org.collection2.java.Employee o1, org.collection2.java.Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(list,comparator);
        System.out.println( System.lineSeparator());
        for (Employee semp:list
             ) {
            System.out.println(semp);
        }
        }



}
