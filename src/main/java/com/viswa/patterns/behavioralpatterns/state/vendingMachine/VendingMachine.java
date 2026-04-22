package com.viswa.patterns.behavioralpatterns.state.vendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine() {
        this.vendingMachineState = new IdleState();
        this.coinList = new ArrayList<>();
        this.inventory = new Inventory(10);
    }


    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
