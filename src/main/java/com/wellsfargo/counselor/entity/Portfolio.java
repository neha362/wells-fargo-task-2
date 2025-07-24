package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioID;

    @OneToOne
    private long clientID;

    @ManyToOne
    private long advisorID;

    protected Portfolio() {

    }

    public Portfolio(long advisorID, long clientID) {
        this.advisorID = advisorID;
        this.clientID = clientID;
    }

    public Long getPortfolioID() {
        return this.portfolioID;
    }

    public Long getClientID() {
        return clientID;
    }

    public void setClientID(long clientID) {
        this.clientID = clientID;
    }

    public Long getAdvisorID() {
        return this.advisorID;
    }

    public void setAdvisorID(long advisorID) {
        this.advisorID = advisorID;
    }
}
