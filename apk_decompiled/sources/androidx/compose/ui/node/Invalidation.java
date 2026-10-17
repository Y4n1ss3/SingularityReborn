package androidx.compose.ui.node;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class Invalidation {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ Invalidation[] $VALUES;
    public static final Invalidation LookaheadMeasurement = new Invalidation("LookaheadMeasurement", 0);
    public static final Invalidation LookaheadPlacement = new Invalidation("LookaheadPlacement", 1);
    public static final Invalidation Measurement = new Invalidation("Measurement", 2);
    public static final Invalidation Placement = new Invalidation("Placement", 3);

    private static final /* synthetic */ Invalidation[] $values() {
        return new Invalidation[]{LookaheadMeasurement, LookaheadPlacement, Measurement, Placement};
    }

    static {
        Invalidation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private Invalidation(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static Invalidation valueOf(String str) {
        return (Invalidation) Enum.valueOf(Invalidation.class, str);
    }

    public static Invalidation[] values() {
        return (Invalidation[]) $VALUES.clone();
    }
}
