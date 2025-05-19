package com.caching;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Cacheable
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int depart_id;

    private String depart_name;
    private String hod;
    private int batches;

    public int getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(int depart_id) {
        this.depart_id = depart_id;
    }

    public String getDepart_name() {
        return depart_name;
    }

    public void setDepart_name(String depart_name) {
        this.depart_name = depart_name;
    }

    public String getHod() {
        return hod;
    }

    public void setHod(String hod) {
        this.hod = hod;
    }

    public int getBatches() {
        return batches;
    }

    public void setBatches(int batches) {
        this.batches = batches;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "depart_id='" + depart_id + '\'' +
                ", depart_name='" + depart_name + '\'' +
                ", hod='" + hod + '\'' +
                ", batches=" + batches +
                '}';
    }
}
