package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import defpackage.iy;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DpKt {
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m7632DpOffsetYgX7TsA(float f, float f2) {
        return DpOffset.m7667constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m7633DpSizeYgX7TsA(float f, float f2) {
        return DpSize.m7700constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m7634coerceAtLeastYgX7TsA(float f, float f2) {
        if (f < f2) {
            f = f2;
        }
        return Dp.m7611constructorimpl(f);
    }

    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m7635coerceAtMostYgX7TsA(float f, float f2) {
        if (f > f2) {
            f = f2;
        }
        return Dp.m7611constructorimpl(f);
    }

    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m7636coerceIn2z7ARbQ(float f, float f2, float f3) {
        return Dp.m7611constructorimpl(y80.g(f, f2, f3));
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m7637getCenterEaSLcWc(long j) {
        float m7611constructorimpl = Dp.m7611constructorimpl(DpSize.m7709getWidthD9Ej5fM(j) / 2.0f);
        float m7611constructorimpl2 = Dp.m7611constructorimpl(DpSize.m7707getHeightD9Ej5fM(j) / 2.0f);
        return DpOffset.m7667constructorimpl((Float.floatToRawIntBits(m7611constructorimpl2) & 4294967295L) | (Float.floatToRawIntBits(m7611constructorimpl) << 32));
    }

    public static final float getDp(int i) {
        return Dp.m7611constructorimpl(i);
    }

    public static final float getHeight(DpRect dpRect) {
        return Dp.m7611constructorimpl(dpRect.m7693getBottomD9Ej5fM() - dpRect.m7696getTopD9Ej5fM());
    }

    public static final long getSize(DpRect dpRect) {
        return m7633DpSizeYgX7TsA(Dp.m7611constructorimpl(dpRect.m7695getRightD9Ej5fM() - dpRect.m7694getLeftD9Ej5fM()), Dp.m7611constructorimpl(dpRect.m7693getBottomD9Ej5fM() - dpRect.m7696getTopD9Ej5fM()));
    }

    public static final float getWidth(DpRect dpRect) {
        return Dp.m7611constructorimpl(dpRect.m7695getRightD9Ej5fM() - dpRect.m7694getLeftD9Ej5fM());
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m7639isFinite0680j_4(float f) {
        return (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m7641isSpecified0680j_4(float f) {
        return !Float.isNaN(f);
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m7643isSpecifiedEaSLcWc(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m7645isSpecifiedjoFl9I(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m7647isUnspecified0680j_4(float f) {
        return Float.isNaN(f);
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m7649isUnspecifiedEaSLcWc(long j) {
        return j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m7651isUnspecifiedjoFl9I(long j) {
        return j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m7653lerpIDex15A(long j, long j2, float f) {
        float m7654lerpMdfbLM = m7654lerpMdfbLM(DpSize.m7709getWidthD9Ej5fM(j), DpSize.m7709getWidthD9Ej5fM(j2), f);
        float m7654lerpMdfbLM2 = m7654lerpMdfbLM(DpSize.m7707getHeightD9Ej5fM(j), DpSize.m7707getHeightD9Ej5fM(j2), f);
        return DpSize.m7700constructorimpl((Float.floatToRawIntBits(m7654lerpMdfbLM) << 32) | (Float.floatToRawIntBits(m7654lerpMdfbLM2) & 4294967295L));
    }

    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m7654lerpMdfbLM(float f, float f2, float f3) {
        return Dp.m7611constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }

    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m7655lerpxhh869w(long j, long j2, float f) {
        float lerp = MathHelpersKt.lerp(DpOffset.m7672getXD9Ej5fM(j), DpOffset.m7672getXD9Ej5fM(j2), f);
        float lerp2 = MathHelpersKt.lerp(DpOffset.m7674getYD9Ej5fM(j), DpOffset.m7674getYD9Ej5fM(j2), f);
        return DpOffset.m7667constructorimpl((Float.floatToRawIntBits(lerp) << 32) | (Float.floatToRawIntBits(lerp2) & 4294967295L));
    }

    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m7656maxYgX7TsA(float f, float f2) {
        return Dp.m7611constructorimpl(Math.max(f, f2));
    }

    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m7657minYgX7TsA(float f, float f2) {
        return Dp.m7611constructorimpl(Math.min(f, f2));
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m7658takeOrElseD5KLDUw(float f, iy iyVar) {
        return !Float.isNaN(f) ? f : ((Dp) iyVar.invoke()).m7625unboximpl();
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m7659takeOrElsegVKV90s(long j, iy iyVar) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j : ((DpOffset) iyVar.invoke()).m7680unboximpl();
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m7660takeOrElseitqla9I(long j, iy iyVar) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j : ((DpSize) iyVar.invoke()).m7717unboximpl();
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m7661times3ABfNKs(double d, float f) {
        return Dp.m7611constructorimpl(((float) d) * f);
    }

    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m7665times6HolHcs(int i, long j) {
        return DpSize.m7715timesGh9hcWk(j, i);
    }

    public static /* synthetic */ void getDp$annotations(float f) {
    }

    public static /* synthetic */ void getDp$annotations(int i) {
    }

    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m7664times6HolHcs(float f, long j) {
        return DpSize.m7714timesGh9hcWk(j, f);
    }

    public static final float getDp(double d) {
        return Dp.m7611constructorimpl((float) d);
    }

    public static final float getDp(float f) {
        return Dp.m7611constructorimpl(f);
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m7662times3ABfNKs(float f, float f2) {
        return Dp.m7611constructorimpl(f * f2);
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m7663times3ABfNKs(int i, float f) {
        return Dp.m7611constructorimpl(i * f);
    }

    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7638getCenterEaSLcWc$annotations(long j) {
    }

    public static /* synthetic */ void getDp$annotations(double d) {
    }

    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m7640isFinite0680j_4$annotations(float f) {
    }

    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m7642isSpecified0680j_4$annotations(float f) {
    }

    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7644isSpecifiedEaSLcWc$annotations(long j) {
    }

    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m7646isSpecifiedjoFl9I$annotations(long j) {
    }

    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m7648isUnspecified0680j_4$annotations(float f) {
    }

    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m7650isUnspecifiedEaSLcWc$annotations(long j) {
    }

    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m7652isUnspecifiedjoFl9I$annotations(long j) {
    }
}
