package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UnpublishedKt {
    private static ImageVector _unpublished;

    public static final ImageVector getUnpublished(Icons.Filled filled) {
        ImageVector imageVector = _unpublished;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Unpublished", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.19f, 21.19f, 2.81f, 2.81f);
        i.lineTo(1.39f, 4.22f);
        i.lineToRelative(2.27f, 2.27f);
        i.curveTo(2.61f, 8.07f, 2.0f, 9.96f, 2.0f, 12.0f);
        i.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        i.curveToRelative(2.04f, 0.0f, 3.93f, -0.61f, 5.51f, -1.66f);
        gy.B(i, 2.27f, 2.27f, 21.19f, 21.19f);
        i.moveTo(10.59f, 16.6f);
        i.lineToRelative(-4.24f, -4.24f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineToRelative(2.83f, 2.83f);
        i.lineToRelative(0.18f, -0.18f);
        gy.B(i, 1.41f, 1.41f, 10.59f, 16.6f);
        i.moveTo(13.59f, 10.76f);
        i.lineToRelative(-7.1f, -7.1f);
        i.curveTo(8.07f, 2.61f, 9.96f, 2.0f, 12.0f, 2.0f);
        i.curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f);
        i.curveToRelative(0.0f, 2.04f, -0.61f, 3.93f, -1.66f, 5.51f);
        i.lineToRelative(-5.34f, -5.34f);
        i.lineToRelative(2.65f, -2.65f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, -1.41f, -1.41f, 13.59f, 10.76f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unpublished = build;
        build.getClass();
        return build;
    }
}
