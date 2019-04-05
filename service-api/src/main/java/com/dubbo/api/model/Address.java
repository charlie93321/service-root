package com.dubbo.api.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @AUTHOR: 小于
 * @DATE: [2019/4/4  23:13]
 * @DESC:
 */
@Data
public class Address implements Serializable {
    private String provice;
    private String city;
    private String region;
    private String desc;

    public Address(String provice, String city, String region, String desc) {
        this.provice = provice;
        this.city = city;
        this.region = region;
        this.desc = desc;
    }

    public Address() {
    }
}
