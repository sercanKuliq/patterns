package com.example.patterns.creational.abstractFactory.Factory;

import com.example.patterns.creational.abstractFactory.enumaretion.EnumFactory;
import org.springframework.stereotype.Component;

@Component
public class FactoryProducer {

    public static AbstractFactory getFactory(EnumFactory factory) {
        if(factory == null){
            return null;
        }

        if(factory == EnumFactory.Shape){
            return new ShapeFactory();

        }else if(factory == EnumFactory.Color){
            return new ColorFactory();
        }

        return null;
    }
}
