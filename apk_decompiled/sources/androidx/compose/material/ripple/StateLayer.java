package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.iy;
import defpackage.kf0;
import defpackage.p01;
import defpackage.q10;
import defpackage.un;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class StateLayer {
    private final boolean bounded;
    private Interaction currentInteraction;
    private final iy rippleAlpha;
    private final Animatable<Float, AnimationVector1D> animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
    private final List<Interaction> interactions = new ArrayList();

    public StateLayer(boolean z, iy iyVar) {
        this.bounded = z;
        this.rippleAlpha = iyVar;
    }

    /* renamed from: drawStateLayer-mxwnekA, reason: not valid java name */
    public final void m1589drawStateLayermxwnekA(DrawScope drawScope, float f, long j) {
        float floatValue = this.animatedAlpha.getValue().floatValue();
        if (floatValue > 0.0f) {
            long m4760copywmQWz5c$default = Color.m4760copywmQWz5c$default(j, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.bounded) {
                DrawScope.m5316drawCircleVaOC9Bg$default(drawScope, m4760copywmQWz5c$default, f, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float m4585getWidthimpl = Size.m4585getWidthimpl(drawScope.mo5335getSizeNHjbRc());
            float m4582getHeightimpl = Size.m4582getHeightimpl(drawScope.mo5335getSizeNHjbRc());
            int m4750getIntersectrtfAjoo = ClipOp.Companion.m4750getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo5259clipRectN_I0leg(0.0f, 0.0f, m4585getWidthimpl, m4582getHeightimpl, m4750getIntersectrtfAjoo);
                DrawScope.m5316drawCircleVaOC9Bg$default(drawScope, m4760copywmQWz5c$default, f, 0L, 0.0f, null, null, 0, 124, null);
            } finally {
                kf0.g(drawContext, mo5256getSizeNHjbRc);
            }
        }
    }

    public final void handleInteraction$material_ripple(Interaction interaction, un unVar) {
        AnimationSpec outgoingStateLayerAnimationSpecFor;
        AnimationSpec incomingStateLayerAnimationSpecFor;
        if (interaction instanceof HoverInteraction.Enter) {
            this.interactions.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.interactions.remove(((HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction.Focus) {
            this.interactions.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.interactions.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction.Start) {
            this.interactions.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            this.interactions.remove(((DragInteraction.Stop) interaction).getStart());
        } else if (!(interaction instanceof DragInteraction.Cancel)) {
            return;
        } else {
            this.interactions.remove(((DragInteraction.Cancel) interaction).getStart());
        }
        Interaction interaction2 = (Interaction) yi.w0(this.interactions);
        if (q10.b(this.currentInteraction, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            RippleAlpha rippleAlpha = (RippleAlpha) this.rippleAlpha.invoke();
            float hoveredAlpha = interaction2 instanceof HoverInteraction.Enter ? rippleAlpha.getHoveredAlpha() : interaction2 instanceof FocusInteraction.Focus ? rippleAlpha.getFocusedAlpha() : interaction2 instanceof DragInteraction.Start ? rippleAlpha.getDraggedAlpha() : 0.0f;
            incomingStateLayerAnimationSpecFor = RippleKt.incomingStateLayerAnimationSpecFor(interaction2);
            p01.t(unVar, null, null, new StateLayer$handleInteraction$1(this, hoveredAlpha, incomingStateLayerAnimationSpecFor, null), 3);
        } else {
            outgoingStateLayerAnimationSpecFor = RippleKt.outgoingStateLayerAnimationSpecFor(this.currentInteraction);
            p01.t(unVar, null, null, new StateLayer$handleInteraction$2(this, outgoingStateLayerAnimationSpecFor, null), 3);
        }
        this.currentInteraction = interaction2;
    }
}
