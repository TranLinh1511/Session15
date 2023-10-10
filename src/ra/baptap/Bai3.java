package ra.baptap;

public class Bai3 {
    //Bài tập tính tổng 1 mảng số nguyên
    //
    //Mục tiêu: luyện tập xử lý ngoại lệ
    //
    //Đề bài: Viết một chương trình Java để tính tổng của một mảng số nguyên. Nếu một phần tử trong mảng không phải số nguyên, chương trình sẽ hiển thị thông báo lỗi và bỏ qua phần tử đó.
    //
    //Hướng dẫn: duyệt mảng cộng các phần tử bình thường, nhưng biểu thức tính cộng để trong khối try-catch.

    public static void main(String[] args) {
        Object[] arr = {1, 2, 3, 4.5, 5.5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                sum += (int) arr[i];
            } catch (Exception e) {
                System.out.println("phần tử không phải số nguyên " + arr[i]);
            }
        }
        System.out.println("Tổng của arr là: " + sum);
    }


}
