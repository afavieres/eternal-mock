package com.example.waiter;

public class TnQuoteReservationRequest extends TnAvailabilityRequest {
    private String transactionStoreId;

    public String getTransactionStoreId() {
        return transactionStoreId;
    }

    public void setTransactionStoreId(String transactionStoreId) {
        this.transactionStoreId = transactionStoreId;
    }
}