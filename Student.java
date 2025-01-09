public class Student {
    String name;
    int age;

    public Student(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public void displayName(){
        System.out.println("Student Name is : " + name);
    }
    
    public void displayAge(){
    	System.out.println("Student Age is : " + age);
	}
}