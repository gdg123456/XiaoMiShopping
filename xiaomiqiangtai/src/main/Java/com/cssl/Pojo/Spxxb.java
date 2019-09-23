package com.cssl.Pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 商品详情表
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Spxxb implements Serializable {
    private Integer spxx_id;/**id*/
    private Integer spxx_lbid; /**商品类别对应的id*/
    private  String spxx_mc; /**商品名称*/
    private Double spxx_spdj; /**商品单价*/
    private Integer spxx_kc; /**商品库存*/
    private  String spxx_sm; /**商品说明*/
    private Integer spxx_ztid; /**商品状态对应的id*/
}
