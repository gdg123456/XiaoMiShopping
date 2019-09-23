package com.cssl.Pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class jjlxb implements Serializable {//加价类型表

    private int Jjlx_idd;//加价类型id
    private String Jjlx_mc;//加价类型名称
}
