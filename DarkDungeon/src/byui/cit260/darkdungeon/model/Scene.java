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
public class Scene implements Serializable {
    
    //class instance variables
    private String description;
    private Boolean trapboolean;
    private Boolean chestboolean;
    private Boolean randomMonsterEncounter;

    public Scene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String drescription) {
        this.description = drescription;
    }

    public Boolean getTrapboolan() {
        return trapboolean;
    }

    public void setTrapboolean(Boolean trapboolean) {
        this.trapboolean = trapboolean;
    }

    public Boolean getChestboolean() {
        return chestboolean;
    }

    public void setChestboolean(Boolean chestboolean) {
        this.chestboolean = chestboolean;
    }

    public Boolean getRandomMonsterEncounter() {
        return randomMonsterEncounter;
    }

    public void setRandomMonsterEncounter(Boolean randomMonsterEncounter) {
        this.randomMonsterEncounter = randomMonsterEncounter;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.description);
        hash = 19 * hash + Objects.hashCode(this.trapboolean);
        hash = 19 * hash + Objects.hashCode(this.chestboolean);
        hash = 19 * hash + Objects.hashCode(this.randomMonsterEncounter);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.trapboolean, other.trapboolean)) {
            return false;
        }
        if (!Objects.equals(this.chestboolean, other.chestboolean)) {
            return false;
        }
        if (!Objects.equals(this.randomMonsterEncounter, other.randomMonsterEncounter)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", trapboolean=" + trapboolean + ", chestboolean=" + chestboolean + ", randomMonsterEncounter=" + randomMonsterEncounter + '}';
    }
    
}
