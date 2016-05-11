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
    private String drescription;
    private Boolean trapboolan;
    private Boolean chestboolan;
    private Boolean randomMonsterEncounter;

    public Scene() {
    }

    public String getDrescription() {
        return drescription;
    }

    public void setDrescription(String drescription) {
        this.drescription = drescription;
    }

    public Boolean getTrapboolan() {
        return trapboolan;
    }

    public void setTrapboolan(Boolean trapboolan) {
        this.trapboolan = trapboolan;
    }

    public Boolean getChestboolan() {
        return chestboolan;
    }

    public void setChestboolan(Boolean chestboolan) {
        this.chestboolan = chestboolan;
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
        hash = 19 * hash + Objects.hashCode(this.drescription);
        hash = 19 * hash + Objects.hashCode(this.trapboolan);
        hash = 19 * hash + Objects.hashCode(this.chestboolan);
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
        if (!Objects.equals(this.drescription, other.drescription)) {
            return false;
        }
        if (!Objects.equals(this.trapboolan, other.trapboolan)) {
            return false;
        }
        if (!Objects.equals(this.chestboolan, other.chestboolan)) {
            return false;
        }
        if (!Objects.equals(this.randomMonsterEncounter, other.randomMonsterEncounter)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "drescription=" + drescription + ", trapboolan=" + trapboolan + ", chestboolan=" + chestboolan + ", randomMonsterEncounter=" + randomMonsterEncounter + '}';
    }
    
}
