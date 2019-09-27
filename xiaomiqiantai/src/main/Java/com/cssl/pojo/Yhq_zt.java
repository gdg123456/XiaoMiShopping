package com.cssl.pojo;
/**
 * 优惠劵状态类
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
public class Yhq_zt implements Serializable {
    private Integer yhq_ztid;//优惠劵ID(自增)
    private String yhq_ztmc;//优惠劵名称
}
