package com.cssl.Pojo;
/**
 * 性别类
 * author:gdg
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Xbb implements Serializable {
    private Integer xb_id;//性别ID(自增)
    private char xb_sm;//性别名称
}
