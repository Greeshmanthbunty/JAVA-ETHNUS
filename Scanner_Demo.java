import java.util.Scanner;
class Scanner_Demo{

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String []args) {
        System.out.println("Ho Hello");

    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your course: ");
        String Course = sc.nextLine();


        System.out.println("Your name is: "+ name);
        System.out.println("Your Learning: "+ Course);

        sc.close();

        




            }
}