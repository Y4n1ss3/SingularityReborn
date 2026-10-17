package androidx.compose.foundation.text.input.internal;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WedgeAffinity {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ WedgeAffinity[] $VALUES;
    public static final WedgeAffinity Start = new WedgeAffinity("Start", 0);
    public static final WedgeAffinity End = new WedgeAffinity("End", 1);

    private static final /* synthetic */ WedgeAffinity[] $values() {
        return new WedgeAffinity[]{Start, End};
    }

    static {
        WedgeAffinity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private WedgeAffinity(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static WedgeAffinity valueOf(String str) {
        return (WedgeAffinity) Enum.valueOf(WedgeAffinity.class, str);
    }

    public static WedgeAffinity[] values() {
        return (WedgeAffinity[]) $VALUES.clone();
    }
}
