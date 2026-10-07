package org.example;

public class CampArea {
    String areaName;

    public CampArea(String areaName, String description) {
        this.areaName = areaName;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    String description;
}
