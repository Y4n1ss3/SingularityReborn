package androidx.compose.animation.core;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimationEndReason {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ AnimationEndReason[] $VALUES;
    public static final AnimationEndReason BoundReached = new AnimationEndReason("BoundReached", 0);
    public static final AnimationEndReason Finished = new AnimationEndReason("Finished", 1);

    private static final /* synthetic */ AnimationEndReason[] $values() {
        return new AnimationEndReason[]{BoundReached, Finished};
    }

    static {
        AnimationEndReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private AnimationEndReason(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static AnimationEndReason valueOf(String str) {
        return (AnimationEndReason) Enum.valueOf(AnimationEndReason.class, str);
    }

    public static AnimationEndReason[] values() {
        return (AnimationEndReason[]) $VALUES.clone();
    }
}
