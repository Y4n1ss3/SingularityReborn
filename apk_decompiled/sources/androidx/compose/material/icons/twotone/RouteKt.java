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
import defpackage.j50;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RouteKt {
    private static ImageVector _route;

    public static final ImageVector getRoute(Icons.TwoTone twoTone) {
        ImageVector imageVector = _route;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Route", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(6.0f, 6.0f, -1.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(18.0f, 18.0f, -1.0f, 0.0f);
        b2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(19.0f, 15.18f, 7.0f);
        d.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        d.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        d.verticalLineToRelative(10.0f);
        d.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        d.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        d.verticalLineTo(8.82f);
        d.curveTo(8.16f, 8.4f, 9.0f, 7.3f, 9.0f, 6.0f);
        d.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        d.reflectiveCurveTo(3.0f, 4.34f, 3.0f, 6.0f);
        d.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        d.verticalLineTo(17.0f);
        d.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        d.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        d.verticalLineTo(7.0f);
        d.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        d.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        d.verticalLineToRelative(8.18f);
        d.curveToRelative(-1.16f, 0.41f, -2.0f, 1.51f, -2.0f, 2.82f);
        d.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        d.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        d.curveTo(21.0f, 16.7f, 20.16f, 15.6f, 19.0f, 15.18f);
        d.close();
        d.moveTo(6.0f, 7.0f);
        d.curveTo(5.45f, 7.0f, 5.0f, 6.55f, 5.0f, 6.0f);
        d.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        d.reflectiveCurveTo(6.55f, 7.0f, 6.0f, 7.0f);
        d.close();
        d.moveTo(18.0f, 19.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(d, 18.55f, 19.0f, 18.0f, 19.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _route = build;
        build.getClass();
        return build;
    }
}
