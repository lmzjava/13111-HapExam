package hbi.core.test.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.test.dto.*;
import hbi.core.test.service.IQueryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by win on 2017/1/11.
 */
@Controller
@RequestMapping("/queryOrder")
public class QueryOrderController extends BaseController {
    @Autowired
    @Qualifier("queryOrderService")
    IQueryOrderService iQueryOrderService;

    @RequestMapping(value = "/select",method = RequestMethod.GET )
    public ResponseData select(HttpServletRequest request,
                               @RequestParam(name="companyName",required = false, defaultValue = "") String companyName,
                               @RequestParam(name="customerName",required = false, defaultValue = "") String customerName,
                               @RequestParam(name="orderNumber",required = false, defaultValue = "") String orderNumber,
                               @RequestParam(name="orderStatus",required = false, defaultValue = "") String orderStatus,
                               @RequestParam(name="itemDiscription",required = false, defaultValue = "") String itemDiscription,
                               @RequestParam(name ="page", required = false, defaultValue = "1") int page,
                               @RequestParam(name ="pageSize", required = false, defaultValue = "10") int pageSize
                               ){
        ResponseData responseData = new ResponseData();
        IRequest requestContext = this.createRequestContext(request);
        OrderHeaders orderHeaders = new OrderHeaders();
        orderHeaders.setCustomerName(customerName);
        orderHeaders.setOrderStatus(orderStatus);

        orderHeaders.setItemDiscripition(itemDiscription);
        orderHeaders.setOrderNumber(orderNumber);
        responseData.setRows(iQueryOrderService.findOrderList(requestContext,orderHeaders));
        return responseData;
    }




}
