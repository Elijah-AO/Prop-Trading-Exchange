package dev.elijahao.stock_trading_exchange;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @GetMapping
    public ResponseEntity<String> getAccount() {
        return ResponseEntity.ok("Hello World");
    }
}
