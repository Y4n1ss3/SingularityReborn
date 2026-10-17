package androidx.compose.runtime.tooling;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ParseException extends Exception {
    private final String message;

    public ParseException(String str) {
        super(str);
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
