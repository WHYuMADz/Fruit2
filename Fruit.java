public class Fruit {
 String name;
 String taste;
 double size;
 
 
 public Fruit(String name, String taste, double size){
 this.name = name;
 this.taste = taste;
 this.size = size;
 }

 public String eat(String name, String taste){
 return name + " is " + taste;
 }
public static void main (String [] args) {
Fruit g = new Fruit ("Apple", "Sweet", 5.0);
System.out.println(g.eat(g.name,g.taste));
}
}