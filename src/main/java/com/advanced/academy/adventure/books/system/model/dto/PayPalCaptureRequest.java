package com.advanced.academy.adventure.books.system.model.dto;

import java.math.BigDecimal;

public class PayPalCaptureRequest {

    private Amount amount = new Amount();
    private String invoiceId;
    private Boolean finalCapture;

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Boolean getFinalCapture() {
        return finalCapture;
    }

    public void setFinalCapture(Boolean finalCapture) {
        this.finalCapture = finalCapture;
    }

    public void setAmountValue(BigDecimal value){

    }
    public void setAmountCurrency(String currency){

    }

    private class Amount {

        private BigDecimal value;
        private String currencyCode;

        public BigDecimal getValue() {
            return value;
        }

        public void setValue(BigDecimal value) {
            this.value = value;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

    }
}
