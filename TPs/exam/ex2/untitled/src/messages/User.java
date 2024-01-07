package messages;

public class User {
    String nom ;

    public User(String nom) {
        this.nom = nom;
    }
    public boolean equals(User other ){
        if (this.nom.equals(other.nom))
            return true;
        return false;
    }
    public  String toString(){
        return "the user name is : "+this.nom;
    }
    public void receiveMessage(Message received){
        System.out.println("sender : "+received.getTag()+" and message : "+received.getContent());
    }
}
