package androidx.compose.ui.layout;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class IntrinsicWidthHeight {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ IntrinsicWidthHeight[] $VALUES;
    public static final IntrinsicWidthHeight Width = new IntrinsicWidthHeight("Width", 0);
    public static final IntrinsicWidthHeight Height = new IntrinsicWidthHeight("Height", 1);

    private static final /* synthetic */ IntrinsicWidthHeight[] $values() {
        return new IntrinsicWidthHeight[]{Width, Height};
    }

    static {
        IntrinsicWidthHeight[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private IntrinsicWidthHeight(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static IntrinsicWidthHeight valueOf(String str) {
        return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
    }

    public static IntrinsicWidthHeight[] values() {
        return (IntrinsicWidthHeight[]) $VALUES.clone();
    }
}
