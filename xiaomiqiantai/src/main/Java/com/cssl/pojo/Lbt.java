package com.cssl.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 轮播图表
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Lbt implements Serializable {
       private int lbt_id;//轮播图id
       private String lbt_url;//轮播图地址
       private int lbt_spid;//商品id
}
