package androidx.compose.ui.text.font;

import androidx.compose.ui.util.MathHelpersKt;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontWeightKt {
    public static final FontWeight lerp(FontWeight fontWeight, FontWeight fontWeight2, float f) {
        return new FontWeight(y80.h(MathHelpersKt.lerp(fontWeight.getWeight(), fontWeight2.getWeight(), f), 1, 1000));
    }
}
