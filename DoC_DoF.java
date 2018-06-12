
import java.util.Scanner;

public class DoC_DoF {
    public static void main(String[] args) {
        float C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập độ C :");
        C = sc.nextFloat();

        float F = (C/5 * 9) + 32;
        System.out.println("Độ F sau khi chuyển đổi :" + F);
    }
}
