package com.Project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputuser;

        int  indo, mtk;

        inputuser = new Scanner(System.in);

        System.out.println("============ Program KKM ===============");
        System.out.print("Masukan nilai MTK : ");
        mtk = inputuser.nextInt();
        System.out.print("Masukan nilai B.indo: ");
        indo = inputuser.nextInt();

        System.out.println("========= Hasil ==========/n");

        if (mtk <= 75){
            System.out.println("Matematika Belum kompeten");
        }
        else if (mtk >= 75){
            System.out.println("Matematika Kompeten");
        }

        if (indo <= 75){
            System.out.println("Bahasa Indonesia Belum kompeten");
        }
        else if (indo >= 75){
            System.out.println("Bahasa Indonesia Kompeten");
        }



    }
}
