package com.javaBasics.OOPConceptPart2;

public interface USBank {
    int min_bal = 100;

    public void debit();

    public void credit();

    public void transferMoney();

    // properties of Interface:
    // only method declaration is allowed --
    // no method body - only method prototype
    // In Interface, we can declare variables - vars are by default static in nature
    // vars value can't be changed, it is final/constant in nature
    // no static method in Interface
    // no main method in Interface
    // We can't create object of the Interface
    // Interface is abstract in nature

}
