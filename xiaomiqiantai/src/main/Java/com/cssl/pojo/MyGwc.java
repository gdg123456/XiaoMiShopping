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

public class MyGwc implements Serializable{

	/**
	 * 购物车id
	 */
  private Integer gwcId;
	/**
	 * 购物车对应用户id
	 */
  private Integer gwcYhid;
	/**
	 * 购物车对应商品id
	 */
  private Integer gwcSpid;
	/**
	 * 购物车对应商品图片
	 */
  private Integer gwcSptpid;
	/**
	 * 购物车商品型号id
	 */
  private Integer gwcSpxhid;
	/**
	 * 购物车中商品数量
	 */
  private Integer gwcSpsl;

}
