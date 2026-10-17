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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AppBlockingKt {
    private static ImageVector _appBlocking;

    public static final ImageVector getAppBlocking(Icons.Outlined outlined) {
        ImageVector imageVector = _appBlocking;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AppBlocking", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 8.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        b.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        b.curveTo(22.0f, 9.79f, 20.21f, 8.0f, 18.0f, 8.0f);
        b.close();
        b.moveTo(15.5f, 12.0f);
        b.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        b.curveToRelative(0.42f, 0.0f, 0.8f, 0.11f, 1.15f, 0.29f);
        b.lineToRelative(-3.36f, 3.36f);
        b.curveTo(15.61f, 12.8f, 15.5f, 12.42f, 15.5f, 12.0f);
        b.close();
        b.moveTo(18.0f, 14.5f);
        b.curveToRelative(-0.42f, 0.0f, -0.8f, -0.11f, -1.15f, -0.29f);
        b.lineToRelative(3.36f, -3.36f);
        b.curveToRelative(0.18f, 0.35f, 0.29f, 0.73f, 0.29f, 1.15f);
        b.curveTo(20.5f, 13.38f, 19.38f, 14.5f, 18.0f, 14.5f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(17.0f, 18.0f, 7.0f, 6.0f, 10.0f);
        f.verticalLineToRelative(1.0f);
        f.horizontalLineToRelative(2.0f);
        f.verticalLineTo(6.0f);
        f.verticalLineTo(5.0f);
        f.verticalLineTo(3.0f);
        f.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        f.horizontalLineTo(7.0f);
        f.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        f.verticalLineToRelative(18.0f);
        f.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        f.horizontalLineToRelative(10.0f);
        f.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        f.verticalLineToRelative(-2.0f);
        f.verticalLineToRelative(-1.0f);
        f.verticalLineToRelative(-1.0f);
        f.horizontalLineToRelative(-2.0f);
        k4.D(f, 18.0f, 7.0f, 3.0f, 10.0f);
        gy.s(f, 1.0f, 7.0f, 3.0f);
        k4.A(f, 17.0f, 21.0f, 7.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(f, 10.0f, 21.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _appBlocking = build;
        build.getClass();
        return build;
    }
}
