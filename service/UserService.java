package homework.service;

import homework.model.User;

public class UserService {

    User user;


    public User createUser(String name) {
        this.user = new User(name);
        return user;
    }

    public User getUserName() {
        return user;
    }

    public User report(){
        return getUserName();
    }

    //    public void save(){
//        Persister persister = new Persister(this);
//        persister.save();
//    }

//    public void report(){
//        System.out.println("Report for user: " + name);
//    }

}
