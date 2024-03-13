package org.vlasov.wallet.infrastructure.db;

import org.vlasov.wallet.domain.Wallet;
import org.vlasov.wallet.infrastructure.model.WalletEntity;
import org.vlasov.wallet.usecase.GetWallet;

import java.util.Optional;
import java.util.UUID;

public class GetWalletFromRepository implements GetWallet {

    private final WalletRepository walletRepository;

    public GetWalletFromRepository(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Override
    public Wallet byId(UUID id) {
        Optional<WalletEntity> result = walletRepository.findById(id);
        return result.map(WalletEntity::fromEntity).orElse(null);
    }

}
