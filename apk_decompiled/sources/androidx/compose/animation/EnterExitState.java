package androidx.compose.animation;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitState {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ EnterExitState[] $VALUES;
    public static final EnterExitState PreEnter = new EnterExitState("PreEnter", 0);
    public static final EnterExitState Visible = new EnterExitState("Visible", 1);
    public static final EnterExitState PostExit = new EnterExitState("PostExit", 2);

    private static final /* synthetic */ EnterExitState[] $values() {
        return new EnterExitState[]{PreEnter, Visible, PostExit};
    }

    static {
        EnterExitState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private EnterExitState(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static EnterExitState valueOf(String str) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, str);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) $VALUES.clone();
    }
}
