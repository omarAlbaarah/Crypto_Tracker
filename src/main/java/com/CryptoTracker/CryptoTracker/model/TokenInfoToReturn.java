package com.CryptoTracker.CryptoTracker.model;

public class TokenInfoToReturn {
    private String id;
    private String name;
    private String symbol;
    private int rank;
    public double price;
    public long market_cap;

    public TokenInfoToReturn() {
    }

    public TokenInfoToReturn(String id, String name, String symbol, int rank, double price, long market_cap) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.rank = rank;
        this.price = price;
        this.market_cap = market_cap;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(long market_cap) {
        this.market_cap = market_cap;
    }
}
