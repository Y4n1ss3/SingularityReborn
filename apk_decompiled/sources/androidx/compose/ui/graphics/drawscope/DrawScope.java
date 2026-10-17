package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.er;
import defpackage.ky;
import defpackage.lu0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@DrawScopeMarker
/* loaded from: classes.dex */
public interface DrawScope extends Density {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m4701getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m4861getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m5337getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m5338getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    /* renamed from: drawArc-illE91I$default, reason: not valid java name */
    static /* synthetic */ void m5313drawArcillE91I$default(DrawScope drawScope, Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        DrawScope drawScope2;
        long j3;
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
            return;
        }
        long m4532getZeroF1C5BW0 = (i2 & 16) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j;
        if ((i2 & 32) != 0) {
            drawScope2 = drawScope;
            j3 = drawScope2.m5332offsetSizePENXr5M(drawScope.mo5335getSizeNHjbRc(), m4532getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            j3 = j2;
        }
        drawScope2.mo5232drawArcillE91I(brush, f, f2, z, m4532getZeroF1C5BW0, j3, (i2 & 64) != 0 ? 1.0f : f3, (i2 & Fields.SpotShadowColor) != 0 ? Fill.INSTANCE : drawStyle, (i2 & Fields.RotationX) != 0 ? null : colorFilter, (i2 & Fields.RotationY) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
    static /* synthetic */ void m5314drawArcyD3GUKo$default(DrawScope drawScope, long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        DrawScope drawScope2;
        long j4;
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
            return;
        }
        long m4532getZeroF1C5BW0 = (i2 & 16) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j2;
        if ((i2 & 32) != 0) {
            drawScope2 = drawScope;
            j4 = drawScope2.m5332offsetSizePENXr5M(drawScope.mo5335getSizeNHjbRc(), m4532getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            j4 = j3;
        }
        drawScope2.mo5233drawArcyD3GUKo(j, f, f2, z, m4532getZeroF1C5BW0, j4, (i2 & 64) != 0 ? 1.0f : f3, (i2 & Fields.SpotShadowColor) != 0 ? Fill.INSTANCE : drawStyle, (i2 & Fields.RotationX) != 0 ? null : colorFilter, (i2 & Fields.RotationY) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
    static /* synthetic */ void m5315drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            drawScope.mo5234drawCircleV9BoPsw(brush, (i2 & 2) != 0 ? Size.m4584getMinDimensionimpl(drawScope.mo5335getSizeNHjbRc()) / 2.0f : f, (i2 & 4) != 0 ? drawScope.mo5334getCenterF1C5BW0() : j, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i);
        } else {
            lu0.a("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
    }

    /* renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
    static /* synthetic */ void m5316drawCircleVaOC9Bg$default(DrawScope drawScope, long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
            return;
        }
        if ((i2 & 2) != 0) {
            f = Size.m4584getMinDimensionimpl(drawScope.mo5335getSizeNHjbRc()) / 2.0f;
        }
        drawScope.mo5235drawCircleVaOC9Bg(j, f, (i2 & 4) != 0 ? drawScope.mo5334getCenterF1C5BW0() : j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
    static /* synthetic */ void m5317drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
            return;
        }
        long m7750getZeronOccac = (i2 & 2) != 0 ? IntOffset.Companion.m7750getZeronOccac() : j;
        long m7777constructorimpl = (i2 & 4) != 0 ? IntSize.m7777constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j2;
        drawScope.mo5236drawImage9jGpkUE(imageBitmap, m7750getZeronOccac, m7777constructorimpl, (i2 & 8) != 0 ? IntOffset.Companion.m7750getZeronOccac() : j3, (i2 & 16) != 0 ? m7777constructorimpl : j4, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i2 & Fields.SpotShadowColor) != 0 ? null : colorFilter, (i2 & Fields.RotationX) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
    static /* synthetic */ void m5318drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
            return;
        }
        long m7750getZeronOccac = (i3 & 2) != 0 ? IntOffset.Companion.m7750getZeronOccac() : j;
        long m7777constructorimpl = (i3 & 4) != 0 ? IntSize.m7777constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j2;
        drawScope.mo5237drawImageAZ2fEMs(imageBitmap, m7750getZeronOccac, m7777constructorimpl, (i3 & 8) != 0 ? IntOffset.Companion.m7750getZeronOccac() : j3, (i3 & 16) != 0 ? m7777constructorimpl : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i3 & Fields.SpotShadowColor) != 0 ? null : colorFilter, (i3 & Fields.RotationX) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i, (i3 & Fields.RotationY) != 0 ? Companion.m5338getDefaultFilterQualityfv9h1I() : i2);
    }

    /* renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
    static /* synthetic */ void m5319drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
            drawScope.mo5238drawImagegbVJVH8(imageBitmap, (i2 & 2) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 16) != 0 ? null : colorFilter, (i2 & 32) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i);
        } else {
            lu0.a("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
    }

    /* renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
    static /* synthetic */ void m5320drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            drawScope.mo5239drawLine1RTmtNc(brush, j, j2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? Stroke.Companion.m5406getDefaultCapKaPHkGw() : i, (i3 & 32) != 0 ? null : pathEffect, (i3 & 64) != 0 ? 1.0f : f2, (i3 & Fields.SpotShadowColor) != 0 ? null : colorFilter, (i3 & Fields.RotationX) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i2);
        } else {
            lu0.a("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
    }

    /* renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
    static /* synthetic */ void m5321drawLineNGM6Ib0$default(DrawScope drawScope, long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj == null) {
            drawScope.mo5240drawLineNGM6Ib0(j, j2, j3, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? Stroke.Companion.m5406getDefaultCapKaPHkGw() : i, (i3 & 32) != 0 ? null : pathEffect, (i3 & 64) != 0 ? 1.0f : f2, (i3 & Fields.SpotShadowColor) != 0 ? null : colorFilter, (i3 & Fields.RotationX) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i2);
        } else {
            lu0.a("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
    }

    /* renamed from: drawOval-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m5322drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        } else {
            long m4532getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j;
            drawScope.mo5241drawOvalAsUm42w(brush, m4532getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m5332offsetSizePENXr5M(drawScope.mo5335getSizeNHjbRc(), m4532getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i);
        }
    }

    /* renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m5323drawOvalnJ9OG0$default(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        } else {
            long m4532getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j2;
            drawScope.mo5242drawOvalnJ9OG0(j, m4532getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m5332offsetSizePENXr5M(drawScope.mo5335getSizeNHjbRc(), m4532getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i);
        }
    }

    /* renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
    static /* synthetic */ void m5324drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
            return;
        }
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = Companion.m5337getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo5243drawPathGBMwjPU(path, brush, f2, drawStyle2, colorFilter2, i);
    }

    /* renamed from: drawPath-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m5325drawPathLG529CI$default(DrawScope drawScope, Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
            return;
        }
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        drawScope.mo5244drawPathLG529CI(path, j, f2, drawStyle2, colorFilter, (i2 & 32) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
    static /* synthetic */ void m5326drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        if (obj == null) {
            drawScope.mo5245drawPointsF8ZwMP8(list, i, j, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? StrokeCap.Companion.m5135getButtKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f2, (i4 & Fields.SpotShadowColor) != 0 ? null : colorFilter, (i4 & Fields.RotationX) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i3);
        } else {
            lu0.a("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
    }

    /* renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
    static /* synthetic */ void m5327drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        if (obj == null) {
            drawScope.mo5246drawPointsGsft0Ws(list, i, brush, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? StrokeCap.Companion.m5135getButtKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f2, (i4 & Fields.SpotShadowColor) != 0 ? null : colorFilter, (i4 & Fields.RotationX) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i3);
        } else {
            lu0.a("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
    }

    /* renamed from: drawRect-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m5328drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        } else {
            long m4532getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j;
            drawScope.mo5247drawRectAsUm42w(brush, m4532getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m5332offsetSizePENXr5M(drawScope.mo5335getSizeNHjbRc(), m4532getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i);
        }
    }

    /* renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m5329drawRectnJ9OG0$default(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        } else {
            long m4532getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j2;
            drawScope.mo5248drawRectnJ9OG0(j, m4532getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m5332offsetSizePENXr5M(drawScope.mo5335getSizeNHjbRc(), m4532getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i);
        }
    }

    /* renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
    static /* synthetic */ void m5330drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        } else {
            long m4532getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j;
            drawScope.mo5249drawRoundRectZuiqVtQ(brush, m4532getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m5332offsetSizePENXr5M(drawScope.mo5335getSizeNHjbRc(), m4532getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? CornerRadius.Companion.m4488getZerokKHJgLs() : j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 64) != 0 ? null : colorFilter, (i2 & Fields.SpotShadowColor) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i);
        }
    }

    /* renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
    static /* synthetic */ void m5331drawRoundRectuAw5IA$default(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, Object obj) {
        DrawScope drawScope2;
        long j5;
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
            return;
        }
        long m4532getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.Companion.m4532getZeroF1C5BW0() : j2;
        if ((i2 & 4) != 0) {
            drawScope2 = drawScope;
            j5 = drawScope2.m5332offsetSizePENXr5M(drawScope.mo5335getSizeNHjbRc(), m4532getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            j5 = j3;
        }
        drawScope2.mo5250drawRoundRectuAw5IA(j, m4532getZeroF1C5BW0, j5, (i2 & 8) != 0 ? CornerRadius.Companion.m4488getZerokKHJgLs() : j4, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? null : colorFilter, (i2 & Fields.SpotShadowColor) != 0 ? Companion.m5337getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: offsetSize-PENXr5M, reason: not valid java name */
    private default long m5332offsetSizePENXr5M(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return Size.m4576constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: record-JVtK1S4$default, reason: not valid java name */
    static /* synthetic */ void m5333recordJVtK1S4$default(DrawScope drawScope, GraphicsLayer graphicsLayer, long j, ky kyVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
            return;
        }
        if ((i & 1) != 0) {
            j = IntSizeKt.m7793toIntSizeuvyYCjk(drawScope.mo5335getSizeNHjbRc());
        }
        drawScope.mo5336recordJVtK1S4(graphicsLayer, j, kyVar);
    }

    /* renamed from: drawArc-illE91I */
    void mo5232drawArcillE91I(Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawArc-yD3GUKo */
    void mo5233drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawCircle-V9BoPsw */
    void mo5234drawCircleV9BoPsw(Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo5235drawCircleVaOC9Bg(long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    @er
    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo5236drawImage9jGpkUE(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawImage-AZ2fEMs */
    default void mo5237drawImageAZ2fEMs(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        m5318drawImageAZ2fEMs$default(this, imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, 0, Fields.RotationY, null);
    }

    /* renamed from: drawImage-gbVJVH8 */
    void mo5238drawImagegbVJVH8(ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawLine-1RTmtNc */
    void mo5239drawLine1RTmtNc(Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo5240drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2);

    /* renamed from: drawOval-AsUm42w */
    void mo5241drawOvalAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawOval-n-J9OG0 */
    void mo5242drawOvalnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawPath-GBMwjPU */
    void mo5243drawPathGBMwjPU(Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawPath-LG529CI */
    void mo5244drawPathLG529CI(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo5245drawPointsF8ZwMP8(List<Offset> list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo5246drawPointsGsft0Ws(List<Offset> list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3);

    /* renamed from: drawRect-AsUm42w */
    void mo5247drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawRect-n-J9OG0 */
    void mo5248drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo5249drawRoundRectZuiqVtQ(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo5250drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i);

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    default long mo5334getCenterF1C5BW0() {
        return SizeKt.m4595getCenteruvyYCjk(getDrawContext().mo5256getSizeNHjbRc());
    }

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo5335getSizeNHjbRc() {
        return getDrawContext().mo5256getSizeNHjbRc();
    }

    /* renamed from: record-JVtK1S4, reason: not valid java name */
    default void mo5336recordJVtK1S4(GraphicsLayer graphicsLayer, long j, ky kyVar) {
        graphicsLayer.m5429recordmLhObY(this, getLayoutDirection(), j, new DrawScope$record$1(this, kyVar));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m5344drawImageAZ2fEMs(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
            DrawScope.super.mo5237drawImageAZ2fEMs(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, i2);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m5359getCenterF1C5BW0(DrawScope drawScope) {
            return DrawScope.super.mo5334getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m5360getSizeNHjbRc(DrawScope drawScope) {
            return DrawScope.super.mo5335getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m5361recordJVtK1S4(DrawScope drawScope, GraphicsLayer graphicsLayer, long j, ky kyVar) {
            DrawScope.super.mo5336recordJVtK1S4(graphicsLayer, j, kyVar);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m5363roundToPxR2X_6o(DrawScope drawScope, long j) {
            return DrawScope.super.mo360roundToPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5364roundToPx0680j_4(DrawScope drawScope, float f) {
            return DrawScope.super.mo361roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5365toDpGaN1DYA(DrawScope drawScope, long j) {
            return DrawScope.super.mo362toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5366toDpu2uoSUM(DrawScope drawScope, float f) {
            return DrawScope.super.mo363toDpu2uoSUM(f);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5368toDpSizekrfVVM(DrawScope drawScope, long j) {
            return DrawScope.super.mo365toDpSizekrfVVM(j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5369toPxR2X_6o(DrawScope drawScope, long j) {
            return DrawScope.super.mo366toPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5370toPx0680j_4(DrawScope drawScope, float f) {
            return DrawScope.super.mo367toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(DrawScope drawScope, DpRect dpRect) {
            return DrawScope.super.toRect(dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m5371toSizeXkaWNTQ(DrawScope drawScope, long j) {
            return DrawScope.super.mo368toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5372toSp0xMU5do(DrawScope drawScope, float f) {
            return DrawScope.super.mo369toSp0xMU5do(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5373toSpkPz2Gy4(DrawScope drawScope, float f) {
            return DrawScope.super.mo370toSpkPz2Gy4(f);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5367toDpu2uoSUM(DrawScope drawScope, int i) {
            return DrawScope.super.mo364toDpu2uoSUM(i);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5374toSpkPz2Gy4(DrawScope drawScope, int i) {
            return DrawScope.super.mo371toSpkPz2Gy4(i);
        }
    }
}
