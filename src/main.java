import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ToDo> todols = new ArrayList<>();

        while(true) {
            System.out.println("\n---ToDo管理---");
            System.out.println("1: ToDo登録");
            System.out.println("2: ToDO一覧");
            System.out.println("3: 終了");

            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 0) {
                break;
            }
        }
    }
}
