package model.floor;

import interfaces.AbstractFactory;

public class FloorFactory implements AbstractFactory<Floor> {

    @Override
    public Floor create(String type) {
        try {
            Class<?> clazz = Class.forName(type);
            return (Floor) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }
}
