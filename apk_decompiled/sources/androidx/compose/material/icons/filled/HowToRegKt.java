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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HowToRegKt {
    private static ImageVector _howToReg;

    public static final ImageVector getHowToReg(Icons.Filled filled) {
        ImageVector imageVector = _howToReg;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.HowToReg", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        PathFillType.Companion companion = PathFillType.Companion;
        int m5057getEvenOddRgk1Os = companion.m5057getEvenOddRgk1Os();
        Color.Companion companion2 = Color.Companion;
        SolidColor solidColor = new SolidColor(companion2.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion3 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion3.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion4 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion4.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(9.0f, 17.0f, 3.0f, -2.94f);
        e.curveToRelative(-0.39f, -0.04f, -0.68f, -0.06f, -1.0f, -0.06f);
        e.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        e.verticalLineToRelative(2.0f);
        e.horizontalLineToRelative(9.0f);
        e.lineToRelative(-3.0f, -3.0f);
        e.close();
        e.moveTo(11.0f, 12.0f);
        e.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        e.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        e.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        e.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), m5057getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int m5057getEvenOddRgk1Os2 = companion.m5057getEvenOddRgk1Os();
        SolidColor solidColor2 = new SolidColor(companion2.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion3.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion4.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.47f, 20.5f, 12.0f, 17.0f);
        i.lineToRelative(1.4f, -1.41f);
        i.lineToRelative(2.07f, 2.08f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, 5.13f, -5.17f, 1.4f, 1.41f), m5057getEvenOddRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _howToReg = build;
        build.getClass();
        return build;
    }
}
