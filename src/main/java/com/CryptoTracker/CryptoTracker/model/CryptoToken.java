package com.CryptoTracker.CryptoTracker.model;

import java.util.Date;

public class CryptoToken {
    private String id;
    private String name;
    private String symbol;
    private int rank;
    private long circulating_supply;
    private long total_supply;
    private long max_supply;
    private double beta_value;
    private Date first_data_at;
    private Date last_updated;
    private Quotes quotes;

    public CryptoToken(){

    }
    public CryptoToken(String id, String name, String symbol, int rank, long circulating_supply, long total_supply, long max_supply, double beta_value, Date first_data_at, Date last_updated, Quotes quotes) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.rank = rank;
        this.circulating_supply = circulating_supply;
        this.total_supply = total_supply;
        this.max_supply = max_supply;
        this.beta_value = beta_value;
        this.first_data_at = first_data_at;
        this.last_updated = last_updated;
        this.quotes = quotes;
    }

    public Quotes getQuotes() {
        return quotes;
    }

    public void setQuotes(Quotes quotes) {
        this.quotes = quotes;
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

    public long getCirculating_supply() {
        return circulating_supply;
    }

    public void setCirculating_supply(long circulating_supply) {
        this.circulating_supply = circulating_supply;
    }

    public long getTotal_supply() {
        return total_supply;
    }

    public void setTotal_supply(long total_supply) {
        this.total_supply = total_supply;
    }

    public long getMax_supply() {
        return max_supply;
    }

    public void setMax_supply(long max_supply) {
        this.max_supply = max_supply;
    }

    public double getBeta_value() {
        return beta_value;
    }

    public void setBeta_value(double beta_value) {
        this.beta_value = beta_value;
    }

    public Date getFirst_data_at() {
        return first_data_at;
    }

    public void setFirst_data_at(Date first_data_at) {
        this.first_data_at = first_data_at;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }
}
