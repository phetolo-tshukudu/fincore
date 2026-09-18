package com.fincore.fincore.budget; import java.math.BigDecimal; import jakarta.validation.constraints.*; public record UpdateBudgetRequest(@NotNull @DecimalMin("0.01") BigDecimal amount){}
