package src.MD2_QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 2: ax2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();

        QuadraticEquation  quadraticEquation = new QuadraticEquation(a, b, c);

        if (a != 0){
            if (quadraticEquation.delta() > 0) {
                System.out.println("Phương trình có 2 nghiệm r1 = " + quadraticEquation.getRoot1() + " và r2 = " + quadraticEquation.getRoot2());
            } else if (quadraticEquation.delta() == 0) {
                System.out.println("Phương trình có 1 nghiệm r= " + quadraticEquation.getDiscriminant());
            }else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Nhập lại a");
        }
    }
}
