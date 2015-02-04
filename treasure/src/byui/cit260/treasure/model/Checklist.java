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
 * @author Braden
 */

public class Checklist implements Serializable{
    //class instance variable
    private int progress;
    private boolean lumber;
    private boolean sail;
    private boolean payDolphin;
    private boolean payTurtle;

    public Checklist() {
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
    
    
    public Boolean getLumber(boolean lumber) {
        return lumber;
    }

    public void setLumber(boolean lumber) {
        this.lumber = lumber;
    }

    public Boolean getSail(boolean sail) {
        return sail;
    }

    public void setSail(boolean sail) {
        this.sail = sail;
    }

    public boolean isPayDolphin() {
        return payDolphin;
    }

    public void setPayDolphin(boolean paydolphin) {
        this.payDolphin = paydolphin;
    }

    public boolean isPayTurtle() {
        return payTurtle;
    }

    public void setPayTurtle(boolean payturtle) {
        this.payTurtle = payturtle;
    }

    @Override
    public String toString() {
        return "Checklist{" + "progress=" + progress + ", lumber=" + lumber + ", sail=" + sail + ", payDolphin=" + payDolphin + ", payTurtle=" + payTurtle + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.progress;
        hash = 13 * hash + (this.lumber ? 1 : 0);
        hash = 13 * hash + (this.sail ? 1 : 0);
        hash = 13 * hash + (this.payDolphin ? 1 : 0);
        hash = 13 * hash + (this.payTurtle ? 1 : 0);
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
        final Checklist other = (Checklist) obj;
        if (this.progress != other.progress) {
            return false;
        }
        if (this.lumber != other.lumber) {
            return false;
        }
        if (this.sail != other.sail) {
            return false;
        }
        if (this.payDolphin != other.payDolphin) {
            return false;
        }
        if (this.payTurtle != other.payTurtle) {
            return false;
        }
        return true;
    }
}
    
    
    

    