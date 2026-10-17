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
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PinchKt {
    private static ImageVector _pinch;

    public static final ImageVector getPinch(Icons.Outlined outlined) {
        ImageVector imageVector = _pinch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Pinch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(6.0f, 2.5f, 1.0f, 5.0f, 5.0f);
        c.horizontalLineTo(9.5f);
        c.verticalLineTo(3.56f);
        c.lineTo(3.56f, 9.5f);
        af0.y(c, 6.0f, 11.0f, 1.0f, 6.0f);
        bv.C(c, 1.5f, 2.44f, 8.44f, 2.5f);
        k4.w(c, 6.0f, 21.89f, 13.77f);
        c.lineToRelative(-3.8f, -1.67f);
        c.curveTo(17.96f, 12.04f, 17.81f, 12.0f, 17.65f, 12.0f);
        c.horizontalLineTo(17.0f);
        c.verticalLineTo(7.5f);
        c.curveTo(17.0f, 6.12f, 15.88f, 5.0f, 14.5f, 5.0f);
        c.reflectiveCurveTo(12.0f, 6.12f, 12.0f, 7.5f);
        c.verticalLineToRelative(8.15f);
        c.lineToRelative(-1.87f, -0.4f);
        c.curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f);
        c.lineTo(7.0f, 17.22f);
        c.lineToRelative(5.12f, 5.19f);
        c.curveTo(12.49f, 22.79f, 13.0f, 23.0f, 13.53f, 23.0f);
        c.horizontalLineToRelative(6.55f);
        c.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        c.lineToRelative(0.92f, -5.44f);
        c.curveTo(23.12f, 15.03f, 22.68f, 14.17f, 21.89f, 13.77f);
        af0.l(c, 20.08f, 21.0f, -6.55f);
        c.lineToRelative(-3.7f, -3.78f);
        c.lineTo(14.0f, 18.11f);
        c.verticalLineTo(7.5f);
        c.curveTo(14.0f, 7.22f, 14.22f, 7.0f, 14.5f, 7.0f);
        c.reflectiveCurveTo(15.0f, 7.22f, 15.0f, 7.5f);
        uo.B(c, 6.18f, 1.76f, 21.0f, 15.56f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(c, 20.08f, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinch = build;
        build.getClass();
        return build;
    }
}
