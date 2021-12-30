/**
 * Java1.HW6
 * @ author Anton Filatov
 * @ version 29.12.2021
 */

package lesson6;

class HW6 {
    public static void main(String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(199));
            System.out.println(animal.run(201));
            System.out.println(animal.run(501));
            System.out.println(animal.swim(9));
            System.out.println(animal.swim(11));
        }
        System.out.println("Animals were created: " + Animal.getCountOfAnimals());
    }
}

class Dog extends Animal {
    Dog(int runLength, int swimLength) {
        super(runLength, swimLength);
    }
}

class Cat extends Animal {
    Cat(int runLength, int swimLength) {
        super(runLength, swimLength);
    }

    Cat(int runLength) {
        super(runLength, -1);
    }

    @Override
    public String swim(int distance) {
        return getClassName() + " can't swim";
    }
}

abstract class Animal implements IAnimal {
    protected int runLength;
    protected int swimLength;
    protected String className;
    protected static int countOfAnimals = 0;

    Animal(int runLength, int swimLength) {
        this.runLength = runLength;
        this.swimLength = swimLength;
        className = getClass().getSimpleName();
        countOfAnimals++;
    }

    public String getClassName() {
        return className;
    }

    public static int getCountOfAnimals () {
        return countOfAnimals;
    }

    @Override
    public String run(int distance) {
        if (distance > runLength) {
            return className + " couldn't run " + distance;
        } else {
            return className + " successfully run " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimLength) {
            return className + " could not swim " + distance;
        } else {
            return className + " successfully swim " + distance;
        }
    }

    @Override
    public String toString() {
        return className + ". runLength: " + runLength + ", swimLength: " + swimLength;
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}