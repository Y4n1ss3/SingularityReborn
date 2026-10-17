package androidx.compose.animation;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.GapComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.iy;
import defpackage.ky;
import defpackage.q10;
import defpackage.zv;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt {
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(EnterExitTransitionKt$TransformOriginVectorConverter$1.INSTANCE, EnterExitTransitionKt$TransformOriginVectorConverter$2.INSTANCE);
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final SpringSpec<Color> DefaultColorAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7730boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7774boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0113, code lost:
    
        if (r3.changed(r1) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012e, code lost:
    
        if (r3.changed(r2) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014d, code lost:
    
        if (r3.changed(r4) == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final GraphicsLayerBlockForEnterExit createGraphicsLayerBlock(Transition<EnterExitState> transition, EnterTransition enterTransition, ExitTransition exitTransition, String str, Composer composer, int i) {
        final Transition.DeferredAnimation deferredAnimation;
        final Transition.DeferredAnimation deferredAnimation2;
        EnterTransition enterTransition2;
        boolean z;
        ExitTransition exitTransition2;
        boolean z2;
        Transition<EnterExitState> transition2;
        boolean changedInstance;
        Object rememberedValue;
        Composer composer2 = composer;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(642253525, i, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:1052)");
        }
        boolean z3 = true;
        boolean z4 = (enterTransition.getData$animation().getFade() == null && exitTransition.getData$animation().getFade() == null) ? false : true;
        boolean z5 = (enterTransition.getData$animation().getScale() == null && exitTransition.getData$animation().getScale() == null) ? false : true;
        zv zvVar = zv.a;
        Transition.DeferredAnimation deferredAnimation3 = null;
        if (z4) {
            composer2.startReplaceGroup(-703879421);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(zvVar);
            Object rememberedValue2 = composer2.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = str + " alpha";
                composer2.updateRememberedValue(rememberedValue2);
            }
            Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter, (String) rememberedValue2, composer2, (i & 14) | 384, 0);
            composer2 = composer2;
            composer2.endReplaceGroup();
            deferredAnimation = createDeferredAnimation;
        } else {
            composer2.startReplaceGroup(-703709976);
            composer2.endReplaceGroup();
            deferredAnimation = null;
        }
        if (z5) {
            composer2.startReplaceGroup(-703642333);
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(zvVar);
            Object rememberedValue3 = composer2.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = str + " scale";
                composer2.updateRememberedValue(rememberedValue3);
            }
            Transition.DeferredAnimation createDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter2, (String) rememberedValue3, composer2, (i & 14) | 384, 0);
            composer2.endReplaceGroup();
            deferredAnimation2 = createDeferredAnimation2;
        } else {
            composer2.startReplaceGroup(-703472888);
            composer2.endReplaceGroup();
            deferredAnimation2 = null;
        }
        if (z5) {
            composer2.startReplaceGroup(-703395232);
            deferredAnimation3 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, TransformOriginVectorConverter, "TransformOriginInterruptionHandling", composer2, (i & 14) | 384, 0);
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(-703222904);
            composer2.endReplaceGroup();
        }
        boolean changedInstance2 = composer2.changedInstance(deferredAnimation);
        if (((i & 112) ^ 48) > 32) {
            enterTransition2 = enterTransition;
        } else {
            enterTransition2 = enterTransition;
        }
        if ((i & 48) != 32) {
            z = false;
            boolean z6 = changedInstance2 | z;
            if (((i & 896) ^ 384) <= 256) {
                exitTransition2 = exitTransition;
            } else {
                exitTransition2 = exitTransition;
            }
            if ((i & 384) != 256) {
                z2 = false;
                boolean changedInstance3 = z6 | z2 | composer2.changedInstance(deferredAnimation2);
                if (((i & 14) ^ 6) > 4) {
                    transition2 = transition;
                } else {
                    transition2 = transition;
                }
                if ((i & 6) != 4) {
                    z3 = false;
                }
                changedInstance = changedInstance3 | z3 | composer2.changedInstance(deferredAnimation3);
                rememberedValue = composer2.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    final EnterTransition enterTransition3 = enterTransition2;
                    final ExitTransition exitTransition3 = exitTransition2;
                    final Transition<EnterExitState> transition3 = transition2;
                    final Transition.DeferredAnimation deferredAnimation4 = deferredAnimation3;
                    GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit = new GraphicsLayerBlockForEnterExit() { // from class: yt
                        @Override // androidx.compose.animation.GraphicsLayerBlockForEnterExit
                        public final ky init() {
                            ky createGraphicsLayerBlock$lambda$2$0;
                            createGraphicsLayerBlock$lambda$2$0 = EnterExitTransitionKt.createGraphicsLayerBlock$lambda$2$0(Transition.DeferredAnimation.this, deferredAnimation2, transition3, enterTransition3, exitTransition3, deferredAnimation4);
                            return createGraphicsLayerBlock$lambda$2$0;
                        }
                    };
                    composer2.updateRememberedValue(graphicsLayerBlockForEnterExit);
                    rememberedValue = graphicsLayerBlockForEnterExit;
                }
                GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit2 = (GraphicsLayerBlockForEnterExit) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return graphicsLayerBlockForEnterExit2;
            }
            z2 = true;
            boolean changedInstance32 = z6 | z2 | composer2.changedInstance(deferredAnimation2);
            if (((i & 14) ^ 6) > 4) {
            }
            if ((i & 6) != 4) {
            }
            changedInstance = changedInstance32 | z3 | composer2.changedInstance(deferredAnimation3);
            rememberedValue = composer2.rememberedValue();
            if (!changedInstance) {
            }
            final EnterTransition enterTransition32 = enterTransition2;
            final ExitTransition exitTransition32 = exitTransition2;
            final Transition transition32 = transition2;
            final Transition.DeferredAnimation deferredAnimation42 = deferredAnimation3;
            GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit3 = new GraphicsLayerBlockForEnterExit() { // from class: yt
                @Override // androidx.compose.animation.GraphicsLayerBlockForEnterExit
                public final ky init() {
                    ky createGraphicsLayerBlock$lambda$2$0;
                    createGraphicsLayerBlock$lambda$2$0 = EnterExitTransitionKt.createGraphicsLayerBlock$lambda$2$0(Transition.DeferredAnimation.this, deferredAnimation2, transition32, enterTransition32, exitTransition32, deferredAnimation42);
                    return createGraphicsLayerBlock$lambda$2$0;
                }
            };
            composer2.updateRememberedValue(graphicsLayerBlockForEnterExit3);
            rememberedValue = graphicsLayerBlockForEnterExit3;
            GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit22 = (GraphicsLayerBlockForEnterExit) rememberedValue;
            if (ComposerKt.isTraceInProgress()) {
            }
            return graphicsLayerBlockForEnterExit22;
        }
        z = true;
        boolean z62 = changedInstance2 | z;
        if (((i & 896) ^ 384) <= 256) {
        }
        if ((i & 384) != 256) {
        }
        z2 = true;
        boolean changedInstance322 = z62 | z2 | composer2.changedInstance(deferredAnimation2);
        if (((i & 14) ^ 6) > 4) {
        }
        if ((i & 6) != 4) {
        }
        changedInstance = changedInstance322 | z3 | composer2.changedInstance(deferredAnimation3);
        rememberedValue = composer2.rememberedValue();
        if (!changedInstance) {
        }
        final EnterTransition enterTransition322 = enterTransition2;
        final ExitTransition exitTransition322 = exitTransition2;
        final Transition transition322 = transition2;
        final Transition.DeferredAnimation deferredAnimation422 = deferredAnimation3;
        GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit32 = new GraphicsLayerBlockForEnterExit() { // from class: yt
            @Override // androidx.compose.animation.GraphicsLayerBlockForEnterExit
            public final ky init() {
                ky createGraphicsLayerBlock$lambda$2$0;
                createGraphicsLayerBlock$lambda$2$0 = EnterExitTransitionKt.createGraphicsLayerBlock$lambda$2$0(Transition.DeferredAnimation.this, deferredAnimation2, transition322, enterTransition322, exitTransition322, deferredAnimation422);
                return createGraphicsLayerBlock$lambda$2$0;
            }
        };
        composer2.updateRememberedValue(graphicsLayerBlockForEnterExit32);
        rememberedValue = graphicsLayerBlockForEnterExit32;
        GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit222 = (GraphicsLayerBlockForEnterExit) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
        }
        return graphicsLayerBlockForEnterExit222;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ky createGraphicsLayerBlock$lambda$2$0(Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition transition, EnterTransition enterTransition, ExitTransition exitTransition, Transition.DeferredAnimation deferredAnimation3) {
        TransformOrigin m5161boximpl;
        State animate = deferredAnimation != null ? deferredAnimation.animate(new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1(enterTransition, exitTransition), new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2(enterTransition, exitTransition)) : null;
        State animate2 = deferredAnimation2 != null ? deferredAnimation2.animate(new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1(enterTransition, exitTransition), new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2(enterTransition, exitTransition)) : null;
        if (transition.getCurrentState() == EnterExitState.PreEnter) {
            Scale scale = enterTransition.getData$animation().getScale();
            if (scale != null || (scale = exitTransition.getData$animation().getScale()) != null) {
                m5161boximpl = TransformOrigin.m5161boximpl(scale.m82getTransformOriginSzJe1aQ());
            }
            m5161boximpl = null;
        } else {
            Scale scale2 = exitTransition.getData$animation().getScale();
            if (scale2 != null || (scale2 = enterTransition.getData$animation().getScale()) != null) {
                m5161boximpl = TransformOrigin.m5161boximpl(scale2.m82getTransformOriginSzJe1aQ());
            }
            m5161boximpl = null;
        }
        return new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1(animate, animate2, deferredAnimation3 != null ? deferredAnimation3.animate(EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1.INSTANCE, new EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2(m5161boximpl, enterTransition, exitTransition)) : null);
    }

    public static final Modifier createModifier(Transition<EnterExitState> transition, EnterTransition enterTransition, ExitTransition exitTransition, iy iyVar, String str, Composer composer, int i, int i2) {
        iy iyVar2;
        Transition.DeferredAnimation deferredAnimation;
        Transition.DeferredAnimation deferredAnimation2;
        Transition.DeferredAnimation deferredAnimation3;
        ChangeSize changeSize;
        ColorSpace m4765getColorSpaceimpl;
        boolean z;
        Transition<EnterExitState> transition2;
        Modifier modifier;
        if ((i2 & 4) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = EnterExitTransitionKt$createModifier$1$1.INSTANCE;
                composer.updateRememberedValue(rememberedValue);
            }
            iyVar2 = (iy) rememberedValue;
        } else {
            iyVar2 = iyVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(28261782, i, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:933)");
        }
        int i3 = i & 14;
        EnterTransition trackActiveEnter = trackActiveEnter(transition, enterTransition, composer, i & 126);
        int i4 = i >> 3;
        ExitTransition trackActiveExit = trackActiveExit(transition, exitTransition, composer, (i4 & 112) | i3);
        boolean z2 = true;
        boolean z3 = (trackActiveEnter.getData$animation().getVeil() == null && trackActiveExit.getData$animation().getVeil() == null) ? false : true;
        boolean z4 = (trackActiveEnter.getData$animation().getSlide() == null && trackActiveExit.getData$animation().getSlide() == null) ? false : true;
        boolean z5 = (trackActiveEnter.getData$animation().getChangeSize() == null && trackActiveExit.getData$animation().getChangeSize() == null) ? false : true;
        if (z4) {
            composer.startReplaceGroup(133792645);
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = str + " slide";
                composer.updateRememberedValue(rememberedValue2);
            }
            Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter, (String) rememberedValue2, composer, i3 | 384, 0);
            composer.endReplaceGroup();
            deferredAnimation = createDeferredAnimation;
        } else {
            composer.startReplaceGroup(133898448);
            composer.endReplaceGroup();
            deferredAnimation = null;
        }
        if (z5) {
            composer.startReplaceGroup(133990239);
            TwoWayConverter<IntSize, AnimationVector2D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntSize.Companion);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = str + " shrink/expand";
                composer.updateRememberedValue(rememberedValue3);
            }
            Transition.DeferredAnimation createDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter2, (String) rememberedValue3, composer, i3 | 384, 0);
            composer.endReplaceGroup();
            deferredAnimation2 = createDeferredAnimation2;
        } else {
            composer.startReplaceGroup(134101063);
            composer.endReplaceGroup();
            deferredAnimation2 = null;
        }
        if (z5) {
            composer.startReplaceGroup(134174689);
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter3 = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = str + " InterruptionHandlingOffset";
                composer.updateRememberedValue(rememberedValue4);
            }
            Transition.DeferredAnimation createDeferredAnimation3 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter3, (String) rememberedValue4, composer, i3 | 384, 0);
            composer.endReplaceGroup();
            deferredAnimation3 = createDeferredAnimation3;
        } else {
            composer.startReplaceGroup(134345095);
            composer.endReplaceGroup();
            deferredAnimation3 = null;
        }
        ChangeSize changeSize2 = trackActiveEnter.getData$animation().getChangeSize();
        boolean z6 = ((changeSize2 == null || changeSize2.getClip()) && ((changeSize = trackActiveExit.getData$animation().getChangeSize()) == null || changeSize.getClip()) && z5) ? false : true;
        Veil veil = trackActiveEnter.getData$animation().getVeil();
        if (veil == null || (m4765getColorSpaceimpl = Color.m4765getColorSpaceimpl(veil.m124getInitialColor0d7_KjU())) == null) {
            Veil veil2 = trackActiveEnter.getData$animation().getVeil();
            if (veil2 != null) {
                m4765getColorSpaceimpl = Color.m4765getColorSpaceimpl(veil2.m125getTargetColor0d7_KjU());
            } else {
                Veil veil3 = trackActiveExit.getData$animation().getVeil();
                m4765getColorSpaceimpl = veil3 != null ? Color.m4765getColorSpaceimpl(veil3.m124getInitialColor0d7_KjU()) : null;
                if (m4765getColorSpaceimpl == null) {
                    Veil veil4 = trackActiveExit.getData$animation().getVeil();
                    ColorSpace m4765getColorSpaceimpl2 = veil4 != null ? Color.m4765getColorSpaceimpl(veil4.m125getTargetColor0d7_KjU()) : null;
                    m4765getColorSpaceimpl = m4765getColorSpaceimpl2 == null ? ColorSpaces.INSTANCE.getSrgb() : m4765getColorSpaceimpl2;
                }
            }
        }
        if (z3) {
            composer.startReplaceGroup(134871569);
            TwoWayConverter twoWayConverter = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl);
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = str + " veil";
                composer.updateRememberedValue(rememberedValue5);
            }
            z = z6;
            transition2 = transition;
            modifier = new VeilModifierElement(transition2, androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition2, twoWayConverter, (String) rememberedValue5, composer, i3 | 384, 0), trackActiveEnter, trackActiveExit);
            composer.endReplaceGroup();
        } else {
            z = z6;
            transition2 = transition;
            composer.startReplaceGroup(135150476);
            composer.endReplaceGroup();
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        Veil veil5 = trackActiveEnter.getData$animation().getVeil();
        boolean matchParentSize = (veil5 == null && (veil5 = trackActiveExit.getData$animation().getVeil()) == null) ? false : veil5.getMatchParentSize();
        GraphicsLayerBlockForEnterExit createGraphicsLayerBlock = createGraphicsLayerBlock(transition2, trackActiveEnter, trackActiveExit, str, composer, i3 | (i4 & 7168));
        Modifier modifier3 = matchParentSize ? modifier2 : Modifier.Companion;
        Modifier modifier4 = Modifier.Companion;
        boolean changed = composer.changed(z);
        if ((((i & 7168) ^ 3072) <= 2048 || !composer.changed(iyVar2)) && (i & 3072) != 2048) {
            z2 = false;
        }
        boolean z7 = changed | z2;
        Object rememberedValue6 = composer.rememberedValue();
        if (z7 || rememberedValue6 == Composer.Companion.getEmpty()) {
            rememberedValue6 = new EnterExitTransitionKt$createModifier$2$1(z, iyVar2);
            composer.updateRememberedValue(rememberedValue6);
        }
        Modifier then = modifier3.then(GraphicsLayerModifierKt.graphicsLayer(modifier4, (ky) rememberedValue6)).then(new EnterExitTransitionElement(transition, deferredAnimation2, deferredAnimation3, deferredAnimation, trackActiveEnter, trackActiveExit, iyVar2, createGraphicsLayerBlock));
        if (!matchParentSize) {
            modifier4 = modifier2;
        }
        Modifier then2 = then.then(modifier4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return then2;
    }

    public static final EnterTransition expandHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, ky kyVar) {
        return expandIn(finiteAnimationSpec, toAlignment(horizontal), z, new EnterExitTransitionKt$expandHorizontally$2(kyVar));
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7774boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            kyVar = EnterExitTransitionKt$expandHorizontally$1.INSTANCE;
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z, kyVar);
    }

    public static final EnterTransition expandIn(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z, ky kyVar) {
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, kyVar, finiteAnimationSpec, z), null, null, false, null, 123, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7774boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            kyVar = EnterExitTransitionKt$expandIn$1.INSTANCE;
        }
        return expandIn(finiteAnimationSpec, alignment, z, kyVar);
    }

    public static final EnterTransition expandVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z, ky kyVar) {
        return expandIn(finiteAnimationSpec, toAlignment(vertical), z, new EnterExitTransitionKt$expandVertically$2(kyVar));
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7774boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            kyVar = EnterExitTransitionKt$expandVertically$1.INSTANCE;
        }
        return expandVertically(finiteAnimationSpec, vertical, z, kyVar);
    }

    public static final EnterTransition fadeIn(FiniteAnimationSpec<Float> finiteAnimationSpec, float f) {
        return new EnterTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), null, null, null, null, false, null, 126, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f);
    }

    public static final ExitTransition fadeOut(FiniteAnimationSpec<Float> finiteAnimationSpec, float f) {
        return new ExitTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), null, null, null, null, false, null, 126, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f);
    }

    public static final <T extends TransitionEffect> T get(EnterTransition enterTransition, TransitionEffectKey<T> transitionEffectKey) {
        TransitionEffect transitionEffect = enterTransition.getData$animation().getEffectsMap().get(transitionEffectKey);
        if (transitionEffect instanceof TransitionEffect) {
            return (T) transitionEffect;
        }
        return null;
    }

    /* renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final EnterTransition m48scaleInL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f, long j) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f, j, finiteAnimationSpec, null), null, false, null, 119, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m49scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.Companion.m5174getCenterSzJe1aQ();
        }
        return m48scaleInL8ZKhE(finiteAnimationSpec, f, j);
    }

    /* renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final ExitTransition m50scaleOutL8ZKhE(FiniteAnimationSpec<Float> finiteAnimationSpec, float f, long j) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f, j, finiteAnimationSpec, null), null, false, null, 119, null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m51scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = TransformOrigin.Companion.m5174getCenterSzJe1aQ();
        }
        return m50scaleOutL8ZKhE(finiteAnimationSpec, f, j);
    }

    public static final ExitTransition shrinkHorizontally(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, ky kyVar) {
        return shrinkOut(finiteAnimationSpec, toAlignment(horizontal), z, new EnterExitTransitionKt$shrinkHorizontally$2(kyVar));
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7774boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            kyVar = EnterExitTransitionKt$shrinkHorizontally$1.INSTANCE;
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z, kyVar);
    }

    public static final ExitTransition shrinkOut(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment alignment, boolean z, ky kyVar) {
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, kyVar, finiteAnimationSpec, z), null, null, false, null, 123, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7774boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            kyVar = EnterExitTransitionKt$shrinkOut$1.INSTANCE;
        }
        return shrinkOut(finiteAnimationSpec, alignment, z, kyVar);
    }

    public static final ExitTransition shrinkVertically(FiniteAnimationSpec<IntSize> finiteAnimationSpec, Alignment.Vertical vertical, boolean z, ky kyVar) {
        return shrinkOut(finiteAnimationSpec, toAlignment(vertical), z, new EnterExitTransitionKt$shrinkVertically$2(kyVar));
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7774boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            kyVar = EnterExitTransitionKt$shrinkVertically$1.INSTANCE;
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z, kyVar);
    }

    public static final EnterTransition slideIn(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, ky kyVar) {
        return new EnterTransitionImpl(new TransitionData(null, new Slide(kyVar, finiteAnimationSpec), null, null, null, false, null, GapComposerKt.nodeKey, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7730boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideIn(finiteAnimationSpec, kyVar);
    }

    public static final EnterTransition slideInHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, ky kyVar) {
        return slideIn(finiteAnimationSpec, new EnterExitTransitionKt$slideInHorizontally$2(kyVar));
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7730boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            kyVar = EnterExitTransitionKt$slideInHorizontally$1.INSTANCE;
        }
        return slideInHorizontally(finiteAnimationSpec, kyVar);
    }

    public static final EnterTransition slideInVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, ky kyVar) {
        return slideIn(finiteAnimationSpec, new EnterExitTransitionKt$slideInVertically$2(kyVar));
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7730boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            kyVar = EnterExitTransitionKt$slideInVertically$1.INSTANCE;
        }
        return slideInVertically(finiteAnimationSpec, kyVar);
    }

    public static final ExitTransition slideOut(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, ky kyVar) {
        return new ExitTransitionImpl(new TransitionData(null, new Slide(kyVar, finiteAnimationSpec), null, null, null, false, null, GapComposerKt.nodeKey, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7730boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideOut(finiteAnimationSpec, kyVar);
    }

    public static final ExitTransition slideOutHorizontally(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, ky kyVar) {
        return slideOut(finiteAnimationSpec, new EnterExitTransitionKt$slideOutHorizontally$2(kyVar));
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7730boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            kyVar = EnterExitTransitionKt$slideOutHorizontally$1.INSTANCE;
        }
        return slideOutHorizontally(finiteAnimationSpec, kyVar);
    }

    public static final ExitTransition slideOutVertically(FiniteAnimationSpec<IntOffset> finiteAnimationSpec, ky kyVar) {
        return slideOut(finiteAnimationSpec, new EnterExitTransitionKt$slideOutVertically$2(kyVar));
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m7730boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i & 2) != 0) {
            kyVar = EnterExitTransitionKt$slideOutVertically$1.INSTANCE;
        }
        return slideOutVertically(finiteAnimationSpec, kyVar);
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.Companion;
        return q10.b(horizontal, companion.getStart()) ? companion.getCenterStart() : q10.b(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    public static final EnterTransition trackActiveEnter(Transition<EnterExitState> transition, EnterTransition enterTransition, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21614502, i, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:1004)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(transition)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(enterTransition, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(enterTransition);
            } else {
                mutableState.setValue(EnterTransition.Companion.getNone());
            }
        } else if (transition.getTargetState() == EnterExitState.Visible) {
            mutableState.setValue(trackActiveEnter$lambda$1(mutableState).plus(enterTransition));
        }
        EnterTransition trackActiveEnter$lambda$1 = trackActiveEnter$lambda$1(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return trackActiveEnter$lambda$1;
    }

    private static final EnterTransition trackActiveEnter$lambda$1(MutableState<EnterTransition> mutableState) {
        return mutableState.getValue();
    }

    public static final ExitTransition trackActiveExit(Transition<EnterExitState> transition, ExitTransition exitTransition, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1363864804, i, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:1024)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(transition)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(exitTransition, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(exitTransition);
            } else {
                mutableState.setValue(ExitTransition.Companion.getNone());
            }
        } else if (transition.getTargetState() != EnterExitState.Visible) {
            mutableState.setValue(trackActiveExit$lambda$1(mutableState).plus(exitTransition));
        }
        ExitTransition trackActiveExit$lambda$1 = trackActiveExit$lambda$1(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return trackActiveExit$lambda$1;
    }

    private static final ExitTransition trackActiveExit$lambda$1(MutableState<ExitTransition> mutableState) {
        return mutableState.getValue();
    }

    /* renamed from: unveilIn-bw27NRU, reason: not valid java name */
    public static final EnterTransition m52unveilInbw27NRU(FiniteAnimationSpec<Color> finiteAnimationSpec, long j, boolean z) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, null, new Veil(j, Color.m4760copywmQWz5c$default(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), finiteAnimationSpec, z, null), false, null, 111, null));
    }

    /* renamed from: unveilIn-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m53unveilInbw27NRU$default(FiniteAnimationSpec finiteAnimationSpec, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            j = Color.m4760copywmQWz5c$default(Color.Companion.m4787getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return m52unveilInbw27NRU(finiteAnimationSpec, j, z);
    }

    /* renamed from: veilOut-bw27NRU, reason: not valid java name */
    public static final ExitTransition m54veilOutbw27NRU(FiniteAnimationSpec<Color> finiteAnimationSpec, long j, boolean z) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, null, new Veil(Color.m4760copywmQWz5c$default(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j, finiteAnimationSpec, z, null), false, null, 111, null));
    }

    /* renamed from: veilOut-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m55veilOutbw27NRU$default(FiniteAnimationSpec finiteAnimationSpec, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            j = Color.m4760copywmQWz5c$default(Color.Companion.m4787getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return m54veilOutbw27NRU(finiteAnimationSpec, j, z);
    }

    public static final EnterTransition withEffect(EnterTransition enterTransition, TransitionEffect transitionEffect) {
        Map singletonMap = Collections.singletonMap(transitionEffect.getKey$animation(), transitionEffect);
        singletonMap.getClass();
        return new EnterTransitionImpl(new TransitionData(null, null, null, null, null, false, singletonMap, 63, null));
    }

    public static final <T extends TransitionEffect> T get(ExitTransition exitTransition, TransitionEffectKey<T> transitionEffectKey) {
        TransitionEffect transitionEffect = exitTransition.getData$animation().getEffectsMap().get(transitionEffectKey);
        if (transitionEffect instanceof TransitionEffect) {
            return (T) transitionEffect;
        }
        return null;
    }

    public static final ExitTransition withEffect(ExitTransition exitTransition, TransitionEffect transitionEffect) {
        Map singletonMap = Collections.singletonMap(transitionEffect.getKey$animation(), transitionEffect);
        singletonMap.getClass();
        return new ExitTransitionImpl(new TransitionData(null, null, null, null, null, false, singletonMap, 63, null));
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.Companion;
        return q10.b(vertical, companion.getTop()) ? companion.getTopCenter() : q10.b(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }
}
