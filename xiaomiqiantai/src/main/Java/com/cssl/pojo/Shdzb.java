package com.cssl.pojo;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author CDN
 * @desc 
 * Date: 2019-09-27
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Shdzb implements Serializable{

	/**
	 * 收货地址id
	 */
  private Integer shdzId;
	/**
	 * 收货地址对应的用户id
	 */
  private Integer shdzYhId;
	/**
	 * 收货地址对应的区县id
	 */
  private Integer shdzQxid;
	/**
	 * 收货地址对应的街道id
	 */
  private Integer shdzJdid;
	/**
	 * 收货地址的详细说明
	 */
  private String shdzSm;
	/**
	 * 收货地址对应的收货人姓名（该姓名可能与下单人姓名不一样）
	 */
  private String shdzShrxm;
	/**
	 * 收货地址对应的收货人电话号码
	 */
  private String shdzShrdh;

}
