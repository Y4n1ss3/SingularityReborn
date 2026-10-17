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
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GTranslateKt {
    private static ImageVector _gTranslate;

    public static final ImageVector getGTranslate(Icons.Filled filled) {
        ImageVector imageVector = _gTranslate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.GTranslate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.0f, 4.0f, 11.0f, 4.0f);
        i.lineToRelative(-1.0f, -3.0f);
        i.lineTo(3.0f, 1.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(15.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        kf0.B(i, 8.0f, 1.0f, 3.0f, 9.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(23.0f, 6.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.close();
        i.moveTo(7.0f, 16.0f);
        i.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        i.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        i.curveToRelative(1.35f, 0.0f, 2.48f, 0.5f, 3.35f, 1.3f);
        i.lineTo(9.03f, 8.57f);
        i.curveToRelative(-0.38f, -0.36f, -1.04f, -0.78f, -2.03f, -0.78f);
        i.curveToRelative(-1.74f, 0.0f, -3.15f, 1.44f, -3.15f, 3.21f);
        i.reflectiveCurveTo(5.26f, 14.21f, 7.0f, 14.21f);
        i.curveToRelative(2.01f, 0.0f, 2.84f, -1.44f, 2.92f, -2.41f);
        af0.m(i, 7.0f, 11.8f, -1.71f, 4.68f);
        i.curveToRelative(0.07f, 0.31f, 0.12f, 0.61f, 0.12f, 1.02f);
        i.curveTo(11.8f, 13.97f, 9.89f, 16.0f, 7.0f, 16.0f);
        af0.l(i, 13.17f, 10.58f, 3.7f);
        i.curveToRelative(-0.43f, 1.25f, -1.11f, 2.43f, -2.05f, 3.47f);
        i.curveToRelative(-0.31f, -0.35f, -0.6f, -0.72f, -0.86f, -1.1f);
        fc.B(i, -0.79f, -2.37f, 21.5f, 20.5f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        i.lineTo(14.0f, 21.5f);
        i.lineToRelative(2.0f, -2.5f);
        i.lineToRelative(-1.04f, -3.1f);
        i.lineToRelative(3.1f, 3.1f);
        i.lineToRelative(0.92f, -0.92f);
        i.lineToRelative(-3.3f, -3.25f);
        i.lineToRelative(0.02f, -0.02f);
        i.curveToRelative(1.13f, -1.25f, 1.93f, -2.69f, 2.4f, -4.22f);
        af0.m(i, 20.0f, 10.59f, -1.3f, -4.53f);
        fc.w(i, 15.47f, 8.0f, -1.29f, 1.29f);
        uo.n(i, -1.44f, 11.46f, 5.5f, 9.04f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(i, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gTranslate = build;
        build.getClass();
        return build;
    }
}
