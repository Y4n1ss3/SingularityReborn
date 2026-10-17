package androidx.compose.material.icons.sharp;

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
import defpackage.j50;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoStrollerKt {
    private static ImageVector _noStroller;

    public static final ImageVector getNoStroller(Icons.Sharp sharp) {
        ImageVector imageVector = _noStroller;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NoStroller", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(10.91f, 8.08f, 6.53f, 3.7f);
        i.curveTo(7.6f, 3.25f, 8.77f, 3.0f, 10.0f, 3.0f);
        i.curveToRelative(1.56f, 0.0f, 3.03f, 0.4f, 4.3f, 1.1f);
        uo.l(i, 10.91f, 8.08f, 21.19f, 21.19f);
        i.lineToRelative(-4.78f, -4.78f);
        i.lineToRelative(-5.75f, -5.75f);
        i.lineTo(2.81f, 2.81f);
        i.lineTo(1.39f, 4.22f);
        i.lineToRelative(7.97f, 7.97f);
        i.lineTo(5.27f, 17.0f);
        i.horizontalLineToRelative(8.9f);
        i.lineToRelative(1.13f, 1.13f);
        i.curveToRelative(-0.88f, 0.33f, -1.47f, 1.25f, -1.26f, 2.28f);
        i.curveToRelative(0.15f, 0.76f, 0.78f, 1.39f, 1.54f, 1.54f);
        i.curveToRelative(1.03f, 0.21f, 1.95f, -0.38f, 2.28f, -1.26f);
        gy.B(i, 1.91f, 1.91f, 21.19f, 21.19f);
        i.moveTo(6.0f, 18.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        i.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        i.reflectiveCurveTo(7.1f, 18.0f, 6.0f, 18.0f);
        i.close();
        i.moveTo(17.0f, 6.27f);
        i.curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f);
        i.curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f);
        uf.z(i, 7.0f, 2.0f, 6.48f);
        i.curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f);
        i.curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f);
        i.lineToRelative(-3.5f, 4.11f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(i, 17.0f, 14.17f, 6.27f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noStroller = build;
        build.getClass();
        return build;
    }
}
