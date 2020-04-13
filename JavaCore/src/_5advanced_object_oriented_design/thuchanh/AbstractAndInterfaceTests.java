package _5advanced_object_oriented_design.thuchanh;

import _5advanced_object_oriented_design.thuchanh.animals.Animal;
import _5advanced_object_oriented_design.thuchanh.animals.Chicken;
import _5advanced_object_oriented_design.thuchanh.animals.Tiger;
import _5advanced_object_oriented_design.thuchanh.edible.Edible;
import _5advanced_object_oriented_design.thuchanh.fruit.Apple;
import _5advanced_object_oriented_design.thuchanh.fruit.Fruit;
import _5advanced_object_oriented_design.thuchanh.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        testAnimalsClass();
        testFruitInterface();

    }

    static void testAnimalsClass() {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }

        }
    }
    static void testFruitInterface(){
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
