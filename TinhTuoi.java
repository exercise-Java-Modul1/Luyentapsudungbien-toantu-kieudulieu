import java.time.Year;

import java.util.Calendar;
import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        int Ns;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm sinh :");
        Ns = Integer.parseInt(sc.nextLine());
        Calendar cl= Calendar.getInstance();
        int year = cl.get(Calendar.YEAR);
        int tuoi = year - Ns;
        System.out.println("Tuổi hiện tại của bạn là : "+tuoi);
    }
}
