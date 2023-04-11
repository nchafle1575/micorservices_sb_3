package com.micorservices.currencyexchangeservice.controller;



import org.springframework.data.jpa.repository.JpaRepository;

import com.micorservices.currencyexchangeservice.entity.CurrencyExchange;

public interface CurrencyExchangeRepository 
	extends JpaRepository<CurrencyExchange, Long> {
	CurrencyExchange findByFromAndTo(String from, String to);
}