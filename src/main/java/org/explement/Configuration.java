package org.explement;

public class Configuration {
    public static final boolean roll = true; // Roll the operator, if set to false, will instantly be picked
    public static final int rollTime = 1250; // Time in milliseconds for the operator to get picked
    
    public static final boolean debug = true; // Debug mode, if set to false, will remove all print statements
    
    public static final boolean mergeHashMaps = false; // Merge the attack and defense operator maps, if set to true, both buttons do the same thing
    

    public static final boolean delayOperatorSelection = false; // Have a delay between the operator selection [This is clamped at 10 to the 'rollTime' constant]
    public static final int operatorSelectionDelay = 100; // Delay in milliseconds between operator selections during roll
}
