public class Chicken extends Animal implements IEdible{
    @Override
    public String makeSound() {
        return "chick chick";
    }

    @Override
    public String howToEat() {
        return "luoc";
    }
}
