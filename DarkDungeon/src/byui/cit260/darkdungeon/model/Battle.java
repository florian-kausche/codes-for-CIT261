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
 * @author Bill
 */
public class Battle implements Serializable {
    
    //class instance variables
    private Boolean isAlive;

    public Battle() {
    }
        
    public Boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.isAlive);
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
        final Battle other = (Battle) obj;
        if (!Objects.equals(this.isAlive, other.isAlive)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Battle{" + "isAlive=" + isAlive + '}';
    }
    
}
