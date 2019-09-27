package com.cssl.service.ServiceImpl;
/**
 * 类型查询业务实现类
 */
import com.cssl.dao.TypeSelect;
import com.cssl.pojo.Spxxb;
import com.cssl.service.TypeSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeSelectServiceImpl implements TypeSelectService {
    @Autowired(required = false)
    private TypeSelect tdao;
    //根据类型查询
    @Override
    public List<Spxxb> Bytype(String type) {
        return tdao.TypeSelect(type);
    }
    //热销
    @Override
    public List<Spxxb> Sellwell() { return tdao.Sellwell();}
}
