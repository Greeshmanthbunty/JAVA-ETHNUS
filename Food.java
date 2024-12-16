package class_objects;

public static class Food {
     int i=10;
   public static void main(String[] args) {
     Food f1=new Food();
     Food f2=new Food();
     f1.i= f1.i+1;
     System.out.println(f1.i);
     System.out.println(f2.i+1);
   }
}
