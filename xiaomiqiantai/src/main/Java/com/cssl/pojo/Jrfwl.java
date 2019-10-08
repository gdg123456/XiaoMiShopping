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

public class Jrfwl implements Serializable{

	/**
	 * 今日访问量id
	 */
  private Integer jrfwlId;
	/**
	 * 今日访问量数量
	 */
  private Integer jrfwlSl;
	/**
	 * 访问量当天的时间
	 */
  private java.util.Date jrfwlSj;

}
