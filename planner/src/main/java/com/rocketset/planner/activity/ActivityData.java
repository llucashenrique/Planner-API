package com.rocketset.planner.activity;

import java.time.LocalDateTime;
import java.util.UUID;

public record ActivityData(UUID id, String tittle, LocalDateTime occurs_at) {
}
