package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.material3.tokens.ProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.er;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ProgressIndicatorDefaults {
    public static final int $stable = 0;
    private static final int CircularDeterminateStrokeCap;
    private static final int CircularIndeterminateStrokeCap;
    private static final float CircularIndicatorTrackGapSize;
    private static final float CircularStrokeWidth;
    public static final ProgressIndicatorDefaults INSTANCE = new ProgressIndicatorDefaults();
    private static final float LinearIndicatorTrackGapSize;
    private static final int LinearStrokeCap;
    private static final float LinearTrackStopIndicatorSize;
    private static final SpringSpec<Float> ProgressAnimationSpec;

    static {
        CircularProgressIndicatorTokens circularProgressIndicatorTokens = CircularProgressIndicatorTokens.INSTANCE;
        CircularStrokeWidth = circularProgressIndicatorTokens.m3102getTrackThicknessD9Ej5fM();
        StrokeCap.Companion companion = StrokeCap.Companion;
        LinearStrokeCap = companion.m5136getRoundKaPHkGw();
        CircularDeterminateStrokeCap = companion.m5136getRoundKaPHkGw();
        CircularIndeterminateStrokeCap = companion.m5136getRoundKaPHkGw();
        LinearProgressIndicatorTokens linearProgressIndicatorTokens = LinearProgressIndicatorTokens.INSTANCE;
        LinearTrackStopIndicatorSize = linearProgressIndicatorTokens.m3393getStopSizeD9Ej5fM();
        LinearIndicatorTrackGapSize = linearProgressIndicatorTokens.m3395getTrackActiveSpaceD9Ej5fM();
        CircularIndicatorTrackGapSize = circularProgressIndicatorTokens.m3101getTrackActiveSpaceD9Ej5fM();
        ProgressAnimationSpec = new SpringSpec<>(1.0f, 50.0f, Float.valueOf(0.001f));
    }

    private ProgressIndicatorDefaults() {
    }

    private static final void drawStopIndicator_EgI2THU$drawIndicator(DrawScope drawScope, int i, long j, float f, float f2) {
        if (StrokeCap.m5131equalsimpl0(i, StrokeCap.Companion.m5136getRoundKaPHkGw())) {
            float f3 = f / 2.0f;
            float intBitsToFloat = (Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)) - f3) - f2;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L)) / 2.0f;
            DrawScope.m5316drawCircleVaOC9Bg$default(drawScope, j, f3, Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2))), 0.0f, null, null, 0, 120, null);
            return;
        }
        float intBitsToFloat3 = (Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)) - f) - f2;
        float intBitsToFloat4 = (Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L)) - f) / 2.0f;
        DrawScope.m5329drawRectnJ9OG0$default(drawScope, j, Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L)), Size.m4576constructorimpl((Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(f))), 0.0f, null, null, 0, 120, null);
    }

    /* renamed from: drawStopIndicator-EgI2THU, reason: not valid java name */
    public final void m2254drawStopIndicatorEgI2THU(DrawScope drawScope, float f, long j, int i) {
        float min = Math.min(drawScope.mo367toPx0680j_4(f), Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L)));
        float mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(ProgressIndicatorKt.getStopIndicatorTrailingSpace());
        float intBitsToFloat = (Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L)) - min) / 2.0f;
        float f2 = intBitsToFloat > mo367toPx0680j_4 ? mo367toPx0680j_4 : intBitsToFloat;
        if (drawScope.getLayoutDirection() != LayoutDirection.Rtl) {
            drawStopIndicator_EgI2THU$drawIndicator(drawScope, i, j, min, f2);
            return;
        }
        long mo5334getCenterF1C5BW0 = drawScope.mo5334getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5263scale0AR0LA0(-1.0f, 1.0f, mo5334getCenterF1C5BW0);
            drawStopIndicator_EgI2THU$drawIndicator(drawScope, i, j, min, f2);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    public final long getCircularColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1803349725, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:817)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getCircularDeterminateStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m2255getCircularDeterminateStrokeCapKaPHkGw() {
        return CircularDeterminateStrokeCap;
    }

    public final long getCircularDeterminateTrackColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2143778381, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularDeterminateTrackColor> (ProgressIndicator.kt:834)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getCircularIndeterminateStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m2256getCircularIndeterminateStrokeCapKaPHkGw() {
        return CircularIndeterminateStrokeCap;
    }

    public final long getCircularIndeterminateTrackColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1947901123, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:838)");
        }
        long m4796getTransparent0d7_KjU = Color.Companion.m4796getTransparent0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m4796getTransparent0d7_KjU;
    }

    /* renamed from: getCircularIndicatorTrackGapSize-D9Ej5fM, reason: not valid java name */
    public final float m2257getCircularIndicatorTrackGapSizeD9Ej5fM() {
        return CircularIndicatorTrackGapSize;
    }

    /* renamed from: getCircularStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m2258getCircularStrokeWidthD9Ej5fM() {
        return CircularStrokeWidth;
    }

    public final long getCircularTrackColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-404222247, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularTrackColor> (ProgressIndicator.kt:830)");
        }
        long m4796getTransparent0d7_KjU = Color.Companion.m4796getTransparent0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m4796getTransparent0d7_KjU;
    }

    public final long getLinearColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-914312983, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:813)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getLinearIndicatorTrackGapSize-D9Ej5fM, reason: not valid java name */
    public final float m2259getLinearIndicatorTrackGapSizeD9Ej5fM() {
        return LinearIndicatorTrackGapSize;
    }

    /* renamed from: getLinearStrokeCap-KaPHkGw, reason: not valid java name */
    public final int m2260getLinearStrokeCapKaPHkGw() {
        return LinearStrokeCap;
    }

    public final long getLinearTrackColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1677541593, i, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:821)");
        }
        long value = ColorSchemeKt.getValue(ProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getLinearTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m2261getLinearTrackStopIndicatorSizeD9Ej5fM() {
        return LinearTrackStopIndicatorSize;
    }

    public final SpringSpec<Float> getProgressAnimationSpec() {
        return ProgressAnimationSpec;
    }

    /* renamed from: getCircularIndicatorTrackGapSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2251getCircularIndicatorTrackGapSizeD9Ej5fM$annotations() {
    }

    @er
    public static /* synthetic */ void getCircularTrackColor$annotations() {
    }

    /* renamed from: getLinearIndicatorTrackGapSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2252getLinearIndicatorTrackGapSizeD9Ej5fM$annotations() {
    }

    /* renamed from: getLinearTrackStopIndicatorSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2253getLinearTrackStopIndicatorSizeD9Ej5fM$annotations() {
    }
}
