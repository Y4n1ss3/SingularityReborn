package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import defpackage.dq;
import defpackage.hm;
import defpackage.hm0;
import defpackage.ll0;
import defpackage.te0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;
import defpackage.zv;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SearchBarState {
    public static final int $stable = 0;
    private static final float Collapsed = 0.0f;
    public static final Companion Companion = new Companion(null);
    private static final float Expanded = 1.0f;
    private final Animatable<Float, AnimationVector1D> animatable;
    private final AnimationSpec<Float> animationSpecForCollapse;
    private final AnimationSpec<Float> animationSpecForExpand;
    private final MutableState collapsedCoords$delegate;
    private final State currentValue$delegate;

    private SearchBarState(Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
        this.animatable = animatable;
        this.animationSpecForExpand = animationSpec;
        this.animationSpecForCollapse = animationSpec2;
        this.collapsedCoords$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentValue$delegate = SnapshotStateKt.derivedStateOf(new hm0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchBarValue currentValue_delegate$lambda$0(SearchBarState searchBarState) {
        return searchBarState.animatable.getValue().floatValue() == 0.0f ? SearchBarValue.Collapsed : SearchBarValue.Expanded;
    }

    public final Object animateToCollapsed(hm hmVar) {
        Object animateTo$default = Animatable.animateTo$default(this.animatable, new Float(0.0f), this.animationSpecForCollapse, null, null, hmVar, 12, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }

    public final Object animateToExpanded(hm hmVar) {
        Object animateTo$default = Animatable.animateTo$default(this.animatable, new Float(1.0f), this.animationSpecForExpand, null, null, hmVar, 12, null);
        return animateTo$default == vn.d ? animateTo$default : w01.a;
    }

    public final LayoutCoordinates getCollapsedCoords() {
        return (LayoutCoordinates) this.collapsedCoords$delegate.getValue();
    }

    public final SearchBarValue getCurrentValue() {
        return (SearchBarValue) this.currentValue$delegate.getValue();
    }

    public final float getProgress() {
        return y80.g(this.animatable.getValue().floatValue(), 0.0f, 1.0f);
    }

    public final SearchBarValue getTargetValue() {
        return this.animatable.getTargetValue().floatValue() == 1.0f ? SearchBarValue.Expanded : SearchBarValue.Collapsed;
    }

    public final boolean isAnimating() {
        return this.animatable.isRunning();
    }

    public final void setCollapsedCoords(LayoutCoordinates layoutCoordinates) {
        this.collapsedCoords$delegate.setValue(layoutCoordinates);
    }

    public final Object snapTo(float f, hm hmVar) {
        Object snapTo = this.animatable.snapTo(new Float(f), hmVar);
        return snapTo == vn.d ? snapTo : w01.a;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List Saver$lambda$0(SaverScope saverScope, SearchBarState searchBarState) {
            return y80.D(Float.valueOf(searchBarState.getProgress()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchBarState Saver$lambda$1(AnimationSpec animationSpec, AnimationSpec animationSpec2, List list) {
            return new SearchBarState(new Animatable(list.get(0), VectorConvertersKt.getVectorConverter(zv.a), null, null, 12, null), animationSpec, animationSpec2, null);
        }

        public final Saver<SearchBarState, ?> Saver(AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
            return ListSaverKt.listSaver(new ll0(19), new te0(5, animationSpec, animationSpec2));
        }

        private Companion() {
        }
    }

    public /* synthetic */ SearchBarState(Animatable animatable, AnimationSpec animationSpec, AnimationSpec animationSpec2, dq dqVar) {
        this((Animatable<Float, AnimationVector1D>) animatable, (AnimationSpec<Float>) animationSpec, (AnimationSpec<Float>) animationSpec2);
    }

    public SearchBarState(SearchBarValue searchBarValue, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
        this((Animatable<Float, AnimationVector1D>) AnimatableKt.Animatable$default(searchBarValue == SearchBarValue.Expanded ? 1.0f : 0.0f, 0.0f, 2, null), animationSpec, animationSpec2);
    }
}
