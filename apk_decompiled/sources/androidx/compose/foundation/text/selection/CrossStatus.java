package androidx.compose.foundation.text.selection;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CrossStatus {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ CrossStatus[] $VALUES;
    public static final CrossStatus CROSSED = new CrossStatus("CROSSED", 0);
    public static final CrossStatus NOT_CROSSED = new CrossStatus("NOT_CROSSED", 1);
    public static final CrossStatus COLLAPSED = new CrossStatus("COLLAPSED", 2);

    private static final /* synthetic */ CrossStatus[] $values() {
        return new CrossStatus[]{CROSSED, NOT_CROSSED, COLLAPSED};
    }

    static {
        CrossStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private CrossStatus(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static CrossStatus valueOf(String str) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, str);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) $VALUES.clone();
    }
}
