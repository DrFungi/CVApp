package david.service;

import david.model.Category;
import david.persistence.I_DAO_CVApp;

public class CVService {
    private I_DAO_CVApp daoCvApp;

    //dependency injection
    public CVService(I_DAO_CVApp dao) {
        this.daoCvApp = dao;
    }

    //insert a category via DAO
    public boolean addCategory(Category category) {
        int result = this.daoCvApp.insertCategory(category);
        return result > 0;
    }
}
