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

public class Qxb implements Serializable{

	/**
	 * 区县id
	 */
  private Integer qxId;
	/**
	 * 区县名称
	 */
  private String qxName;

}