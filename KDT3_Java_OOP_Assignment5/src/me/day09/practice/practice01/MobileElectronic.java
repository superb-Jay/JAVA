package me.day09.practice.practice01;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class MobileElectronic extends Electronic {
    enum CommunicationMethod {FIVE_G, FOUR_G, THREE_G}

    protected CommunicationMethod communicationMethod;
    protected int weight;

    Electronic() {

    }

    public MobileElectronic(CommunicationMethod communicationMethod, int weight) {
        this.communicationMethod = communicationMethod;
        this.weight = weight;
    }

    public MobileElectronic(String productNo, String modelName, Company companyName, LocalDate dateOfMade, AuthMethod[] authMethod, CommunicationMethod communicationMethod, int weight) {
        super(productNo, modelName, companyName, dateOfMade, authMethod);
        this.communicationMethod = communicationMethod;
        this.weight = weight;
    }
}
