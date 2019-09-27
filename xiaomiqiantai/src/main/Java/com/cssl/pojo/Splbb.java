package com.cssl.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 商品类别表
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Splbb implements Serializable {

    private Integer splb_id;/*** 商品类别id */
    private String splb_mc;/*** 商品类别名称*/
}
