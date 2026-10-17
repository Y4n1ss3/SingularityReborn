package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ScaleFactorKt {
    public static final long ScaleFactor(float f, float f2) {
        return ScaleFactor.m6347constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m6361divUQTWf7w(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L));
        return Size.m4576constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m6362isSpecifiedFK8aYYs(long j) {
        return j != ScaleFactor.Companion.m6360getUnspecified_hLwfpc();
    }

    /* renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m6364isUnspecifiedFK8aYYs(long j) {
        return j == ScaleFactor.Companion.m6360getUnspecified_hLwfpc();
    }

    /* renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m6366lerpbDIf60(long j, long j2, float f) {
        float lerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float lerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return ScaleFactor.m6347constructorimpl((Float.floatToRawIntBits(lerp) << 32) | (Float.floatToRawIntBits(lerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m6367takeOrElseoyDd2qo(long j, iy iyVar) {
        return j != ScaleFactor.Companion.m6360getUnspecified_hLwfpc() ? j : ((ScaleFactor) iyVar.invoke()).m6358unboximpl();
    }

    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m6368timesUQTWf7w(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return Size.m4576constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    /* renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m6369timesmw2e94(long j, long j2) {
        return m6368timesUQTWf7w(j2, j);
    }

    /* renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m6363isSpecifiedFK8aYYs$annotations(long j) {
    }

    /* renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m6365isUnspecifiedFK8aYYs$annotations(long j) {
    }
}
