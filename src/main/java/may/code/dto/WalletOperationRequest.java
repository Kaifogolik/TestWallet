package may.code.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

public class WalletOperationRequest {

    @NotNull
    private UUID walletId;

    @NotNull
    private String operationType;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal amount;

    public @NotNull UUID getWalletId() {
        return walletId;
    }

    public void setWalletId(@NotNull UUID walletId) {
        this.walletId = walletId;
    }

    public @NotNull String getOperationType() {
        return operationType;
    }

    public void setOperationType(@NotNull String operationType) {
        this.operationType = operationType;
    }

    public @NotNull @DecimalMin(value = "0.0", inclusive = false) BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(@NotNull @DecimalMin(value = "0.0", inclusive = false) BigDecimal amount) {
        this.amount = amount;
    }
}