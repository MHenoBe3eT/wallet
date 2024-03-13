package org.vlasov.wallet.usecase;

import org.springframework.stereotype.Service;
import org.vlasov.wallet.domain.Wallet;

import java.util.UUID;

@Service
public interface GetWallet {
    Wallet byId(UUID id);
}
