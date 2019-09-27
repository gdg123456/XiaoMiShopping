package com.cssl.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 商品状态表
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Spztb implements Serializable {
    private Integer spzt_id; /**商品状态id*/
    private String spzt_mc;/**商品状态名称*/
}
