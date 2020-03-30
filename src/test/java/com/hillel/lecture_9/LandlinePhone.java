package com.hillel.lecture_9;

import java.util.Objects;

public class LandlinePhone extends Phone {
    private String adress;

    public LandlinePhone(String provider, String type, String os, String adress) {
        super(provider, type, os);
        this.adress = adress;
    }

    @Override
    public String call() {
        return "You call in house on " + adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LandlinePhone that = (LandlinePhone) o;
        return adress.equals(that.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), adress);
    }
}
