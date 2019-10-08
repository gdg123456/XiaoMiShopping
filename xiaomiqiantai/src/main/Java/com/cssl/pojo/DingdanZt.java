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

public class DingdanZt implements Serializable{

	/**
	 * 订单状态id
	 */
  private Integer ddztId;
	/**
	 * 订单状态说明
	 */
  private String ddztSm;

}
