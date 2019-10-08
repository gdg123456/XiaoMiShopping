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

public class Spxhb implements Serializable{

	/**
	 * 商品型号id
	 */
  private Integer spxhbId;
	/**
	 * 商品型号类型说明
	 */
  private String spxhbLxsm;
	/**
	 * 商品型号对应的商品id
	 */
  private Integer spxhbSpid;
	/**
	 * 商品该型号对应的价格
	 */
  private Double spxhbSpxhdyjg;

}
