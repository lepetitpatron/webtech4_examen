package edu.ap.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.ap.spring.jpa.WalletJpa;
import edu.ap.spring.jpa.WalletRepository;
import edu.ap.spring.service.Wallet;

@Controller
public class BlockChainController
{
    @Autowired
    private WalletRepository repository;

    @GetMapping("/balance")
    @ResponseBody
    public String index()
    {
        return "Blockchain";
    }

    @GetMapping("/init")
    @ResponseBody
    public String init()
    {

        repository.save(new WalletJpa("WalletA", new Wallet()));
        repository.save(new WalletJpa("WalletB", new Wallet()));

        return "Values added!";
    }
}