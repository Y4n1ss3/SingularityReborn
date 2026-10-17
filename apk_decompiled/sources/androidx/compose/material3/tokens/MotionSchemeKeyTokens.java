package androidx.compose.material3.tokens;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MotionSchemeKeyTokens {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ MotionSchemeKeyTokens[] $VALUES;
    public static final MotionSchemeKeyTokens DefaultSpatial = new MotionSchemeKeyTokens("DefaultSpatial", 0);
    public static final MotionSchemeKeyTokens FastSpatial = new MotionSchemeKeyTokens("FastSpatial", 1);
    public static final MotionSchemeKeyTokens SlowSpatial = new MotionSchemeKeyTokens("SlowSpatial", 2);
    public static final MotionSchemeKeyTokens DefaultEffects = new MotionSchemeKeyTokens("DefaultEffects", 3);
    public static final MotionSchemeKeyTokens FastEffects = new MotionSchemeKeyTokens("FastEffects", 4);
    public static final MotionSchemeKeyTokens SlowEffects = new MotionSchemeKeyTokens("SlowEffects", 5);

    private static final /* synthetic */ MotionSchemeKeyTokens[] $values() {
        return new MotionSchemeKeyTokens[]{DefaultSpatial, FastSpatial, SlowSpatial, DefaultEffects, FastEffects, SlowEffects};
    }

    static {
        MotionSchemeKeyTokens[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private MotionSchemeKeyTokens(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static MotionSchemeKeyTokens valueOf(String str) {
        return (MotionSchemeKeyTokens) Enum.valueOf(MotionSchemeKeyTokens.class, str);
    }

    public static MotionSchemeKeyTokens[] values() {
        return (MotionSchemeKeyTokens[]) $VALUES.clone();
    }
}
