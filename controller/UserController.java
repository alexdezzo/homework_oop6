package homework.controller;

import homework.model.User;
import homework.service.UserService;

public class UserController {

    private UserService service = new UserService();

    public User createUser(String name) {
        return service.createUser(name);
    }

    public User getUserName() {
        return service.getUserName();
    }


    public void report(){
        System.out.println("Report for user: " + service.report());
    }





}
