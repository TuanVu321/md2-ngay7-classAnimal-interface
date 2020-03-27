public class main {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Tiger tiger = new Tiger();
        System.out.println(chicken.howToEat());
        System.out.println(tiger.makeSound());
        System.out.println(chicken.makeSound());
        Orange orange = new Orange();
        Apple apple = new Apple();
        System.out.println(orange.howToEat());
        System.out.println(apple.howToEat());
    }
}
