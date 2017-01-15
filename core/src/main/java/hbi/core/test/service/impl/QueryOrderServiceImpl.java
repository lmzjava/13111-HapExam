package hbi.core.test.service.impl;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.test.dto.OrderHeaders;
import hbi.core.test.mapper.QueryMapper;
import hbi.core.test.service.IQueryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by win on 2017/1/11.
 */
@Service("queryOrderService")
public class QueryOrderServiceImpl extends BaseServiceImpl<OrderHeaders> implements IQueryOrderService{

    @Autowired
    private QueryMapper queryMapper;
    @Override
    public List<OrderHeaders> findOrderList(IRequest request, @StdWho OrderHeaders orderHeaders) {
        List<OrderHeaders> list = queryMapper.findOrderList(orderHeaders);
        return list;
    }
}
