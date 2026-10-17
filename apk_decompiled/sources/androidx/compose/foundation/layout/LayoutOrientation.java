package androidx.compose.foundation.layout;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LayoutOrientation {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ LayoutOrientation[] $VALUES;
    public static final LayoutOrientation Horizontal = new LayoutOrientation("Horizontal", 0);
    public static final LayoutOrientation Vertical = new LayoutOrientation("Vertical", 1);

    private static final /* synthetic */ LayoutOrientation[] $values() {
        return new LayoutOrientation[]{Horizontal, Vertical};
    }

    static {
        LayoutOrientation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private LayoutOrientation(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static LayoutOrientation valueOf(String str) {
        return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, str);
    }

    public static LayoutOrientation[] values() {
        return (LayoutOrientation[]) $VALUES.clone();
    }
}
