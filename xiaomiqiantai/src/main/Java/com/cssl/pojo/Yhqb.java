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

public class Yhqb implements Serializable{

	/**
	 * 优惠券id
	 */
  private Integer yhqId;
	/**
	 * 优惠券名称
	 */
  private String yhqMc;
	/**
	 * 优惠券优惠的价格
	 */
  private Double yhqYhjg;
	/**
	 * 优惠券开始时间
	 */
  private java.util.Date yhqKssj;
	/**
	 * 优惠券结束时间
	 */
  private java.util.Date yhqJssj;
	/**
	 * 优惠券状态
	 */
  private Integer yhqZt;
	/**
	 * 满足该条件优惠券才开始起作用
	 */
  private Double yhqMztj;

}
