package androidx.compose.animation.core;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RepeatMode {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ RepeatMode[] $VALUES;
    public static final RepeatMode Restart = new RepeatMode("Restart", 0);
    public static final RepeatMode Reverse = new RepeatMode("Reverse", 1);

    private static final /* synthetic */ RepeatMode[] $values() {
        return new RepeatMode[]{Restart, Reverse};
    }

    static {
        RepeatMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private RepeatMode(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static RepeatMode valueOf(String str) {
        return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
    }

    public static RepeatMode[] values() {
        return (RepeatMode[]) $VALUES.clone();
    }
}
