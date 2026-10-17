package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import defpackage.iy;
import defpackage.kl0;
import defpackage.ky;
import defpackage.my;
import defpackage.t6;
import defpackage.w01;
import defpackage.xl;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionMagnifierKt {
    private static final SpringSpec<Offset> MagnifierSpringSpec;
    private static final long OffsetDisplacementThreshold;
    private static final AnimationVector2D UnspecifiedAnimationVector2D = new AnimationVector2D(Float.NaN, Float.NaN);
    private static final TwoWayConverter<Offset, AnimationVector2D> UnspecifiedSafeOffsetVectorConverter = VectorConvertersKt.TwoWayConverter(new kl0(26), new kl0(27));

    static {
        long m4508constructorimpl = Offset.m4508constructorimpl((Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L));
        OffsetDisplacementThreshold = m4508constructorimpl;
        MagnifierSpringSpec = new SpringSpec<>(0.0f, 0.0f, Offset.m4505boximpl(m4508constructorimpl), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationVector2D UnspecifiedSafeOffsetVectorConverter$lambda$0(Offset offset) {
        return (offset.m4526unboximpl() & InlineClassHelperKt.DualUnsignedFloatMask) != InlineClassHelperKt.UnspecifiedPackedFloats ? new AnimationVector2D(Float.intBitsToFloat((int) (offset.m4526unboximpl() >> 32)), Float.intBitsToFloat((int) (offset.m4526unboximpl() & 4294967295L))) : UnspecifiedAnimationVector2D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset UnspecifiedSafeOffsetVectorConverter$lambda$1(AnimationVector2D animationVector2D) {
        float v1 = animationVector2D.getV1();
        float v2 = animationVector2D.getV2();
        return Offset.m4505boximpl(Offset.m4508constructorimpl((Float.floatToRawIntBits(v1) << 32) | (Float.floatToRawIntBits(v2) & 4294967295L)));
    }

    public static final Modifier animatedSelectionMagnifier(Modifier modifier, iy iyVar, ky kyVar) {
        return ComposedModifierKt.composed$default(modifier, null, new xl(kyVar, iyVar), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier animatedSelectionMagnifier$lambda$0(iy iyVar, ky kyVar, Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(759876635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(759876635, i, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:64)");
        }
        State<Offset> rememberAnimatedMagnifierPosition = rememberAnimatedMagnifierPosition(iyVar, composer, 0);
        boolean changed = composer.changed(rememberAnimatedMagnifierPosition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new t6(rememberAnimatedMagnifierPosition, 16);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier modifier2 = (Modifier) kyVar.invoke((iy) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifier2;
    }

    private static final long animatedSelectionMagnifier$lambda$0$0(State<Offset> state) {
        return state.getValue().m4526unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset animatedSelectionMagnifier$lambda$0$1$0(State state) {
        return Offset.m4505boximpl(animatedSelectionMagnifier$lambda$0$0(state));
    }

    public static final SpringSpec<Offset> getMagnifierSpringSpec() {
        return MagnifierSpringSpec;
    }

    public static final long getOffsetDisplacementThreshold() {
        return OffsetDisplacementThreshold;
    }

    public static final TwoWayConverter<Offset, AnimationVector2D> getUnspecifiedSafeOffsetVectorConverter() {
        return UnspecifiedSafeOffsetVectorConverter;
    }

    private static final State<Offset> rememberAnimatedMagnifierPosition(iy iyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589795249, i, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:73)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(iyVar);
            composer.updateRememberedValue(rememberedValue);
        }
        State state = (State) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            Object animatable = new Animatable(Offset.m4505boximpl(rememberAnimatedMagnifierPosition$lambda$1(state)), UnspecifiedSafeOffsetVectorConverter, Offset.m4505boximpl(OffsetDisplacementThreshold), null, 8, null);
            composer.updateRememberedValue(animatable);
            rememberedValue2 = animatable;
        }
        Animatable animatable2 = (Animatable) rememberedValue2;
        boolean changedInstance = composer.changedInstance(animatable2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(state, animatable2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        EffectsKt.LaunchedEffect(w01.a, (my) rememberedValue3, composer, 6);
        State<Offset> asState = animatable2.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rememberAnimatedMagnifierPosition$lambda$1(State<Offset> state) {
        return state.getValue().m4526unboximpl();
    }
}
