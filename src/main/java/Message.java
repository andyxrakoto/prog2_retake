import model.User;

import java.time.LocalDateTime;

public class Message {
    private String text;
    private LocalDateTime date;
    private boolean confidential;
    private User autor;

    public Message(String text, LocalDateTime date, boolean confidential, User autor) {
        this.text = text;
        this.date = date;
        this.confidential = confidential;
        this.autor = autor;
    }

    public Message(String text, boolean b, User anon1) {
    }

    public String getAutor() {

        return "";
    }

    public String getText() {
        return text;
    }
}
