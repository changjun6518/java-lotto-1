package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputView {
    private static final Scanner sc = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Integer getUserMoney() {
        try {
            System.out.println("구입금액을 입력해 주세요.");
            return Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("투입 금액을 제대로 입력해 주세요");
            return getUserMoney();
        }
    }

    public static String getWinningNumber() {
        try {
            System.out.println("당첨 번호를 입력해 주세요.");
            return br.readLine();
        } catch (IOException e) {
            return getWinningNumber();
        }
    }

    public static Integer getBonusNumber() {
        try {
            System.out.println("보너스 번호를 입력해 주세요.");
            return Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("보너스 번호를 제대로 입력해 주세요");
            return getBonusNumber();
        }
    }
}
