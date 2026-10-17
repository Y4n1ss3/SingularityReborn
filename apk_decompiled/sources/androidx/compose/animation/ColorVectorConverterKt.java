package androidx.compose.animation;

import androidx.compose.ui.graphics.Color;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ColorVectorConverterKt {
    private static final ky ColorToVector = ColorVectorConverterKt$ColorToVector$1.INSTANCE;

    public static final ky getVectorConverter(Color.Companion companion) {
        return ColorToVector;
    }
}
