package com.hillel.lecture_9;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class PhoneTest {

    Phone strangePhone = new Phone("Vega", "Disk Phone", "analog");
    CellPhone mobilePhone = new CellPhone("KS", "SmartPhone", "Android");
    LandlinePhone homePhone = new LandlinePhone("Ukrtelecom", "DiskPhone", "analog", "Kirova str");
    TaxoPhone taxoPhone = new TaxoPhone("Ukrtelecom", "taxophone", "analog");

    @Test
    public void strangePhoneCallTest() {
        assertEquals(strangePhone.call(), "Phone call!!");
    }

    @Test
    public void mobilePhoneCallTest() {
        assertEquals(mobilePhone.call(), "Phone call!!");
    }

    @Test
    public void mobilePhoneMathCallTest() {
        assertEquals(mobilePhone.call(4), "Math call!!");
    }

    @Test
    public void mobilePhoneUnknownCallTest() {
        assertEquals(mobilePhone.call(10), "Unknown contact call!!");
    }

    @Test
    public void mobilePhoneDownTest() {
        assertEquals(mobilePhone.down(), "Put Phone in pocket");
    }
    @Test
    public void homePhoneCallTest() {
        assertEquals(homePhone.call(), "You call in house on Kirova str");
    }

    @Test
    public void taxoPhoneTest() {
        taxoPhone.setCompany("Epic company");
        assertEquals(taxoPhone.getType()+" own to " +taxoPhone.getCompany(), "taxophone own to Epic company");
    }
}
