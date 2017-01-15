package hbi.core.test.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by win on 2017/1/11.
 */
@Table(name="HAP_OM_ORDER_HEADERS")
public class OrderHeaders  {
    @Id
    @GeneratedValue
    private int headerId;
    @Column
    private String orderNumber;
    @Column
    private int companyId;
    @Column
    private Date orderDate;
    @Column
    private String orderStatus;
    @Column
    private int customerId;

    @Transient
    private String companyName;
    @Transient
    private String customerName;
    @Transient
    private String itemDiscripition;

    public int getHeaderId() {
        return headerId;
    }

    public void setHeaderId(int headerId) {
        this.headerId = headerId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getItemDiscripition() {
        return itemDiscripition;
    }

    public void setItemDiscripition(String itemDiscripition) {
        this.itemDiscripition = itemDiscripition;
    }
}
