package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    static int id = 1;
    int doctorId;
    private String speciality;

    private String email;

    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();


    @Override
    public String toString() {
        return super.toString()+" \n Speciality: "+speciality+"\nAvailable: "+availableAppointments;
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hopital: Cruz Roja");
        System.out.println("Departamento: Cancerologìa");
    }


    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    public void showName(){
        System.out.println(this.getName());
    }

    public void showId(){

        System.out.println(this.doctorId);
    }


    public Doctor(String name, String email){
        super(name, email);
        System.out.println("instanciado");
        this.doctorId = id++;
        this.setName(name);
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

        @Override
        public String toString() {
            return "Available Appointments \nDate: "+date+"\nTime: "+time;
        }
    }



}
