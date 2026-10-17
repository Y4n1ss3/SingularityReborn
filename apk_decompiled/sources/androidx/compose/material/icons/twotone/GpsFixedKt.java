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
import defpackage.af0;
import defpackage.fc;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GpsFixedKt {
    private static ImageVector _gpsFixed;

    public static final ImageVector getGpsFixed(Icons.TwoTone twoTone) {
        ImageVector imageVector = _gpsFixed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.GpsFixed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 12.0f, -2.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 8.0f);
        b2.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        b2.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b2.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        b2.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        b2.close();
        b2.moveTo(12.0f, 14.0f);
        b2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b2.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b2.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b2.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b2.close();
        b2.moveTo(20.94f, 11.0f);
        b2.curveToRelative(-0.46f, -4.17f, -3.77f, -7.48f, -7.94f, -7.94f);
        fc.w(b2, 13.0f, 1.0f, -2.0f, 2.06f);
        b2.curveTo(6.83f, 3.52f, 3.52f, 6.83f, 3.06f, 11.0f);
        af0.m(b2, 1.0f, 11.0f, 2.0f, 2.06f);
        b2.curveToRelative(0.46f, 4.17f, 3.77f, 7.48f, 7.94f, 7.94f);
        fc.w(b2, 11.0f, 23.0f, 2.0f, -2.06f);
        b2.curveToRelative(4.17f, -0.46f, 7.48f, -3.77f, 7.94f, -7.94f);
        kp0.x(b2, 23.0f, 13.0f, -2.0f, -2.06f);
        b2.moveTo(12.0f, 19.0f);
        b2.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        b2.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        b2.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b2, -3.13f, 7.0f, -7.0f, 7.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gpsFixed = build;
        build.getClass();
        return build;
    }
}
