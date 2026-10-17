package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerIconKt;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HandwritingDetector_androidKt {
    public static final Modifier handwritingDetector(Modifier modifier, iy iyVar) {
        return StylusHandwriting_androidKt.isStylusHandwritingSupported() ? PointerIconKt.stylusHoverIcon(modifier, TextPointerIcon_androidKt.getHandwritingPointerIcon(), false, StylusHandwritingKt.getHandwritingBoundsExpansion()).then(new HandwritingDetectorElement(iyVar)) : modifier;
    }
}
