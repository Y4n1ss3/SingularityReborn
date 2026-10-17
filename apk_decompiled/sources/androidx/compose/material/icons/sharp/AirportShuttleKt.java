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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirportShuttleKt {
    private static ImageVector _airportShuttle;

    public static final ImageVector getAirportShuttle(Icons.Sharp sharp) {
        ImageVector imageVector = _airportShuttle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AirportShuttle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(17.0f, 5.0f, 1.0f, 5.0f, 11.0f);
        s.horizontalLineToRelative(2.0f);
        s.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        s.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        s.horizontalLineToRelative(6.0f);
        s.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        s.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        j50.u(s, 2.0f, -5.0f, -6.0f, -6.0f);
        s.moveTo(3.0f, 11.0f);
        fc.w(s, 3.0f, 7.0f, 4.0f, 4.0f);
        uo.l(s, 3.0f, 11.0f, 6.0f, 17.25f);
        s.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        s.reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f);
        s.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        s.reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f);
        k4.r(s, 13.0f, 11.0f, 9.0f, 11.0f);
        r6.m(s, 9.0f, 7.0f, 4.0f, 4.0f);
        s.moveTo(18.0f, 17.25f);
        s.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        s.reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f);
        s.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        s.reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f);
        k4.r(s, 15.0f, 11.0f, 15.0f, 7.0f);
        s.horizontalLineToRelative(1.0f);
        s.lineToRelative(4.0f, 4.0f);
        s.horizontalLineToRelative(-5.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airportShuttle = build;
        build.getClass();
        return build;
    }
}
