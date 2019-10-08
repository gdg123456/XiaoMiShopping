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

public class Yhb implements Serializable{

	/**
	 * id
	 */
  private Integer yhId;
	/**
	 * 用户名称
	 */
  private String yhMc;
	/**
	 * 用户对应的性别
	 */
  private String yhXb;
	/**
	 * 用户账号
	 */
  private String yhAdmin;
	/**
	 * 用户密码
	 */
  private String yhPwd;
	/**
	 * 用户手机号码
	 */
  private String yhSjhm;
	/**
	 * 用户类型id
	 */
  private Integer yhLxid;

}
