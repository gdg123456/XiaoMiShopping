package com.cssl.pojo;
/**
 * 优惠劵类
 * author:gdg
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Yhqb implements Serializable {
    private Integer Yhq_id;//优惠劵详细信息ID(自增)
    private String Yhq_mc;//优惠劵名称
    private double Yhq_yhjg;//优惠劵面值大小
    private Date Yhq_kssj;//优惠劵领取时间
    private Date Yhq_jssj;//优惠劵失效时间
    private Integer Yhq_zt;//优惠劵状态(外键)
    private Integer Yhq_mztj;//优惠券满足条件
}
