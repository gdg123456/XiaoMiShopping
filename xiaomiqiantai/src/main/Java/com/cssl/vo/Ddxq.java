package com.cssl.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ddxq implements Serializable {
    private String dd_bh;//订单编号
    private  double dd_zje;//订单总金额
    private  String ddzt_sm;//订单状态说明
    private  String shdz_shrxm;//收货地址收货人姓名
    private  String shdz_shrdh;//收货人电话
    private  String qx_name;//区县名称
    private  String jd_name;//街道名称
    private  String shdz_sm;//收货地址说明
}
