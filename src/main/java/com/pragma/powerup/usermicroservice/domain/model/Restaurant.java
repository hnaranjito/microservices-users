package com.pragma.powerup.usermicroservice.domain.model;

public class Restaurant {
    private Long id;
    private String name;
    private String dniNumber;
    private String address;
    private String phone;
    private String urlBrand;
    private Long idOwner;

    public Restaurant(Long id, String name, String dniNumber, String address, String phone, String urlBrand, Long idOwner){
        this.id = id;
        this.name = name;
        this.dniNumber = dniNumber;
        this.address = address;
        this.phone = phone;
        this.urlBrand = urlBrand;
        this.idOwner = idOwner;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDniNumber() {
        return dniNumber;
    }

    public void setDniNumber(String dniNumber) {
        this.dniNumber = dniNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrlBrand() {
        return urlBrand;
    }

    public void setUrlBrand(String urlBrand) {
        this.urlBrand = urlBrand;
    }
    public Long getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(Long idOwner) {
        this.idOwner = idOwner;
    }

}
