package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;
public class UIMenu {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor loggedDoctor;
    public static Patient loggedPatient;


    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    //showPatientMenu();
                    System.out.println("Patient");
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }


    private static void authUser(int userType){
        // userType == 1 Doctor
        // userType == 2 Patient
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("juan felipe arenas", "juanfa107@gmail.com"));
        doctors.add(new Doctor("sebastian arenas", "sebas@gmail.com"));
        doctors.add(new Doctor("mateo arenas", "mateo@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();

        patients.add(new Patient("leydy cardona", "leydy@gmail.com"));
        patients.add(new Patient("walter cardona", "walter@gmail.com"));
        patients.add(new Patient("azucena cardenas", "suegra@gmail.com"));

        boolean emailCorrect = false;
        do{
            System.out.println("Insert your email: [a@a.any]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(userType == 1){
                for(Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener datos de usuario loggeado
                        loggedDoctor = d;
                        //mostrar menu doctor
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }else{
                for(Patient p: patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener datos de usuario loggeado
                        loggedPatient = p;
                        //mostrar menu paciente
                        UIMenu.showPatientMenu();
                    }
                }

            }
        }while(!emailCorrect);


    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for(int i = 1; i<4; i++){
                        System.out.println(i+". "+MONTHS[i]);
                    }
                    int month = Integer.valueOf(sc.nextLine());
                    System.out.println("Mes elegido: "+MONTHS[month]);
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
