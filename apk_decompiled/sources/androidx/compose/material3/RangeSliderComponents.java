package androidx.compose.material3;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class RangeSliderComponents {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ RangeSliderComponents[] $VALUES;
    public static final RangeSliderComponents ENDTHUMB = new RangeSliderComponents("ENDTHUMB", 0);
    public static final RangeSliderComponents STARTTHUMB = new RangeSliderComponents("STARTTHUMB", 1);
    public static final RangeSliderComponents TRACK = new RangeSliderComponents("TRACK", 2);

    private static final /* synthetic */ RangeSliderComponents[] $values() {
        return new RangeSliderComponents[]{ENDTHUMB, STARTTHUMB, TRACK};
    }

    static {
        RangeSliderComponents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private RangeSliderComponents(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static RangeSliderComponents valueOf(String str) {
        return (RangeSliderComponents) Enum.valueOf(RangeSliderComponents.class, str);
    }

    public static RangeSliderComponents[] values() {
        return (RangeSliderComponents[]) $VALUES.clone();
    }
}
