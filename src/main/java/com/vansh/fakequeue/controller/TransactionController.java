package com.vansh.fakequeue.controller;

import com.vansh.fakequeue.dao.entity.Transaction;
import com.vansh.fakequeue.dto.TransactionDTO;
import com.vansh.fakequeue.service.transaction.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/")
    public ResponseEntity<TransactionDTO> addTransaction(@RequestBody TransactionDTO transactionDTO){
        return transactionService.addTransaction(transactionDTO);
    }

    @GetMapping("/")
    public ResponseEntity<List<TransactionDTO>> getTransaction(){
        return transactionService.getTransaction();
    }


}
