package com.cssl.pojo;
/**
 * 用户类型信息类
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
public class Yhlxb implements Serializable {
    private Integer Yhlx_id;//用户类型ID(自增)
    private String Yhlx_mc;//用户类型名称
}
