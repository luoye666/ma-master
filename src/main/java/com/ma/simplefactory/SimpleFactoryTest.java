package com.ma.simplefactory;

import com.ma.IAnimal;
import com.ma.Monkey;

/**
 * @Author：sun
 * @Date: 2019/3/8 22:14
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        IAnimal animal = new Monkey();
        animal.animalName();
    }

}
