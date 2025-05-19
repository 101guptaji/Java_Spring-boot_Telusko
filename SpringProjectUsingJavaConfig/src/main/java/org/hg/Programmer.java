package org.hg;

public class Programmer {
    private String pName;
    private Computer comp;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println(pName+ " is Coding.");
    }
}
