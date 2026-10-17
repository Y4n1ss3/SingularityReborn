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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlipCameraIosKt {
    private static ImageVector _flipCameraIos;

    public static final ImageVector getFlipCameraIos(Icons.Rounded rounded) {
        ImageVector imageVector = _flipCameraIos;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FlipCameraIos", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(20.0f, 5.0f, -3.17f, -1.24f, -1.35f);
        i.curveTo(15.22f, 3.24f, 14.68f, 3.0f, 14.12f, 3.0f);
        i.horizontalLineTo(9.88f);
        i.curveToRelative(-0.56f, 0.0f, -1.1f, 0.24f, -1.48f, 0.65f);
        i.lineTo(7.17f, 5.0f);
        i.horizontalLineTo(4.0f);
        i.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(7.0f);
        i.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        i.close();
        i.moveTo(13.67f, 17.7f);
        i.curveTo(13.15f, 17.89f, 12.59f, 18.0f, 12.0f, 18.0f);
        i.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        i.horizontalLineTo(5.0f);
        i.lineToRelative(2.5f, -2.5f);
        i.lineTo(10.0f, 13.0f);
        i.horizontalLineTo(8.0f);
        i.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        i.curveToRelative(0.46f, 0.0f, 0.91f, -0.08f, 1.32f, -0.23f);
        i.curveToRelative(0.19f, -0.07f, 0.39f, -0.03f, 0.53f, 0.11f);
        i.curveTo(14.11f, 17.14f, 14.01f, 17.57f, 13.67f, 17.7f);
        k4.r(i, 16.5f, 15.5f, 14.0f, 13.0f);
        i.horizontalLineToRelative(2.0f);
        i.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        i.curveToRelative(-0.46f, 0.0f, -0.91f, 0.08f, -1.32f, 0.23f);
        i.curveToRelative(-0.19f, 0.07f, -0.39f, 0.03f, -0.53f, -0.11f);
        i.curveTo(9.89f, 8.86f, 9.99f, 8.43f, 10.33f, 8.3f);
        i.curveTo(10.85f, 8.11f, 11.41f, 8.0f, 12.0f, 8.0f);
        i.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(i, 2.0f, 16.5f, 15.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flipCameraIos = build;
        build.getClass();
        return build;
    }
}
