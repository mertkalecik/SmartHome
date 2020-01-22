package model.building;

import interfaces.AbstractFactory;

public class BuildingFactory implements AbstractFactory<Building> {

    @Override
    public Building create(String type) {

        try {
            Class<?> clazz = Class.forName(type);
            return (Building) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }
}
