package androidx.compose.runtime;

import defpackage.z20;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotDoubleStateKt__SnapshotDoubleStateKt {
    public static final double getValue(DoubleState doubleState, Object obj, z20 z20Var) {
        return doubleState.getDoubleValue();
    }

    public static final MutableDoubleState mutableDoubleStateOf(double d) {
        return SnapshotDoubleState_androidKt.createSnapshotMutableDoubleState(d);
    }

    public static final void setValue(MutableDoubleState mutableDoubleState, Object obj, z20 z20Var, double d) {
        mutableDoubleState.setDoubleValue(d);
    }
}
