package com.hillel.lecture_9;

import java.util.Objects;
import java.util.Random;

public class Phone {
    private String provider;
    private String type;
    private String os;

     Phone(String provider, String type,String os) {
         this.provider = provider;
         this.type = type;
         this.os = os;
     }

    public String call() {
        return "Phone call!!";
     }

    public String down() {
        return "Put Phone on trigger";
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return provider.equals(phone.provider) &&
                type.equals(phone.type) &&
                os.equals(phone.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, type, os);
    }
}
