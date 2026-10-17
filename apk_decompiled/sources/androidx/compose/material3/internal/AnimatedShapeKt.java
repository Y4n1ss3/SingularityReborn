package androidx.compose.material3.internal;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ShapeWithHorizontalCenterOptically;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.d41;
import defpackage.iy;
import defpackage.my;
import defpackage.ti;
import defpackage.ui;
import defpackage.v4;
import defpackage.w01;
import defpackage.y80;
import defpackage.zg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedShapeKt {
    public static final Shape rememberAnimatedShape(RoundedCornerShape roundedCornerShape, FiniteAnimationSpec<Float> finiteAnimationSpec, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-288714613, i, -1, "androidx.compose.material3.internal.rememberAnimatedShape (AnimatedShape.kt:131)");
        }
        boolean changed = composer.changed(finiteAnimationSpec);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AnimatedShapeState(roundedCornerShape, finiteAnimationSpec);
            composer.updateRememberedValue(rememberedValue);
        }
        AnimatedShapeState animatedShapeState = (AnimatedShapeState) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = d41.b(-1, 6, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        zg zgVar = (zg) rememberedValue2;
        boolean changedInstance = ((((i & 14) ^ 6) > 4 && composer.changed(roundedCornerShape)) || (i & 6) == 4) | composer.changedInstance(zgVar);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new v4(3, zgVar, roundedCornerShape);
            composer.updateRememberedValue(rememberedValue3);
        }
        EffectsKt.SideEffect((iy) rememberedValue3, composer, 0);
        boolean changedInstance2 = composer.changedInstance(zgVar) | composer.changed(animatedShapeState);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new AnimatedShapeKt$rememberAnimatedShape$3$1(zgVar, animatedShapeState, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        EffectsKt.LaunchedEffect(animatedShapeState, zgVar, (my) rememberedValue4, composer, 0);
        Shape rememberAnimatedShape = rememberAnimatedShape(animatedShapeState, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberAnimatedShape;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 rememberAnimatedShape$lambda$4$lambda$3(zg zgVar, RoundedCornerShape roundedCornerShape) {
        zgVar.m(roundedCornerShape);
        return w01.a;
    }

    private static final Shape rememberAnimatedShape(final AnimatedShapeState animatedShapeState, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1383367813, i, -1, "androidx.compose.material3.internal.rememberAnimatedShape (AnimatedShape.kt:89)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        animatedShapeState.setDensity(density);
        boolean changed = ((((i & 14) ^ 6) > 4 && composer.changed(animatedShapeState)) || (i & 6) == 4) | composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ShapeWithHorizontalCenterOptically() { // from class: androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$1$1
                private final MutableState clampedRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ti(0.0f, 1.0f), null, 2, null);

                @Override // androidx.compose.ui.graphics.Shape
                /* renamed from: createOutline-Pq9zytI */
                public Outline mo283createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density2) {
                    AnimatedShapeState.this.m2886setSizeuvyYCjk(j);
                    setClampedRange(new ti(0.0f, Float.intBitsToFloat((int) (4294967295L & j)) / 2.0f));
                    return RoundedCornerShapeKt.RoundedCornerShape(((Number) y80.j(Float.valueOf(AnimatedShapeState.m2882topStartTmRCtEA$default(AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue(), ((Number) y80.j(Float.valueOf(AnimatedShapeState.m2881topEndTmRCtEA$default(AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue(), ((Number) y80.j(Float.valueOf(AnimatedShapeState.m2879bottomEndTmRCtEA$default(AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue(), ((Number) y80.j(Float.valueOf(AnimatedShapeState.m2880bottomStartTmRCtEA$default(AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue()).mo283createOutlinePq9zytI(j, layoutDirection, density2);
                }

                public final ui getClampedRange() {
                    return (ui) this.clampedRange$delegate.getValue();
                }

                @Override // androidx.compose.material3.ShapeWithHorizontalCenterOptically
                public float offset() {
                    float floatValue = ((Number) y80.j(Float.valueOf(AnimatedShapeState.m2882topStartTmRCtEA$default(AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue();
                    float floatValue2 = ((Number) y80.j(Float.valueOf(AnimatedShapeState.m2881topEndTmRCtEA$default(AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue();
                    return (((floatValue + ((Number) y80.j(Float.valueOf(AnimatedShapeState.m2880bottomStartTmRCtEA$default(AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue()) / 2.0f) - ((floatValue2 + ((Number) y80.j(Float.valueOf(AnimatedShapeState.m2879bottomEndTmRCtEA$default(AnimatedShapeState.this, 0L, null, 3, null)), getClampedRange())).floatValue()) / 2.0f)) * 0.11f;
                }

                public final void setClampedRange(ui uiVar) {
                    this.clampedRange$delegate.setValue(uiVar);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        AnimatedShapeKt$rememberAnimatedShape$1$1 animatedShapeKt$rememberAnimatedShape$1$1 = (AnimatedShapeKt$rememberAnimatedShape$1$1) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return animatedShapeKt$rememberAnimatedShape$1$1;
    }
}
