package androidx.compose.material.icons.outlined;

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
import defpackage.c21;
import defpackage.fc;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlipCameraIosKt {
    private static ImageVector _flipCameraIos;

    public static final ImageVector getFlipCameraIos(Icons.Outlined outlined) {
        ImageVector imageVector = _flipCameraIos;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FlipCameraIos", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(20.0f, 5.0f, -3.17f, 15.0f, 3.0f);
        bv.u(p, 9.0f, 7.17f, 5.0f, 4.0f);
        p.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        p.verticalLineToRelative(12.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(16.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.verticalLineTo(7.0f);
        p.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        c21.d(p, 20.0f, 19.0f, 4.0f, 7.0f);
        p.horizontalLineToRelative(3.17f);
        p.horizontalLineToRelative(0.88f);
        p.lineToRelative(0.59f, -0.65f);
        p.lineTo(9.88f, 5.0f);
        p.horizontalLineToRelative(4.24f);
        p.lineToRelative(1.24f, 1.35f);
        p.lineTo(15.95f, 7.0f);
        p.horizontalLineToRelative(0.88f);
        p.horizontalLineTo(20.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(p, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 17.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        b.horizontalLineToRelative(2.0f);
        b.lineToRelative(-2.5f, -2.5f);
        b.lineTo(5.0f, 13.0f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        b.curveToRelative(0.86f, 0.0f, 1.65f, -0.24f, 2.36f, -0.62f);
        b.lineToRelative(-0.74f, -0.74f);
        b.curveTo(13.13f, 16.87f, 12.58f, 17.0f, 12.0f, 17.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 8.0f);
        b2.curveToRelative(-0.86f, 0.0f, -1.65f, 0.24f, -2.36f, 0.62f);
        b2.lineToRelative(0.74f, 0.73f);
        b2.curveTo(10.87f, 9.13f, 11.42f, 9.0f, 12.0f, 9.0f);
        b2.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        b2.horizontalLineToRelative(-2.0f);
        b2.lineToRelative(2.5f, 2.5f);
        b2.lineTo(19.0f, 13.0f);
        b2.horizontalLineToRelative(-2.0f);
        b2.curveTo(17.0f, 10.24f, 14.76f, 8.0f, 12.0f, 8.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flipCameraIos = build;
        build.getClass();
        return build;
    }
}
