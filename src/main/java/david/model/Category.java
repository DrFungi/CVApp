package david.model;

public class Category {
    int ID;
    String CategoryName;

    public Category(int ID, String categoryName) {
        this.ID = ID;
        CategoryName = categoryName;
    }

    public Category(String categoryName) {
        CategoryName = categoryName;
    }

    //empty constructor
    public Category() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "ID=" + ID +
                ", CategoryName='" + CategoryName + '\'' +
                '}';
    }
}
