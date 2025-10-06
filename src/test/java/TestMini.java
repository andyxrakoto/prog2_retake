import model.User;
import model.UserAnonym;
import model.UserVerified;

public class TestMini{
    public static void main(String[] args) {
        // Création d'un utilisateur inscrit
        User u1 = new UserVerified("u001", "Andy", "Rakoto", "andy@mail.com");
        // Création d'une publication
        Post pub = new Post("pub001", u1);

        // Création d'auteurs anonymes
        User anon1 = new UserAnonym("anon_123");
        User anon2 = new UserAnonym("anon_456");

        // Ajout de messages
        pub.addMessage(new Message("Salut!", false, anon1));
        pub.addMessage(new Message("J’adore ton profil 😆", true, anon2));
        pub.addMessage(new Message("Merci pour vos messages !", false, u1));

        // Affichage des auteurs
        pub.showAutors();
    }
}