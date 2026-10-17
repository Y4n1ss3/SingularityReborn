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
import defpackage.bv;
import defpackage.j50;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UsbOffKt {
    private static ImageVector _usbOff;

    public static final ImageVector getUsbOff(Icons.Rounded rounded) {
        ImageVector imageVector = _usbOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.UsbOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(9.6f, 5.2f, 2.0f, -2.67f);
        e.curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f);
        e.lineToRelative(2.0f, 2.67f);
        e.curveTo(14.65f, 5.53f, 14.41f, 6.0f, 14.0f, 6.0f);
        bv.p(e, -1.0f, 4.17f, -2.0f, -2.0f);
        e.verticalLineTo(6.0f);
        e.horizontalLineToRelative(-1.0f);
        e.curveTo(9.59f, 6.0f, 9.35f, 5.53f, 9.6f, 5.2f);
        uo.q(e, 15.5f, 12.0f, 16.0f, 1.17f);
        e.lineToRelative(1.77f, 1.77f);
        e.curveTo(17.91f, 14.66f, 18.0f, 14.34f, 18.0f, 14.0f);
        e.verticalLineToRelative(-2.0f);
        e.horizontalLineToRelative(0.5f);
        e.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        e.verticalLineToRelative(-3.0f);
        e.curveTo(19.0f, 8.22f, 18.78f, 8.0f, 18.5f, 8.0f);
        e.horizontalLineToRelative(-3.0f);
        e.curveTo(15.22f, 8.0f, 15.0f, 8.22f, 15.0f, 8.5f);
        e.verticalLineToRelative(3.0f);
        e.curveTo(15.0f, 11.78f, 15.22f, 12.0f, 15.5f, 12.0f);
        k4.r(e, 20.49f, 21.9f, 20.49f, 21.9f);
        e.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        j50.x(e, -5.9f, -5.9f, 13.0f, 2.28f);
        e.curveToRelative(0.6f, 0.34f, 1.0f, 0.98f, 1.0f, 1.72f);
        e.curveToRelative(0.0f, 1.2f, -1.07f, 2.16f, -2.31f, 1.98f);
        e.curveToRelative(-0.88f, -0.13f, -1.59f, -0.88f, -1.68f, -1.77f);
        e.curveToRelative(-0.08f, -0.83f, 0.33f, -1.55f, 0.99f, -1.93f);
        e.verticalLineTo(16.0f);
        e.horizontalLineTo(8.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.verticalLineToRelative(-2.28f);
        e.curveTo(5.4f, 11.38f, 5.0f, 10.74f, 5.0f, 10.0f);
        e.curveToRelative(0.0f, -0.59f, 0.26f, -1.13f, 0.68f, -1.5f);
        e.lineTo(2.1f, 4.93f);
        e.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        e.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        e.lineToRelative(16.97f, 16.97f);
        e.curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f);
        k4.x(e, 11.0f, 13.83f, -2.51f, -2.51f);
        e.curveToRelative(-0.14f, 0.16f, -0.31f, 0.29f, -0.49f, 0.4f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.r(e, 14.0f, 3.0f, 13.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _usbOff = build;
        build.getClass();
        return build;
    }
}
