import java.util.Scanner;

public class Chuvihinhtron {
    public static void main(String[] args) {
        float r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính:");
        r = sc.nextFloat();
        float c = 2 * 3.14 * r;
        float s = r * r * 3.14;
        System.out.println("Chu vi hình tròn là : "+c);
        System.out.println("Diện tích hình tròn là : "+s);
    }
}
