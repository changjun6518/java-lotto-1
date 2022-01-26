package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputView {
    private static final Scanner sc = new Scanner(System.in);
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String getUserMoney() {
        try {
            System.out.println("구입금액을 입력해 주세요.");
            return br.readLine();
        } catch (IOException e) {
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
}
