package model.building;

import interfaces.AbstractFactory;
import model.SmartHomeConstants;
import model.factory.FactoryProvider;
import model.floor.Floor;

import java.util.ArrayList;

public class SmartBuilding extends Building {
    AbstractFactory factory;

    public SmartBuilding() {
        onCreate();
    }

    private void onCreate() {
        init();

        factory = FactoryProvider.getFactory(SmartHomeConstants.CLASS_NAME_FLOOR_FACTORY);
        floorList.add((Floor) factory.create(SmartHomeConstants.CLASS_NAME_SMART_FLOOR));
        floorList.add((Floor) factory.create(SmartHomeConstants.CLASS_NAME_SMART_FLOOR));
        floorList.add((Floor) factory.create(SmartHomeConstants.CLASS_NAME_SMART_FLOOR));
    }

    private void init() {
        stairCases = new ArrayList<>();
        floorList = new ArrayList<>();
    }
}
