package com.cssl.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class shdzb implements Serializable {//收货地址表
    private int Shdz_id;//收货地址id
    private int Shdz_yh_id;//收货地址对应的用户id
    private int Shdz_qxid;//收货地址对应的区县id
    private int Shdz_jdid;//收货地址对应的街道id
    private String Shdz_sm;//收货地址的详细说明
    private String Shdz_shrxm;//收货地址对应的收货人姓名（该姓名可能与下单人姓名不一样）
    private String Shdz_shrdh;//收货地址对应的收货人电话号码
}
