import model.*;

import java.util.Date;

public class Main {

        public static void main(String[] args){
                // showMenu();
                Doctor myDoctor = new Doctor("Juan Felipe Arenas", "Cardiologo");
                myDoctor.showId();

                myDoctor.addAvailableAppointment(new Date(), "4pm");
                myDoctor.addAvailableAppointment(new Date(), "5pm");


                ISchedulable iSchedulable = new ISchedulable() {
                        @Override
                        public void schedule(Date date, String time) {

                        }
                };

                ISchedulable iSchedulable1 = new AppointmentDoctor();

                /*
                        for(model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
                        System.out.println(aA.getDate()+" "+aA.getTime());
                        }

                        Patient patient = new Patient("juan", "juanfa107@gmail.com");
                        System.out.println(patient);
                */



        }
}
