package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.iy;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {
    private Alignment currentAlignment;
    private EnterTransition enter;
    private ExitTransition exit;
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;
    private iy isEnabled;
    private boolean lookaheadConstraintsAvailable;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;
    private Transition<EnterExitState> transition;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();
    private long lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final ky sizeTransitionSpec = new EnterExitTransitionModifierNode$sizeTransitionSpec$1(this);
    private final ky slideSpec = new EnterExitTransitionModifierNode$slideSpec$1(this);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EnterExitTransitionModifierNode(Transition<EnterExitState> transition, Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, iy iyVar, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.isEnabled = iyVar;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    /* renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m69setLookaheadConstraintsBRTryo0(long j) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j;
    }

    public final Alignment getAlignment() {
        Alignment alignment;
        Alignment alignment2;
        if (this.transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            ChangeSize changeSize = this.enter.getData$animation().getChangeSize();
            if (changeSize != null && (alignment2 = changeSize.getAlignment()) != null) {
                return alignment2;
            }
            ChangeSize changeSize2 = this.exit.getData$animation().getChangeSize();
            if (changeSize2 != null) {
                return changeSize2.getAlignment();
            }
            return null;
        }
        ChangeSize changeSize3 = this.exit.getData$animation().getChangeSize();
        if (changeSize3 != null && (alignment = changeSize3.getAlignment()) != null) {
            return alignment;
        }
        ChangeSize changeSize4 = this.enter.getData$animation().getChangeSize();
        if (changeSize4 != null) {
            return changeSize4.getAlignment();
        }
        return null;
    }

    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    public final EnterTransition getEnter() {
        return this.enter;
    }

    public final ExitTransition getExit() {
        return this.exit;
    }

    public final GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    public final ky getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getSlideAnimation() {
        return this.slideAnimation;
    }

    public final ky getSlideSpec() {
        return this.slideSpec;
    }

    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public final iy isEnabled() {
        return this.isEnabled;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        State<IntOffset> animate;
        State<IntOffset> animate2;
        if (this.transition.getCurrentState() == this.transition.getTargetState()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            Alignment alignment = getAlignment();
            if (alignment == null) {
                alignment = Alignment.Companion.getTopStart();
            }
            this.currentAlignment = alignment;
        }
        if (measureScope.isLookingAhead()) {
            Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
            long m7777constructorimpl = IntSize.m7777constructorimpl((mo6234measureBRTryo0.getWidth() << 32) | (mo6234measureBRTryo0.getHeight() & 4294967295L));
            this.lookaheadSize = m7777constructorimpl;
            m69setLookaheadConstraintsBRTryo0(j);
            return MeasureScope.layout$default(measureScope, (int) (m7777constructorimpl >> 32), (int) (m7777constructorimpl & 4294967295L), null, new EnterExitTransitionModifierNode$measure$1(mo6234measureBRTryo0), 4, null);
        }
        if (!((Boolean) this.isEnabled.invoke()).booleanValue()) {
            Placeable mo6234measureBRTryo02 = measurable.mo6234measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, mo6234measureBRTryo02.getWidth(), mo6234measureBRTryo02.getHeight(), null, new EnterExitTransitionModifierNode$measure$3$1(mo6234measureBRTryo02), 4, null);
        }
        ky init = this.graphicsLayerBlock.init();
        Placeable mo6234measureBRTryo03 = measurable.mo6234measureBRTryo0(j);
        long m7777constructorimpl2 = IntSize.m7777constructorimpl((mo6234measureBRTryo03.getWidth() << 32) | (mo6234measureBRTryo03.getHeight() & 4294967295L));
        long j2 = AnimationModifierKt.m37isValidozmzZPI(this.lookaheadSize) ? this.lookaheadSize : m7777constructorimpl2;
        Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
        State<IntSize> animate3 = deferredAnimation != null ? deferredAnimation.animate(this.sizeTransitionSpec, new EnterExitTransitionModifierNode$measure$animSize$1(this, j2)) : null;
        if (animate3 != null) {
            m7777constructorimpl2 = animate3.getValue().m7786unboximpl();
        }
        long m7578constrain4WqzIAM = ConstraintsKt.m7578constrain4WqzIAM(j, m7777constructorimpl2);
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        long m7750getZeronOccac = (deferredAnimation2 == null || (animate2 = deferredAnimation2.animate(EnterExitTransitionModifierNode$measure$offsetDelta$1.INSTANCE, new EnterExitTransitionModifierNode$measure$offsetDelta$2(this, j2))) == null) ? IntOffset.Companion.m7750getZeronOccac() : animate2.getValue().m7748unboximpl();
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        long m7750getZeronOccac2 = (deferredAnimation3 == null || (animate = deferredAnimation3.animate(this.slideSpec, new EnterExitTransitionModifierNode$measure$slideOffset$1(this, j2))) == null) ? IntOffset.Companion.m7750getZeronOccac() : animate.getValue().m7748unboximpl();
        Alignment alignment2 = this.currentAlignment;
        return MeasureScope.layout$default(measureScope, (int) (m7578constrain4WqzIAM >> 32), (int) (m7578constrain4WqzIAM & 4294967295L), null, new EnterExitTransitionModifierNode$measure$2(mo6234measureBRTryo03, IntOffset.m7743plusqkQi6aY(alignment2 != null ? alignment2.mo4178alignKFBX0sM(j2, m7578constrain4WqzIAM, LayoutDirection.Ltr) : IntOffset.Companion.m7750getZeronOccac(), m7750getZeronOccac2), m7750getZeronOccac, init), 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
    }

    public final void setCurrentAlignment(Alignment alignment) {
        this.currentAlignment = alignment;
    }

    public final void setEnabled(iy iyVar) {
        this.isEnabled = iyVar;
    }

    public final void setEnter(EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    public final void setExit(ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    public final void setGraphicsLayerBlock(GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public final void setOffsetAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.offsetAnimation = deferredAnimation;
    }

    public final void setSizeAnimation(Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
        this.sizeAnimation = deferredAnimation;
    }

    public final void setSlideAnimation(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.slideAnimation = deferredAnimation;
    }

    public final void setTransition(Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    /* renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m70sizeByStateUzc_VyU(EnterExitState enterExitState, long j) {
        ky size;
        ky size2;
        int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ChangeSize changeSize = this.enter.getData$animation().getChangeSize();
                if (changeSize != null && (size = changeSize.getSize()) != null) {
                    return ((IntSize) size.invoke(IntSize.m7774boximpl(j))).m7786unboximpl();
                }
            } else {
                if (i != 3) {
                    o.n();
                    return 0L;
                }
                ChangeSize changeSize2 = this.exit.getData$animation().getChangeSize();
                if (changeSize2 != null && (size2 = changeSize2.getSize()) != null) {
                    return ((IntSize) size2.invoke(IntSize.m7774boximpl(j))).m7786unboximpl();
                }
            }
        }
        return j;
    }

    /* renamed from: slideTargetValueByState-oFUgxo0, reason: not valid java name */
    public final long m71slideTargetValueByStateoFUgxo0(EnterExitState enterExitState, long j) {
        ky slideOffset;
        ky slideOffset2;
        Slide slide = this.enter.getData$animation().getSlide();
        long m7750getZeronOccac = (slide == null || (slideOffset2 = slide.getSlideOffset()) == null) ? IntOffset.Companion.m7750getZeronOccac() : ((IntOffset) slideOffset2.invoke(IntSize.m7774boximpl(j))).m7748unboximpl();
        Slide slide2 = this.exit.getData$animation().getSlide();
        long m7750getZeronOccac2 = (slide2 == null || (slideOffset = slide2.getSlideOffset()) == null) ? IntOffset.Companion.m7750getZeronOccac() : ((IntOffset) slideOffset.invoke(IntSize.m7774boximpl(j))).m7748unboximpl();
        int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i == 1) {
            return IntOffset.Companion.m7750getZeronOccac();
        }
        if (i == 2) {
            return m7750getZeronOccac;
        }
        if (i == 3) {
            return m7750getZeronOccac2;
        }
        o.n();
        return 0L;
    }

    /* renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m72targetOffsetByStateoFUgxo0(EnterExitState enterExitState, long j) {
        if (this.currentAlignment == null) {
            return IntOffset.Companion.m7750getZeronOccac();
        }
        if (getAlignment() == null) {
            return IntOffset.Companion.m7750getZeronOccac();
        }
        if (q10.b(this.currentAlignment, getAlignment())) {
            return IntOffset.Companion.m7750getZeronOccac();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i == 1) {
            return IntOffset.Companion.m7750getZeronOccac();
        }
        if (i == 2) {
            return IntOffset.Companion.m7750getZeronOccac();
        }
        if (i != 3) {
            o.n();
            return 0L;
        }
        ChangeSize changeSize = this.exit.getData$animation().getChangeSize();
        if (changeSize == null) {
            return IntOffset.Companion.m7750getZeronOccac();
        }
        long m7786unboximpl = ((IntSize) changeSize.getSize().invoke(IntSize.m7774boximpl(j))).m7786unboximpl();
        Alignment alignment = getAlignment();
        alignment.getClass();
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        long mo4178alignKFBX0sM = alignment.mo4178alignKFBX0sM(j, m7786unboximpl, layoutDirection);
        Alignment alignment2 = this.currentAlignment;
        alignment2.getClass();
        return IntOffset.m7742minusqkQi6aY(mo4178alignKFBX0sM, alignment2.mo4178alignKFBX0sM(j, m7786unboximpl, layoutDirection));
    }
}
