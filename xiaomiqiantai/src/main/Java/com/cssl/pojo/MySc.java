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

public class MySc implements Serializable{

	/**
	 * id
	 */
  private Integer myscId;
	/**
	 * 对应收藏该商品的用户id
	 */
  private Integer myscYhid;
	/**
	 * 被收藏的商品id
	 */
  private Integer myscSpid;

}
