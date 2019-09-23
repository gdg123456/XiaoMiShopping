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
public class jjmbb  implements Serializable {//加价模板表

    private int Jjmb_id;//加价模板id
    private int Jjmb_lx_id;//加价模板类型id
    private int Jjmb_ckz;//加价模板操控值
}
