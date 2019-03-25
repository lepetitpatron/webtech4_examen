package edu.ap.spring.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import edu.ap.spring.service.Wallet;

@Entity
public class WalletJpa 
{
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private Wallet wallet;


    public WalletJpa() {
    }


    public WalletJpa(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wallet getWallet() {
        return this.wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }


}