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

public class Lbt implements Serializable{

	/**
	 * 轮播图id
	 */
  private Integer lbtId;
	/**
	 * 图片路径
	 */
  private String lbtUrl;
	/**
	 * 图片对应的商品id
	 */
  private Integer lbtSpid;

}
