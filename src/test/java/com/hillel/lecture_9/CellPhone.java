package com.hillel.lecture_9;

import java.util.Objects;

public class CellPhone extends Phone {

    CellPhone(String provider, String type, String os) {
        super(provider, type, os);
    }

    public String call(int caller) {
        switch (caller) {
            case 1:
                return "Alex call!!";
            case 2:
                return "Ann call!!";
            case 3:
                return "John call!!";
            case 4:
                return  "Math call!!";
            default:
                return "Unknown contact call!!";
        }
    }

    @Override
    public String down() {
        return "Put Phone in pocket";
    }
}
