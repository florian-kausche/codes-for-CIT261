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
 * @author Florian
 */
public class Location implements Serializable{
    private String currentRoom;
    private double currentX;
    private double currentY;

    public String getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(String currentRoom) {
        this.currentRoom = currentRoom;
    }

    public double getCurrentX() {
        return currentX;
    }

    public void setCurrentX(double currentX) {
        this.currentX = currentX;
    }

    public double getCurrentY() {
        return currentY;
    }

    public void setCurrentY(double currentY) {
        this.currentY = currentY;
    }

    public Location() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.currentRoom);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.currentX) ^ (Double.doubleToLongBits(this.currentX) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.currentY) ^ (Double.doubleToLongBits(this.currentY) >>> 32));
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.currentX) != Double.doubleToLongBits(other.currentX)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentY) != Double.doubleToLongBits(other.currentY)) {
            return false;
        }
        if (!Objects.equals(this.currentRoom, other.currentRoom)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "currentRoom=" + currentRoom + ", currentX=" + currentX + ", currentY=" + currentY + '}';
    }
    
    
    
}
