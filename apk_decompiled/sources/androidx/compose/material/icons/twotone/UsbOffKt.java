package androidx.compose.material.icons.twotone;

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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UsbOffKt {
    private static ImageVector _usbOff;

    public static final ImageVector getUsbOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _usbOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.UsbOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(15.0f, 8.0f, 4.0f, 4.0f, -1.0f);
        n.verticalLineToRelative(2.0f);
        n.curveToRelative(0.0f, 0.34f, -0.08f, 0.66f, -0.23f, 0.94f);
        fc.t(n, 16.0f, 13.17f, 12.0f, -1.0f);
        bv.t(n, 8.0f, 11.0f, 8.17f);
        fc.u(n, 2.0f, 2.0f, 6.0f, 2.0f);
        n.lineToRelative(-3.0f, -4.0f);
        n.lineTo(9.0f, 6.0f);
        n.horizontalLineToRelative(2.0f);
        n.verticalLineTo(8.17f);
        n.close();
        n.moveTo(13.0f, 16.0f);
        n.verticalLineToRelative(2.28f);
        n.curveToRelative(0.6f, 0.34f, 1.0f, 0.98f, 1.0f, 1.72f);
        n.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        n.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        n.curveToRelative(0.0f, -0.74f, 0.4f, -1.37f, 1.0f, -1.72f);
        n.verticalLineTo(16.0f);
        n.horizontalLineTo(8.0f);
        n.curveToRelative(-1.11f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
        n.verticalLineToRelative(-2.28f);
        n.curveTo(5.4f, 11.38f, 5.0f, 10.74f, 5.0f, 10.0f);
        n.curveToRelative(0.0f, -0.59f, 0.26f, -1.13f, 0.68f, -1.49f);
        n.lineTo(1.39f, 4.22f);
        n.lineToRelative(1.41f, -1.41f);
        n.lineToRelative(18.38f, 18.38f);
        n.lineToRelative(-1.41f, 1.41f);
        kf0.h(n, 13.17f, 16.0f, 13.0f);
        n.moveTo(11.0f, 14.0f);
        n.verticalLineToRelative(-0.17f);
        n.lineToRelative(-2.51f, -2.51f);
        n.curveToRelative(-0.14f, 0.16f, -0.31f, 0.29f, -0.49f, 0.4f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(n, 14.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _usbOff = build;
        build.getClass();
        return build;
    }
}
