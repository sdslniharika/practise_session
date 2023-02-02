package com.example.demo.com.glo.addressBook;

public class PhoneNumber {
    private String label;
    private String phoneNumber;

    public PhoneNumber(String label, String phoneNumber) throws Exception {
        // TODO
        if(label.isBlank() || label.contains("1") || label.length()>25 || phoneNumber.contains("A"))
        {
            throw new Exception();
        }
        this.label=label;
        this.phoneNumber=phoneNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
