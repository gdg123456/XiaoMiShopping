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

public class Splbb implements Serializable{

	/**
	 * 商品类别id
	 */
  private Integer splbId;
	/**
	 * 商品类别名称
	 */
  private String splbMc;

}
