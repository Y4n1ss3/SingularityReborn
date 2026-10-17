package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatorMutex;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicTooltipDefaults {
    public static final int $stable = 0;
    public static final long TooltipDuration = 1500;
    public static final BasicTooltipDefaults INSTANCE = new BasicTooltipDefaults();
    private static final MutatorMutex GlobalMutatorMutex = new MutatorMutex();

    private BasicTooltipDefaults() {
    }

    public final MutatorMutex getGlobalMutatorMutex() {
        return GlobalMutatorMutex;
    }
}
