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

public class Spxxb implements Serializable{

	/**
	 * id
	 */
  private Integer spxxId;
	/**
	 * 商品类别对应的id
	 */
  private Integer spxxLbid;
	/**
	 * 商品名称
	 */
  private String spxxMc;
	/**
	 * 商品发布的时间
	 */
  private java.util.Date spxxFbsj;
	/**
	 * 商品库存
	 */
  private Integer spxxKc;
	/**
	 * 商品说明
	 */
  private String spxxSm;
	/**
	 * 商品状态对应的id
	 */
  private Integer spxxZtid;
	/**
	 * 商品广告口号
	 */
  private String spxxSpgg;

}
