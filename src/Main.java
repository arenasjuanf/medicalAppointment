import static ui.UIMenu.showMenu;
import java.util.Date;

public class Main {

        public static void main(String[] args){
                // showMenu();
                Doctor myDoctor = new Doctor("Juan Felipe Arenas", "Cardiologo");
                myDoctor.showId();

                myDoctor.addAvailableAppointment(new Date(), "4pm");
                myDoctor.addAvailableAppointment(new Date(), "5pm");


                System.out.println(myDoctor.getAvailableAppointments());
                for(Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
                        System.out.println(aA.getDate()+" "+aA.getTime());
                }

        }
}
