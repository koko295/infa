package com.sibsutis.devices;

import java.util.Objects;

public class PersonalComputer extends Device {
    public PersonalComputer(int id, int price, String ip) {
        super(id, price, ip);
    }

    @Override
    protected String getDeviceType() { return "PersonalComputer"; }

    /** равенство по id и точному классу, как обычно для сущностей */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalComputer that = (PersonalComputer) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
