package com.hillel.lecture_9;

import java.util.Objects;

public class TaxoPhone extends Phone {
    String company;

    TaxoPhone(String provider, String type, String os) {
        super(provider, type, os);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TaxoPhone taxoPhone = (TaxoPhone) o;
        return Objects.equals(company, taxoPhone.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), company);
    }
}
