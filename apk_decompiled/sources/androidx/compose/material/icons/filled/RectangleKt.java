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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RectangleKt {
    private static ImageVector _rectangle;

    public static final ImageVector getRectangle(Icons.Filled filled) {
        ImageVector imageVector = _rectangle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(new ImageVector.Builder("Filled.Rectangle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null), kf0.c(2.0f, 4.0f, 20.0f, 16.0f, -20.0f), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, StrokeCap.Companion.m5135getButtKaPHkGw(), StrokeJoin.Companion.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rectangle = build;
        build.getClass();
        return build;
    }
}
