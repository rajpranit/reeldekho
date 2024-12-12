package com.bezkoder.spring.jpa.h2.repository;

import com.bezkoder.spring.jpa.h2.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MerchantRepo extends JpaRepository<Merchant, UUID> {
}