package com.advanced.academy.adventure.books.system.model.dto;

import java.util.List;package com.example;

public class BitrexResponse {



import java.util.List;

    public class Example {

        private Boolean success;
        private String message;
        private List<Result> result = null;


        public Boolean getSuccess() {
            return success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<Result> getResult() {
            return result;
        }

        public void setResult(List<Result> result) {
            this.result = result;
        }

    }


}


package com.example;


private class Result {



    private String marketName;
    private Float high;
    private Float low;
    private Float volume;
    private Float last;
    private Float baseVolume;
    private String timeStamp;
    private Float bid;
    private Float ask;
    private Integer openBuyOrders;
    private Integer openSellOrders;
    private Float prevDay;
    private String created;
    private String displayMarketName;

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public Float getHigh() {
        return high;
    }

    public void setHigh(Float high) {
        this.high = high;
    }

    public Float getLow() {
        return low;
    }

    public void setLow(Float low) {
        this.low = low;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Float getLast() {
        return last;
    }

    public void setLast(Float last) {
        this.last = last;
    }

    public Float getBaseVolume() {
        return baseVolume;
    }

    public void setBaseVolume(Float baseVolume) {
        this.baseVolume = baseVolume;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Float getBid() {
        return bid;
    }

    public void setBid(Float bid) {
        this.bid = bid;
    }

    public Float getAsk() {
        return ask;
    }

    public void setAsk(Float ask) {
        this.ask = ask;
    }

    public Integer getOpenBuyOrders() {
        return openBuyOrders;
    }

    public void setOpenBuyOrders(Integer openBuyOrders) {
        this.openBuyOrders = openBuyOrders;
    }

    public Integer getOpenSellOrders() {
        return openSellOrders;
    }

    public void setOpenSellOrders(Integer openSellOrders) {
        this.openSellOrders = openSellOrders;
    }

    public Float getPrevDay() {
        return prevDay;
    }

    public void setPrevDay(Float prevDay) {
        this.prevDay = prevDay;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getDisplayMarketName() {
        return displayMarketName;
    }

    public void setDisplayMarketName(String displayMarketName) {
        this.displayMarketName = displayMarketName;
    }

}