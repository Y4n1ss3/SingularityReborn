package androidx.compose.runtime.tooling;

import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposeStackTrace {
    public static final int $stable = 8;
    private final List<ComposeStackTraceFrame> frames;
    private final boolean hasSourceInformation;

    public ComposeStackTrace(List<ComposeStackTraceFrame> list, boolean z) {
        this.frames = list;
        this.hasSourceInformation = z;
    }

    public final List<ComposeStackTraceFrame> getFrames() {
        return this.frames;
    }

    public final boolean getHasSourceInformation() {
        return this.hasSourceInformation;
    }
}
