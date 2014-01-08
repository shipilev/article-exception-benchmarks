package net.shipilev.perf.exceptions;

public class LilStacklessException extends LilException {
    public LilStacklessException(int metadata) {
        super(metadata);
    }

    public LilStacklessException(LilStacklessException e, int metadata) {
        super(e, metadata);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        // do nothing
        return this;
    }
}
