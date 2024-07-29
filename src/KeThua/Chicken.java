package KeThua;

public class Chicken extends Animal{
    public Chicken(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("cook!" + "cook!");
    }
}
