package rikkei.academy.animals;


import rikkei.academy.edible.IEdible;

public class Chicken extends Animals implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: click- cluck!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }

}
