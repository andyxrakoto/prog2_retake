package model;

public abstract class User {
    protected String id;

    public User(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public abstract void showInfos();
}
