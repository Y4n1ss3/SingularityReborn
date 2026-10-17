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
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RocketKt {
    private static ImageVector _rocket;

    public static final ImageVector getRocket(Icons.TwoTone twoTone) {
        ImageVector imageVector = _rocket;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Rocket", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.98f, 18.25f);
        b.curveToRelative(-0.29f, -0.9f, -0.57f, -1.94f, -0.76f, -3.0f);
        b.lineTo(6.0f, 16.07f);
        kf0.t(b, 2.98f, 7.98f, 18.25f);
        b.moveTo(12.0f, 4.36f);
        b.curveToRelative(0.0f, 0.0f, -3.0f, 2.02f, -3.0f, 8.64f);
        b.curveToRelative(0.0f, 2.25f, 1.0f, 5.0f, 1.0f, 5.0f);
        b.horizontalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 0.0f, 1.0f, -2.75f, 1.0f, -5.0f);
        b.curveTo(15.0f, 6.38f, 12.0f, 4.36f, 12.0f, 4.36f);
        b.close();
        b.moveTo(12.0f, 13.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.curveTo(14.0f, 12.1f, 13.1f, 13.0f, 12.0f, 13.0f);
        bv.v(b, 18.0f, 19.05f, -2.98f);
        b.lineToRelative(-1.22f, -0.81f);
        b.curveToRelative(-0.19f, 1.05f, -0.47f, 2.1f, -0.76f, 3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 18.0f, 19.05f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(14.0f, 11.0f);
        b2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b2.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b2.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        b2.reflectiveCurveTo(14.0f, 12.1f, 14.0f, 11.0f);
        b2.close();
        b2.moveTo(7.98f, 18.25f);
        b2.curveToRelative(-0.29f, -0.9f, -0.57f, -1.94f, -0.76f, -3.0f);
        b2.lineTo(6.0f, 16.07f);
        kf0.t(b2, 2.98f, 7.98f, 18.25f);
        b2.moveTo(12.0f, 2.0f);
        b2.curveToRelative(0.0f, 0.0f, 5.0f, 2.0f, 5.0f, 11.0f);
        b2.lineToRelative(2.11f, 1.41f);
        b2.curveToRelative(0.56f, 0.37f, 0.89f, 1.0f, 0.89f, 1.66f);
        b2.verticalLineTo(22.0f);
        b2.lineToRelative(-5.0f, -2.0f);
        b2.horizontalLineTo(9.0f);
        b2.lineToRelative(-5.0f, 2.0f);
        b2.verticalLineToRelative(-5.93f);
        b2.curveToRelative(0.0f, -0.67f, 0.33f, -1.29f, 0.89f, -1.66f);
        b2.lineTo(7.0f, 13.0f);
        b2.curveTo(7.0f, 4.0f, 12.0f, 2.0f, 12.0f, 2.0f);
        b2.close();
        b2.moveTo(12.0f, 4.36f);
        b2.curveToRelative(0.0f, 0.0f, -3.0f, 2.02f, -3.0f, 8.64f);
        b2.curveToRelative(0.0f, 2.25f, 1.0f, 5.0f, 1.0f, 5.0f);
        b2.horizontalLineToRelative(4.0f);
        b2.curveToRelative(0.0f, 0.0f, 1.0f, -2.75f, 1.0f, -5.0f);
        b2.curveTo(15.0f, 6.38f, 12.0f, 4.36f, 12.0f, 4.36f);
        bv.v(b2, 18.0f, 19.05f, -2.98f);
        b2.lineToRelative(-1.22f, -0.81f);
        b2.curveToRelative(-0.19f, 1.05f, -0.47f, 2.1f, -0.76f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b2, 18.0f, 19.05f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rocket = build;
        build.getClass();
        return build;
    }
}
