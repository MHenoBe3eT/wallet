package org.vlasov.wallet.usecase;

import org.vlasov.wallet.domain.Wallet;

import java.util.UUID;

public interface GetWallet {
    Wallet byId(UUID id);
}
