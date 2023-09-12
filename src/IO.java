import java.util.Scanner;

public class IO {

    Scanner scanner = new Scanner(System.in);

    public int readInt() {
        while (true) {
            String read = scanner.nextLine();
            try {
                return Integer.parseInt(read);
            } catch (Exception e) {
                System.out.println("invalid Integer value");
            }
        }
    }

    public boolean readBool() {
        while (true) {
            String read = scanner.nextLine();
            try {
                return Boolean.parseBoolean(read);
            } catch (Exception e) {
                System.out.println("invalid boolean value");
            }
        }
    }
}
