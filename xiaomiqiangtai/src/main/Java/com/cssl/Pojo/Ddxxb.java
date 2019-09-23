package com.cssl.Pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 订单详细表
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ddxxb implements Serializable {
    private  Integer Ddxx_id;//订单详细id
    private  String Ddxx_Ddbh;//订单编号
    private Integer Ddxx_spid;//该详细对应商品id
    private Integer Ddxx_gmsl;//该个商品的购买数量
    private double Ddxx_je;//该商品购买数量下对应的金额小结

}
