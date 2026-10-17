package androidx.compose.runtime;

import defpackage.z20;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotIntStateKt__SnapshotIntStateKt {
    public static final int getValue(IntState intState, Object obj, z20 z20Var) {
        return intState.getIntValue();
    }

    public static final MutableIntState mutableIntStateOf(int i) {
        return SnapshotIntState_androidKt.createSnapshotMutableIntState(i);
    }

    public static final void setValue(MutableIntState mutableIntState, Object obj, z20 z20Var, int i) {
        mutableIntState.setIntValue(i);
    }
}
