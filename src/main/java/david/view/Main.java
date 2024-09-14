package david.view;

import david.model.Category;

public class Main {
    public static void main(String[] args) {
        UI_CVOrganizer cvOrganizer = new UI_CVOrganizer();
        String category = "Manager";
        Category cat = new Category(category);
        cvOrganizer.insertCategory(cat);
    }
}