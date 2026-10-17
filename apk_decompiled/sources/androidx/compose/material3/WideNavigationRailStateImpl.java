package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import defpackage.dq;
import defpackage.ew0;
import defpackage.hm;
import defpackage.hm0;
import defpackage.vn;
import defpackage.vt0;
import defpackage.w01;
import defpackage.zv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WideNavigationRailStateImpl implements WideNavigationRailState {
    private static final float Collapsed = 0.0f;
    private static final float Expanded = 1.0f;
    private final State<WideNavigationRailValue> _currentVal;
    private final AnimationSpec<Float> animationSpec;
    private WideNavigationRailValue initialValue;
    private final Animatable<Float, AnimationVector1D> internalState;
    private final float internalValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public WideNavigationRailStateImpl(WideNavigationRailValue wideNavigationRailValue, AnimationSpec<Float> animationSpec) {
        this.initialValue = wideNavigationRailValue;
        this.animationSpec = animationSpec;
        float f = WideNavigationRailStateKt.isExpanded(wideNavigationRailValue) ? 1.0f : 0.0f;
        this.internalValue = f;
        this.internalState = new Animatable<>(Float.valueOf(f), VectorConvertersKt.getVectorConverter(zv.a), null, null, 12, null);
        this._currentVal = SnapshotStateKt.derivedStateOf(new hm0(this, 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WideNavigationRailValue _currentVal$lambda$0(WideNavigationRailStateImpl wideNavigationRailStateImpl) {
        return wideNavigationRailStateImpl.internalState.getValue().floatValue() == 1.0f ? WideNavigationRailValue.Expanded : WideNavigationRailValue.Collapsed;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object collapse(hm hmVar) {
        Object animateTo$default = Animatable.animateTo$default(this.internalState, new Float(0.0f), this.animationSpec, null, null, hmVar, 12, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object expand(hm hmVar) {
        Object animateTo$default = Animatable.animateTo$default(this.internalState, new Float(1.0f), this.animationSpec, null, null, hmVar, 12, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public WideNavigationRailValue getCurrentValue() {
        return this._currentVal.getValue();
    }

    public final WideNavigationRailValue getInitialValue() {
        return this.initialValue;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public WideNavigationRailValue getTargetValue() {
        return this.internalState.getTargetValue().floatValue() == 1.0f ? WideNavigationRailValue.Expanded : WideNavigationRailValue.Collapsed;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public boolean isAnimating() {
        return this.internalState.isRunning();
    }

    public final void setInitialValue(WideNavigationRailValue wideNavigationRailValue) {
        this.initialValue = wideNavigationRailValue;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object snapTo(WideNavigationRailValue wideNavigationRailValue, hm hmVar) {
        Object snapTo = this.internalState.snapTo(new Float(WideNavigationRailStateKt.isExpanded(wideNavigationRailValue) ? 1.0f : 0.0f), hmVar);
        return snapTo == vn.d ? snapTo : w01.a;
    }

    @Override // androidx.compose.material3.WideNavigationRailState
    public Object toggle(hm hmVar) {
        Object animateTo$default = Animatable.animateTo$default(this.internalState, new Float(WideNavigationRailStateKt.isExpanded(getTargetValue()) ? 0.0f : 1.0f), this.animationSpec, null, null, hmVar, 12, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WideNavigationRailValue Saver$lambda$0(SaverScope saverScope, WideNavigationRailState wideNavigationRailState) {
            return wideNavigationRailState.getTargetValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WideNavigationRailState Saver$lambda$1(AnimationSpec animationSpec, WideNavigationRailValue wideNavigationRailValue) {
            return new WideNavigationRailStateImpl(wideNavigationRailValue, animationSpec);
        }

        public final Saver<WideNavigationRailState, WideNavigationRailValue> Saver(AnimationSpec<Float> animationSpec) {
            return SaverKt.Saver(new ew0(1), new vt0(animationSpec, 3));
        }

        private Companion() {
        }
    }
}
