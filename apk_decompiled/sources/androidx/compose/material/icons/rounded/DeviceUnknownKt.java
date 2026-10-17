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
import defpackage.af0;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeviceUnknownKt {
    private static ImageVector _deviceUnknown;

    public static final ImageVector getDeviceUnknown(Icons.Rounded rounded) {
        ImageVector imageVector = _deviceUnknown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DeviceUnknown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.0f, 1.0f, 7.0f, 1.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(18.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(10.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(19.0f, 3.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 17.0f, 19.0f, 7.0f, 19.0f);
        r6.m(i, 7.0f, 5.0f, 10.0f, 14.0f);
        k4.C(i, 11.0f, 16.0f, 2.0f, 2.0f);
        kp0.A(i, -2.0f, 9.52f, 10.19f, 0.13f);
        i.curveToRelative(0.33f, 0.0f, 0.59f, -0.23f, 0.7f, -0.54f);
        i.curveToRelative(0.24f, -0.69f, 0.91f, -1.21f, 1.66f, -1.21f);
        i.curveToRelative(0.93f, 0.0f, 1.75f, 0.82f, 1.75f, 1.75f);
        i.curveToRelative(0.0f, 1.32f, -1.49f, 1.55f, -2.23f, 2.82f);
        i.horizontalLineToRelative(-0.01f);
        i.curveToRelative(-0.08f, 0.14f, -0.14f, 0.29f, -0.2f, 0.45f);
        i.curveToRelative(-0.01f, 0.02f, -0.02f, 0.03f, -0.02f, 0.05f);
        i.curveToRelative(-0.01f, 0.02f, -0.01f, 0.04f, -0.01f, 0.05f);
        i.curveToRelative(-0.1f, 0.31f, -0.16f, 0.66f, -0.16f, 1.08f);
        i.horizontalLineToRelative(1.76f);
        i.curveToRelative(0.0f, -0.25f, 0.04f, -0.47f, 0.12f, -0.67f);
        i.curveToRelative(0.54f, -1.47f, 2.77f, -1.86f, 2.48f, -4.18f);
        i.curveToRelative(-0.19f, -1.55f, -1.43f, -2.84f, -2.98f, -3.04f);
        i.curveToRelative(-1.77f, -0.23f, -3.29f, 0.78f, -3.81f, 2.3f);
        i.curveToRelative(-0.2f, 0.56f, 0.23f, 1.14f, 0.82f, 1.14f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deviceUnknown = build;
        build.getClass();
        return build;
    }
}
