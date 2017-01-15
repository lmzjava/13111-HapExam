package hbi.core.test.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.*;

/**
 * Created by win on 2017/1/11.
 */
@Table(name="HAP_AR_CUSTOMERS")
public class Customers extends BaseDTO {
    @Id
    @GeneratedValue
    private int customerId;
    @Column
    private String customerNumber;
    @Column
    private String customerName;
    @Column
    private int companyId;
    @Column
    private String enabledFalg;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getEnabledFalg() {
        return enabledFalg;
    }

    public void setEnabledFalg(String enabledFalg) {
        this.enabledFalg = enabledFalg;
    }
}
