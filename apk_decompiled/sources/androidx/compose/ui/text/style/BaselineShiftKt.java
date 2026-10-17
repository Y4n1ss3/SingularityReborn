package androidx.compose.ui.text.style;

import androidx.compose.ui.util.MathHelpersKt;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class BaselineShiftKt {
    /* renamed from: isSpecified-4Dl_Bck, reason: not valid java name */
    public static final boolean m7366isSpecified4Dl_Bck(float f) {
        return !Float.isNaN(f);
    }

    /* renamed from: lerp-jWV1Mfo, reason: not valid java name */
    public static final float m7367lerpjWV1Mfo(float f, float f2, float f3) {
        return BaselineShift.m7352constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }

    /* renamed from: takeOrElse-JpAxnlU, reason: not valid java name */
    public static final float m7368takeOrElseJpAxnlU(float f, iy iyVar) {
        return Float.isNaN(f) ? ((BaselineShift) iyVar.invoke()).m7357unboximpl() : f;
    }
}
