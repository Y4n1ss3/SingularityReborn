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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlipCameraIosKt {
    private static ImageVector _flipCameraIos;

    public static final ImageVector getFlipCameraIos(Icons.Sharp sharp) {
        ImageVector imageVector = _flipCameraIos;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FlipCameraIos", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = gy.p(16.83f, 5.0f, 15.0f, 3.0f, 9.0f);
        r6.w(p, 7.17f, 5.0f, 2.0f, 16.0f);
        kf0.v(p, 20.0f, 5.0f, 16.83f);
        p.moveTo(12.0f, 18.0f);
        p.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        p.horizontalLineTo(5.0f);
        p.lineToRelative(2.5f, -2.5f);
        p.lineTo(10.0f, 13.0f);
        p.horizontalLineTo(8.0f);
        p.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        p.curveToRelative(0.58f, 0.0f, 1.13f, -0.13f, 1.62f, -0.35f);
        p.lineToRelative(0.74f, 0.74f);
        p.curveTo(13.65f, 17.76f, 12.86f, 18.0f, 12.0f, 18.0f);
        k4.r(p, 16.5f, 15.5f, 14.0f, 13.0f);
        p.horizontalLineToRelative(2.0f);
        p.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        p.curveToRelative(-0.58f, 0.0f, -1.13f, 0.13f, -1.62f, 0.35f);
        p.lineTo(9.64f, 8.62f);
        p.curveTo(10.35f, 8.24f, 11.14f, 8.0f, 12.0f, 8.0f);
        p.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(p, 2.0f, 16.5f, 15.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flipCameraIos = build;
        build.getClass();
        return build;
    }
}
