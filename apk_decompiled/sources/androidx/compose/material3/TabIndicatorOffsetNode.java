package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fo0;
import defpackage.g5;
import defpackage.p01;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabIndicatorOffsetNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private FiniteAnimationSpec<Dp> animationSpec;
    private boolean followContentSize;
    private Dp initialOffset;
    private Dp initialWidth;
    private Animatable<Dp, AnimationVector1D> offsetAnimatable;
    private int selectedTabIndex;
    private State<? extends List<TabPosition>> tabPositionsState;
    private Animatable<Dp, AnimationVector1D> widthAnimatable;

    public TabIndicatorOffsetNode(State<? extends List<TabPosition>> state, int i, boolean z, FiniteAnimationSpec<Dp> finiteAnimationSpec) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i;
        this.followContentSize = z;
        this.animationSpec = finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable.PlacementScope placementScope) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$3(Placeable placeable, MeasureScope measureScope, float f, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, measureScope.mo361roundToPx0680j_4(f), 0, 0.0f, 4, null);
        return w01.a;
    }

    public final FiniteAnimationSpec<Dp> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final State<List<TabPosition>> getTabPositionsState() {
        return this.tabPositionsState;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        if (this.tabPositionsState.getValue().isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new fo0(12), 4, null);
        }
        boolean z = this.followContentSize;
        State<? extends List<TabPosition>> state = this.tabPositionsState;
        float m2500getContentWidthD9Ej5fM = z ? state.getValue().get(this.selectedTabIndex).m2500getContentWidthD9Ej5fM() : state.getValue().get(this.selectedTabIndex).m2503getWidthD9Ej5fM();
        Dp dp = this.initialWidth;
        if (dp != null) {
            Animatable<Dp, AnimationVector1D> animatable = this.widthAnimatable;
            if (animatable == null) {
                animatable = new Animatable<>(dp, VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
                this.widthAnimatable = animatable;
            }
            if (!Dp.m7616equalsimpl0(m2500getContentWidthD9Ej5fM, animatable.getTargetValue().m7625unboximpl())) {
                p01.t(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$2(animatable, m2500getContentWidthD9Ej5fM, this, null), 3);
            }
        } else {
            this.initialWidth = Dp.m7609boximpl(m2500getContentWidthD9Ej5fM);
        }
        float m2501getLeftD9Ej5fM = this.tabPositionsState.getValue().get(this.selectedTabIndex).m2501getLeftD9Ej5fM();
        Dp dp2 = this.initialOffset;
        if (dp2 != null) {
            Animatable<Dp, AnimationVector1D> animatable2 = this.offsetAnimatable;
            if (animatable2 == null) {
                Animatable<Dp, AnimationVector1D> animatable3 = new Animatable<>(dp2, VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
                this.offsetAnimatable = animatable3;
                animatable2 = animatable3;
            }
            if (!Dp.m7616equalsimpl0(m2501getLeftD9Ej5fM, animatable2.getTargetValue().m7625unboximpl())) {
                p01.t(getCoroutineScope(), null, null, new TabIndicatorOffsetNode$measure$3(animatable2, m2501getLeftD9Ej5fM, this, null), 3);
            }
        } else {
            this.initialOffset = Dp.m7609boximpl(m2501getLeftD9Ej5fM);
        }
        LayoutDirection layoutDirection = measureScope.getLayoutDirection();
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        Animatable<Dp, AnimationVector1D> animatable4 = this.offsetAnimatable;
        if (layoutDirection != layoutDirection2) {
            if (animatable4 != null) {
                m2501getLeftD9Ej5fM = animatable4.getValue().m7625unboximpl();
            }
            m2501getLeftD9Ej5fM = Dp.m7611constructorimpl(-m2501getLeftD9Ej5fM);
        } else if (animatable4 != null) {
            m2501getLeftD9Ej5fM = animatable4.getValue().m7625unboximpl();
        }
        Animatable<Dp, AnimationVector1D> animatable5 = this.widthAnimatable;
        if (animatable5 != null) {
            m2500getContentWidthD9Ej5fM = animatable5.getValue().m7625unboximpl();
        }
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, measureScope.mo361roundToPx0680j_4(m2500getContentWidthD9Ej5fM), measureScope.mo361roundToPx0680j_4(m2500getContentWidthD9Ej5fM), 0, 0, 12, null));
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new g5(mo6234measureBRTryo0, measureScope, m2501getLeftD9Ej5fM), 4, null);
    }

    public final void setAnimationSpec(FiniteAnimationSpec<Dp> finiteAnimationSpec) {
        this.animationSpec = finiteAnimationSpec;
    }

    public final void setFollowContentSize(boolean z) {
        this.followContentSize = z;
    }

    public final void setSelectedTabIndex(int i) {
        this.selectedTabIndex = i;
    }

    public final void setTabPositionsState(State<? extends List<TabPosition>> state) {
        this.tabPositionsState = state;
    }
}
