package com.vietjack;

public class Address {
    private String street;
    private String province;
    private String phone;

    public void display(){
        System.out.println("This is address: ");
        System.out.println("Street: " + street);
        System.out.println("Street: " + province);
        System.out.println("Street: " + phone);
    }

    public Address(String street, String province, String phone) {
        this.street = street;
        this.province = province;
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
