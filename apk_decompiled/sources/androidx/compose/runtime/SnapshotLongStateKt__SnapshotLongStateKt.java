package androidx.compose.runtime;

import defpackage.z20;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotLongStateKt__SnapshotLongStateKt {
    public static final long getValue(LongState longState, Object obj, z20 z20Var) {
        return longState.getLongValue();
    }

    public static final MutableLongState mutableLongStateOf(long j) {
        return SnapshotLongState_androidKt.createSnapshotMutableLongState(j);
    }

    public static final void setValue(MutableLongState mutableLongState, Object obj, z20 z20Var, long j) {
        mutableLongState.setLongValue(j);
    }
}
