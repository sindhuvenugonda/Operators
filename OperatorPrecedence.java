public class OperatorPrecedence{
    public static void main(String[] args){
        int a=10, b=5, c=2, x=10, y=5;
        System.out.println("Arithmetic: " + (a+b*c));
        System.out.println("Relational: " + (a+b>c));
        System.out.println("Logical: " + (a>b && b>c));
        System.out.println("Assignment: " + (x+=5));
        System.out.println("Increment: " + (++y));
        System.out.println("Decrement: " + (--y));
        System.out.println("Bitwise: " + (a&b));
    }
}