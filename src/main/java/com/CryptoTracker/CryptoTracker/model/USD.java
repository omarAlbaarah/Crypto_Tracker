package com.CryptoTracker.CryptoTracker.model;

import java.util.Date;

public class USD {
    public double price;
    public double volume_24h;
    public double volume_24h_change_24h;
    public long market_cap;
    public double market_cap_change_24h;
    public double percent_change_15m;
    public double percent_change_30m;
    public double percent_change_1h;
    public double percent_change_6h;
    public double percent_change_12h;
    public double percent_change_24h;
    public double percent_change_7d;
    public double percent_change_30d;
    public double percent_change_1y;
    public double ath_price;
    public Date ath_date;
    public double percent_from_price_ath;

    public USD(double price, double volume_24h, double volume_24h_change_24h, long market_cap, double market_cap_change_24h, double percent_change_15m, double percent_change_30m, double percent_change_1h, double percent_change_6h, double percent_change_12h, double percent_change_24h, double percent_change_7d, double percent_change_30d, double percent_change_1y, double ath_price, Date ath_date, double percent_from_price_ath) {
        this.price = price;
        this.volume_24h = volume_24h;
        this.volume_24h_change_24h = volume_24h_change_24h;
        this.market_cap = market_cap;
        this.market_cap_change_24h = market_cap_change_24h;
        this.percent_change_15m = percent_change_15m;
        this.percent_change_30m = percent_change_30m;
        this.percent_change_1h = percent_change_1h;
        this.percent_change_6h = percent_change_6h;
        this.percent_change_12h = percent_change_12h;
        this.percent_change_24h = percent_change_24h;
        this.percent_change_7d = percent_change_7d;
        this.percent_change_30d = percent_change_30d;
        this.percent_change_1y = percent_change_1y;
        this.ath_price = ath_price;
        this.ath_date = ath_date;
        this.percent_from_price_ath = percent_from_price_ath;
    }

    public USD() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume_24h() {
        return volume_24h;
    }

    public void setVolume_24h(double volume_24h) {
        this.volume_24h = volume_24h;
    }

    public double getVolume_24h_change_24h() {
        return volume_24h_change_24h;
    }

    public void setVolume_24h_change_24h(double volume_24h_change_24h) {
        this.volume_24h_change_24h = volume_24h_change_24h;
    }

    public long getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(long market_cap) {
        this.market_cap = market_cap;
    }

    public double getMarket_cap_change_24h() {
        return market_cap_change_24h;
    }

    public void setMarket_cap_change_24h(double market_cap_change_24h) {
        this.market_cap_change_24h = market_cap_change_24h;
    }

    public double getPercent_change_15m() {
        return percent_change_15m;
    }

    public void setPercent_change_15m(double percent_change_15m) {
        this.percent_change_15m = percent_change_15m;
    }

    public double getPercent_change_30m() {
        return percent_change_30m;
    }

    public void setPercent_change_30m(double percent_change_30m) {
        this.percent_change_30m = percent_change_30m;
    }

    public double getPercent_change_1h() {
        return percent_change_1h;
    }

    public void setPercent_change_1h(double percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }

    public double getPercent_change_6h() {
        return percent_change_6h;
    }

    public void setPercent_change_6h(double percent_change_6h) {
        this.percent_change_6h = percent_change_6h;
    }

    public double getPercent_change_12h() {
        return percent_change_12h;
    }

    public void setPercent_change_12h(double percent_change_12h) {
        this.percent_change_12h = percent_change_12h;
    }

    public double getPercent_change_24h() {
        return percent_change_24h;
    }

    public void setPercent_change_24h(double percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public double getPercent_change_7d() {
        return percent_change_7d;
    }

    public void setPercent_change_7d(double percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }

    public double getPercent_change_30d() {
        return percent_change_30d;
    }

    public void setPercent_change_30d(double percent_change_30d) {
        this.percent_change_30d = percent_change_30d;
    }

    public double getPercent_change_1y() {
        return percent_change_1y;
    }

    public void setPercent_change_1y(double percent_change_1y) {
        this.percent_change_1y = percent_change_1y;
    }

    public double getAth_price() {
        return ath_price;
    }

    public void setAth_price(double ath_price) {
        this.ath_price = ath_price;
    }

    public Date getAth_date() {
        return ath_date;
    }

    public void setAth_date(Date ath_date) {
        this.ath_date = ath_date;
    }

    public double getPercent_from_price_ath() {
        return percent_from_price_ath;
    }

    public void setPercent_from_price_ath(double percent_from_price_ath) {
        this.percent_from_price_ath = percent_from_price_ath;
    }
}
