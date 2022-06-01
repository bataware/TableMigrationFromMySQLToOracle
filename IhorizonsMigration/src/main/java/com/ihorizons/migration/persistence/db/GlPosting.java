package com.ihorizons.migration.persistence.db;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "nmtc_gl_intg_stg")
public class GlPosting {

    private String sourceSys;
    private String glBatchName;
    private String status;
    private Integer setOfBooksId;
    private String userJeCategoryName;
    private String userJeSourceName;
    private String transactionType;
    private String sourceSysUniqueRefId;
    private Integer payCustomerNum;
    private String payCustomerName;
    private Timestamp trxCreationDate;
    private String trxCreatedBy;
    private String glSegment;
    private String currency;
    private BigDecimal amount;
    private BigDecimal listPrice;
    private BigDecimal discountAmount;
    private BigDecimal netAmount;
    private String prodCategory;
    private String productId;
    private String productName;
    private String soNo;
    private String ledgerName;
    private String busniessUnit;
    private String invOrg;
    private String lineItemCode;
    private BigDecimal lineItemQty;
    private String errorLog;
    private Integer trxLnNum;
    private String periodName;
    private Timestamp lastUpdateDate;
    private String lastUpdatedBy;
    private String createdBy;
    private Timestamp creationDate;
    private String glProcess;
    private Integer merchantId;
    private String authorizationCode;
    private String rrn;
    private String paymentReqNum;
    private String typeCd;
    private String serviceType;
    private Integer id;
    private Integer amountDr;
    private Integer amountCr;


    @Basic
    @Column(name = "SOURCE_SYS", nullable = true, length = 255)
    public String getSourceSys() {
        return sourceSys;
    }

    public void setSourceSys(String sourceSys) {
        this.sourceSys = sourceSys;
    }

    @Basic
    @Column(name = "GL_BATCH_NAME", nullable = true, length = 255)
    public String getGlBatchName() {
        return glBatchName;
    }

    public void setGlBatchName(String glBatchName) {
        this.glBatchName = glBatchName;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "SET_OF_BOOKS_ID", nullable = true)
    public Integer getSetOfBooksId() {
        return setOfBooksId;
    }

    public void setSetOfBooksId(Integer setOfBooksId) {
        this.setOfBooksId = setOfBooksId;
    }

    @Basic
    @Column(name = "USER_JE_CATEGORY_NAME", nullable = true, length = 255)
    public String getUserJeCategoryName() {
        return userJeCategoryName;
    }

    public void setUserJeCategoryName(String userJeCategoryName) {
        this.userJeCategoryName = userJeCategoryName;
    }

    @Basic
    @Column(name = "USER_JE_SOURCE_NAME", nullable = true, length = 255)
    public String getUserJeSourceName() {
        return userJeSourceName;
    }

    public void setUserJeSourceName(String userJeSourceName) {
        this.userJeSourceName = userJeSourceName;
    }

    @Basic
    @Column(name = "TRANSACTION_TYPE", nullable = true, length = 255)
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Basic
    @Column(name = "SOURCE_SYS_UNIQUE_REF_ID", nullable = true, length = 255)
    public String getSourceSysUniqueRefId() {
        return sourceSysUniqueRefId;
    }

    public void setSourceSysUniqueRefId(String sourceSysUniqueRefId) {
        this.sourceSysUniqueRefId = sourceSysUniqueRefId;
    }

    @Basic
    @Column(name = "PAY_CUSTOMER_NUM", nullable = true)
    public Integer getPayCustomerNum() {
        return payCustomerNum;
    }

    public void setPayCustomerNum(Integer payCustomerNum) {
        this.payCustomerNum = payCustomerNum;
    }

    @Basic
    @Column(name = "PAY_CUSTOMER_NAME", nullable = true, length = 255)
    public String getPayCustomerName() {
        return payCustomerName;
    }

    public void setPayCustomerName(String payCustomerName) {
        this.payCustomerName = payCustomerName;
    }

    @Basic
    @Column(name = "TRX_CREATION_DATE", nullable = true)
    public Timestamp getTrxCreationDate() {
        return trxCreationDate;
    }

    public void setTrxCreationDate(Timestamp trxCreationDate) {
        this.trxCreationDate = trxCreationDate;
    }

