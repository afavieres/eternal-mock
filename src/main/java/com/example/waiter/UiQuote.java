package com.example.waiter;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UiQuote {
    private String opportunityId;
    private String transactionStoreId;
    private List<UiLocation> locations;
    private Integer packagesCount;
    private String volume;
    private UiQuoteCheckoutAttributes checkout;
    private String emailAddress;
    private Boolean createdByAgent;
    private Boolean isTrial;

    public List<UiLocation> getLocations() {
        return locations;
    }
    public void setLocations(List<UiLocation> locations) {
        this.locations = locations;
    }
    public Integer getPackagesCount() {
        return packagesCount;
    }
    public void setPackagesCount(Integer packagesCount) {
        this.packagesCount = packagesCount;
    }
    public String getVolume() {
        return volume;
    }
    public void setVolume(String volume) {
        this.volume = volume;
    }
    public UiQuoteCheckoutAttributes getCheckout() {
        return checkout;
    }
    public void setCheckout(UiQuoteCheckoutAttributes checkout) {
        this.checkout = checkout;
    }
    public Boolean getCreatedByAgent() {
        return createdByAgent;
    }
    public void setCreatedByAgent(Boolean createdByAgent) {
        this.createdByAgent = createdByAgent;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getTransactionStoreId() {
        return transactionStoreId;
    }
    public void setTransactionStoreId(String transactionStoreId) {
        this.transactionStoreId = transactionStoreId;
    }
    public String getOpportunityId() {
        return opportunityId;
    }
    public void setOpportunityId(String opportunityId) {
        this.opportunityId = opportunityId;
    }
    public Boolean getIsTrial() {
        return isTrial;
    }
    public void setIsTrial(Boolean isTrial) {
        this.isTrial = isTrial;
    }

}
