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

public class Jdb implements Serializable{

	/**
	 * 街道id
	 */
  private Integer jdId;
	/**
	 * 街道名称
	 */
  private String jdName;
	/**
	 * 所属区县的ID
	 */
  private Integer jdQxid;

}
