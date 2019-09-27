package com.cssl.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 街道表
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Jdb implements Serializable {
    private  Integer Jd_id;//街道id
    private  String Jd_name;//街道名称
    private  Integer Jd_qxid;//所属区县的ID
}
