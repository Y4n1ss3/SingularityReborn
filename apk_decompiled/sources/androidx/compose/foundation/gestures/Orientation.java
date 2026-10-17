package androidx.compose.foundation.gestures;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Orientation {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ Orientation[] $VALUES;
    public static final Orientation Vertical = new Orientation("Vertical", 0);
    public static final Orientation Horizontal = new Orientation("Horizontal", 1);

    private static final /* synthetic */ Orientation[] $values() {
        return new Orientation[]{Vertical, Horizontal};
    }

    static {
        Orientation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private Orientation(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) $VALUES.clone();
    }
}
