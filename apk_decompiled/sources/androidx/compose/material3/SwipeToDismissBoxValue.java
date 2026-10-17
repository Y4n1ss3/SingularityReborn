package androidx.compose.material3;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeToDismissBoxValue {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ SwipeToDismissBoxValue[] $VALUES;
    public static final SwipeToDismissBoxValue StartToEnd = new SwipeToDismissBoxValue("StartToEnd", 0);
    public static final SwipeToDismissBoxValue EndToStart = new SwipeToDismissBoxValue("EndToStart", 1);
    public static final SwipeToDismissBoxValue Settled = new SwipeToDismissBoxValue("Settled", 2);

    private static final /* synthetic */ SwipeToDismissBoxValue[] $values() {
        return new SwipeToDismissBoxValue[]{StartToEnd, EndToStart, Settled};
    }

    static {
        SwipeToDismissBoxValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private SwipeToDismissBoxValue(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static SwipeToDismissBoxValue valueOf(String str) {
        return (SwipeToDismissBoxValue) Enum.valueOf(SwipeToDismissBoxValue.class, str);
    }

    public static SwipeToDismissBoxValue[] values() {
        return (SwipeToDismissBoxValue[]) $VALUES.clone();
    }
}
