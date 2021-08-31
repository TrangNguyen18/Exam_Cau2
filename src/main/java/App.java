import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        checkPassword();
    }

    public static void checkPassword() {
        Scanner sc = new Scanner(System.in);
        boolean isUpperCase = false;
        boolean isNumeric = false;
        boolean isSpecial = false;
        boolean isStrong = false;
        boolean isSufficient = true;
        do {
            isUpperCase = false;
            isNumeric = false;
            isSpecial = false;
            isStrong = false;
            isSufficient = true;
            System.out.print("Nhap vao mat khau: ");
            String str = sc.nextLine();
            if (str.length() < 10) {
                isSufficient = false;
                System.out.println("Mat khau yeu");
            } else {
                for (int i = 0; i < str.length(); i++) {
                    if (!isUpperCase && Character.isUpperCase(str.charAt(i))) {
                        isUpperCase = true;
                        continue;
                    }
                    if (!isNumeric && Character.isDigit(str.charAt(i))) {
                        isNumeric = true;
                        continue;
                    }
                    if (!isSpecial && !Character.isWhitespace(str.charAt(i)) && !Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))) {
                        isSpecial = true;
                        continue;
                    }

                }
                if (isNumeric && isUpperCase && isSpecial) {
                    isStrong = true;
                } else System.out.println("Mat khau khong du manh ");
            }
        }
        while (!isStrong || !isSufficient);
    }
}
