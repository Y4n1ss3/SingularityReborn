package androidx.compose.runtime;

import defpackage.z20;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final /* synthetic */ class PrimitiveSnapshotStateKt__SnapshotFloatStateKt {
    public static final float getValue(FloatState floatState, Object obj, z20 z20Var) {
        return floatState.getFloatValue();
    }

    public static final MutableFloatState mutableFloatStateOf(float f) {
        return SnapshotFloatState_androidKt.createSnapshotMutableFloatState(f);
    }

    public static final void setValue(MutableFloatState mutableFloatState, Object obj, z20 z20Var, float f) {
        mutableFloatState.setFloatValue(f);
    }
}
