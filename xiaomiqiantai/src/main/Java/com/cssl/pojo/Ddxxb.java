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

public class Ddxxb implements Serializable{

	/**
	 * 订单详细id
	 */
  private Integer ddxxId;
	/**
	 * 订单编号
	 */
  private String ddxxDdbh;
	/**
	 * 该详细对应商品id
	 */
  private Integer ddxxSpid;
	/**
	 * 该个商品的购买数量
	 */
  private Integer ddxxGmsl;
	/**
	 * 该商品购买数量下对应的金额小结
	 */
  private Double ddxxJe;
	/**
	 * 下单商品对应图片id
	 */
  private Integer ddxxSptpid;
	/**
	 * 商品对应型号id
	 */
  private Integer ddxxSpxhid;

}
