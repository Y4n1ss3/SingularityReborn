package androidx.compose.material3;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SliderComponents {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ SliderComponents[] $VALUES;
    public static final SliderComponents THUMB = new SliderComponents("THUMB", 0);
    public static final SliderComponents TRACK = new SliderComponents("TRACK", 1);

    private static final /* synthetic */ SliderComponents[] $values() {
        return new SliderComponents[]{THUMB, TRACK};
    }

    static {
        SliderComponents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private SliderComponents(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static SliderComponents valueOf(String str) {
        return (SliderComponents) Enum.valueOf(SliderComponents.class, str);
    }

    public static SliderComponents[] values() {
        return (SliderComponents[]) $VALUES.clone();
    }
}
