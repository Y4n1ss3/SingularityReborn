package androidx.compose.runtime;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PausedCompositionState {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ PausedCompositionState[] $VALUES;
    public static final PausedCompositionState Invalid = new PausedCompositionState("Invalid", 0);
    public static final PausedCompositionState Cancelled = new PausedCompositionState("Cancelled", 1);
    public static final PausedCompositionState InitialPending = new PausedCompositionState("InitialPending", 2);
    public static final PausedCompositionState RecomposePending = new PausedCompositionState("RecomposePending", 3);
    public static final PausedCompositionState Recomposing = new PausedCompositionState("Recomposing", 4);
    public static final PausedCompositionState ApplyPending = new PausedCompositionState("ApplyPending", 5);
    public static final PausedCompositionState Applied = new PausedCompositionState("Applied", 6);

    private static final /* synthetic */ PausedCompositionState[] $values() {
        return new PausedCompositionState[]{Invalid, Cancelled, InitialPending, RecomposePending, Recomposing, ApplyPending, Applied};
    }

    static {
        PausedCompositionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private PausedCompositionState(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static PausedCompositionState valueOf(String str) {
        return (PausedCompositionState) Enum.valueOf(PausedCompositionState.class, str);
    }

    public static PausedCompositionState[] values() {
        return (PausedCompositionState[]) $VALUES.clone();
    }
}
