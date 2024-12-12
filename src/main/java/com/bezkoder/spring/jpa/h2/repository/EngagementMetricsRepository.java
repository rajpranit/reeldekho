package com.bezkoder.spring.jpa.h2.repository;

import com.bezkoder.spring.jpa.h2.entity.EngagementMetrics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngagementMetricsRepository extends JpaRepository<EngagementMetrics, Long> {
}
