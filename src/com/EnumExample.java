package com;

enum Status {
    PENDING(0),
    ACTIVE(1),
    INACTIVE(2),
    DELETED(3);

    private int value;

    Status(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}

public class EnumExample {

    public static void main(String[] args) {
        Status myVar = Status.INACTIVE;

        switch (myVar) {
            case ACTIVE:
                System.out.println("Status : " + myVar.name());
                break;
            case INACTIVE:
                System.out.println("Status : " + myVar.name());
                break;
            case PENDING:
                System.out.println("Status : " + myVar.name());
                break;
            default:
                System.out.println("Status : " + myVar.name());
                break;
        }
    }
}
