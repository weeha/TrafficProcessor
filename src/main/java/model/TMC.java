package model;

import com.mongodb.BasicDBObject;

public class TMC extends BasicDBObject {

    private int pc;
    private String de;
    private char qd;
    private double length;

    public TMC(){

    }

    public TMC(int pc, String de, char qd, double length){
        this.pc = pc;
        this.de = de;
        this.qd = qd;
        this.length = length;
        put("pc", pc);
        put("de", de);
        put("qd", qd);
        put("length", length);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public char getQd() {
        return qd;
    }

    public void setQd(char qd) {
        this.qd = qd;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String toString(){
        String result = "";
        result += "PC: " + pc;
        result += "\tDE: " + de;
        result += "\tQD: " + qd;
        result += "\tLength: " + length;
        return result;
    }

}
