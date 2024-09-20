package J2;

public class StrongBox<E>  {
    public enum keyType {
        PADLOCK, BUTTON, DIAL, FINGER,
    }
    private E data;
    private keyType keyType;
    private int accessCount = 0;
    public StrongBox(keyType keyType){
        this.keyType = keyType;
    }
    public void put(E d) { data = d; }
    public E get() {
        accessCount += 1;
        boolean keyBroken = accessCount > switch(keyType) {
            case PADLOCK -> 1024;
            case BUTTON -> 10000;
            case DIAL -> 30000;
            case FINGER -> 1000000;
        };
        return keyBroken? null : data;
    }
}
