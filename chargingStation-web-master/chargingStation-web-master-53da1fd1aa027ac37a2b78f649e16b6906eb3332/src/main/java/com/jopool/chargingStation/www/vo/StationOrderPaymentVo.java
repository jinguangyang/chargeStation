package com.jopool.chargingStation.www.vo;


/**
 * Created by synn on 2017/9/6.
 */
public class StationOrderPaymentVo {
    private String id;

    private String number;

    private String name;

    private String area;

    private String areaDes;

    private Integer lngE5;

    private Integer latE5;

    private String address;

    private Integer portCount;

    private String status;

    private int amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaDes() {
        return areaDes;
    }

    public void setAreaDes(String areaDes) {
        this.areaDes = areaDes;
    }

    public Integer getLngE5() {
        return lngE5;
    }

    public void setLngE5(Integer lngE5) {
        this.lngE5 = lngE5;
    }

    public Integer getLatE5() {
        return latE5;
    }

    public void setLatE5(Integer latE5) {
        this.latE5 = latE5;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPortCount() {
        return portCount;
    }

    public void setPortCount(Integer portCount) {
        this.portCount = portCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
