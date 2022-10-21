public class Player {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //    public void sayHello() {
//        System.out.println("hi, I'm " + getName() + " and I'm " + getAge());
//    }
    public String toString() {
        return "Hello" + name ;
    }

}

