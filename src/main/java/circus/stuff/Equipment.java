<<<<<<< HEAD:src/main/java/Equipment.java
public abstract class Equipment implements Asset{
    // abstract class prevent the class making any objects.
=======
package circus.stuff;

import circus.Asset;

public abstract class Equipment implements Asset {
>>>>>>> 4171f38e4bcc7f62eca0ce4093b0beb05d87ce96:src/main/java/circus/stuff/Equipment.java
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
