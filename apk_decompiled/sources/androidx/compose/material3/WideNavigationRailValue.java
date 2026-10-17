package androidx.compose.material3;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WideNavigationRailValue {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ WideNavigationRailValue[] $VALUES;
    public static final WideNavigationRailValue Collapsed = new WideNavigationRailValue("Collapsed", 0);
    public static final WideNavigationRailValue Expanded = new WideNavigationRailValue("Expanded", 1);

    private static final /* synthetic */ WideNavigationRailValue[] $values() {
        return new WideNavigationRailValue[]{Collapsed, Expanded};
    }

    static {
        WideNavigationRailValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private WideNavigationRailValue(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static WideNavigationRailValue valueOf(String str) {
        return (WideNavigationRailValue) Enum.valueOf(WideNavigationRailValue.class, str);
    }

    public static WideNavigationRailValue[] values() {
        return (WideNavigationRailValue[]) $VALUES.clone();
    }
}
