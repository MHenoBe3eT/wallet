package org.vlasov.wallet.usecase;

import org.vlasov.wallet.domain.Wallet;

import java.util.UUID;

public class GetWalletByIdUseCase {
    private GetWallet getWallet;

    public GetWalletByIdUseCase(GetWallet getWallet) {
        this.getWallet = getWallet;
    }

    public Wallet byId(UUID id) {
        return getWallet.byId(id);
    }
}
