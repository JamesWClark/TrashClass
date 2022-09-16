public class Person {
    private String eyeColor;
    private String hairColor;
    private int age;

    public Person() {
        age = 18 + (int)(Math.random() * 78); // 18-100
        eyeColor = "Brown"; // todo - randomize
        hairColor = "Brown"; // todo - randomize
    }
    public Person(int age) {
        this(); // call the default constructor
        this.age = age;
    }

    public Person(int age, String hair, String eyes) {
        this.age = age;
        hairColor = hair;
        eyeColor = eyes;
    }

    @Override
    public String toString() {
        return "Age: " + age + ", Eyes: " + eyeColor + ", Hair: " + hairColor;
    }

    public void talk() {
        System.out.println("I'm talking, and this is what I have to say...");
        System.out.println(this);
        System.out.println("My hashcode is " + hashCode());
    }

    // accessor
    public int getAge() { return age; }

    // mutator
    public void setAge(int a) { age = a; }
}

/*
Person
--------------
- eyeColor : String
- hairColor : String
- age : int
--------------
+ Person()
+ Person(age: int)
+ Person(age: int, hair: String, eye: String)
+ talk() : void
+ tellAge() : int
+ dyeHair(newHair: String) : void
+ toString() : String <<override>>
// accessors and mutators 
*/