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

public class Ddb implements Serializable{

	/**
	 * 订单编号，由代码产生随机数
	 */
  private String ddBh;
	/**
	 * 订单用户id，下单用户的id
	 */
  private Integer ddYhid;
	/**
	 * 订单总金额
	 */
  private Double ddZje;
	/**
	 * 订单收货地址的id
	 */
  private Integer ddShdzid;
	/**
	 * 订单状态id
	 */
  private Integer ddZtid;

}
