package com.cssl.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class my_sc implements Serializable {//我的收藏表

    private int Mysc_id;//收藏表id
    private int Mysc_yhid;//对应收藏该商品的用户id
    private int Mysc_spid;//被收藏的商品id
}
