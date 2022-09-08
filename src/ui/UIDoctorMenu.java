package ui;

import java.util.Scanner;

import static ui.UIMenu.MONTHS;

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
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response != 0);
    }

    private void showAddAvailableAppoinrmentsMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println(":: Add Available appointment");
            System.out.println(":: Select a month");

            for(int i = 1; i<4; i++){
                System.out.println(i+". "+ MONTHS[i]);
            }

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if(response > 0 && response < 4){
                int selectedMonth = response;
                System.out.println("Selected month: "+MONTHS[i]);
                System.out.println("Insert date : [dd/mm/yy]");
                String date = sc.nextLine();
                System.out.println("your date is: "+date+" \n 1.Correct \n 2.Incorrect");


            }else if(response==0){
                showDoctorMenu();
            }

        }while(response != 0);
    }

}
