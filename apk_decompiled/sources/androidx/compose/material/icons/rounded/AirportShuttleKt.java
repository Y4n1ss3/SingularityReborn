package androidx.compose.material.icons.rounded;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirportShuttleKt {
    private static ImageVector _airportShuttle;

    public static final ImageVector getAirportShuttle(Icons.Rounded rounded) {
        ImageVector imageVector = _airportShuttle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AirportShuttle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.41f, 10.41f, -4.83f, -4.83f);
        e.curveToRelative(-0.37f, -0.37f, -0.88f, -0.58f, -1.41f, -0.58f);
        e.lineTo(3.0f, 5.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        e.verticalLineToRelative(7.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        e.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        e.horizontalLineToRelative(6.0f);
        e.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        e.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineToRelative(-2.17f);
        e.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.42f);
        k4.r(e, 3.0f, 10.0f, 3.0f, 8.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        bv.C(e, 3.0f, 4.0f, 4.0f, 11.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.close();
        e.moveTo(6.0f, 17.25f);
        e.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        e.reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f);
        e.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        e.reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f);
        k4.r(e, 13.0f, 11.0f, 9.0f, 11.0f);
        r6.m(e, 9.0f, 7.0f, 4.0f, 4.0f);
        e.moveTo(18.0f, 17.25f);
        e.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        e.reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f);
        e.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        e.reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f);
        k4.r(e, 15.0f, 11.0f, 15.0f, 7.0f);
        e.horizontalLineToRelative(1.0f);
        e.lineToRelative(4.0f, 4.0f);
        e.horizontalLineToRelative(-5.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airportShuttle = build;
        build.getClass();
        return build;
    }
}
