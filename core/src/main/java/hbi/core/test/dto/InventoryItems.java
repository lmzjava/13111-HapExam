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
@Table(name="HAP_INV_INVENTORY_ITEMS")
public class InventoryItems extends BaseDTO {
    @Id
    @GeneratedValue
    private int inventoryItemId;
    @Column
    private String itemCode;
    @Column
    private String itemUom;
    @Column
    private String itemDiscripition;
    @Column
    private String orderFlag;
    @Column
    private String enableFlg;

    public int getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(int inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemUom() {
        return itemUom;
    }

    public void setItemUom(String itemUom) {
        this.itemUom = itemUom;
    }

    public String getItemDiscripition() {
        return itemDiscripition;
    }

    public void setItemDiscripition(String itemDiscripition) {
        this.itemDiscripition = itemDiscripition;
    }

    public String getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(String orderFlag) {
        this.orderFlag = orderFlag;
    }

    public String getEnableFlg() {
        return enableFlg;
    }

    public void setEnableFlg(String enableFlg) {
        this.enableFlg = enableFlg;
    }
}
