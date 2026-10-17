package androidx.compose.animation;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StateChangeRequest {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ StateChangeRequest[] $VALUES;
    public static final StateChangeRequest NoRequest = new StateChangeRequest("NoRequest", 0);
    public static final StateChangeRequest MatchFound = new StateChangeRequest("MatchFound", 1);
    public static final StateChangeRequest VisibleContentAbsentDuringTransition = new StateChangeRequest("VisibleContentAbsentDuringTransition", 2);
    public static final StateChangeRequest NoMatchFound = new StateChangeRequest("NoMatchFound", 3);

    private static final /* synthetic */ StateChangeRequest[] $values() {
        return new StateChangeRequest[]{NoRequest, MatchFound, VisibleContentAbsentDuringTransition, NoMatchFound};
    }

    static {
        StateChangeRequest[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private StateChangeRequest(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static StateChangeRequest valueOf(String str) {
        return (StateChangeRequest) Enum.valueOf(StateChangeRequest.class, str);
    }

    public static StateChangeRequest[] values() {
        return (StateChangeRequest[]) $VALUES.clone();
    }
}
