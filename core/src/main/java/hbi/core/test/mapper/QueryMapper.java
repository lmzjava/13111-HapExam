package hbi.core.test.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.test.dto.OrderHeaders;

import java.util.List;

/**
 * Created by win on 2017/1/11.
 */
public interface QueryMapper extends Mapper<OrderHeaders> {
    List<OrderHeaders> findOrderList(OrderHeaders orderHeaders);
}
