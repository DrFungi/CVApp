package david.view;

import david.persistence.DAO_CVAppJDBC;
import david.persistence.I_DAO_CVApp;
import david.service.CVService;

public class UI_CVOrganizer {

    //property
    public CVService cvservice;

    //constructor
    I_DAO_CVApp dao_cvApp = new DAO_CVAppJDBC();

    public void insertCategory(String category){

    }
}
