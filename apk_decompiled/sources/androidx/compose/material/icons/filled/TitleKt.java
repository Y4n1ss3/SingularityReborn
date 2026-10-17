package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.kf0;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TitleKt {
    private static ImageVector _title;

    public static final ImageVector getTitle(Icons.Filled filled) {
        ImageVector imageVector = _title;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(new ImageVector.Builder("Filled.Title", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null), kf0.l(kp0.s(5.0f, 4.0f, 3.0f, 5.5f, 12.0f), 3.0f, 7.0f, 19.0f, 4.0f), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, StrokeCap.Companion.m5135getButtKaPHkGw(), StrokeJoin.Companion.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _title = build;
        build.getClass();
        return build;
    }
}
