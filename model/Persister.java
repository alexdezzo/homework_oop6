package homework.model;

public class Persister {
    private final User user;

    public Persister(User user) {
        this.user = user;
    }


    public User getUser() {
        return user;
    }

//    public void save(){
//        System.out.println("Save user: " + user.getName());
//    }
}
