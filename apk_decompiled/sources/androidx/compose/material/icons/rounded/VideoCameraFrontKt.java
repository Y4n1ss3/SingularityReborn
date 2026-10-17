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
import defpackage.fc;
import defpackage.j50;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideoCameraFrontKt {
    private static ImageVector _videoCameraFront;

    public static final ImageVector getVideoCameraFront(Icons.Rounded rounded) {
        ImageVector imageVector = _videoCameraFront;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VideoCameraFront", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(18.0f, 10.48f, 6.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineTo(4.0f);
        d.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineToRelative(-4.48f);
        d.lineToRelative(3.15f, 3.13f);
        d.curveTo(21.46f, 16.97f, 22.0f, 16.74f, 22.0f, 16.3f);
        d.verticalLineTo(7.7f);
        d.curveToRelative(0.0f, -0.44f, -0.54f, -0.67f, -0.85f, -0.35f);
        uo.l(d, 18.0f, 10.48f, 10.0f, 8.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        d.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        d.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        d.reflectiveCurveTo(8.9f, 8.0f, 10.0f, 8.0f);
        uo.q(d, 14.0f, 16.0f, 6.0f, -0.57f);
        d.curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f);
        d.curveTo(8.07f, 13.21f, 9.01f, 13.0f, 10.0f, 13.0f);
        d.curveToRelative(0.99f, 0.0f, 1.93f, 0.21f, 2.78f, 0.58f);
        d.curveTo(13.52f, 13.9f, 14.0f, 14.62f, 14.0f, 15.43f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(d, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videoCameraFront = build;
        build.getClass();
        return build;
    }
}
