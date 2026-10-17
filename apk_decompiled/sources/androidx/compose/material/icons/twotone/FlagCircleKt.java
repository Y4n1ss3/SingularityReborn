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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlagCircleKt {
    private static ImageVector _flagCircle;

    public static final ImageVector getFlagCircle(Icons.TwoTone twoTone) {
        ImageVector imageVector = _flagCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FlagCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f);
        b.reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.59f, 8.0f, -8.0f);
        b.reflectiveCurveTo(16.41f, 4.0f, 12.0f, 4.0f);
        k4.x(b, 13.0f, 15.0f, -1.0f, -2.0f);
        uf.B(b, 9.5f, 5.0f, 8.0f, 7.0f);
        kf0.B(b, 6.0f, 1.0f, 2.0f, 3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(b, 6.0f, 13.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 2.0f);
        b2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b2.close();
        b2.moveTo(12.0f, 20.0f);
        b2.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b2.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b2.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b2, 16.41f, 20.0f, 12.0f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder u = gy.u(15.0f, 9.0f, -1.0f, -2.0f, 8.0f);
        uf.s(u, 11.0f, 1.5f, -5.0f, 12.0f);
        fc.r(u, 1.0f, 2.0f, 5.0f, 9.0f);
        kp0.r(u, 15.0f, 16.5f, 13.5f, -2.57f);
        j50.x(u, -1.0f, -2.0f, 9.5f, -3.0f);
        kf0.B(u, 3.57f, 1.0f, 2.0f, 2.43f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(u, 13.5f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flagCircle = build;
        build.getClass();
        return build;
    }
}
