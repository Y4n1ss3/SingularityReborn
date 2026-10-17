package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.hm;
import defpackage.kf0;
import defpackage.ky;
import defpackage.o;
import defpackage.p01;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {
    private z10 animationJob;
    private final MutableState animationMode$delegate;
    private final MutableIntState containerWidth$delegate;
    private final MutableIntState contentWidth$delegate;
    private int delayMillis;
    private final MutableState hasFocus$delegate;
    private int initialDelayMillis;
    private int iterations;
    private GraphicsLayer marqueeLayer;
    private final Animatable<Float, AnimationVector1D> offset;
    private final MutableState spacing$delegate;
    private final State spacingPx$delegate;
    private float velocity;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private MarqueeModifierNode(int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f) {
        this.iterations = i;
        this.delayMillis = i3;
        this.initialDelayMillis = i4;
        this.velocity = f;
        this.contentWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.containerWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.spacing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(marqueeSpacing, null, 2, null);
        this.animationMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.m297boximpl(i2), null, 2, null);
        this.offset = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.spacingPx$delegate = SnapshotStateKt.derivedStateOf(new c(1, marqueeSpacing, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 draw$lambda$0$0(ContentDrawScope contentDrawScope, DrawScope drawScope) {
        contentDrawScope.drawContent();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContainerWidth() {
        return this.containerWidth$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContentWidth() {
        return this.contentWidth$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSpacingPx() {
        return ((Number) this.spacingPx$delegate.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, (ky) null, 12, (Object) null);
        return w01.a;
    }

    private final void restartAnimation() {
        z10 z10Var = this.animationJob;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
        if (isAttached()) {
            this.animationJob = p01.t(getCoroutineScope(), null, null, new MarqueeModifierNode$restartAnimation$1(z10Var, this, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(hm hmVar) {
        int i = this.iterations;
        w01 w01Var = w01.a;
        if (i <= 0) {
            return w01Var;
        }
        Object H = p01.H(FixedMotionDurationScale.INSTANCE, new MarqueeModifierNode$runAnimation$2(this, null), hmVar);
        return H == vn.d ? H : w01Var;
    }

    private final void setContainerWidth(int i) {
        this.containerWidth$delegate.setIntValue(i);
    }

    private final void setContentWidth(int i) {
        this.contentWidth$delegate.setIntValue(i);
    }

    private final void setHasFocus(boolean z) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int spacingPx_delegate$lambda$0(MarqueeSpacing marqueeSpacing, MarqueeModifierNode marqueeModifierNode) {
        return marqueeSpacing.calculateSpacing(DelegatableNodeKt.requireDensity(marqueeModifierNode), marqueeModifierNode.getContentWidth(), marqueeModifierNode.getContainerWidth());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    @Override // androidx.compose.ui.node.DrawModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(ContentDrawScope contentDrawScope) {
        float contentWidth;
        float floatValue;
        int containerWidth;
        GraphicsLayer graphicsLayer;
        DrawContext drawContext;
        GraphicsLayer graphicsLayer2;
        int i = 1;
        if (Dp.m7610compareTo0680j_4(this.velocity, Dp.m7611constructorimpl(0.0f)) > 0) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[contentDrawScope.getLayoutDirection().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    o.n();
                    return;
                }
                floatValue = (-this.offset.getValue().floatValue()) + (getContentWidth() * 2) + getSpacingPx();
                containerWidth = getContainerWidth();
                contentWidth = floatValue - containerWidth;
                boolean z = contentWidth >= ((float) getContentWidth());
                boolean z2 = ((float) getContainerWidth()) + contentWidth > ((float) (getContentWidth() + getSpacingPx()));
                float contentWidth2 = getContentWidth() + getSpacingPx();
                float intBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() & 4294967295L));
                graphicsLayer = this.marqueeLayer;
                if (graphicsLayer != null) {
                    contentDrawScope.mo5336recordJVtK1S4(graphicsLayer, IntSize.m7777constructorimpl((getContentWidth() << 32) | (y80.P(intBitsToFloat) & 4294967295L)), new d(contentDrawScope, i));
                }
                float containerWidth2 = getContainerWidth();
                float intBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() & 4294967295L));
                int m4750getIntersectrtfAjoo = ClipOp.Companion.m4750getIntersectrtfAjoo();
                drawContext = contentDrawScope.getDrawContext();
                long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo5259clipRectN_I0leg(0.0f, 0.0f, containerWidth2, intBitsToFloat2, m4750getIntersectrtfAjoo);
                    float f = -contentWidth;
                    contentDrawScope.getDrawContext().getTransform().translate(f, 0.0f);
                    try {
                        graphicsLayer2 = this.marqueeLayer;
                        if (graphicsLayer2 == null) {
                            if (z) {
                                GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer2);
                            }
                            if (z2) {
                                contentDrawScope.getDrawContext().getTransform().translate(contentWidth2, 0.0f);
                                try {
                                    GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer2);
                                    contentDrawScope.getDrawContext().getTransform().translate(-contentWidth2, -0.0f);
                                } finally {
                                }
                            }
                            contentDrawScope.getDrawContext().getTransform().translate(-f, -0.0f);
                            return;
                        }
                        if (z) {
                            contentDrawScope.drawContent();
                        }
                        if (z2) {
                            contentDrawScope.getDrawContext().getTransform().translate(contentWidth2, 0.0f);
                            try {
                                contentDrawScope.drawContent();
                                contentDrawScope.getDrawContext().getTransform().translate(-contentWidth2, -0.0f);
                            } finally {
                            }
                        }
                        contentDrawScope.getDrawContext().getTransform().translate(-f, -0.0f);
                        return;
                    } catch (Throwable th) {
                        contentDrawScope.getDrawContext().getTransform().translate(-f, -0.0f);
                        throw th;
                    }
                } finally {
                    kf0.g(drawContext, mo5256getSizeNHjbRc);
                }
            }
            contentWidth = this.offset.getValue().floatValue();
            if (contentWidth >= ((float) getContentWidth())) {
            }
            if (((float) getContainerWidth()) + contentWidth > ((float) (getContentWidth() + getSpacingPx()))) {
            }
            float contentWidth22 = getContentWidth() + getSpacingPx();
            float intBitsToFloat3 = Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() & 4294967295L));
            graphicsLayer = this.marqueeLayer;
            if (graphicsLayer != null) {
            }
            float containerWidth22 = getContainerWidth();
            float intBitsToFloat22 = Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() & 4294967295L));
            int m4750getIntersectrtfAjoo2 = ClipOp.Companion.m4750getIntersectrtfAjoo();
            drawContext = contentDrawScope.getDrawContext();
            long mo5256getSizeNHjbRc2 = drawContext.mo5256getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo5259clipRectN_I0leg(0.0f, 0.0f, containerWidth22, intBitsToFloat22, m4750getIntersectrtfAjoo2);
            float f2 = -contentWidth;
            contentDrawScope.getDrawContext().getTransform().translate(f2, 0.0f);
            graphicsLayer2 = this.marqueeLayer;
            if (graphicsLayer2 == null) {
            }
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$0[contentDrawScope.getLayoutDirection().ordinal()];
            if (i3 == 1) {
                contentWidth = (-this.offset.getValue().floatValue()) + getContentWidth() + getSpacingPx();
                if (contentWidth >= ((float) getContentWidth())) {
                }
                if (((float) getContainerWidth()) + contentWidth > ((float) (getContentWidth() + getSpacingPx()))) {
                }
                float contentWidth222 = getContentWidth() + getSpacingPx();
                float intBitsToFloat32 = Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() & 4294967295L));
                graphicsLayer = this.marqueeLayer;
                if (graphicsLayer != null) {
                }
                float containerWidth222 = getContainerWidth();
                float intBitsToFloat222 = Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() & 4294967295L));
                int m4750getIntersectrtfAjoo22 = ClipOp.Companion.m4750getIntersectrtfAjoo();
                drawContext = contentDrawScope.getDrawContext();
                long mo5256getSizeNHjbRc22 = drawContext.mo5256getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo5259clipRectN_I0leg(0.0f, 0.0f, containerWidth222, intBitsToFloat222, m4750getIntersectrtfAjoo22);
                float f22 = -contentWidth;
                contentDrawScope.getDrawContext().getTransform().translate(f22, 0.0f);
                graphicsLayer2 = this.marqueeLayer;
                if (graphicsLayer2 == null) {
                }
            } else {
                if (i3 != 2) {
                    o.n();
                    return;
                }
                floatValue = this.offset.getValue().floatValue() + getContentWidth();
                containerWidth = getContainerWidth();
                contentWidth = floatValue - containerWidth;
                if (contentWidth >= ((float) getContentWidth())) {
                }
                if (((float) getContainerWidth()) + contentWidth > ((float) (getContentWidth() + getSpacingPx()))) {
                }
                float contentWidth2222 = getContentWidth() + getSpacingPx();
                float intBitsToFloat322 = Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() & 4294967295L));
                graphicsLayer = this.marqueeLayer;
                if (graphicsLayer != null) {
                }
                float containerWidth2222 = getContainerWidth();
                float intBitsToFloat2222 = Float.intBitsToFloat((int) (contentDrawScope.mo5335getSizeNHjbRc() & 4294967295L));
                int m4750getIntersectrtfAjoo222 = ClipOp.Companion.m4750getIntersectrtfAjoo();
                drawContext = contentDrawScope.getDrawContext();
                long mo5256getSizeNHjbRc222 = drawContext.mo5256getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo5259clipRectN_I0leg(0.0f, 0.0f, containerWidth2222, intBitsToFloat2222, m4750getIntersectrtfAjoo222);
                float f222 = -contentWidth;
                contentDrawScope.getDrawContext().getTransform().translate(f222, 0.0f);
                graphicsLayer2 = this.marqueeLayer;
                if (graphicsLayer2 == null) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getAnimationMode-ZbEOnfQ, reason: not valid java name */
    public final int m311getAnimationModeZbEOnfQ() {
        return ((MarqueeAnimationMode) this.animationMode$delegate.getValue()).m303unboximpl();
    }

    public final MarqueeSpacing getSpacing() {
        return (MarqueeSpacing) this.spacing$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        setContainerWidth(ConstraintsKt.m7581constrainWidthK40F9xA(j, mo6234measureBRTryo0.getWidth()));
        setContentWidth(mo6234measureBRTryo0.getWidth());
        return MeasureScope.layout$default(measureScope, getContainerWidth(), mo6234measureBRTryo0.getHeight(), null, new d(mo6234measureBRTryo0, 2), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return 0;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        GraphicsContext requireGraphicsContext = DelegatableNodeKt.requireGraphicsContext(this);
        if (graphicsLayer != null) {
            requireGraphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
        this.marqueeLayer = requireGraphicsContext.createGraphicsLayer();
        restartAnimation();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        z10 z10Var = this.animationJob;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
        this.animationJob = null;
        GraphicsLayer graphicsLayer = this.marqueeLayer;
        if (graphicsLayer != null) {
            DelegatableNodeKt.requireGraphicsContext(this).releaseGraphicsLayer(graphicsLayer);
            this.marqueeLayer = null;
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        setHasFocus(focusState.getHasFocus());
    }

    /* renamed from: setAnimationMode-97h66l8, reason: not valid java name */
    public final void m312setAnimationMode97h66l8(int i) {
        this.animationMode$delegate.setValue(MarqueeAnimationMode.m297boximpl(i));
    }

    public final void setSpacing(MarqueeSpacing marqueeSpacing) {
        this.spacing$delegate.setValue(marqueeSpacing);
    }

    /* renamed from: update-lWfNwf4, reason: not valid java name */
    public final void m313updatelWfNwf4(int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f) {
        setSpacing(marqueeSpacing);
        m312setAnimationMode97h66l8(i2);
        if (this.iterations == i && this.delayMillis == i3 && this.initialDelayMillis == i4 && Dp.m7616equalsimpl0(this.velocity, f)) {
            return;
        }
        this.iterations = i;
        this.delayMillis = i3;
        this.initialDelayMillis = i4;
        this.velocity = f;
        restartAnimation();
    }

    public /* synthetic */ MarqueeModifierNode(int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f, dq dqVar) {
        this(i, i2, i3, i4, marqueeSpacing, f);
    }
}
