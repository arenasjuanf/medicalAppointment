package ui;

import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome "+UIMenu.loggedDoctor.getName());
            System.out.println("1. add available appointment");
            System.out.println("2. my scheduled appointments");
            System.out.println("0. exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                    
            }

        }while (response != 0);
    }
}
