package com.example.waiter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

public class TransactionStorePackage {
    private String transactionStoreId;
    private Long opportunityId;
    private String businessOrderId;
    private String scenarioId;
    private Boolean isLocked;
    private String status;
    private Long clientUserId;
    private String emailAddress;
    private String customerNumber;
    private String orderedDate;
    private String expiredDate;
    private String errorMessage;
    private List<StatusHistory> statusHistory;
    private String orderPackageJson;

    public TransactionStorePackage() {
    }

    public String getTransactionStoreId() {
        return this.transactionStoreId;
    }

    public void setTransactionStoreId(String transactionStoreId) {
        this.transactionStoreId = transactionStoreId;
    }

    public String getBusinessOrderId() {
        return this.businessOrderId;
    }

    public void setBusinessOrderId(String businessOrderId) {
        this.businessOrderId = businessOrderId;
    }

    public String getScenarioId() {
        return this.scenarioId;
    }

    public void setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
    }

    public Boolean getIsLocked() {
        return this.isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getOpportunityId() {
        return this.opportunityId;
    }

    public void setOpportunityId(Long opportunityId) {
        this.opportunityId = opportunityId;
    }

    public Long getClientUserId() {
        return this.clientUserId;
    }

    public void setClientUserId(Long clientUserId) {
        this.clientUserId = clientUserId;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getOrderedDate() {
        return this.orderedDate;
    }

    public void setOrderedDate(String orderedDate) {
        this.orderedDate = orderedDate;
    }

    public String getExpiredDate() {
        return this.expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<TransactionStorePackage.StatusHistory> getStatusHistory() {
        return this.statusHistory;
    }

    public void setStatusHistory(List<TransactionStorePackage.StatusHistory> statusHistory) {
        this.statusHistory = statusHistory;
    }

    public String getOrderPackageJson() {
        return this.orderPackageJson;
    }

    public void setOrderPackageJson(String orderPackageJson) {
        this.orderPackageJson = orderPackageJson;
    }

    @JsonIgnoreProperties(
            ignoreUnknown = true
    )
    public static class StatusHistory {
        private String transactionStoreId;
        private String status;
        private String lockStatus;
        private String createDate;

        public StatusHistory() {
        }

        public String getTransactionStoreId() {
            return this.transactionStoreId;
        }

        public void setTransactionStoreId(String transactionStoreId) {
            this.transactionStoreId = transactionStoreId;
        }

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getLockStatus() {
            return this.lockStatus;
        }

        public void setLockStatus(String lockStatus) {
            this.lockStatus = lockStatus;
        }

        public String getCreateDate() {
            return this.createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }
    }
}
