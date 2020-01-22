package model.light;

import interfaces.AbstractFactory;

public class LightFactory implements AbstractFactory<Light> {

    @Override
    public Light create(String type) {

        try {
            Class<?> clazz = Class.forName(type);
            return (Light) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }
}
