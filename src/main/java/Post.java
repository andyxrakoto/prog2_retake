import model.User;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String id;
    private User Owner;
    private List<Message> Messages;

    public Post(String id, User owner, List<Message> messages) {
        super()
        this.id = id;
        this.Owner = owner;
        this.Messages = new ArrayList<>();
    }

    public void addMessage(Message message){
        this.Messages.add(message);
    }



}
