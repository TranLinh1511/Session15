package ra.baptap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Nhập vào một số: ");
        String number = new Scanner(System.in).nextLine();
        List<Integer> n = new ArrayList<>();
        try {
            n.add(Integer.parseInt(number));
        } catch (Exception e) {
            System.err.println("Số bạn nhập không phải là số nguyên");
        }
    }
}
