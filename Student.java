
class Student {
    String name;
    int id;

    public Student(String name,int id) {
        this.name = name;
         this.id = id;
    }
    public void displayInfo() {
        System.out.println("Student name: " + name);
        System.out.println("Student id: " + id);
    }

    public static void main(String[] args) {
        Student student = new Student("Pavan",1001);
        student.displayInfo();


    }
}

    