package com.sibsutis.devices;

import com.sibsutis.Printable;

/** База для устройств. */
public abstract class Device implements Printable {
    private final int id;      // уникальный идентификатор
    private final int price;   // стоимость
    private final String ip;   // ip адрес (может быть null)

    protected Device(int id, int price, String ip) {
        this.id = id;
        this.price = price;
        this.ip = ip;
    }

    public int getId()    { return id; }
    public int getPrice() { return price; }
    public String getIp() { return ip; }

    /** Тип устройства для вывода. Реализуют наследники. */
    protected abstract String getDeviceType();

    /** Реализация Printable. */
    @Override
    public String print() {
        return String.format("%s{id=%d, price=%d, ip=%s}",
                getDeviceType(), id, price, ip);
    }

    /* equals/hashCode — по заданию реализуем в наследниках */
}
