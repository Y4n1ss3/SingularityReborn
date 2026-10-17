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
import defpackage.j50;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideoCameraFrontKt {
    private static ImageVector _videoCameraFront;

    public static final ImageVector getVideoCameraFront(Icons.TwoTone twoTone) {
        ImageVector imageVector = _videoCameraFront;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.VideoCameraFront", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(18.0f, 10.48f, 6.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineTo(4.0f);
        d.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        j50.A(d, -4.48f, 4.0f, 3.98f, -11.0f);
        uo.l(d, 18.0f, 10.48f, 16.0f, 18.0f);
        uo.o(d, 4.0f, 6.0f, 12.0f, 18.0f);
        d.moveTo(10.0f, 12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        d.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        d.reflectiveCurveTo(8.9f, 12.0f, 10.0f, 12.0f);
        d.close();
        d.moveTo(14.0f, 15.43f);
        d.curveToRelative(0.0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f);
        d.curveTo(11.93f, 13.21f, 10.99f, 13.0f, 10.0f, 13.0f);
        d.curveToRelative(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f);
        d.curveTo(6.48f, 13.9f, 6.0f, 14.62f, 6.0f, 15.43f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.r(d, 16.0f, 8.0f, 15.43f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineTo(9.69f);
        pathBuilder.verticalLineTo(6.0f);
        bv.s(pathBuilder, 4.0f, 18.0f, 10.0f, 8.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(8.9f, 8.0f, 10.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 15.43f);
        pathBuilder.curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f);
        pathBuilder.curveTo(8.07f, 13.21f, 9.01f, 13.0f, 10.0f, 13.0f);
        pathBuilder.curveToRelative(0.99f, 0.0f, 1.93f, 0.21f, 2.78f, 0.58f);
        pathBuilder.curveTo(13.52f, 13.9f, 14.0f, 14.62f, 14.0f, 15.43f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineTo(15.43f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videoCameraFront = build;
        build.getClass();
        return build;
    }
}