    @Basic
    @Column(name = "TRX_CREATED_BY", nullable = true, length = 255)
    public String getTrxCreatedBy() {
        return trxCreatedBy;
    }

    public void setTrxCreatedBy(String trxCreatedBy) {
        this.trxCreatedBy = trxCreatedBy;
    }
    @Basic
    @Column(name = "SERVICE_TYPE", nullable = true, length = 255)
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Basic
    @Column(name = "GL_SEGMENT", nullable = true, length = 255)
    public String getGlSegment() {
        return glSegment;
    }

    public void setGlSegment(String glSegment) {
        this.glSegment = glSegment;
    }

    @Basic
    @Column(name = "CURRENCY", nullable = true, length = 255)
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Basic
    @Column(name = "AMOUNT", nullable = true, precision = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "LIST_PRICE", nullable = true, precision = 2)
    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    @Basic
    @Column(name = "DISCOUNT_AMOUNT", nullable = true, precision = 2)
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Basic
    @Column(name = "NET_AMOUNT", nullable = true, precision = 2)
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    @Basic
    @Column(name = "PROD_CATEGORY", nullable = true, length = 255)
    public String getProdCategory() {
        return prodCategory;
    }

    public void setProdCategory(String prodCategory) {
        this.prodCategory = prodCategory;
    }

