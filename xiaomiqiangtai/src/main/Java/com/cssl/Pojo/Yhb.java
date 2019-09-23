package com.cssl.Pojo;
/**
 * 用户信息类
 * author:gdg
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Yhb implements Serializable {
    private Integer Yh_id;//用户信息ID(自增)
    private String Yh_mc;//用户名称
    private Integer Yh_xbid;//性别ID(外键)
    private String Yh_admin;//登录账户
    private String Yh_pwd;//登录密码
    private String Yh_sjhm;//用户手机号码
    private Integer Yh_lxid;//用户类型ID(外键)
}
