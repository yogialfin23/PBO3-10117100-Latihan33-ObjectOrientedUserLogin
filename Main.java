package com.company;
/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 * Deskripsi : Program untuk melakukan login
 */

import java.util.Scanner;

public class Main {

        private static String userName;
        private static String pw;

        public static void main (String[]args){
            Scanner scn = new Scanner(System.in);

            System.out.print("Masukkan Username = ");
            userName = scn.next();

            System.out.print("Masukkan Password = ");
            pw = scn.next();

            User cek = new User();
            cek.pengecekkanLogin(userName, pw);

        }
}
