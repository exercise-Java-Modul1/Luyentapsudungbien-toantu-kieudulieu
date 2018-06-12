import java.util.Scanner;

public class Chuvihinhtron {
    public static void main(String[] args) {
        double r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính:");
        r = sc.nextDouble();
        double c = 2 * 3.14 * r;
        double s = r * r * 3.14;
        System.out.println("Chu vi hình tròn là : "+c);
        System.out.println("Diện tích hình tròn là : "+s);
    }
}
