package androidx.compose.foundation;

import androidx.compose.ui.MotionDurationScale;
import defpackage.in;
import defpackage.jn;
import defpackage.kn;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FixedMotionDurationScale implements MotionDurationScale {
    public static final FixedMotionDurationScale INSTANCE = new FixedMotionDurationScale();

    private FixedMotionDurationScale() {
    }

    @Override // androidx.compose.ui.MotionDurationScale, defpackage.kn
    public /* bridge */ <R> R fold(R r, my myVar) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r, myVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale, defpackage.kn
    public /* bridge */ <E extends in> E get(jn jnVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, jnVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        return 1.0f;
    }

    @Override // androidx.compose.ui.MotionDurationScale, defpackage.kn
    public /* bridge */ kn minusKey(jn jnVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, jnVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale, defpackage.kn
    public /* bridge */ kn plus(kn knVar) {
        return MotionDurationScale.DefaultImpls.plus(this, knVar);
    }
}
