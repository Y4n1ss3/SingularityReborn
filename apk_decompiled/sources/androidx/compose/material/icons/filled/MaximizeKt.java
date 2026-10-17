package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MaximizeKt {
    private static ImageVector _maximize;

    public static final ImageVector getMaximize(Icons.Filled filled) {
        ImageVector imageVector = _maximize;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(new ImageVector.Builder("Filled.Maximize", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null), uf.f(3.0f, 3.0f, 18.0f, 2.0f, 3.0f), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, StrokeCap.Companion.m5135getButtKaPHkGw(), StrokeJoin.Companion.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _maximize = build;
        build.getClass();
        return build;
    }
}
