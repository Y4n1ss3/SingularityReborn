package androidx.compose.ui.layout;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class IntrinsicMinMax {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ IntrinsicMinMax[] $VALUES;
    public static final IntrinsicMinMax Min = new IntrinsicMinMax("Min", 0);
    public static final IntrinsicMinMax Max = new IntrinsicMinMax("Max", 1);

    private static final /* synthetic */ IntrinsicMinMax[] $values() {
        return new IntrinsicMinMax[]{Min, Max};
    }

    static {
        IntrinsicMinMax[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private IntrinsicMinMax(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static IntrinsicMinMax valueOf(String str) {
        return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
    }

    public static IntrinsicMinMax[] values() {
        return (IntrinsicMinMax[]) $VALUES.clone();
    }
}
