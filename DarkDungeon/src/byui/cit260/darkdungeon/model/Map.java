/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.darkdungeon.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author K
 */
public class Map implements Serializable{
    private Boolean locationX;
    private Boolean locationY;

    public Boolean getLocationX() {
        return locationX;
    }

    public void setLocationX(Boolean locationX) {
        this.locationX = locationX;
    }

    public Boolean getLocationY() {
        return locationY;
    }

    public void setLocationY(Boolean locationY) {
        this.locationY = locationY;
    }

    public Map() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.locationX);
        hash = 79 * hash + Objects.hashCode(this.locationY);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (!Objects.equals(this.locationX, other.locationX)) {
            return false;
        }
        if (!Objects.equals(this.locationY, other.locationY)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "locationX=" + locationX + ", locationY=" + locationY + '}';
    }
}