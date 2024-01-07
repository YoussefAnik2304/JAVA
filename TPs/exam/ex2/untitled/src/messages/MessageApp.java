package messages;

import java.util.*;
import java.util.List;

public class MessageApp {
    HashMap<String, List<User>> abbonnes;

    public MessageApp() {
        this.abbonnes = new HashMap<>();
    }

    public void register(String tag, User user) throws AlreadyRegisteredUserException {
        List<User> tmp = abbonnes.get(tag);
        if (tmp == null) {
            tmp = new ArrayList<>();
            abbonnes.put(tag, tmp);
        }

        if (tmp.contains(user)) {
            throw new AlreadyRegisteredUserException(user.nom);
        } else {
            tmp.add(user);
        }
    }
    public List<User> registeredUsersForTag(String tag ){
        List<User> users = abbonnes.get(tag);
        if(users!=null){
            return users;
        }
       return null;
    }
    public Set allTags(){
        Set<String> tags =abbonnes.keySet();
        return tags ;
    }
    public List allUsers(){
        Set<String>tags =allTags();
        Set<User>users =new HashSet<>() ;
        for (String tag : tags ){
            users.addAll(registeredUsersForTag(tag));
        }
        return new ArrayList(users);

    }
    public void unregisterForTag(String tag,User user){
        List<User>users=registeredUsersForTag(tag);
        if(users.contains(user)){
            users.remove(user);
            abbonnes.put(tag,(List)users);
        }
    }
    public void unregisterFromAll(User that) {
        Set<String> tags = allTags();
        for (String tag : tags) {
            List<User> users = new ArrayList<>(registeredUsersForTag(tag));
            Iterator<User> iterator = users.iterator();
            while (iterator.hasNext()) {
                User user = iterator.next();
                if (user.equals(that)) {
                    iterator.remove();
                }
            }
            abbonnes.put(tag, users);
        }
    }

    public void newMessage(Message msg ){
        List<User>users =registeredUsersForTag(msg.getTag());
        for (User user:users ){
            user.receiveMessage(msg);
        }
    }
    public HashMap<User,Integer> numberRegister(){
        Set<String>tags=allTags();
        HashMap<User,Integer>nbr_users=new HashMap<>();
        for (String tag: tags ){
            for(User user : registeredUsersForTag(tag)){
                if(nbr_users.containsKey(user)){
                    nbr_users.put(user,nbr_users.get(user)+1);
                }
                else nbr_users.put(user,1);
            }
        }
        return nbr_users;
    }

}
