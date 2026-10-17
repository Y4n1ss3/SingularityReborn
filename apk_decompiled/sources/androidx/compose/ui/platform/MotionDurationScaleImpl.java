package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.MotionDurationScale;
import defpackage.in;
import defpackage.jn;
import defpackage.kn;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.un;
import defpackage.ur0;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class MotionDurationScaleImpl implements MotionDurationScale {
    private final MutableFloatState _scaleFactor$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
    private final Context applicationContext;
    private un coroutineScope;
    private z10 job;

    public MotionDurationScaleImpl(Context context) {
        this.applicationContext = context;
    }

    private final float get_scaleFactor() {
        return this._scaleFactor$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_scaleFactor(float f) {
        this._scaleFactor$delegate.setFloatValue(f);
    }

    private final z10 startObservingSystemScaleFactor() {
        ur0 animationScaleFlowFor;
        animationScaleFlowFor = WindowRecomposer_androidKt.getAnimationScaleFlowFor(this.applicationContext);
        set_scaleFactor(((Number) animationScaleFlowFor.getValue()).floatValue());
        un unVar = this.coroutineScope;
        if (unVar != null) {
            return p01.t(unVar, null, null, new MotionDurationScaleImpl$startObservingSystemScaleFactor$1(animationScaleFlowFor, this, null), 3);
        }
        o.f("MotionDurationScale scale factor requested before recomposer loop start");
        return null;
    }

    @Override // androidx.compose.ui.MotionDurationScale, defpackage.kn
    public /* bridge */ <R> R fold(R r, my myVar) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r, myVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale, defpackage.kn
    public /* bridge */ <E extends in> E get(jn jnVar) {
        return (E) MotionDurationScale.DefaultImpls.get(this, jnVar);
    }

    public final un getCoroutineScope() {
        return this.coroutineScope;
    }

    public final z10 getJob() {
        return this.job;
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        if (this.job == null) {
            this.job = startObservingSystemScaleFactor();
        }
        return get_scaleFactor();
    }

    @Override // androidx.compose.ui.MotionDurationScale, defpackage.kn
    public /* bridge */ kn minusKey(jn jnVar) {
        return MotionDurationScale.DefaultImpls.minusKey(this, jnVar);
    }

    @Override // androidx.compose.ui.MotionDurationScale, defpackage.kn
    public /* bridge */ kn plus(kn knVar) {
        return MotionDurationScale.DefaultImpls.plus(this, knVar);
    }

    public final void setCoroutineScope(un unVar) {
        this.coroutineScope = unVar;
    }

    public final void setJob(z10 z10Var) {
        this.job = z10Var;
    }
}
