package com.cssl.pojo;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author CDN
 * @desc 
 * Date: 2019-10-08
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Sptpb implements Serializable{

	/**
	 * 商品图片id
	 */
  private Integer sptpId;
	/**
	 * 商品图片对应的颜色
	 */
  private String sptpYs;
	/**
	 * 商品图片的路径
	 */
  private String sptpTplj;
	/**
	 * 商品图片对应的商品id
	 */
  private Integer sptpSpId;

}
