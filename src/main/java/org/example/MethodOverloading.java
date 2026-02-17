package org.example;

class math{
    public void static int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b,double c){
        return a+b+c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(math.add(11,10));
        System.out.println(math.add(11.5,12));


    }
}
