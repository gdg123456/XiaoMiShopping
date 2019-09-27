package com.cssl.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 商品类型说明表
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Spxhb implements Serializable {
    private Integer Spxhb_id; /**商品型号id*/
    private String Spxhb_lxsm; /**商品型号类型说明*/
    private  Integer Spxhb_spid; /**商品型号对应的商品id*/
    private Integer Spxhb_spxhdyjg;//商品型号对应的价格
}
