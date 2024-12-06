class Person {
    String name;
    int age;
    String gender;

    public Person() {
    
    }

    public Person(String name,String gender,int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }

public void displayInfo() {
    System.out.println(" name: " + name + " gender: " + gender + " age: " + age);
}
    public static void main(String[] args) {
        Person p1 = new Person("pavan","male",50);
        p1.displayInfo();
    }
}


