package com.model;

public class BillingFile {
    private Integer id;

    private String billingFileVendor;

    private String billingFileGeo;

    private String billingFile;

    private String billingFileState;

    private String billingNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillingFileVendor() {
        return billingFileVendor;
    }

    public void setBillingFileVendor(String billingFileVendor) {
        this.billingFileVendor = billingFileVendor == null ? null : billingFileVendor.trim();
    }

    public String getBillingFileGeo() {
        return billingFileGeo;
    }

    public void setBillingFileGeo(String billingFileGeo) {
        this.billingFileGeo = billingFileGeo == null ? null : billingFileGeo.trim();
    }

    public String getBillingFile() {
        return billingFile;
    }

    public void setBillingFile(String billingFile) {
        this.billingFile = billingFile == null ? null : billingFile.trim();
    }

    public String getBillingFileState() {
        return billingFileState;
    }

    public void setBillingFileState(String billingFileState) {
        this.billingFileState = billingFileState == null ? null : billingFileState.trim();
    }

    public String getBillingNumber() {
        return billingNumber;
    }

    public void setBillingNumber(String billingNumber) {
        this.billingNumber = billingNumber == null ? null : billingNumber.trim();
    }
}