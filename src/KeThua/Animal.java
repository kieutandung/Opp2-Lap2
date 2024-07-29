package KeThua;

abstract class Animal {
    private String name;
    public Animal(String name){

    }
    abstract void makeSound();
    public void eat(){
        System.out.println(name + "is eating");
    }
}
