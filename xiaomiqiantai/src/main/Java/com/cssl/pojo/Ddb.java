package com.cssl.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 订单表
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ddb implements Serializable {
    private String Dd_bh;//订单编号，由代码产生随机数
    private  Integer Dd_yhid;//订单用户id，下单用户的id
    private double Dd_zje;//订单总金额
    private  Integer Dd_shdzid;//订单收货地址的id
    private Integer Dd_ztid;//订单状态id
}
