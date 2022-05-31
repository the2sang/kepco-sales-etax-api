package com.kepco.etax.api.domain.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@IdClass(IfTaxBillItemListKey.class)
public class IfTaxBillItemListEntity {

    @Id
    @Column(name = "REL_SYSTEM_ID")
    private String relSystemId;

    @Id
    @Column(name = "JOB_GUB_CODE")
    private String jobGubCode;

    @Id
    @Column(name = "MANAGE_ID")
    private String manageId;

    @Id
    @Column(name = "SEQ_NO")
    private long seqNo;

    @Column(name = "PURCHASE_DAY")
    private String purchaseDay;

    @Column(name = "ITEM_NAME")
    private String itemName;

    @Column(name = "ITEM_INFO")
    private String itemInfo;

    @Column(name = "ITEM_DESC")
    private String itemDesc;

    @Column(name = "UNIT_QUANTITY")
    private double unitQuantity;

    @Column(name = "UNIT_AMOUNT")
    private double unitAmount;

    @Column(name = "INVOICE_AMOUNT")
    private long invoiceAmount;

    @Column(name = "TAX_AMOUNT")
    private long taxAmount;

    @Column(name = "BILL_ISSUE_YYYYMM")
    private String billIssueYyyymm;
}
