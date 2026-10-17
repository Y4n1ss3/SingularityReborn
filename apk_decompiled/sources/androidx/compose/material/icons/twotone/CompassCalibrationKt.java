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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompassCalibrationKt {
    private static ImageVector _compassCalibration;

    public static final ImageVector getCompassCalibration(Icons.TwoTone twoTone) {
        ImageVector imageVector = _compassCalibration;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CompassCalibration", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(4.94f, 7.26f, 2.21f, 2.21f);
        e.curveToRelative(1.44f, -0.91f, 3.11f, -1.4f, 4.85f, -1.4f);
        e.curveToRelative(1.74f, 0.0f, 3.41f, 0.49f, 4.84f, 1.4f);
        e.lineToRelative(2.21f, -2.21f);
        e.curveTo(17.0f, 5.79f, 14.56f, 5.0f, 12.0f, 5.0f);
        e.curveToRelative(-2.56f, 0.0f, -5.01f, 0.79f, -7.06f, 2.26f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 17.0f, -3.0f, 0.0f);
        b.arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f);
        b.arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(17.0f, 17.0f);
        b2.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        b2.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        b2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b2.close();
        b2.moveTo(9.0f, 17.0f);
        b2.curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
        b2.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        b2.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        b2.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        k4.x(b2, 2.0f, 7.15f, 5.0f, 5.0f);
        b2.curveToRelative(1.28f, -1.28f, 3.05f, -2.08f, 5.0f, -2.08f);
        b2.reflectiveCurveToRelative(3.72f, 0.79f, 5.0f, 2.07f);
        b2.lineToRelative(5.0f, -5.0f);
        b2.curveTo(19.44f, 4.59f, 15.9f, 3.0f, 12.0f, 3.0f);
        b2.curveTo(8.1f, 3.0f, 4.56f, 4.59f, 2.0f, 7.15f);
        b2.close();
        b2.moveTo(16.84f, 9.47f);
        b2.curveToRelative(-1.44f, -0.91f, -3.1f, -1.4f, -4.84f, -1.4f);
        b2.curveToRelative(-1.74f, 0.0f, -3.41f, 0.49f, -4.85f, 1.41f);
        b2.lineTo(4.94f, 7.26f);
        b2.curveTo(6.99f, 5.79f, 9.44f, 5.0f, 12.0f, 5.0f);
        b2.curveToRelative(2.56f, 0.0f, 5.0f, 0.79f, 7.05f, 2.26f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b2, -2.21f, 2.21f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _compassCalibration = build;
        build.getClass();
        return build;
    }
}
