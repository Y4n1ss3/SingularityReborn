package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IcecreamKt {
    private static ImageVector _icecream;

    public static final ImageVector getIcecream(Icons.Filled filled) {
        ImageVector imageVector = _icecream;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Icecream", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int m5057getEvenOddRgk1Os = PathFillType.Companion.m5057getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(8.79f, 12.4f, 3.26f, 6.22f);
        e.lineToRelative(3.17f, -6.21f);
        e.curveToRelative(-0.11f, -0.08f, -0.21f, -0.16f, -0.3f, -0.25f);
        e.curveTo(14.08f, 12.69f, 13.07f, 13.0f, 12.0f, 13.0f);
        e.reflectiveCurveToRelative(-2.08f, -0.31f, -2.92f, -0.84f);
        e.curveTo(8.99f, 12.25f, 8.89f, 12.33f, 8.79f, 12.4f);
        e.close();
        e.moveTo(6.83f, 12.99f);
        e.curveTo(5.25f, 12.9f, 4.0f, 11.6f, 4.0f, 10.0f);
        e.curveToRelative(0.0f, -1.49f, 1.09f, -2.73f, 2.52f, -2.96f);
        e.curveTo(6.75f, 4.22f, 9.12f, 2.0f, 12.0f, 2.0f);
        e.reflectiveCurveToRelative(5.25f, 2.22f, 5.48f, 5.04f);
        e.curveTo(18.91f, 7.27f, 20.0f, 8.51f, 20.0f, 10.0f);
        e.curveToRelative(0.0f, 1.59f, -1.24f, 2.9f, -2.81f, 2.99f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 12.07f, 23.0f, 6.83f, 12.99f), m5057getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _icecream = build;
        build.getClass();
        return build;
    }
}
