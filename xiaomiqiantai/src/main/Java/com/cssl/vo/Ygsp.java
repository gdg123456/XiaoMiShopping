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
public class Ygsp implements Serializable {
    private  String sptp_tplj;//商品图片路径
    private  String spxx_mc;//商品名称
    private  String sptp_ys;//商品颜色
    private  String spxhb_lxsm;//商品型号
    private  double spxhb_spxhdyjg;//商品型号对应的价格
    private  int ddxx_gmsl;//购买数量
}
