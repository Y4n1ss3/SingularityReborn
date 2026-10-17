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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoStrollerKt {
    private static ImageVector _noStroller;

    public static final ImageVector getNoStroller(Icons.Filled filled) {
        ImageVector imageVector = _noStroller;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoStroller", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.0f, 18.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveTo(4.9f, 18.0f, 6.0f, 18.0f);
        b.close();
        b.moveTo(18.65f, 3.0f);
        b.curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f);
        b.lineToRelative(-3.5f, 4.11f);
        b.lineTo(17.0f, 14.17f);
        b.verticalLineToRelative(-7.9f);
        b.curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f);
        b.curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f);
        uf.z(b, 7.0f, 2.0f, 6.48f);
        b.curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f);
        k4.r(b, 10.67f, 10.67f, 2.81f, 2.81f);
        b.lineTo(1.39f, 4.22f);
        b.lineToRelative(7.97f, 7.97f);
        b.lineTo(6.7f, 15.31f);
        b.curveToRelative(-0.55f, 0.65f, -0.09f, 1.65f, 0.76f, 1.65f);
        b.horizontalLineToRelative(6.66f);
        b.lineToRelative(1.17f, 1.17f);
        b.curveTo(14.54f, 18.42f, 14.0f, 19.14f, 14.0f, 20.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.curveToRelative(0.86f, 0.0f, 1.58f, -0.54f, 1.87f, -1.3f);
        b.lineToRelative(1.91f, 1.91f);
        b.lineToRelative(1.41f, -1.41f);
        gy.B(b, -4.8f, -4.8f, 10.67f, 10.67f);
        b.moveTo(13.47f, 5.03f);
        b.curveToRelative(0.27f, -0.32f, 0.58f, -0.72f, 0.98f, -1.09f);
        b.curveToRelative(-2.46f, -1.19f, -5.32f, -1.22f, -7.81f, -0.13f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 4.25f, 4.25f, 13.47f, 5.03f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noStroller = build;
        build.getClass();
        return build;
    }
}
