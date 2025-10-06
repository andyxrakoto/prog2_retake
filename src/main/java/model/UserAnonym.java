package model;

public class UserAnonym extends User {
    public UserAnonym(String id) {
        super(id);
    }

    @Override
    public void showInfos() {
        System.out.println("User Anonym: " + id);
    }
}
