package test20240118_tamagaki;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ルールの表示
        displayRules();

        // パスワードの入力を促すメッセージ
        System.out.println("パスワードを入力してください:");

        // ユーザーにパスワードを入力させる
        String password = scanner.nextLine();

        // パスワードの妥当性を検証
        boolean isValid = isValidPassword(password);

        // パスワードの妥当性に基づいたメッセージを表示
        if (isValid) {
            System.out.println("パスワードは有効です: " + password);
        } else {
            System.out.println("パスワードが無効です。");
        }

        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        // パスワードの長さが8文字以上であることを確認
        if (password.length() < 8) {
            System.out.println("パスワードは8文字以上である必要があります。");
            return false;
        }

        // 文字と数字のみで構成されているか確認
        if (!password.matches("[a-zA-Z0-9]+")) {
            System.out.println("パスワードは文字と数字のみで構成されている必要があります。");
            return false;
        }

        // 少なくとも3桁の数字が含まれているか確認
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < 3) {
            System.out.println("パスワードには少なくとも3桁の数字が含まれている必要があります。");
            return false;
        }

        // パスワードが全ての条件を満たしている場合
        return true;
    }

    // ルールの表示メソッド
    public static void displayRules() {
        System.out.println("パスワードのルール:");
        System.out.println("- 8文字以上であること");
        System.out.println("- 文字と数字のみで構成されていること");
        System.out.println("- 少なくとも3桁の数字が含まれていること");
        System.out.println();
    }
}
