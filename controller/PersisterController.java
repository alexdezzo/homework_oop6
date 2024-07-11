package homework.controller;

import homework.model.User;
import homework.model.Persister;
import homework.service.PersisterService;

public class PersisterController {

    PersisterService controller = new PersisterService();

    public Persister createPersister(User user){
        return controller.createPersister(user);
    }

    public void save(){
        controller.save();
    }
}
