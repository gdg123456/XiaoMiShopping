package com.cssl.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * 商品详情
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sptpb implements Serializable {
    private Integer sptp_id; /**商品图片id*/
    private String sptp_ys; /**商品图片对应的颜色*/
    private String sptp_tplj; /**商品图片的路径*/
    private Integer sptp_sp_id; /**商品图片对应的商品id*/
}
