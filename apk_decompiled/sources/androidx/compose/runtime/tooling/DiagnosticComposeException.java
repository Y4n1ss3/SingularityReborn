package androidx.compose.runtime.tooling;

import defpackage.ky;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DiagnosticComposeException extends RuntimeException {
    public static final int $stable = 8;
    private final ComposeStackTrace trace;

    public DiagnosticComposeException(ComposeStackTrace composeStackTrace) {
        this.trace = composeStackTrace;
        if (composeStackTrace.getHasSourceInformation()) {
            return;
        }
        List<ComposeStackTraceFrame> filterInternalFramesByGroupKey = ComposeStackTraceKt.filterInternalFramesByGroupKey(composeStackTrace);
        int size = filterInternalFramesByGroupKey.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i = 0; i < size; i++) {
            stackTraceElementArr[i] = new StackTraceElement("$$compose", "m$" + filterInternalFramesByGroupKey.get(i).getGroupKey(), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    private final <T, R> R[] mapToArray(List<? extends T> list, ky kyVar) {
        list.size();
        q10.G();
        throw null;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (!this.trace.getHasSourceInformation()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Composition stack when thrown:\n");
        ComposeStackTraceKt.appendSourceInformationStackTrace(sb, this.trace);
        return sb.toString();
    }
}
