package com.ma.abstractfactory;

/**
 * @Author：sun
 * @Date: 2019/3/8 22:39
 */
public class MonkeyAnimalFactory implements IZooFactory {

    public IMonkey monkey() {

        return new MonkeyFactory();
    }

    public IElephant elephant() {
        return new ElephantFactory();
    }
}
