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
import defpackage.af0;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UsbKt {
    private static ImageVector _usb;

    public static final ImageVector getUsb(Icons.Filled filled) {
        ImageVector imageVector = _usb;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Usb", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(15.0f, 7.0f, 4.0f, 1.0f, 2.0f);
        af0.f(s, -3.0f, 5.0f, 2.0f);
        s.lineToRelative(-3.0f, -4.0f);
        r6.q(s, -3.0f, 4.0f, 2.0f, 8.0f);
        s.horizontalLineTo(8.0f);
        s.verticalLineToRelative(-2.07f);
        s.curveToRelative(0.7f, -0.37f, 1.2f, -1.08f, 1.2f, -1.93f);
        s.curveToRelative(0.0f, -1.21f, -0.99f, -2.2f, -2.2f, -2.2f);
        s.curveToRelative(-1.21f, 0.0f, -2.2f, 0.99f, -2.2f, 2.2f);
        s.curveToRelative(0.0f, 0.85f, 0.5f, 1.56f, 1.2f, 1.93f);
        s.verticalLineTo(13.0f);
        s.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(3.0f);
        s.verticalLineToRelative(3.05f);
        s.curveToRelative(-0.71f, 0.37f, -1.2f, 1.1f, -1.2f, 1.95f);
        s.curveToRelative(0.0f, 1.22f, 0.99f, 2.2f, 2.2f, 2.2f);
        s.curveToRelative(1.21f, 0.0f, 2.2f, -0.98f, 2.2f, -2.2f);
        s.curveToRelative(0.0f, -0.85f, -0.49f, -1.58f, -1.2f, -1.95f);
        s.verticalLineTo(15.0f);
        s.horizontalLineToRelative(3.0f);
        s.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        s.verticalLineToRelative(-2.0f);
        s.horizontalLineToRelative(1.0f);
        s.verticalLineTo(7.0f);
        s.horizontalLineToRelative(-4.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _usb = build;
        build.getClass();
        return build;
    }
}
