package androidx.compose.material3;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SheetValue {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ SheetValue[] $VALUES;
    public static final SheetValue Hidden = new SheetValue("Hidden", 0);
    public static final SheetValue Expanded = new SheetValue("Expanded", 1);
    public static final SheetValue PartiallyExpanded = new SheetValue("PartiallyExpanded", 2);

    private static final /* synthetic */ SheetValue[] $values() {
        return new SheetValue[]{Hidden, Expanded, PartiallyExpanded};
    }

    static {
        SheetValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private SheetValue(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static SheetValue valueOf(String str) {
        return (SheetValue) Enum.valueOf(SheetValue.class, str);
    }

    public static SheetValue[] values() {
        return (SheetValue[]) $VALUES.clone();
    }
}
