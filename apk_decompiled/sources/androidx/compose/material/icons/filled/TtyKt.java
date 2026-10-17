package androidx.compose.material.icons.filled;

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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TtyKt {
    private static ImageVector _tty;

    public static final ImageVector getTty(Icons.Filled filled) {
        ImageVector imageVector = _tty;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Tty", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(14.0f, 4.0f, 2.0f, 2.0f, -2.0f);
        k4.D(n, 4.0f, 13.0f, 7.0f, 2.0f);
        k4.p(n, 2.0f, -2.0f, 7.0f);
        k4.C(n, 11.0f, 4.0f, 2.0f, 2.0f);
        uo.r(n, -2.0f, 4.0f, 18.0f, 9.0f);
        j50.D(n, -2.0f, 7.0f, 2.0f, 9.0f);
        j50.y(n, 19.0f, 6.0f, -2.0f, 4.0f);
        uo.r(n, 2.0f, 6.0f, 21.0f, 9.0f);
        j50.D(n, -2.0f, 7.0f, 2.0f, 9.0f);
        j50.y(n, 22.0f, 6.0f, -2.0f, 4.0f);
        uo.r(n, 2.0f, 6.0f, 14.62f, 14.38f);
        n.lineTo(12.1f, 16.9f);
        n.curveToRelative(-2.5f, -1.43f, -4.57f, -3.5f, -6.0f, -6.0f);
        n.lineToRelative(2.52f, -2.52f);
        n.curveTo(8.86f, 8.14f, 8.96f, 7.8f, 8.9f, 7.48f);
        n.lineTo(8.16f, 3.8f);
        n.curveTo(8.07f, 3.34f, 7.66f, 3.0f, 7.18f, 3.0f);
        n.horizontalLineTo(3.03f);
        n.curveTo(2.47f, 3.0f, 2.0f, 3.47f, 2.03f, 4.03f);
        n.curveTo(2.2f, 6.92f, 3.05f, 9.63f, 4.43f, 12.0f);
        n.curveToRelative(1.58f, 2.73f, 3.85f, 4.99f, 6.57f, 6.57f);
        n.curveToRelative(2.37f, 1.37f, 5.08f, 2.23f, 7.97f, 2.4f);
        n.curveToRelative(0.56f, 0.03f, 1.03f, -0.44f, 1.03f, -1.0f);
        n.verticalLineToRelative(-4.15f);
        n.curveToRelative(0.0f, -0.48f, -0.34f, -0.89f, -0.8f, -0.98f);
        n.lineToRelative(-3.67f, -0.73f);
        n.curveTo(15.2f, 14.04f, 14.86f, 14.14f, 14.62f, 14.38f);
        r6.B(n, 14.0f, 10.0f, 2.0f, 2.0f);
        uo.r(n, -2.0f, 10.0f, 11.0f, 10.0f);
        bv.l(n, 2.0f, 2.0f, -2.0f, 10.0f);
        k4.C(n, 19.0f, 12.0f, -2.0f, -2.0f);
        uo.r(n, 2.0f, 12.0f, 22.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(n, -2.0f, -2.0f, 2.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tty = build;
        build.getClass();
        return build;
    }
}
