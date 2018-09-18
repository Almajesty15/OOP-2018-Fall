public class Student {

    private String name;
    private int id;
    int year_of_study;

    Student(String _name, int _id) {
        name = _name;
        id = _id;
        year_of_study = 1;
    }

    String getName() {
        return name;
    }

    void setName(String newname) {
        name = newname;
    }

    void incrementYearOfStudy() {
        year_of_study++;
    }

    int getId() {
        return id;
    }

    void setId(int newid) {
        id = newid;
    }
}