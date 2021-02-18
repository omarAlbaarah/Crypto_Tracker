package com.CryptoTracker.CryptoTracker.controller;

import com.CryptoTracker.CryptoTracker.model.CryptoToken;
import com.CryptoTracker.CryptoTracker.model.TokenInfoToReturn;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api")
public class pricingController {

    private final RestTemplate restTemplate;
    @Autowired
    public pricingController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @CrossOrigin
    @RequestMapping("/tokens")
    public List<TokenInfoToReturn>  getTokendetails(){

        HashSet<String> tokensFilter = new HashSet<>(Arrays.asList("Bitcoin", "Ethereum", "Chainlink", "Cardano",
                "Monero","yearn.finance","Aave","Compound","Uniswap","Golem"));

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-rapidapi-key","Your API Key");
        ArrayList<CryptoToken> tokens;
        HttpEntity<String> entity = new HttpEntity<>("body", headers);

        ResponseEntity<ArrayList<CryptoToken>> rateResponse =
                restTemplate.exchange("https://coinpaprika1.p.rapidapi.com/tickers",
                        HttpMethod.GET, entity, new ParameterizedTypeReference<ArrayList<CryptoToken>>() {
                        });
        tokens= rateResponse.getBody();

        List<TokenInfoToReturn> tokensToBeReturned  = tokens.stream()
                .filter(t -> tokensFilter.contains(t.getName()))
                .map(t -> new TokenInfoToReturn(t.getId(), t.getName(), t.getSymbol(), t.getRank(),
                        t.getQuotes().getUsd().getPrice(), t.getQuotes().getUsd().getMarket_cap()))
                .collect(Collectors.toList());
        return tokensToBeReturned;
    }
}
