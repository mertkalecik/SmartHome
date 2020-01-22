package model.window;

import interfaces.AbstractFactory;

public class WindowFactory implements AbstractFactory<AbstractWindow> {

    @Override
    public AbstractWindow create(String type) {

        try {
            Class<?> clazz = Class.forName(type);
            return (AbstractWindow) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }
}
