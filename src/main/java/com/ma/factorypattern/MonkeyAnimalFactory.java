package com.ma.factorypattern;

import com.ma.IAnimal;
import com.ma.Monkey;

/**
 * @Author：sun
 * @Date: 2019/3/8 22:19
 */
public class MonkeyAnimalFactory implements IZooFactory {

    public IAnimal animal() {

        return new Monkey();
    }
}
