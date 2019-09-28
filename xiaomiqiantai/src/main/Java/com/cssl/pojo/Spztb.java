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

public class Spztb implements Serializable{

	/**
	 * 商品状态id
	 */
  private Integer spztId;
	/**
	 * 商品状态名称
	 */
  private String spztMc;

}
