package model.door;

import interfaces.AbstractFactory;

public class DoorFactory implements AbstractFactory<Door> {

    @Override
    public Door create(String type) {

        try {
            Class<?> clazz = Class.forName(type);
            return (Door) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("An error occured while trying to initialize model.door class.");
            e.printStackTrace();
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }
}
