
class Student {

    private String Name;
    private int age;

    Student(String name, int Age) {

        Name = name;
        age = Age;

    }

    Student() {
        Name = "John Doe";
        age = 0;
    }

    public void getName() {

        System.out.println(Name);
    }

    public void SetName(String Name) {
        this.Name = Name;
    }

    public void show() {

        System.out.println(this.Name + " " + age);
    }

}

public class lol {

    public static void main(String[] args) {

        Student std1 = new Student("Manas Sharma", 21);

        std1.SetName("Anuj Dave");

        std1.getName();

    }
}