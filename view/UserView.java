package homework.view;

import homework.controller.PersisterController;
import homework.controller.UserController;
import homework.service.ReportService;

import java.util.Scanner;

public class UserView {

    public void start(){

        UserController uController = new UserController();
        PersisterController pController = new PersisterController();
//        ReportService reportService = new ReportService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        uController.createUser(scanner.nextLine());
        pController.createPersister(uController.getUserName());
//        reportService.report();
        uController.report();
        pController.save();

    }


}
