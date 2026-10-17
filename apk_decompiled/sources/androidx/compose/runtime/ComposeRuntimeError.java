package androidx.compose.runtime;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposeRuntimeError extends IllegalStateException {
    public static final int $stable = 8;
    private final String message;

    public ComposeRuntimeError(String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
