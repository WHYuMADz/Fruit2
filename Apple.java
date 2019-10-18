public class Apple extends Fruit {
 String name;
 String taste;
 double size;
 
 
 public Fruit(String name, String taste, double size){
 this.name = name;
 this.taste = taste;
 this.size = size;
 }

 public String eat(String name, String taste){
 return name + " " + taste;
 }


}