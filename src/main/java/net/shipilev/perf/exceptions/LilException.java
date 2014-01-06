package net.shipilev.perf.exceptions;

public class LilException extends Exception {
    private final int metadata;

    public LilException(int metadata) {
        this.metadata = metadata;
    }

    public LilException(LilException e, int metadata) {
        super(e);
        this.metadata = metadata;
    }

    public int getMetadata() {
        return metadata;
    }
}
