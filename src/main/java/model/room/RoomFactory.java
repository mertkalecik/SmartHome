package model.room;

import interfaces.AbstractFactory;

public class RoomFactory implements AbstractFactory<Room> {

    @Override
    public Room create(String type) {

        try {
            Class<?> clazz = Class.forName(type);
            return (Room) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }
}
