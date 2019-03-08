package com.ma.factorypattern;

import com.ma.IAnimal;

/**
 * @Author：sun
 * @Date: 2019/3/8 22:21
 */
public class FactoryPatternTest {

    public static void main(String[] args) {

        IZooFactory zoo = new MonkeyAnimalFactory();
        IAnimal animal = zoo.animal();
        animal.animalName();
    }
}
