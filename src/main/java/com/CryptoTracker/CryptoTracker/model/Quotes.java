package com.CryptoTracker.CryptoTracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quotes {
    @JsonProperty("USD")
    private USD usd;

    public Quotes() {
    }

    public Quotes(USD usd) {
        this.usd = usd;
    }

    public USD getUsd() {
        return usd;
    }

    public void setUsd(USD usd) {
        this.usd = usd;
    }
}
