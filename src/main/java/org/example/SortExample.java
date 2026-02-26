//package org.example;
//
//import java.util.*;
//
//class Employee implements Comparable<Employee> {
//    String name;
//    int age;
//    Employee(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public int compareTo(Employee o) {
//        if (this.equals(o)) {
//            return 0;
//        } else  if (this.age < o.age) {
//            return  -1;
//        } else  return 1;
//    }
//}
//
//public class SortExample {
//    Map<String, Integer> letterCodes = new HashMap<>();
//
//    SortExample() {
//        String[] letters = new String[] {
//                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
//        };
//        for (int i= 0; i< letters.length; i++) {
//            letterCodes.put(letters[i], i+1);
//        }
//    }
//
//    public static void main(String[] args) {
//        new SortExample().run();
//    }
//
//    private void run() {
//        System.out.println("Sorting Example");
//
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("Sai", 10));
//        employees.add(new Employee("Raju", 15));
//        employees.add(new Employee("Ravi", 19));
//
//       Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if (o1.equals(o2)) {
//                    return 0;
//                }else if (o1.age < o2.age) {
//                    return -1;
//                } else return 1;
//            }
//        });
//
//        Collections.sort(employees);
//
//        List<Employee> reversedEmployeeList = employees.reversed();
//
//        System.out.println("Reversed Employee List");
//        for (Employee employee : reversedEmployeeList) {
//            System.out.println(employee.name);
//        }
//        System.out.println("----------------------------------");
//        String s1 = "A";
//        String s2 = "B";
//
//        int pos = s1.compareTo(s2);
//        System.out.println("----------------------------------");
//
//        List<Employee> sortedEmployees = new ArrayList<>(employees);
//
//        for (int i = 0; i < employees.size(); i++) {
//
//            String e1 = employees.get(i).name;
//            String e1C = String.valueOf(e1.toCharArray()[0]);
//
//            if ((i+1) < employees.size()) {
//                String e2 = employees.get(i+1).name;
//                String e2C = String.valueOf(e2.toCharArray()[0]);
//
//                int position = getPosition(e1C, e2C, letterCodes);
//
//                if (position == -1 && i > 1) {
//                    Employee tmp = sortedEmployees.get(i);
//                    sortedEmployees.set(i, employees.get(i-1));
//                    sortedEmployees.set(i-1, tmp);
//                } else if (position == 0) {
//                    continue;
//                } else if (position == 1) {
//                    Employee tmp = sortedEmployees.get(i);
//                    sortedEmployees.set(i, employees.get(i+1));
//                    sortedEmployees.set(i+1, tmp);
//                }
//            } else {
//                Employee tmp = sortedEmployees.get(i);
//                sortedEmployees.set(i, sortedEmployees.get(i-1));
//                sortedEmployees.set(i-1, tmp);
//            }
//        }
//
//        System.out.println("Sorted Employees:");
//
//        for (Employee sortedEmployee : sortedEmployees) {
//            System.out.println(sortedEmployee.name);
//        }
//    }
//
//    private int getPosition(String a, String b, Map<String, Integer> letterCodes) {
//        int aCode = letterCodes.get(a);
//        int bCode = letterCodes.get(b);
//
//        if (a.equals(b)) {
//            return 0;
//        } else if (aCode < bCode) {
//          return -1;
//        } else return 1;
//    }
//}
