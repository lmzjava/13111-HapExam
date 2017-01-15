package hbi.core.test.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;
import hbi.core.test.dto.OrderHeaders;

import java.util.List;

/**
 * Created by win on 2017/1/11.
 */
public interface IQueryOrderService extends IBaseService<OrderHeaders>{
    List<OrderHeaders> findOrderList(IRequest request, @StdWho OrderHeaders orderHeaders);

}
