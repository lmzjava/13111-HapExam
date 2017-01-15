package hbi.core.test.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by win on 2017/1/11.
 */
@Table(name="HAP_OM_ORDER_LINES")
public class OrderLines extends BaseDTO {
    @Id
    @GeneratedValue
    private int lineId;
    @Column
    private int headerId;
    @Column
    private int lineNumber;
    @Column
    private int inventoryItemId;
    @Column
    private int orderQuantity;
    @Column
    private String orderQuantityUom;
    @Column
    private int unitSellingPrice;
    @Column
    private int companyId;

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public int getHeaderId() {
        return headerId;
    }

    public void setHeaderId(int headerId) {
        this.headerId = headerId;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(int inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public void setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
    }

    public int getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public void setUnitSellingPrice(int unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

}
