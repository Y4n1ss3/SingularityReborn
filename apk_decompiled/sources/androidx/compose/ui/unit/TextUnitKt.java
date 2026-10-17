package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m7817TextUnitanM5pPY(float f, long j) {
        return pack(j, f);
    }

    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m7818checkArithmeticR2X_6o(long j) {
        if (TextUnit.m7803getRawTypeimpl(j) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m7819checkArithmeticNB67dxo(long j, long j2) {
        if (!((TextUnit.m7803getRawTypeimpl(j) == 0 || TextUnit.m7803getRawTypeimpl(j2) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m7833equalsimpl0(TextUnit.m7804getTypeUIouoOA(j), TextUnit.m7804getTypeUIouoOA(j2))) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m7835toStringimpl(TextUnit.m7804getTypeUIouoOA(j))) + " and " + ((Object) TextUnitType.m7835toStringimpl(TextUnit.m7804getTypeUIouoOA(j2))));
    }

    /* renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m7820checkArithmeticvU0ePk(long j, long j2, long j3) {
        boolean z = false;
        if (!((TextUnit.m7803getRawTypeimpl(j) == 0 || TextUnit.m7803getRawTypeimpl(j2) == 0 || TextUnit.m7803getRawTypeimpl(j3) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m7833equalsimpl0(TextUnit.m7804getTypeUIouoOA(j), TextUnit.m7804getTypeUIouoOA(j2)) && TextUnitType.m7833equalsimpl0(TextUnit.m7804getTypeUIouoOA(j2), TextUnit.m7804getTypeUIouoOA(j3))) {
            z = true;
        }
        if (z) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m7835toStringimpl(TextUnit.m7804getTypeUIouoOA(j))) + " and " + ((Object) TextUnitType.m7835toStringimpl(TextUnit.m7804getTypeUIouoOA(j2))));
    }

    public static final long getEm(double d) {
        return pack(UNIT_TYPE_EM, (float) d);
    }

    public static final long getSp(double d) {
        return pack(UNIT_TYPE_SP, (float) d);
    }

    /* renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m7821isSpecifiedR2X_6o(long j) {
        return !(TextUnit.m7803getRawTypeimpl(j) == 0);
    }

    /* renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m7823isUnspecifiedR2X_6o(long j) {
        return TextUnit.m7803getRawTypeimpl(j) == 0;
    }

    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m7825lerpC3pnCVY(long j, long j2, float f) {
        m7819checkArithmeticNB67dxo(j, j2);
        return pack(TextUnit.m7803getRawTypeimpl(j), MathHelpersKt.lerp(TextUnit.m7805getValueimpl(j), TextUnit.m7805getValueimpl(j2), f));
    }

    public static final long pack(long j, float f) {
        return TextUnit.m7797constructorimpl(j | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    /* renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m7826takeOrElseeAf_CNQ(long j, iy iyVar) {
        return !((TextUnit.m7803getRawTypeimpl(j) > 0L ? 1 : (TextUnit.m7803getRawTypeimpl(j) == 0L ? 0 : -1)) == 0) ? j : ((TextUnit) iyVar.invoke()).m7814unboximpl();
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m7827timesmpE4wyQ(double d, long j) {
        m7818checkArithmeticR2X_6o(j);
        return pack(TextUnit.m7803getRawTypeimpl(j), TextUnit.m7805getValueimpl(j) * ((float) d));
    }

    public static /* synthetic */ void getEm$annotations(float f) {
    }

    public static /* synthetic */ void getSp$annotations(float f) {
    }

    public static /* synthetic */ void getEm$annotations(int i) {
    }

    public static /* synthetic */ void getSp$annotations(int i) {
    }

    public static final long getEm(float f) {
        return pack(UNIT_TYPE_EM, f);
    }

    public static final long getSp(float f) {
        return pack(UNIT_TYPE_SP, f);
    }

    public static final long getEm(int i) {
        return pack(UNIT_TYPE_EM, i);
    }

    public static final long getSp(int i) {
        return pack(UNIT_TYPE_SP, i);
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m7828timesmpE4wyQ(float f, long j) {
        m7818checkArithmeticR2X_6o(j);
        return pack(TextUnit.m7803getRawTypeimpl(j), TextUnit.m7805getValueimpl(j) * f);
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m7829timesmpE4wyQ(int i, long j) {
        m7818checkArithmeticR2X_6o(j);
        return pack(TextUnit.m7803getRawTypeimpl(j), TextUnit.m7805getValueimpl(j) * i);
    }

    public static /* synthetic */ void getEm$annotations(double d) {
    }

    public static /* synthetic */ void getSp$annotations(double d) {
    }

    /* renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m7822isSpecifiedR2X_6o$annotations(long j) {
    }

    /* renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m7824isUnspecifiedR2X_6o$annotations(long j) {
    }
}
