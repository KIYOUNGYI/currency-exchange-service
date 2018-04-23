package com.in28minutes.microservice.currencyexchangeservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.microservice.currencyexchangeservice.model.ExchangeValue;

public interface ExchangeValueRepository extends 
		JpaRepository<ExchangeValue, Long>{
	ExchangeValue findByFromAndTo(String from, String to);
}
