package model;

public class UserVerified extends User {
    private  String LastName;
    private  String FirstName;
    private  String Email;

    public UserVerified(String id ,String firstName, String lastName, String email) {
        super(id);
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Email = email;
    }
    @Override
    public void showInfos() {
        System.out.println("ID: " + id + "\nFirst Name: " + FirstName + "\nLast Name: " + LastName + "\nEmail: " + Email);
    }
}
