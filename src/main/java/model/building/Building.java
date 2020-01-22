package model.building;

import interfaces.ISmartHomeItem;
import model.floor.Floor;
import model.staircase.StairCase;

import java.util.List;

public abstract class Building implements ISmartHomeItem {
    protected List<StairCase> stairCases;
    protected List<Floor> floorList;

    public Building() {
    }

    public List<StairCase> getStairCases() {
        return stairCases;
    }

    public void setStairCases(List<StairCase> stairCases) {
        this.stairCases = stairCases;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }
}
