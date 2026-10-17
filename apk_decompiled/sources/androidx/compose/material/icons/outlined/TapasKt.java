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
import defpackage.af0;
import defpackage.bv;
import defpackage.c21;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TapasKt {
    private static ImageVector _tapas;

    public static final ImageVector getTapas(Icons.Outlined outlined) {
        ImageVector imageVector = _tapas;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Tapas", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(22.0f, 10.0f, 1.0f, -8.0f, 9.0f);
        c.curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f);
        uf.p(c, 21.0f, -2.0f, 2.0f, 6.0f);
        kf0.z(c, -2.0f, -2.0f, -7.14f);
        c.curveTo(20.72f, 13.41f, 22.0f, 11.86f, 22.0f, 10.0f);
        uo.C(c, 20.0f, 3.0f, 3.0f, -4.0f);
        bv.z(c, 3.0f, 20.0f, 16.0f, 10.0f);
        kf0.r(c, 8.0f, 4.0f, 2.0f);
        c.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        c.reflectiveCurveTo(16.0f, 11.1f, 16.0f, 10.0f);
        c21.d(c, 10.0f, 9.0f, 8.0f, 8.0f);
        c.horizontalLineToRelative(2.0f);
        c.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        c.curveTo(12.5f, 4.12f, 11.38f, 3.0f, 10.0f, 3.0f);
        gy.x(c, 8.0f, 1.0f, 6.0f, 2.0f);
        c.horizontalLineTo(4.0f);
        c.curveTo(2.62f, 3.0f, 1.5f, 4.12f, 1.5f, 5.5f);
        c.curveTo(1.5f, 6.88f, 2.62f, 8.0f, 4.0f, 8.0f);
        k4.k(c, 2.0f, 1.0f, 4.0f);
        c.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        c.curveTo(1.5f, 12.88f, 2.62f, 14.0f, 4.0f, 14.0f);
        af0.v(c, 2.0f, 9.0f, 2.0f, -9.0f);
        c.horizontalLineToRelative(2.0f);
        c.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        c.curveTo(12.5f, 10.12f, 11.38f, 9.0f, 10.0f, 9.0f);
        c.close();
        c.moveTo(4.0f, 6.0f);
        c.curveTo(3.72f, 6.0f, 3.5f, 5.78f, 3.5f, 5.5f);
        c.reflectiveCurveTo(3.72f, 5.0f, 4.0f, 5.0f);
        c.horizontalLineToRelative(6.0f);
        c.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        c.reflectiveCurveTo(10.28f, 6.0f, 10.0f, 6.0f);
        kp0.B(c, 4.0f, 10.0f, 12.0f, 4.0f);
        c.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        c.reflectiveCurveTo(3.72f, 11.0f, 4.0f, 11.0f);
        c.horizontalLineToRelative(6.0f);
        c.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(c, 10.28f, 12.0f, 10.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tapas = build;
        build.getClass();
        return build;
    }
}
