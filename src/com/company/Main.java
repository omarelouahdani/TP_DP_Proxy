package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Client client = new Client();
        client.setStandard(new Proxy());
        client.process();
    }
}
