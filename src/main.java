import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ToDo> ToDos = new ArrayList<>();

        while(true) {
            System.out.println("\n---ToDo管理---");
            System.out.println("1: ToDo登録");
            System.out.println("2: ToDo一覧");
            System.out.println("3: ToDOを完了にする");
            System.out.println("0: 終了");
            
            int choice = Integer.parseInt(scanner.nextLine());
            
            if (choice == 0) {
                break;
            }

            if (choice == 1) {
                System.out.print("ToDoのタイトル: ");
                String title = scanner.nextLine();
                ToDos.add(new ToDo(title));
            }

            if (choice == 2) {
                for (int i = 0; i < ToDos.size(); i++) {
                    ToDo todo = ToDos.get(i);
                    System.out.println(
                        i+1 + ": " + todo.getTitle() +
                        (todo.isDone() ? " [完了]" : " [未完了]")
                    );
                }
            }

            if (choice == 3) {
                System.out.print("完了にする番号: ");
                int index = Integer.parseInt(scanner.nextLine());
                if (index > 0 && index <= ToDos.size()) {
                    ToDos.get(index-1).Completed();
                }
            }
        }

        scanner.close();
    }
}
