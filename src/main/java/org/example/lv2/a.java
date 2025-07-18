package org.example.lv2;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println('*'*i);
        }
    }
}
