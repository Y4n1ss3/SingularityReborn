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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirlineSeatIndividualSuiteKt {
    private static ImageVector _airlineSeatIndividualSuite;

    public static final ImageVector getAirlineSeatIndividualSuite(Icons.Sharp sharp) {
        ImageVector imageVector = _airlineSeatIndividualSuite;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AirlineSeatIndividualSuite", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.0f, 13.0f);
        b.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        b.reflectiveCurveTo(8.65f, 7.0f, 7.0f, 7.0f);
        b.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        b.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        k4.r(b, 23.0f, 7.0f, 11.0f, 7.0f);
        b.verticalLineToRelative(7.0f);
        b.lineTo(3.0f, 14.0f);
        b.lineTo(3.0f, 7.0f);
        af0.m(b, 1.0f, 7.0f, 10.0f, 22.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 23.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatIndividualSuite = build;
        build.getClass();
        return build;
    }
}
