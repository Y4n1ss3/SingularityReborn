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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeviceUnknownKt {
    private static ImageVector _deviceUnknown;

    public static final ImageVector getDeviceUnknown(Icons.Sharp sharp) {
        ImageVector imageVector = _deviceUnknown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DeviceUnknown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(19.0f, 1.0f, 5.0f, 1.0f, 22.0f);
        gy.n(s, 14.0f, 19.0f, 1.0f);
        s.moveTo(17.0f, 19.0f);
        s.lineTo(7.0f, 19.0f);
        r6.m(s, 7.0f, 5.0f, 10.0f, 14.0f);
        s.moveTo(12.0f, 6.72f);
        s.curveToRelative(-1.96f, 0.0f, -3.5f, 1.52f, -3.5f, 3.47f);
        s.horizontalLineToRelative(1.75f);
        s.curveToRelative(0.0f, -0.93f, 0.82f, -1.75f, 1.75f, -1.75f);
        s.reflectiveCurveToRelative(1.75f, 0.82f, 1.75f, 1.75f);
        s.curveToRelative(0.0f, 1.75f, -2.63f, 1.57f, -2.63f, 4.45f);
        s.horizontalLineToRelative(1.76f);
        s.curveToRelative(0.0f, -1.96f, 2.62f, -2.19f, 2.62f, -4.45f);
        s.curveToRelative(0.0f, -1.96f, -1.54f, -3.47f, -3.5f, -3.47f);
        r6.B(s, 11.0f, 16.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(s, -2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deviceUnknown = build;
        build.getClass();
        return build;
    }
}
