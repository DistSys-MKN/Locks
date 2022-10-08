package solution;

import internal.Environment;

public class ProcessLamport implements MutexProcess {
    private final Environment env;

    public ProcessLamport(Environment env) {
        this.env = env;
    }

    @Override
    public void onMessage(int sourcePid, Object message) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void onLockRequest() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void onUnlockRequest() {
        throw new UnsupportedOperationException("Not implemented");
    }
}
