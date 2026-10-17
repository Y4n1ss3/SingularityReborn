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
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TaxiAlertKt {
    private static ImageVector _taxiAlert;

    public static final ImageVector getTaxiAlert(Icons.Sharp sharp) {
        ImageVector imageVector = _taxiAlert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TaxiAlert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 13.0f);
        b.curveToRelative(-1.91f, 0.0f, -3.63f, -0.76f, -4.89f, -2.0f);
        uo.g(b, 4.81f, 1.04f, -3.0f, 5.44f);
        b.curveTo(11.1f, 7.37f, 11.0f, 6.7f, 11.0f, 6.0f);
        b.reflectiveCurveToRelative(0.1f, -1.37f, 0.29f, -2.0f);
        r6.y(b, 8.0f, 2.0f, 4.43f);
        af0.m(b, 2.0f, 13.0f, 9.0f, 3.0f);
        r6.D(b, -2.0f, 12.0f, 2.0f, 3.0f);
        b.verticalLineToRelative(-9.0f);
        b.lineToRelative(-0.09f, -0.27f);
        b.curveTo(19.3f, 12.9f, 18.66f, 13.0f, 18.0f, 13.0f);
        b.close();
        b.moveTo(6.5f, 17.0f);
        b.curveTo(5.67f, 17.0f, 5.0f, 16.33f, 5.0f, 15.5f);
        b.reflectiveCurveTo(5.67f, 14.0f, 6.5f, 14.0f);
        b.reflectiveCurveTo(8.0f, 14.67f, 8.0f, 15.5f);
        b.reflectiveCurveTo(7.33f, 17.0f, 6.5f, 17.0f);
        b.close();
        b.moveTo(15.5f, 17.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 16.33f, 17.0f, 15.5f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(18.0f, 1.0f);
        b2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b2.reflectiveCurveTo(20.76f, 1.0f, 18.0f, 1.0f);
        af0.r(b2, 18.5f, 9.0f, -1.0f, 8.0f);
        uo.r(b2, 1.0f, 9.0f, 18.5f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.h(b2, -1.0f, 3.0f, 1.0f, 7.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _taxiAlert = build;
        build.getClass();
        return build;
    }
}
