package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.ky;
import defpackage.p01;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ThumbNode extends Modifier.Node implements LayoutModifierNode {
    private FiniteAnimationSpec<Float> animationSpec;
    private boolean checked;
    private float initialOffset = Float.NaN;
    private float initialSize = Float.NaN;
    private InteractionSource interactionSource;
    private boolean isPressed;
    private Animatable<Float, AnimationVector1D> offsetAnim;
    private Animatable<Float, AnimationVector1D> sizeAnim;

    public ThumbNode(InteractionSource interactionSource, boolean z, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.interactionSource = interactionSource;
        this.checked = z;
        this.animationSpec = finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable placeable, ThumbNode thumbNode, float f, Placeable.PlacementScope placementScope) {
        Animatable<Float, AnimationVector1D> animatable = thumbNode.offsetAnim;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, animatable != null ? (int) animatable.getValue().floatValue() : (int) f, 0, 0.0f, 4, null);
        return w01.a;
    }

    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        float f;
        float f2;
        float f3;
        float mo367toPx0680j_4 = measureScope.mo367toPx0680j_4(this.isPressed ? SwitchTokens.INSTANCE.m3689getPressedHandleWidthD9Ej5fM() : ((measurable.maxIntrinsicHeight(Constraints.m7564getMaxWidthimpl(j)) != 0 && measurable.maxIntrinsicWidth(Constraints.m7563getMaxHeightimpl(j)) != 0) || this.checked) ? SwitchKt.getThumbDiameter() : SwitchKt.getUncheckedThumbDiameter());
        Animatable<Float, AnimationVector1D> animatable = this.sizeAnim;
        int floatValue = (int) (animatable != null ? animatable.getValue().floatValue() : mo367toPx0680j_4);
        final Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(floatValue, floatValue));
        f = SwitchKt.SwitchHeight;
        final float mo367toPx0680j_42 = measureScope.mo367toPx0680j_4(Dp.m7611constructorimpl(Dp.m7611constructorimpl(f - measureScope.mo363toDpu2uoSUM(mo367toPx0680j_4)) / 2.0f));
        f2 = SwitchKt.SwitchWidth;
        float m7611constructorimpl = Dp.m7611constructorimpl(f2 - SwitchKt.getThumbDiameter());
        f3 = SwitchKt.ThumbPadding;
        float mo367toPx0680j_43 = measureScope.mo367toPx0680j_4(Dp.m7611constructorimpl(m7611constructorimpl - f3));
        boolean z = this.isPressed;
        if (z && this.checked) {
            mo367toPx0680j_42 = mo367toPx0680j_43 - measureScope.mo367toPx0680j_4(SwitchTokens.INSTANCE.m3695getTrackOutlineWidthD9Ej5fM());
        } else if (z && !this.checked) {
            mo367toPx0680j_42 = measureScope.mo367toPx0680j_4(SwitchTokens.INSTANCE.m3695getTrackOutlineWidthD9Ej5fM());
        } else if (this.checked) {
            mo367toPx0680j_42 = mo367toPx0680j_43;
        }
        Animatable<Float, AnimationVector1D> animatable2 = this.sizeAnim;
        Float targetValue = animatable2 != null ? animatable2.getTargetValue() : null;
        if (targetValue == null || targetValue.floatValue() != mo367toPx0680j_4) {
            p01.t(getCoroutineScope(), null, null, new ThumbNode$measure$1(this, mo367toPx0680j_4, null), 3);
        }
        Animatable<Float, AnimationVector1D> animatable3 = this.offsetAnim;
        Float targetValue2 = animatable3 != null ? animatable3.getTargetValue() : null;
        if (targetValue2 == null || targetValue2.floatValue() != mo367toPx0680j_42) {
            p01.t(getCoroutineScope(), null, null, new ThumbNode$measure$2(this, mo367toPx0680j_42, null), 3);
        }
        if (Float.isNaN(this.initialSize) && Float.isNaN(this.initialOffset)) {
            this.initialSize = mo367toPx0680j_4;
            this.initialOffset = mo367toPx0680j_42;
        }
        return MeasureScope.layout$default(measureScope, floatValue, floatValue, null, new ky() { // from class: androidx.compose.material3.m1
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$0;
                measure_3p2s80s$lambda$0 = ThumbNode.measure_3p2s80s$lambda$0(Placeable.this, this, mo367toPx0680j_42, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        p01.t(getCoroutineScope(), null, null, new ThumbNode$onAttach$1(this, null), 3);
    }

    public final void setAnimationSpec(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.animationSpec = finiteAnimationSpec;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public final void setInteractionSource(InteractionSource interactionSource) {
        this.interactionSource = interactionSource;
    }

    public final void update() {
        if (this.sizeAnim == null && !Float.isNaN(this.initialSize)) {
            this.sizeAnim = AnimatableKt.Animatable$default(this.initialSize, 0.0f, 2, null);
        }
        if (this.offsetAnim != null || Float.isNaN(this.initialOffset)) {
            return;
        }
        this.offsetAnim = AnimatableKt.Animatable$default(this.initialOffset, 0.0f, 2, null);
    }
}
