package activities;

interface Addable {
    int add(int a, int b);
}

public class Activity12 {
    public static void main(String[] args) {
        Addable ad1 = (a, b) -> (a + b);
        System.out.println("Sum of two numbers without return statement : " + ad1.add(40, 50));
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println("Sum of two numbers with return statement : " +  ad2.add(11, 22));
    }
}