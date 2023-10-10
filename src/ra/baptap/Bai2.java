package ra.baptap;

import java.util.Scanner;

public class Bai2 {
    //Bài tập tìm số lớn nhất trong mảng số nguyên
    //
    //Mục tiêu: sử dụng throw để ném ngoại lệ
    //
    //Đề bài: Viết một chương trình Java để tìm số lớn nhất trong một mảng số nguyên. Nếu mảng không có phần tử nào, chương trình sẽ hiển thị thông báo lỗi.
    //
    //Hướng dẫn: đặt 1 khối if(), kiểm tra length của mảng == 0 thì ném ngoại lệ với tin nhắn: “mảng rỗng”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử trong mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] nArr = new int[n];
        for (int i = 0; i < nArr.length; i++) {
            handleAddInterger(sc, nArr, i);
        }
        highNumberSearch(nArr);
    }

    private static void handleAddInterger(Scanner scanner, int[] arr, int n) {
        try {
            System.out.println("Nhập vào phần tử thứ " + n + ": ");
            arr[n] = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException ignored) {
            System.out.println("Yêu cầu nhập đúng định dạng số nguyên!!");
            handleAddInterger(scanner, arr, n);
        }
    }

    private static void highNumberSearch(int[] nArr) {
        if (nArr.length == 0) {
            try {
                throw new RuntimeException("Mảng rỗng");
            } catch (RuntimeException r) {
                System.out.println(r.getMessage());
            }
        } else {
            int max = nArr[0];
            for (int i = 0; i < nArr.length; i++) {
                if (nArr[i] > max) {
                    max = nArr[i];
                }
            }
            System.out.println("Giá trị lớn nhất trong mảng là max");
        }
    }

}
