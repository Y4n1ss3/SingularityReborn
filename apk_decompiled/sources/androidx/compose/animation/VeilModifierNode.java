package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class VeilModifierNode extends Modifier.Node implements DrawModifierNode {
    private EnterTransition enter;
    private ExitTransition exit;
    private Transition<EnterExitState> transition;
    private Transition<EnterExitState>.DeferredAnimation<Color, AnimationVector4D> veilAnimation;

    public VeilModifierNode(Transition<EnterExitState> transition, Transition<EnterExitState>.DeferredAnimation<Color, AnimationVector4D> deferredAnimation, EnterTransition enterTransition, ExitTransition exitTransition) {
        this.transition = transition;
        this.veilAnimation = deferredAnimation;
        this.enter = enterTransition;
        this.exit = exitTransition;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        long m4594getZeroNHjbRc;
        contentDrawScope.drawContent();
        State<Color> animate = this.veilAnimation.animate(new VeilModifierNode$draw$veilColor$1(this), new VeilModifierNode$draw$veilColor$2(this));
        if (Color.m4763getAlphaimpl(animate.getValue().m4771unboximpl()) == 0.0f) {
            return;
        }
        Veil veil = this.enter.getData$animation().getVeil();
        if (veil == null) {
            veil = this.exit.getData$animation().getVeil();
        }
        if (veil == null || !veil.getMatchParentSize()) {
            DrawScope.m5329drawRectnJ9OG0$default(contentDrawScope, animate.getValue().m4771unboximpl(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            return;
        }
        LayoutCoordinates requireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(this);
        LayoutCoordinates parentLayoutCoordinates = requireLayoutCoordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            long mo6242getSizeYbymL2g = parentLayoutCoordinates.mo6242getSizeYbymL2g();
            m4594getZeroNHjbRc = Size.m4576constructorimpl((Float.floatToRawIntBits((int) (mo6242getSizeYbymL2g & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (mo6242getSizeYbymL2g >> 32)) << 32));
        } else {
            m4594getZeroNHjbRc = Size.Companion.m4594getZeroNHjbRc();
        }
        DrawScope.m5329drawRectnJ9OG0$default(contentDrawScope, animate.getValue().m4771unboximpl(), Offset.m4508constructorimpl((-9223372034707292160L) ^ LayoutCoordinatesKt.positionInParent(requireLayoutCoordinates)), m4594getZeroNHjbRc, 0.0f, null, null, 0, 120, null);
    }

    public final EnterTransition getEnter() {
        return this.enter;
    }

    public final ExitTransition getExit() {
        return this.exit;
    }

    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public final Transition<EnterExitState>.DeferredAnimation<Color, AnimationVector4D> getVeilAnimation() {
        return this.veilAnimation;
    }

    public final void setEnter(EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    public final void setExit(ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    public final void setTransition(Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    public final void setVeilAnimation(Transition<EnterExitState>.DeferredAnimation<Color, AnimationVector4D> deferredAnimation) {
        this.veilAnimation = deferredAnimation;
    }
}
