package model.factory;

import interfaces.AbstractFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String factoryName) {

        try {
            Class<?> clazz = Class.forName(factoryName);
            return (AbstractFactory) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }
}
