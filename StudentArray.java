import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Trung", "Mallory", "Zoe", "Emily"};

        System.out.println("Nhap ten sinh vien :");
        String name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Vi tri sinh vien " + name + " la: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Khong thay" + name + " trong danh sach.");
        }

    }
}
