public class heri {
    public static void main(String args[]){
        cat c=new cat();
        Dog d=new Dog();
        c.eat();
        c.meow();
        d.barks();
        d.eat();

    }
}


class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void barks(){
        System.out.println("barking");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("meowing");
    }
}