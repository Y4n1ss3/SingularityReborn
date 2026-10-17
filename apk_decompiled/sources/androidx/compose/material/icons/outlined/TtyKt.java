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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TtyKt {
    private static ImageVector _tty;

    public static final ImageVector getTty(Icons.Outlined outlined) {
        ImageVector imageVector = _tty;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Tty", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = fc.n(16.0f, 6.0f, -2.0f, 4.0f, 2.0f);
        k4.D(n, 6.0f, 18.0f, 7.0f, -2.0f);
        k4.p(n, 2.0f, 2.0f, 7.0f);
        j50.y(n, 19.0f, 9.0f, 2.0f, 7.0f);
        uo.r(n, -2.0f, 9.0f, 19.0f, 4.0f);
        bv.l(n, -2.0f, 2.0f, 2.0f, 4.0f);
        k4.C(n, 15.0f, 7.0f, -2.0f, 2.0f);
        uo.r(n, 2.0f, 7.0f, 19.0f, 10.0f);
        bv.l(n, -2.0f, 2.0f, 2.0f, 10.0f);
        k4.C(n, 16.0f, 10.0f, -2.0f, 2.0f);
        uo.r(n, 2.0f, 10.0f, 13.0f, 4.0f);
        bv.l(n, -2.0f, 2.0f, 2.0f, 4.0f);
        n.moveTo(20.0f, 15.82f);
        n.verticalLineToRelative(4.15f);
        n.curveToRelative(0.0f, 0.56f, -0.47f, 1.03f, -1.03f, 1.0f);
        n.curveToRelative(-2.89f, -0.17f, -5.6f, -1.03f, -7.97f, -2.4f);
        n.curveTo(8.27f, 16.99f, 6.01f, 14.73f, 4.43f, 12.0f);
        n.curveTo(3.05f, 9.63f, 2.2f, 6.92f, 2.03f, 4.03f);
        n.curveTo(2.0f, 3.47f, 2.47f, 3.0f, 3.03f, 3.0f);
        n.horizontalLineToRelative(4.15f);
        n.curveToRelative(0.48f, 0.0f, 0.89f, 0.34f, 0.98f, 0.8f);
        n.lineTo(8.9f, 7.48f);
        n.curveToRelative(0.07f, 0.33f, -0.04f, 0.67f, -0.27f, 0.9f);
        n.lineTo(6.1f, 10.9f);
        n.curveToRelative(1.43f, 2.5f, 3.5f, 4.57f, 6.0f, 6.0f);
        n.lineToRelative(2.52f, -2.52f);
        n.curveToRelative(0.24f, -0.24f, 0.58f, -0.34f, 0.9f, -0.27f);
        n.lineToRelative(3.67f, 0.73f);
        n.curveTo(19.66f, 14.93f, 20.0f, 15.34f, 20.0f, 15.82f);
        k4.x(n, 5.18f, 8.99f, 1.65f, -1.65f);
        n.lineTo(6.36f, 5.0f);
        n.horizontalLineTo(4.13f);
        n.curveTo(4.3f, 6.37f, 4.66f, 7.71f, 5.18f, 8.99f);
        k4.x(n, 18.0f, 16.64f, -2.34f, -0.47f);
        n.lineToRelative(-1.65f, 1.65f);
        n.curveToRelative(1.28f, 0.52f, 2.63f, 0.87f, 3.99f, 1.05f);
        kf0.D(n, 16.64f, 20.0f, 4.0f, 2.0f);
        kf0.v(n, 2.0f, 4.0f, 20.0f);
        k4.C(n, 20.0f, 12.0f, 2.0f, -2.0f);
        uo.r(n, -2.0f, 12.0f, 13.0f, 10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(n, -2.0f, 2.0f, 2.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tty = build;
        build.getClass();
        return build;
    }
}
