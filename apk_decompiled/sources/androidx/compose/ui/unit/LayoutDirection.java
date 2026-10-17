package androidx.compose.ui.unit;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutDirection {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ LayoutDirection[] $VALUES;
    public static final LayoutDirection Ltr = new LayoutDirection("Ltr", 0);
    public static final LayoutDirection Rtl = new LayoutDirection("Rtl", 1);

    private static final /* synthetic */ LayoutDirection[] $values() {
        return new LayoutDirection[]{Ltr, Rtl};
    }

    static {
        LayoutDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private LayoutDirection(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static LayoutDirection valueOf(String str) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, str);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) $VALUES.clone();
    }
}
