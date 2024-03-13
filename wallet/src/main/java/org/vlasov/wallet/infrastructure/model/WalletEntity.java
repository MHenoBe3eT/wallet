package org.vlasov.wallet.infrastructure.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name = "wallet")
@Data
public class WalletEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID walletId;

    @Column(name = "balance", nullable = false)
    @NotNull
    @Min(0)
    private double balance;
}

