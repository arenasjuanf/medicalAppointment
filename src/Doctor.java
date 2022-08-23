import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 1;
    int doctorId;
    private String name;
    private String speciality;

    private String email;

    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void showName(){
        System.out.println(this.name);

    }

    public void showId(){

        System.out.println(this.doctorId);
    }

    Doctor(String name){
        this.name = name;
        System.out.println("instanciado");
        this.doctorId = id++;
    }

    Doctor(String name, String speciality){
        System.out.println("instanciado");
        this.doctorId = id++;
        this.name = name;
        this.speciality = speciality;
    }

    public void addAvailableAppointment(Date date, String time){
        this.availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return this.availableAppointments;
    }


    public static class AvailableAppointment{
        private int id_availableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }



}
