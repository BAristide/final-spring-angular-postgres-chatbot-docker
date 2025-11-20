package com.sciencespo.backend.repository;

import com.sciencespo.backend.entities.CryptoCurrency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CryptoCurrencyRepository extends JpaRepository<CryptoCurrency, String> {
}
