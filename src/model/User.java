package model;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNimber;


    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNimber() {
        return phoneNimber;
    }

    public void setPhoneNimber(String phoneNimber) {
        this.phoneNimber = phoneNimber;
    }

    @Override
    public String toString() {
        return "model.User: "+name+", Email: "+email+ ", Adress: "+address+", Phone: "+phoneNimber;
    }

    public abstract void showDataUser();
}
