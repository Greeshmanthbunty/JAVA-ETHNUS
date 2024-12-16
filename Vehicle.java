package class_objects;

class Vehicle{
String name;
String colour;
String brand;
int number;
int speed;

public static void main (String []args){
    Vehicle v= new Vehicle();
    v.name= "maybach";
    v.colour= "black";
    v.brand= "merc";
    v.number= 000;
    v.speed= 200;
    System.out.println(v.name);
    System.out.println(v.brand);
}


}