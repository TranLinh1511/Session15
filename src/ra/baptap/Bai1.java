package ra.baptap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        handleAddInterger(sc);
    }

    private static void handleAddInterger(Scanner scanner) {
        try {
            System.out.println("Nhập vào lần lượt a và b: ");
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Tổng của 2 số a và b là: " + (a+b));
        } catch (NumberFormatException ignored) {
            System.out.println("Yêu cầu nhập đúng định dạng số nguyên!!");
            handleAddInterger(scanner);
        }
    }
}
