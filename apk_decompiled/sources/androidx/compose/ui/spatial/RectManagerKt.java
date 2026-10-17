package androidx.compose.ui.spatial;

import androidx.compose.ui.unit.IntOffset;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RectManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: analyzeComponents-58bKbWc, reason: not valid java name */
    public static final int m6857analyzeComponents58bKbWc(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i2 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 << 1) | i;
    }

    private static final boolean getHasNonTranslationComponents(int i) {
        return (i & 2) == 0;
    }

    private static final boolean isIdentity(int i) {
        return i == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isSet--gyyYBs, reason: not valid java name */
    public static final boolean m6858isSetgyyYBs(long j) {
        return !IntOffset.m7738equalsimpl0(j, IntOffset.Companion.m7749getMaxnOccac());
    }

    private static /* synthetic */ void getHasNonTranslationComponents$annotations(int i) {
    }

    private static /* synthetic */ void isIdentity$annotations(int i) {
    }

    public static final int toInt(boolean z) {
        return z ? 1 : 0;
    }
}
