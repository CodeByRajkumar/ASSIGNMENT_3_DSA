
class Box<T> {
    public T t;
    public Box(T t) 
    {
        this.t = t;
    }
    public T get() 
    {
        return t;
    }
    public void set(T t) 
    {
        this.t = t;
    }
}
public class Q6 {
	public static void main(String[] args) {
		
		Box<String> strobj1 = new Box<>("It is the object of Box String");
        Box<String> strobj2 = strobj1;
        System.out.println("String variable_1 contains: " + strobj1.get());
        System.out.println("String variable_2 contains: " + strobj2.get());
        strobj1.set("World");
        System.out.println("String box contains: " + strobj1.get());
        System.out.println("String box2 contains: " + strobj2.get());

        Box<Integer> intBox = new Box<>(10);
        Box<Integer> intBox2 = intBox;
        System.out.println("Integer box contains: " + intBox.get());
        System.out.println("Integer box2 contains: " + intBox2.get());
        intBox.set(20);
        System.out.println("Integer box contains: " + intBox.get());
        System.out.println("Integer box2 contains: " + intBox2.get());

        Box<Object> objectBox = new Box<>(new Object());
        Box<Object> objectBox2 = objectBox;
        System.out.println("Object box contains: " + objectBox.get());
        System.out.println("Object box2 contains: " + objectBox2.get());
        objectBox.set("Hello");
        System.out.println("Object box contains: " + objectBox.get());
        System.out.println("Object box2 contains: " + objectBox2.get());
        objectBox.set(10);
        System.out.println("Object box contains: " + objectBox.get());
        System.out.println("Object box2 contains: " + objectBox2.get());
    }
}
/*
OUTPUT:
String variable_1 contains: It is the object of Box String
String variable_2 contains: It is the object of Box String
String box contains: World
String box2 contains: World
Integer box contains: 10
Integer box2 contains: 10
Integer box contains: 20
Integer box2 contains: 20
Object box contains: java.lang.Object@2c7b84de
Object box2 contains: java.lang.Object@2c7b84de
Object box contains: Hello
Object box2 contains: Hello
Object box contains: 10
Object box2 contains: 10
*/