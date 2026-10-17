package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirlineSeatReclineNormalKt {
    private static ImageVector _airlineSeatReclineNormal;

    public static final ImageVector getAirlineSeatReclineNormal(Icons.TwoTone twoTone) {
        ImageVector imageVector = _airlineSeatReclineNormal;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AirlineSeatReclineNormal", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.59f, 5.41f);
        b.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        b.reflectiveCurveToRelative(2.05f, -0.78f, 2.83f, 0.0f);
        b.reflectiveCurveToRelative(0.78f, 2.05f, 0.0f, 2.83f);
        b.curveToRelative(-0.79f, 0.79f, -2.05f, 0.79f, -2.83f, 0.0f);
        k4.r(b, 6.0f, 16.0f, 6.0f, 7.0f);
        b.lineTo(4.0f, 7.0f);
        b.verticalLineToRelative(9.0f);
        b.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        bv.C(b, 6.0f, -2.0f, 9.0f, 19.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        k4.r(b, 20.0f, 20.07f, 14.93f, 15.0f);
        b.lineTo(11.5f, 15.0f);
        b.verticalLineToRelative(-3.68f);
        b.curveToRelative(1.4f, 1.15f, 3.6f, 2.16f, 5.5f, 2.16f);
        b.verticalLineToRelative(-2.16f);
        b.curveToRelative(-1.66f, 0.02f, -3.61f, -0.87f, -4.67f, -2.04f);
        b.lineToRelative(-1.4f, -1.55f);
        b.curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f);
        b.curveToRelative(-0.29f, -0.14f, -0.62f, -0.23f, -0.96f, -0.23f);
        b.horizontalLineToRelative(-0.03f);
        b.curveTo(8.01f, 7.0f, 7.0f, 8.01f, 7.0f, 9.25f);
        b.lineTo(7.0f, 15.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.horizontalLineToRelative(5.07f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 3.5f, 3.5f, 20.0f, 20.07f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatReclineNormal = build;
        build.getClass();
        return build;
    }
}
