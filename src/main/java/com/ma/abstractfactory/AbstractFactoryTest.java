package com.ma.abstractfactory;

/**
 * @Author：sun
 * @Date: 2019/3/8 22:33
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        MonkeyAnimalFactory monkey = new MonkeyAnimalFactory();

        monkey.monkey().climbTree();

    }
}
