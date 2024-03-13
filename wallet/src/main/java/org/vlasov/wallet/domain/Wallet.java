package org.vlasov.wallet.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Wallet {
    private UUID walletId;
    private double balance;
}

