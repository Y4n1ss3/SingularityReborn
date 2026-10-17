package androidx.compose.material3;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DrawerValue {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ DrawerValue[] $VALUES;
    public static final DrawerValue Closed = new DrawerValue("Closed", 0);
    public static final DrawerValue Open = new DrawerValue("Open", 1);

    private static final /* synthetic */ DrawerValue[] $values() {
        return new DrawerValue[]{Closed, Open};
    }

    static {
        DrawerValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private DrawerValue(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static DrawerValue valueOf(String str) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, str);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) $VALUES.clone();
    }
}
