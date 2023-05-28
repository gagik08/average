package com.epam.rd.autotasks;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strNums;
        strNums = scanner.nextLine().split(" ");
        int average = 0;
        int count = 0;
        for (String strNum : strNums) {
            if (strNum.equals("0")) {
                break;
            }
            count++;
        }
        String[] strNums2;
        strNums2 = Arrays.copyOfRange(strNums, 0, count);
        for (String s : strNums2) {
            average += Integer.parseInt(s);
        }
        System.out.println(average/count);
    }
}