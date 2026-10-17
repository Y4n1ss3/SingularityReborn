package androidx.compose.material3;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LayoutId {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ LayoutId[] $VALUES;
    public static final LayoutId Selector = new LayoutId("Selector", 0);
    public static final LayoutId InnerCircle = new LayoutId("InnerCircle", 1);

    private static final /* synthetic */ LayoutId[] $values() {
        return new LayoutId[]{Selector, InnerCircle};
    }

    static {
        LayoutId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private LayoutId(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static LayoutId valueOf(String str) {
        return (LayoutId) Enum.valueOf(LayoutId.class, str);
    }

    public static LayoutId[] values() {
        return (LayoutId[]) $VALUES.clone();
    }
}
