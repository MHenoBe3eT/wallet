package org.vlasov.wallet.infrastructure.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vlasov.wallet.domain.Wallet;
import org.vlasov.wallet.usecase.GetWallet;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/wallets")
public class WalletController {

    private final GetWallet getWallet;

    @Autowired
    public WalletController(GetWallet getWallet) {
        this.getWallet = getWallet;
    }

    @GetMapping("/{walletId}")
    public ResponseEntity<?> getWalletById(@PathVariable UUID walletId) {
        Wallet wallet = getWallet.byId(walletId);
        if (wallet != null) {
            return ResponseEntity.ok(wallet);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Wallet not found");
        }
    }
}
