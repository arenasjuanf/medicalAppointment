public class Doctor {
    static int id = 1;
    int doctorId;
    String name;
    String speciality;

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


}
