package david.view;

import david.model.Category;
import david.persistence.DAO_CVAppJDBC;
import david.persistence.I_DAO_CVApp;
import david.service.CVService;

public class UI_CVOrganizer {

    //property
    public CVService cvservice;

    //constructor
    public UI_CVOrganizer() {
        I_DAO_CVApp dao_cvApp = new DAO_CVAppJDBC(); //jdbc implementation
        this.cvservice = new CVService(dao_cvApp); //Inject DAO into service
    }

    //method to insert a new category
    public void insertCategory(Category cat){
        boolean success = this.cvservice.addCategory(cat);

        if(success){
            System.out.println("Category added successfully");
        }else {
            System.out.println("Failed to add category");
        }
    }

}
