package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class GlowOverscrollNode extends DelegatingNode implements DrawModifierNode {
    private final EdgeEffectWrapper edgeEffectWrapper;
    private final PaddingValues glowDrawPadding;
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public GlowOverscrollNode(DelegatableNode delegatableNode, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper, PaddingValues paddingValues) {
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.glowDrawPadding = paddingValues;
        delegate(delegatableNode);
    }

    private final boolean drawBottomGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(this.glowDrawPadding.mo711calculateBottomPaddingD9Ej5fM());
        float f = -Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32));
        float f2 = (-Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L))) + mo367toPx0680j_4;
        return m282drawWithRotationAndOffsetubNVwUQ(180.0f, Offset.m4508constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), edgeEffect, canvas);
    }

    private final boolean drawLeftGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float f = -Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L));
        float mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(this.glowDrawPadding.mo712calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection()));
        return m282drawWithRotationAndOffsetubNVwUQ(270.0f, Offset.m4508constructorimpl((Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(mo367toPx0680j_4))), edgeEffect, canvas);
    }

    private final boolean drawRightGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(this.glowDrawPadding.mo713calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection())) + (-y80.P(Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32))));
        return m282drawWithRotationAndOffsetubNVwUQ(90.0f, Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(mo367toPx0680j_4) & 4294967295L)), edgeEffect, canvas);
    }

    private final boolean drawTopGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(this.glowDrawPadding.mo714calculateTopPaddingD9Ej5fM());
        return m282drawWithRotationAndOffsetubNVwUQ(0.0f, Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(mo367toPx0680j_4) & 4294967295L)), edgeEffect, canvas);
    }

    /* renamed from: drawWithRotationAndOffset-ubNVwUQ, reason: not valid java name */
    private final boolean m282drawWithRotationAndOffsetubNVwUQ(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.overscrollEffect.m208updateSizeuvyYCjk$foundation(contentDrawScope.mo5335getSizeNHjbRc());
        if (Size.m4587isEmptyimpl(contentDrawScope.mo5335getSizeNHjbRc())) {
            contentDrawScope.drawContent();
            return;
        }
        contentDrawScope.drawContent();
        this.overscrollEffect.getRedrawSignal$foundation().getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        boolean drawLeftGlow = edgeEffectWrapper.isLeftAnimating() ? drawLeftGlow(contentDrawScope, edgeEffectWrapper.getOrCreateLeftEffect(), nativeCanvas) : false;
        if (edgeEffectWrapper.isTopAnimating()) {
            drawLeftGlow = drawTopGlow(contentDrawScope, edgeEffectWrapper.getOrCreateTopEffect(), nativeCanvas) || drawLeftGlow;
        }
        if (edgeEffectWrapper.isRightAnimating()) {
            drawLeftGlow = drawRightGlow(contentDrawScope, edgeEffectWrapper.getOrCreateRightEffect(), nativeCanvas) || drawLeftGlow;
        }
        if (edgeEffectWrapper.isBottomAnimating()) {
            drawLeftGlow = drawBottomGlow(contentDrawScope, edgeEffectWrapper.getOrCreateBottomEffect(), nativeCanvas) || drawLeftGlow;
        }
        if (drawLeftGlow) {
            this.overscrollEffect.invalidateOverscroll$foundation();
        }
    }
}
