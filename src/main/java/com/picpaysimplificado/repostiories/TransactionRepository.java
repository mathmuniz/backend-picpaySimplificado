package com.picpaysimplificado.repostiories;

import com.picpaysimplificado.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository  extends JpaRepository<Transaction, Long> {
}
