package com.cssl.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品详情表
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Spxxb implements Serializable {
    private Integer Spxx_id;/**id*/
    private Integer Spxx_lbid; /**商品类别对应的id*/
    private  String Spxx_mc; /**商品名称*/
    private Date Spxx_fbsj;//商品发货时间
    private Integer spxx_kc; /**商品库存*/
    private  String spxx_sm; /**商品说明*/
    private Integer spxx_ztid; /**商品状态对应的id*/
    private  String Spxx_spgg;//商品广告
}
