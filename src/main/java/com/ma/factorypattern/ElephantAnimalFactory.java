package com.ma.factorypattern;

import com.ma.Elephant;
import com.ma.IAnimal;

/**
 * @Author：sun
 * @Date: 2019/3/8 22:20
 */
public class ElephantAnimalFactory implements IZooFactory {

    public IAnimal animal() {

        return new Elephant();
    }
}
