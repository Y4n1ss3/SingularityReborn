package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Density;
import defpackage.ky;
import defpackage.p01;
import defpackage.un;
import defpackage.z10;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutScrollDeltaBetweenPasses {
    public static final int $stable = 8;
    private AnimationState<Float, AnimationVector1D> _scrollDeltaBetweenPasses;
    private z10 job;

    public LazyLayoutScrollDeltaBetweenPasses() {
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(zv.a);
        Float valueOf = Float.valueOf(0.0f);
        this._scrollDeltaBetweenPasses = AnimationStateKt.AnimationState$default(vectorConverter, valueOf, valueOf, 0L, 0L, false, 56, null);
    }

    public final z10 getJob$foundation() {
        return this.job;
    }

    public final float getScrollDeltaBetweenPasses$foundation() {
        return this._scrollDeltaBetweenPasses.getValue().floatValue();
    }

    public final boolean isActive$foundation() {
        return !(this._scrollDeltaBetweenPasses.getValue().floatValue() == 0.0f);
    }

    public final void setJob$foundation(z10 z10Var) {
        this.job = z10Var;
    }

    public final void stop$foundation() {
        z10 z10Var = this.job;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
        this._scrollDeltaBetweenPasses = new AnimationState<>(VectorConvertersKt.getVectorConverter(zv.a), Float.valueOf(0.0f), null, 0L, 0L, false, 60, null);
    }

    public final void updateScrollDeltaForApproach$foundation(float f, Density density, un unVar) {
        float f2;
        f2 = LazyLayoutScrollDeltaBetweenPassesKt.DeltaThresholdForScrollAnimation;
        if (f <= density.mo367toPx0680j_4(f2)) {
            return;
        }
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            float floatValue = this._scrollDeltaBetweenPasses.getValue().floatValue();
            z10 z10Var = this.job;
            if (z10Var != null) {
                z10Var.cancel(null);
            }
            if (this._scrollDeltaBetweenPasses.isRunning()) {
                this._scrollDeltaBetweenPasses = AnimationStateKt.copy$default((AnimationState) this._scrollDeltaBetweenPasses, floatValue - f, 0.0f, 0L, 0L, false, 30, (Object) null);
            } else {
                this._scrollDeltaBetweenPasses = new AnimationState<>(VectorConvertersKt.getVectorConverter(zv.a), Float.valueOf(-f), null, 0L, 0L, false, 60, null);
            }
            this.job = p01.t(unVar, null, null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this, null), 3);
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }
}
