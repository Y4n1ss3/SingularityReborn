package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import defpackage.er;
import defpackage.ki0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidPaint_androidKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final Paint asComposePaint(android.graphics.Paint paint) {
        return new AndroidPaint(paint);
    }

    public static final float getNativeAlpha(android.graphics.Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(android.graphics.Paint paint) {
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(android.graphics.Paint paint) {
        return ColorKt.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(android.graphics.Paint paint) {
        return !paint.isFilterBitmap() ? FilterQuality.Companion.m4863getNonefv9h1I() : FilterQuality.Companion.m4861getLowfv9h1I();
    }

    public static final android.graphics.Paint getNativePaint(Paint paint) {
        if (!(paint instanceof AndroidPaint)) {
            InlineClassHelperKt.throwIllegalArgumentException("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + ki0.a(paint.getClass()).a());
        }
        return ((AndroidPaint) paint).getInternalPaint$ui_graphics();
    }

    public static final int getNativeStrokeCap(android.graphics.Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? StrokeCap.Companion.m5135getButtKaPHkGw() : StrokeCap.Companion.m5137getSquareKaPHkGw() : StrokeCap.Companion.m5136getRoundKaPHkGw() : StrokeCap.Companion.m5135getButtKaPHkGw();
    }

    public static final int getNativeStrokeJoin(android.graphics.Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? StrokeJoin.Companion.m5146getMiterLxFBmk8() : StrokeJoin.Companion.m5147getRoundLxFBmk8() : StrokeJoin.Companion.m5145getBevelLxFBmk8() : StrokeJoin.Companion.m5146getMiterLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(android.graphics.Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(android.graphics.Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(android.graphics.Paint paint) {
        Paint.Style style = paint.getStyle();
        return (style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? PaintingStyle.Companion.m5043getStrokeTiuSbCo() : PaintingStyle.Companion.m5042getFillTiuSbCo();
    }

    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(7);
    }

    public static final void setNativeAlpha(android.graphics.Paint paint, float f) {
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final void setNativeAntiAlias(android.graphics.Paint paint, boolean z) {
        paint.setAntiAlias(z);
    }

    /* renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m4642setNativeBlendModeGB0RdKg(android.graphics.Paint paint, int i) {
        WrapperVerificationHelperMethods.INSTANCE.m5187setBlendModeGB0RdKg(paint, i);
    }

    /* renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m4643setNativeColor4WTKRHQ(android.graphics.Paint paint, long j) {
        paint.setColor(ColorKt.m4815toArgb8_81llA(j));
    }

    public static final void setNativeColorFilter(android.graphics.Paint paint, ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    /* renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m4644setNativeFilterQuality50PEsBU(android.graphics.Paint paint, int i) {
        paint.setFilterBitmap(!FilterQuality.m4856equalsimpl0(i, FilterQuality.Companion.m4863getNonefv9h1I()));
    }

    public static final void setNativePathEffect(android.graphics.Paint paint, PathEffect pathEffect) {
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }

    public static final void setNativeShader(android.graphics.Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    /* renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m4645setNativeStrokeCapCSYIeUk(android.graphics.Paint paint, int i) {
        StrokeCap.Companion companion = StrokeCap.Companion;
        paint.setStrokeCap(StrokeCap.m5131equalsimpl0(i, companion.m5137getSquareKaPHkGw()) ? Paint.Cap.SQUARE : StrokeCap.m5131equalsimpl0(i, companion.m5136getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m5131equalsimpl0(i, companion.m5135getButtKaPHkGw()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m4646setNativeStrokeJoinkLtJ_vA(android.graphics.Paint paint, int i) {
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        paint.setStrokeJoin(StrokeJoin.m5141equalsimpl0(i, companion.m5146getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m5141equalsimpl0(i, companion.m5145getBevelLxFBmk8()) ? Paint.Join.BEVEL : StrokeJoin.m5141equalsimpl0(i, companion.m5147getRoundLxFBmk8()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void setNativeStrokeMiterLimit(android.graphics.Paint paint, float f) {
        paint.setStrokeMiter(f);
    }

    public static final void setNativeStrokeWidth(android.graphics.Paint paint, float f) {
        paint.setStrokeWidth(f);
    }

    /* renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m4647setNativeStyle5YerkU(android.graphics.Paint paint, int i) {
        paint.setStyle(PaintingStyle.m5038equalsimpl0(i, PaintingStyle.Companion.m5043getStrokeTiuSbCo()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    @er
    public static /* synthetic */ void NativePaint$annotations() {
    }
}
