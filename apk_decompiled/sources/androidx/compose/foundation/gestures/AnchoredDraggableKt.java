package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.d1;
import defpackage.er;
import defpackage.gi0;
import defpackage.hm;
import defpackage.iy;
import defpackage.j50;
import defpackage.ky;
import defpackage.my;
import defpackage.p10;
import defpackage.r4;
import defpackage.s4;
import defpackage.ut;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnchoredDraggableKt {
    private static final String ConfigurationMovedToModifier = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to AnchoredDraggableDefaults.flingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.";
    private static final String ConfirmValueChangeDeprecated = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.";
    private static final boolean DEBUG = false;
    private static final String SettleWithVelocityDeprecated = "settle does not accept a velocity anymore. Please use FlingBehavior#performFling instead. See AnchoredDraggableSample.kt for example usages.";
    private static final String StartDragImmediatelyDeprecated = "startDragImmediately has been removed without replacement. Modifier.anchoredDraggable sets startDragImmediately to true by default when animations are running.";
    private static final ky AlwaysDrag = new d1(7);
    private static final ky GetOrNan = new d1(8);
    private static final float AnchoredDraggableMinFlingVelocity = Dp.m7611constructorimpl(125.0f);
    private static final DecayAnimationSpec<Float> NoOpDecayAnimationSpec = DecayAnimationSpecKt.generateDecayAnimationSpec(new FloatDecayAnimationSpec() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$NoOpDecayAnimationSpec$1
        private final float absVelocityThreshold;

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getAbsVelocityThreshold() {
            return this.absVelocityThreshold;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public long getDurationNanos(float f, float f2) {
            return 0L;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getTargetValue(float f, float f2) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getValueFromNanos(long j, float f, float f2) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getVelocityFromNanos(long j, float f, float f2) {
            return 0.0f;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AlwaysDrag$lambda$0(PointerType pointerType) {
        return true;
    }

    private static final <T> SnapLayoutInfoProvider AnchoredDraggableLayoutInfoProvider(final AnchoredDraggableState<T> anchoredDraggableState, final ky kyVar, final iy iyVar) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AnchoredDraggableLayoutInfoProvider$1
            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f, float f2) {
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f) {
                float requireOffset = anchoredDraggableState.requireOffset();
                Object computeTarget = AnchoredDraggableKt.computeTarget(anchoredDraggableState.getAnchors(), requireOffset, f, kyVar, iyVar);
                if (!((Boolean) anchoredDraggableState.getConfirmValueChange$foundation().invoke(computeTarget)).booleanValue()) {
                    computeTarget = anchoredDraggableState.getSettledValue();
                }
                return anchoredDraggableState.getAnchors().positionOf(computeTarget) - requireOffset;
            }
        };
    }

    @er
    public static final <T> AnchoredDraggableState<T> AnchoredDraggableState(T t, ky kyVar, iy iyVar, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, ky kyVar2) {
        AnchoredDraggableState<T> anchoredDraggableState = new AnchoredDraggableState<>(t, kyVar2);
        anchoredDraggableState.setPositionalThreshold$foundation(kyVar);
        anchoredDraggableState.setVelocityThreshold$foundation(iyVar);
        anchoredDraggableState.setSnapAnimationSpec$foundation(animationSpec);
        anchoredDraggableState.setDecayAnimationSpec$foundation(decayAnimationSpec);
        return anchoredDraggableState;
    }

    public static /* synthetic */ AnchoredDraggableState AnchoredDraggableState$default(Object obj, DraggableAnchors draggableAnchors, ky kyVar, iy iyVar, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, ky kyVar2, int i, Object obj2) {
        if ((i & 64) != 0) {
            kyVar2 = new d1(5);
        }
        return AnchoredDraggableState(obj, draggableAnchors, kyVar, iyVar, animationSpec, decayAnimationSpec, kyVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AnchoredDraggableState$lambda$0(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AnchoredDraggableState$lambda$2(Object obj) {
        return true;
    }

    public static final <T> DraggableAnchors<T> DraggableAnchors(ky kyVar) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        kyVar.invoke(draggableAnchorsConfig);
        return new DefaultDraggableAnchors(draggableAnchorsConfig.buildKeys$foundation(), draggableAnchorsConfig.buildPositions$foundation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float GetOrNan$lambda$0(int i) {
        return Float.NaN;
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, boolean z, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z2, Boolean.valueOf(z), mutableInteractionSource, null, overscrollEffect, flingBehavior, 32, null));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, boolean z, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z3, FlingBehavior flingBehavior, int i, Object obj) {
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        AnchoredDraggableState anchoredDraggableState2;
        boolean z4;
        Orientation orientation2;
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z5 = z2;
        MutableInteractionSource mutableInteractionSource2 = (i & 16) != 0 ? null : mutableInteractionSource;
        OverscrollEffect overscrollEffect2 = (i & 32) != 0 ? null : overscrollEffect;
        boolean isAnimationRunning = (i & 64) != 0 ? anchoredDraggableState.isAnimationRunning() : z3;
        if ((i & Fields.SpotShadowColor) != 0) {
            flingBehavior2 = null;
            modifier2 = modifier;
            z4 = z;
            orientation2 = orientation;
            anchoredDraggableState2 = anchoredDraggableState;
        } else {
            flingBehavior2 = flingBehavior;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            z4 = z;
            orientation2 = orientation;
        }
        return anchoredDraggable(modifier2, anchoredDraggableState2, z4, orientation2, z5, mutableInteractionSource2, overscrollEffect2, isAnimationRunning, flingBehavior2);
    }

    public static final <T> TargetedFlingBehavior anchoredDraggableFlingBehavior(AnchoredDraggableState<T> anchoredDraggableState, Density density, ky kyVar, AnimationSpec<Float> animationSpec) {
        return SnapFlingBehaviorKt.snapFlingBehavior(AnchoredDraggableLayoutInfoProvider(anchoredDraggableState, kyVar, new s4(density, 0)), NoOpDecayAnimationSpec, animationSpec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float anchoredDraggableFlingBehavior$lambda$0(Density density) {
        return density.mo367toPx0680j_4(Dp.m7611constructorimpl(125.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, float f, AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t, AnimationSpec<Float> animationSpec, hm hmVar) {
        Object animate;
        float positionOf = draggableAnchors.positionOf(t);
        gi0 gi0Var = new gi0();
        gi0Var.d = Float.isNaN(anchoredDraggableState.getOffset()) ? 0.0f : anchoredDraggableState.getOffset();
        if (!Float.isNaN(positionOf)) {
            float f2 = gi0Var.d;
            if (f2 != positionOf && (animate = SuspendAnimationKt.animate(f2, positionOf, f, animationSpec, new r4(0, anchoredDragScope, gi0Var), hmVar)) == vn.d) {
                return animate;
            }
        }
        return w01.a;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, AnimationSpec animationSpec, hm hmVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            animationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation() ? anchoredDraggableState.getSnapAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
        }
        return animateTo(anchoredDraggableState, obj, animationSpec, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 animateTo$lambda$0$1(AnchoredDragScope anchoredDragScope, gi0 gi0Var, float f, float f2) {
        anchoredDragScope.dragTo(f, f2);
        gi0Var.d = f;
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object animateToWithDecay(AnchoredDraggableState<T> anchoredDraggableState, T t, float f, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, hm hmVar) {
        AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$1;
        int i;
        float f2;
        gi0 gi0Var;
        if (hmVar instanceof AnchoredDraggableKt$animateToWithDecay$1) {
            anchoredDraggableKt$animateToWithDecay$1 = (AnchoredDraggableKt$animateToWithDecay$1) hmVar;
            int i2 = anchoredDraggableKt$animateToWithDecay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$animateToWithDecay$1.label = i2 - Integer.MIN_VALUE;
                AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$12 = anchoredDraggableKt$animateToWithDecay$1;
                Object obj = anchoredDraggableKt$animateToWithDecay$12.result;
                i = anchoredDraggableKt$animateToWithDecay$12.label;
                if (i != 0) {
                    p10.Q(obj);
                    gi0 gi0Var2 = new gi0();
                    gi0Var2.d = f;
                    AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(anchoredDraggableState, f, animationSpec, gi0Var2, decayAnimationSpec, null);
                    anchoredDraggableKt$animateToWithDecay$12.L$0 = gi0Var2;
                    anchoredDraggableKt$animateToWithDecay$12.F$0 = f;
                    anchoredDraggableKt$animateToWithDecay$12.label = 1;
                    Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, anchoredDraggableKt$animateToWithDecay$2, anchoredDraggableKt$animateToWithDecay$12, 2, null);
                    vn vnVar = vn.d;
                    if (anchoredDrag$default == vnVar) {
                        return vnVar;
                    }
                    f2 = f;
                    gi0Var = gi0Var2;
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f2 = anchoredDraggableKt$animateToWithDecay$12.F$0;
                    gi0Var = (gi0) anchoredDraggableKt$animateToWithDecay$12.L$0;
                    p10.Q(obj);
                }
                return new Float(f2 - gi0Var.d);
            }
        }
        anchoredDraggableKt$animateToWithDecay$1 = new AnchoredDraggableKt$animateToWithDecay$1(hmVar);
        AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$122 = anchoredDraggableKt$animateToWithDecay$1;
        Object obj2 = anchoredDraggableKt$animateToWithDecay$122.result;
        i = anchoredDraggableKt$animateToWithDecay$122.label;
        if (i != 0) {
        }
        return new Float(f2 - gi0Var.d);
    }

    public static /* synthetic */ Object animateToWithDecay$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, hm hmVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            animationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation() ? anchoredDraggableState.getSnapAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i & 8) != 0) {
            decayAnimationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation() ? anchoredDraggableState.getDecayAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getDecayAnimationSpec();
        }
        return animateToWithDecay(anchoredDraggableState, obj, f, animationSpec2, decayAnimationSpec, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> T computeTarget(DraggableAnchors<T> draggableAnchors, float f, float f2, ky kyVar, iy iyVar) {
        if (Float.isNaN(f)) {
            defpackage.o.m("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z = Math.abs(f2) > 0.0f;
        boolean z2 = z && f2 > 0.0f;
        if (!z) {
            T closestAnchor = draggableAnchors.closestAnchor(f);
            closestAnchor.getClass();
            return closestAnchor;
        }
        if (Math.abs(f2) >= Math.abs(((Number) iyVar.invoke()).floatValue())) {
            T closestAnchor2 = draggableAnchors.closestAnchor(f, z2);
            closestAnchor2.getClass();
            return closestAnchor2;
        }
        T closestAnchor3 = draggableAnchors.closestAnchor(f, false);
        closestAnchor3.getClass();
        float positionOf = draggableAnchors.positionOf(closestAnchor3);
        T closestAnchor4 = draggableAnchors.closestAnchor(f, true);
        closestAnchor4.getClass();
        float positionOf2 = draggableAnchors.positionOf(closestAnchor4);
        float abs = Math.abs(((Number) kyVar.invoke(Float.valueOf(Math.abs(positionOf - positionOf2)))).floatValue());
        if (!z2) {
            positionOf = positionOf2;
        }
        boolean z3 = Math.abs(positionOf - f) >= abs;
        if (z3) {
            return z2 ? closestAnchor4 : closestAnchor3;
        }
        if (z3) {
            defpackage.o.n();
            return null;
        }
        if (z2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> DefaultDraggableAnchors<T> emptyDraggableAnchors() {
        return new DefaultDraggableAnchors<>(ut.d, new float[0]);
    }

    public static final <T> void forEach(DraggableAnchors<T> draggableAnchors, my myVar) {
        int size = draggableAnchors.getSize();
        for (int i = 0; i < size; i++) {
            T anchorAt = draggableAnchors.anchorAt(i);
            if (anchorAt == null) {
                defpackage.o.c(j50.i(i, "There was no key at index ", ". Please report a bug."));
                return;
            }
            myVar.invoke(anchorAt, Float.valueOf(draggableAnchors.positionAt(i)));
        }
    }

    public static final float getAnchoredDraggableMinFlingVelocity() {
        return AnchoredDraggableMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <I> Object restartable(iy iyVar, my myVar, hm hmVar) {
        AnchoredDraggableKt$restartable$1 anchoredDraggableKt$restartable$1;
        int i;
        if (hmVar instanceof AnchoredDraggableKt$restartable$1) {
            anchoredDraggableKt$restartable$1 = (AnchoredDraggableKt$restartable$1) hmVar;
            int i2 = anchoredDraggableKt$restartable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$restartable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = anchoredDraggableKt$restartable$1.result;
                i = anchoredDraggableKt$restartable$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(iyVar, myVar, null);
                    anchoredDraggableKt$restartable$1.label = 1;
                    Object n = p10.n(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1);
                    vn vnVar = vn.d;
                    if (n == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return w01.a;
            }
        }
        anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(hmVar);
        Object obj2 = anchoredDraggableKt$restartable$1.result;
        i = anchoredDraggableKt$restartable$1.label;
        if (i != 0) {
        }
        return w01.a;
    }

    public static final <T> Object snapTo(AnchoredDraggableState<T> anchoredDraggableState, T t, hm hmVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new AnchoredDraggableKt$snapTo$2(null), hmVar, 2, null);
        return anchoredDrag$default == vn.d ? anchoredDrag$default : w01.a;
    }

    @er
    public static final <T> AnchoredDraggableState<T> AnchoredDraggableState(T t, DraggableAnchors<T> draggableAnchors, ky kyVar, iy iyVar, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, ky kyVar2) {
        AnchoredDraggableState<T> anchoredDraggableState = new AnchoredDraggableState<>(t, draggableAnchors, kyVar2);
        anchoredDraggableState.setPositionalThreshold$foundation(kyVar);
        anchoredDraggableState.setVelocityThreshold$foundation(iyVar);
        anchoredDraggableState.setSnapAnimationSpec$foundation(animationSpec);
        anchoredDraggableState.setDecayAnimationSpec$foundation(decayAnimationSpec);
        return anchoredDraggableState;
    }

    public static /* synthetic */ AnchoredDraggableState AnchoredDraggableState$default(Object obj, ky kyVar, iy iyVar, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, ky kyVar2, int i, Object obj2) {
        if ((i & 32) != 0) {
            kyVar2 = new d1(6);
        }
        return AnchoredDraggableState(obj, kyVar, iyVar, animationSpec, decayAnimationSpec, kyVar2);
    }

    private static final void debugLog(iy iyVar) {
    }

    @er
    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, boolean z, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z3, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z2, Boolean.valueOf(z), mutableInteractionSource, Boolean.valueOf(z3), overscrollEffect, flingBehavior));
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z, null, mutableInteractionSource, null, overscrollEffect, flingBehavior, 32, null));
    }

    @er
    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z2, FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z, null, mutableInteractionSource, Boolean.valueOf(z2), overscrollEffect, flingBehavior));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, boolean z, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, int i, Object obj) {
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        AnchoredDraggableState anchoredDraggableState2;
        boolean z3;
        Orientation orientation2;
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        MutableInteractionSource mutableInteractionSource2 = (i & 16) != 0 ? null : mutableInteractionSource;
        OverscrollEffect overscrollEffect2 = (i & 32) != 0 ? null : overscrollEffect;
        if ((i & 64) != 0) {
            flingBehavior2 = null;
            anchoredDraggableState2 = anchoredDraggableState;
            z3 = z;
            orientation2 = orientation;
            modifier2 = modifier;
        } else {
            flingBehavior2 = flingBehavior;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            z3 = z;
            orientation2 = orientation;
        }
        return anchoredDraggable(modifier2, anchoredDraggableState2, z3, orientation2, z4, mutableInteractionSource2, overscrollEffect2, flingBehavior2);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z, (i & 8) != 0 ? null : mutableInteractionSource, (i & 16) != 0 ? null : overscrollEffect, (i & 32) != 0 ? null : flingBehavior);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z2, FlingBehavior flingBehavior, int i, Object obj) {
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        AnchoredDraggableState anchoredDraggableState2;
        Orientation orientation2;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        MutableInteractionSource mutableInteractionSource2 = (i & 8) != 0 ? null : mutableInteractionSource;
        OverscrollEffect overscrollEffect2 = (i & 16) != 0 ? null : overscrollEffect;
        if ((i & 32) != 0) {
            z2 = anchoredDraggableState.isAnimationRunning();
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            flingBehavior2 = null;
            anchoredDraggableState2 = anchoredDraggableState;
            orientation2 = orientation;
            modifier2 = modifier;
        } else {
            flingBehavior2 = flingBehavior;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            orientation2 = orientation;
        }
        return anchoredDraggable(modifier2, anchoredDraggableState2, orientation2, z3, mutableInteractionSource2, overscrollEffect2, z4, flingBehavior2);
    }

    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t, AnimationSpec<Float> animationSpec, hm hmVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t, null, new AnchoredDraggableKt$animateTo$4(anchoredDraggableState, animationSpec, null), hmVar, 2, null);
        return anchoredDrag$default == vn.d ? anchoredDrag$default : w01.a;
    }
}