    @Basic
    @Column(name = "PRODUCT_ID", nullable = true, precision = 2)
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "PRODUCT_NAME", nullable = true, length = 255)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "SO_NO", nullable = true, length = 255)
    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    @Basic
    @Column(name = "LEDGER_NAME", nullable = true, length = 255)
    public String getLedgerName() {
        return ledgerName;
    }

    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

    @Basic
    @Column(name = "BUSNIESS_UNIT", nullable = true, length = 255)
    public String getBusniessUnit() {
        return busniessUnit;
    }

    public void setBusniessUnit(String busniessUnit) {
        this.busniessUnit = busniessUnit;
    }

    @Basic
    @Column(name = "INV_ORG", nullable = true, length = 255)
    public String getInvOrg() {
        return invOrg;
    }

    public void setInvOrg(String invOrg) {
        this.invOrg = invOrg;
    }

    @Basic
    @Column(name = "LINE_ITEM_CODE", nullable = true, length = 255)
    public String getLineItemCode() {
        return lineItemCode;
    }

    public void setLineItemCode(String lineItemCode) {
        this.lineItemCode = lineItemCode;
    }

    @Basic
    @Column(name = "LINE_ITEM_QTY", nullable = true, precision = 2)
    public BigDecimal getLineItemQty() {
        return lineItemQty;
    }

    public void setLineItemQty(BigDecimal lineItemQty) {
        this.lineItemQty = lineItemQty;
    }

    @Basic
    @Column(name = "ERROR_LOG", nullable = true, length = -1)
    public String getErrorLog() {
        return errorLog;
    }

    public void setErrorLog(String errorLog) {
        this.errorLog = errorLog;
    }

    @Basic
    @Column(name = "TRX_LN_NUM", nullable = true)
    public Integer getTrxLnNum() {
        return trxLnNum;
    }

    public void setTrxLnNum(Integer trxLnNum) {
        this.trxLnNum = trxLnNum;
    }

    @Basic
    @Column(name = "PERIOD_NAME", nullable = true, length = 255)
    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    @Basic
    @Column(name = "LAST_UPDATE_DATE", nullable = true)
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Basic
    @Column(name = "LAST_UPDATED_BY", nullable = true, length = 255)
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Basic
    @Column(name = "CREATED_BY", nullable = true, length = 255)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "CREATION_DATE", nullable = true)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "GL_PROCESS", nullable = true, length = 255)
    public String getGlProcess() {
        return glProcess;
    }

    public void setGlProcess(String glProcess) {
        this.glProcess = glProcess;
    }

    @Basic
    @Column(name = "MERCHANT_ID", nullable = true)
    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    @Basic
    @Column(name = "AUTHORIZATION_CODE", nullable = true, length = 255)
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    @Basic
    @Column(name = "RRN", nullable = true, length = 255)
    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    @Basic
    @Column(name = "PAYMENT_REQ_NUM", nullable = true, length = 255)
    public String getPaymentReqNum() {
        return paymentReqNum;
    }

    public void setPaymentReqNum(String paymentReqNum) {
        this.paymentReqNum = paymentReqNum;
    }

    @Basic
    @Column(name = "TYPE_CD", nullable = true, length = 255)
    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "AMOUNT_DR", nullable = false)
    public Integer getAmountDr() {
        return amountDr;
    }

    public void setAmountDr(Integer amountDr) {
        this.amountDr = amountDr;
    }
    @Column(name = "AMOUNT_CR", nullable = false)
    public Integer getAmountCr() {
        return amountCr;
    }

    public void setAmountCr(Integer amountCr) {
        this.amountCr = amountCr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GlPosting glPosting = (GlPosting) o;

        if (sourceSys != null ? !sourceSys.equals(glPosting.sourceSys) : glPosting.sourceSys != null) return false;
        if (glBatchName != null ? !glBatchName.equals(glPosting.glBatchName) : glPosting.glBatchName != null)
            return false;
        if (status != null ? !status.equals(glPosting.status) : glPosting.status != null) return false;
        if (setOfBooksId != null ? !setOfBooksId.equals(glPosting.setOfBooksId) : glPosting.setOfBooksId != null)
            return false;
        if (userJeCategoryName != null ? !userJeCategoryName.equals(glPosting.userJeCategoryName) : glPosting.userJeCategoryName != null)
            return false;
        if (userJeSourceName != null ? !userJeSourceName.equals(glPosting.userJeSourceName) : glPosting.userJeSourceName != null)
            return false;
        if (transactionType != null ? !transactionType.equals(glPosting.transactionType) : glPosting.transactionType != null)
            return false;
        if (sourceSysUniqueRefId != null ? !sourceSysUniqueRefId.equals(glPosting.sourceSysUniqueRefId) : glPosting.sourceSysUniqueRefId != null)
            return false;
        if (payCustomerNum != null ? !payCustomerNum.equals(glPosting.payCustomerNum) : glPosting.payCustomerNum != null)
            return false;
        if (payCustomerName != null ? !payCustomerName.equals(glPosting.payCustomerName) : glPosting.payCustomerName != null)
            return false;
        if (trxCreationDate != null ? !trxCreationDate.equals(glPosting.trxCreationDate) : glPosting.trxCreationDate != null)
            return false;
        if (trxCreatedBy != null ? !trxCreatedBy.equals(glPosting.trxCreatedBy) : glPosting.trxCreatedBy != null)
            return false;
        if (glSegment != null ? !glSegment.equals(glPosting.glSegment) : glPosting.glSegment != null) return false;
        if (currency != null ? !currency.equals(glPosting.currency) : glPosting.currency != null) return false;
        if (amount != null ? !amount.equals(glPosting.amount) : glPosting.amount != null) return false;
        if (listPrice != null ? !listPrice.equals(glPosting.listPrice) : glPosting.listPrice != null) return false;
        if (discountAmount != null ? !discountAmount.equals(glPosting.discountAmount) : glPosting.discountAmount != null)
            return false;
        if (netAmount != null ? !netAmount.equals(glPosting.netAmount) : glPosting.netAmount != null) return false;
        if (prodCategory != null ? !prodCategory.equals(glPosting.prodCategory) : glPosting.prodCategory != null)
            return false;
        if (productId != null ? !productId.equals(glPosting.productId) : glPosting.productId != null) return false;
        if (productName != null ? !productName.equals(glPosting.productName) : glPosting.productName != null)
            return false;
        if (soNo != null ? !soNo.equals(glPosting.soNo) : glPosting.soNo != null) return false;
        if (ledgerName != null ? !ledgerName.equals(glPosting.ledgerName) : glPosting.ledgerName != null) return false;
        if (busniessUnit != null ? !busniessUnit.equals(glPosting.busniessUnit) : glPosting.busniessUnit != null)
            return false;
        if (invOrg != null ? !invOrg.equals(glPosting.invOrg) : glPosting.invOrg != null) return false;
        if (lineItemCode != null ? !lineItemCode.equals(glPosting.lineItemCode) : glPosting.lineItemCode != null)
            return false;
        if (lineItemQty != null ? !lineItemQty.equals(glPosting.lineItemQty) : glPosting.lineItemQty != null)
            return false;
        if (errorLog != null ? !errorLog.equals(glPosting.errorLog) : glPosting.errorLog != null) return false;
        if (trxLnNum != null ? !trxLnNum.equals(glPosting.trxLnNum) : glPosting.trxLnNum != null) return false;
        if (periodName != null ? !periodName.equals(glPosting.periodName) : glPosting.periodName != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(glPosting.lastUpdateDate) : glPosting.lastUpdateDate != null)
            return false;
        if (lastUpdatedBy != null ? !lastUpdatedBy.equals(glPosting.lastUpdatedBy) : glPosting.lastUpdatedBy != null)
            return false;
        if (createdBy != null ? !createdBy.equals(glPosting.createdBy) : glPosting.createdBy != null) return false;
        if (creationDate != null ? !creationDate.equals(glPosting.creationDate) : glPosting.creationDate != null)
            return false;
        if (glProcess != null ? !glProcess.equals(glPosting.glProcess) : glPosting.glProcess != null) return false;
        if (merchantId != null ? !merchantId.equals(glPosting.merchantId) : glPosting.merchantId != null) return false;
        if (authorizationCode != null ? !authorizationCode.equals(glPosting.authorizationCode) : glPosting.authorizationCode != null)
            return false;
        if (rrn != null ? !rrn.equals(glPosting.rrn) : glPosting.rrn != null) return false;
        if (paymentReqNum != null ? !paymentReqNum.equals(glPosting.paymentReqNum) : glPosting.paymentReqNum != null)
            return false;
        if (typeCd != null ? !typeCd.equals(glPosting.typeCd) : glPosting.typeCd != null) return false;
        if (id != null ? !id.equals(glPosting.id) : glPosting.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sourceSys != null ? sourceSys.hashCode() : 0;
        result = 31 * result + (glBatchName != null ? glBatchName.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (setOfBooksId != null ? setOfBooksId.hashCode() : 0);
        result = 31 * result + (userJeCategoryName != null ? userJeCategoryName.hashCode() : 0);
        result = 31 * result + (userJeSourceName != null ? userJeSourceName.hashCode() : 0);
        result = 31 * result + (transactionType != null ? transactionType.hashCode() : 0);
        result = 31 * result + (sourceSysUniqueRefId != null ? sourceSysUniqueRefId.hashCode() : 0);
        result = 31 * result + (payCustomerNum != null ? payCustomerNum.hashCode() : 0);
        result = 31 * result + (payCustomerName != null ? payCustomerName.hashCode() : 0);
        result = 31 * result + (trxCreationDate != null ? trxCreationDate.hashCode() : 0);
        result = 31 * result + (trxCreatedBy != null ? trxCreatedBy.hashCode() : 0);
        result = 31 * result + (glSegment != null ? glSegment.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (listPrice != null ? listPrice.hashCode() : 0);
        result = 31 * result + (discountAmount != null ? discountAmount.hashCode() : 0);
        result = 31 * result + (netAmount != null ? netAmount.hashCode() : 0);
        result = 31 * result + (prodCategory != null ? prodCategory.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (soNo != null ? soNo.hashCode() : 0);
        result = 31 * result + (ledgerName != null ? ledgerName.hashCode() : 0);
        result = 31 * result + (busniessUnit != null ? busniessUnit.hashCode() : 0);
        result = 31 * result + (invOrg != null ? invOrg.hashCode() : 0);
        result = 31 * result + (lineItemCode != null ? lineItemCode.hashCode() : 0);
        result = 31 * result + (lineItemQty != null ? lineItemQty.hashCode() : 0);
        result = 31 * result + (errorLog != null ? errorLog.hashCode() : 0);
        result = 31 * result + (trxLnNum != null ? trxLnNum.hashCode() : 0);
        result = 31 * result + (periodName != null ? periodName.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdatedBy != null ? lastUpdatedBy.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (glProcess != null ? glProcess.hashCode() : 0);
        result = 31 * result + (merchantId != null ? merchantId.hashCode() : 0);
        result = 31 * result + (authorizationCode != null ? authorizationCode.hashCode() : 0);
        result = 31 * result + (rrn != null ? rrn.hashCode() : 0);
        result = 31 * result + (paymentReqNum != null ? paymentReqNum.hashCode() : 0);
        result = 31 * result + (typeCd != null ? typeCd.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

}
