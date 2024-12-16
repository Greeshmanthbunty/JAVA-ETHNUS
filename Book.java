package class_objects;
class Book {
    String subject;
    String page;
    String section;

    public void teacher (){
        System.out.println("teacher");
    }
    public void school () {
        System.out.println("school");
    }
    public static void main(String[] args){
        Book b1= new Book();
        b1.subject = "java";
        b1.page = "cs";
        b1.section = "flag";
        b1.school();
        b1.teacher();
    }
}
