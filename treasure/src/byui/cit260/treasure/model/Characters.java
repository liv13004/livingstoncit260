/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author andrew
 */
public class Characters implements Serializable {

    public Characters() {

    }

    @Override
    public String toString() {
        return "Characters{" + "name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Characters other = (Characters) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    private int parrot;
    private int trader;
    private int dolfin;
    private int seaturtle;
    private int name;

}
