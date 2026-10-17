package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fb0;
import defpackage.ky;
import defpackage.q10;
import defpackage.ql0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {
    public static final int $stable = 8;
    private State<IntSize> animatedSize;
    private Alignment contentAlignment;
    private LayoutDirection layoutDirection;
    private final MutableState measuredSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m7774boximpl(IntSize.Companion.m7787getZeroYbymL2g()), null, 2, null);
    private final fb0 targetSizeMap;
    private final Transition<S> transition;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SizeModifierElement<S> extends ModifierNodeElement<SizeModifierNode<S>> {
        private final AnimatedContentTransitionScopeImpl<S> scope;
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private final State<SizeTransform> sizeTransform;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifierElement(Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, State<? extends SizeTransform> state, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
            this.scope = animatedContentTransitionScopeImpl;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public SizeModifierNode<S> create() {
            return new SizeModifierNode<>(this.sizeAnimation, this.sizeTransform, this.scope);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            if (!(obj instanceof SizeModifierElement)) {
                return false;
            }
            SizeModifierElement sizeModifierElement = (SizeModifierElement) obj;
            return q10.b(sizeModifierElement.sizeAnimation, this.sizeAnimation) && q10.b(sizeModifierElement.sizeTransform, this.sizeTransform);
        }

        public final AnimatedContentTransitionScopeImpl<S> getScope() {
            return this.scope;
        }

        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            int hashCode = this.scope.hashCode() * 31;
            Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
            return this.sizeTransform.hashCode() + ((hashCode + (deferredAnimation != null ? deferredAnimation.hashCode() : 0)) * 31);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("sizeTransform");
            inspectorInfo.getProperties().set("sizeAnimation", this.sizeAnimation);
            inspectorInfo.getProperties().set("sizeTransform", this.sizeTransform);
            inspectorInfo.getProperties().set("scope", this.scope);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(SizeModifierNode<S> sizeModifierNode) {
            sizeModifierNode.setSizeAnimation(this.sizeAnimation);
            sizeModifierNode.setSizeTransform(this.sizeTransform);
            sizeModifierNode.setScope(this.scope);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SizeModifierNode<S> extends LayoutModifierNodeWithPassThroughIntrinsics {
        private long lastSize;
        private AnimatedContentTransitionScopeImpl<S> scope;
        private Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private State<? extends SizeTransform> sizeTransform;

        public SizeModifierNode(Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, State<? extends SizeTransform> state, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            long j;
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
            this.scope = animatedContentTransitionScopeImpl;
            j = AnimatedContentKt.UnspecifiedSize;
            this.lastSize = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lastContinuousSizeOrDefault-mzRDjE0, reason: not valid java name */
        public final long m32lastContinuousSizeOrDefaultmzRDjE0(long j) {
            long j2;
            long j3 = this.lastSize;
            j2 = AnimatedContentKt.UnspecifiedSize;
            return IntSize.m7780equalsimpl0(j3, j2) ? j : this.lastSize;
        }

        public final AnimatedContentTransitionScopeImpl<S> getScope() {
            return this.scope;
        }

        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult mo33measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
            long m7786unboximpl;
            Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
            if (measureScope.isLookingAhead()) {
                m7786unboximpl = IntSize.m7777constructorimpl((mo6234measureBRTryo0.getWidth() << 32) | (mo6234measureBRTryo0.getHeight() & 4294967295L));
            } else if (this.sizeAnimation == null) {
                m7786unboximpl = IntSize.m7777constructorimpl((mo6234measureBRTryo0.getWidth() << 32) | (mo6234measureBRTryo0.getHeight() & 4294967295L));
                this.lastSize = IntSize.m7777constructorimpl((mo6234measureBRTryo0.getWidth() << 32) | (mo6234measureBRTryo0.getHeight() & 4294967295L));
            } else {
                long m7777constructorimpl = IntSize.m7777constructorimpl((mo6234measureBRTryo0.getWidth() << 32) | (mo6234measureBRTryo0.getHeight() & 4294967295L));
                Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
                deferredAnimation.getClass();
                State<IntSize> animate = deferredAnimation.animate(new AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1(this, m7777constructorimpl), new AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2(this, m7777constructorimpl));
                this.scope.setAnimatedSize$animation(animate);
                m7786unboximpl = animate.getValue().m7786unboximpl();
                this.lastSize = animate.getValue().m7786unboximpl();
            }
            return MeasureScope.layout$default(measureScope, (int) (m7786unboximpl >> 32), (int) (m7786unboximpl & 4294967295L), null, new AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1(this, mo6234measureBRTryo0, m7786unboximpl), 4, null);
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onReset() {
            long j;
            super.onReset();
            j = AnimatedContentKt.UnspecifiedSize;
            this.lastSize = j;
        }

        public final void setScope(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.scope = animatedContentTransitionScopeImpl;
        }

        public final void setSizeAnimation(Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
            this.sizeAnimation = deferredAnimation;
        }

        public final void setSizeTransform(State<? extends SizeTransform> state) {
            this.sizeTransform = state;
        }
    }

    public AnimatedContentTransitionScopeImpl(Transition<S> transition, Alignment alignment, LayoutDirection layoutDirection) {
        this.transition = transition;
        this.contentAlignment = alignment;
        this.layoutDirection = layoutDirection;
        long[] jArr = ql0.a;
        this.targetSizeMap = new fb0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffset-emnUabE, reason: not valid java name */
    public final long m25calculateOffsetemnUabE(long j, long j2) {
        return getContentAlignment().mo4178alignKFBX0sM(j, j2, LayoutDirection.Ltr);
    }

    private static final boolean createSizeAnimationModifier$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    public final long m26getCurrentSizeYbymL2g() {
        State<IntSize> state = this.animatedSize;
        return state != null ? state.getValue().m7786unboximpl() : m29getMeasuredSizeYbymL2g$animation();
    }

    /* renamed from: isLeft-gWo6LJ4, reason: not valid java name */
    private final boolean m27isLeftgWo6LJ4(int i) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (AnimatedContentTransitionScope.SlideDirection.m13equalsimpl0(i, companion.m19getLeftDKzdypw())) {
            return true;
        }
        if (AnimatedContentTransitionScope.SlideDirection.m13equalsimpl0(i, companion.m21getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr) {
            return true;
        }
        return AnimatedContentTransitionScope.SlideDirection.m13equalsimpl0(i, companion.m18getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl;
    }

    /* renamed from: isRight-gWo6LJ4, reason: not valid java name */
    private final boolean m28isRightgWo6LJ4(int i) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (AnimatedContentTransitionScope.SlideDirection.m13equalsimpl0(i, companion.m20getRightDKzdypw())) {
            return true;
        }
        if (AnimatedContentTransitionScope.SlideDirection.m13equalsimpl0(i, companion.m21getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl) {
            return true;
        }
        return AnimatedContentTransitionScope.SlideDirection.m13equalsimpl0(i, companion.m18getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr;
    }

    public final Modifier createSizeAnimationModifier$animation(ContentTransform contentTransform, Composer composer, int i) {
        Modifier modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93755870, i, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:557)");
        }
        boolean changed = composer.changed(this);
        Object rememberedValue = composer.rememberedValue();
        Transition.DeferredAnimation deferredAnimation = null;
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (q10.b(this.transition.getCurrentState(), this.transition.getTargetState())) {
            createSizeAnimationModifier$lambda$2(mutableState, false);
        } else if (rememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$2(mutableState, true);
        }
        if (createSizeAnimationModifier$lambda$1(mutableState)) {
            composer.startReplaceGroup(1353077497);
            deferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.Companion), null, composer, 0, 2);
            boolean changed2 = composer.changed(deferredAnimation);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) rememberUpdatedState.getValue();
                rememberedValue2 = (sizeTransform == null || sizeTransform.getClip()) ? ClipKt.clipToBounds(Modifier.Companion) : Modifier.Companion;
                composer.updateRememberedValue(rememberedValue2);
            }
            modifier = (Modifier) rememberedValue2;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1353343539);
            composer.endReplaceGroup();
            this.animatedSize = null;
            modifier = Modifier.Companion;
        }
        Modifier then = modifier.then(new SizeModifierElement(deferredAnimation, rememberUpdatedState, this));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return then;
    }

    public final State<IntSize> getAnimatedSize$animation() {
        return this.animatedSize;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    public final LayoutDirection getLayoutDirection$animation() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMeasuredSize-YbymL2g$animation, reason: not valid java name */
    public final long m29getMeasuredSizeYbymL2g$animation() {
        return ((IntSize) this.measuredSize$delegate.getValue()).m7786unboximpl();
    }

    public final fb0 getTargetSizeMap$animation() {
        return this.targetSizeMap;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    public final Transition<S> getTransition$animation() {
        return this.transition;
    }

    public final void setAnimatedSize$animation(State<IntSize> state) {
        this.animatedSize = state;
    }

    public void setContentAlignment(Alignment alignment) {
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation, reason: not valid java name */
    public final void m30setMeasuredSizeozmzZPI$animation(long j) {
        this.measuredSize$delegate.setValue(IntSize.m7774boximpl(j));
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideIntoContainer-mOhB8PU */
    public EnterTransition mo8slideIntoContainermOhB8PU(int i, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, ky kyVar) {
        if (m27isLeftgWo6LJ4(i)) {
            return EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$1(kyVar, this));
        }
        if (m28isRightgWo6LJ4(i)) {
            return EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$2(kyVar, this));
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        return AnimatedContentTransitionScope.SlideDirection.m13equalsimpl0(i, companion.m22getUpDKzdypw()) ? EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$3(kyVar, this)) : AnimatedContentTransitionScope.SlideDirection.m13equalsimpl0(i, companion.m17getDownDKzdypw()) ? EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$4(kyVar, this)) : EnterTransition.Companion.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideOutOfContainer-mOhB8PU */
    public ExitTransition mo9slideOutOfContainermOhB8PU(int i, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, ky kyVar) {
        if (m27isLeftgWo6LJ4(i)) {
            return EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$1(this, kyVar));
        }
        if (m28isRightgWo6LJ4(i)) {
            return EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$2(this, kyVar));
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        return AnimatedContentTransitionScope.SlideDirection.m13equalsimpl0(i, companion.m22getUpDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$3(this, kyVar)) : AnimatedContentTransitionScope.SlideDirection.m13equalsimpl0(i, companion.m17getDownDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$4(this, kyVar)) : ExitTransition.Companion.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform) {
        contentTransform.setSizeTransform$animation(sizeTransform);
        return contentTransform;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ChildData implements ParentDataModifier {
        public static final int $stable = 0;
        private final MutableState isTarget$delegate;

        public ChildData(boolean z) {
            this.isTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean isTarget() {
            return ((Boolean) this.isTarget$delegate.getValue()).booleanValue();
        }

        public final void setTarget(boolean z) {
            this.isTarget$delegate.setValue(Boolean.valueOf(z));
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public Object modifyParentData(Density density, Object obj) {
            return this;
        }
    }
}
