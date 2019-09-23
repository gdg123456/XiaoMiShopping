package com.cssl.Pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 订单状态表
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dingdan_zt implements Serializable {
    private Integer ddzt_id;//订单状态id
    private String ddzt_sm;//订单状态说明
}
