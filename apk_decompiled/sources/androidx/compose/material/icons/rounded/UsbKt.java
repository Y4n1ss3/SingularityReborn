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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UsbKt {
    private static ImageVector _usb;

    public static final ImageVector getUsb(Icons.Rounded rounded) {
        ImageVector imageVector = _usb;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Usb", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(18.0f, 7.0f, -2.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.verticalLineToRelative(2.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        k4.l(a, 2.0f, -3.0f, 5.0f, 1.0f);
        a.curveToRelative(0.41f, 0.0f, 0.65f, -0.47f, 0.4f, -0.8f);
        a.lineToRelative(-2.0f, -2.67f);
        a.curveToRelative(-0.2f, -0.27f, -0.6f, -0.27f, -0.8f, 0.0f);
        a.lineToRelative(-2.0f, 2.67f);
        a.curveToRelative(-0.25f, 0.33f, -0.01f, 0.8f, 0.4f, 0.8f);
        af0.z(a, 1.0f, 8.0f, 8.0f, -2.07f);
        a.curveToRelative(0.83f, -0.44f, 1.38f, -1.36f, 1.14f, -2.43f);
        a.curveToRelative(-0.17f, -0.77f, -0.77f, -1.4f, -1.52f, -1.61f);
        a.curveTo(6.15f, 6.48f, 4.8f, 7.59f, 4.8f, 9.0f);
        a.curveToRelative(0.0f, 0.85f, 0.5f, 1.56f, 1.2f, 1.93f);
        a.verticalLineTo(13.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.horizontalLineToRelative(3.0f);
        a.verticalLineToRelative(3.05f);
        a.curveToRelative(-0.86f, 0.45f, -1.39f, 1.42f, -1.13f, 2.49f);
        a.curveToRelative(0.18f, 0.75f, 0.79f, 1.38f, 1.54f, 1.58f);
        a.curveToRelative(1.46f, 0.39f, 2.8f, -0.7f, 2.8f, -2.12f);
        a.curveToRelative(0.0f, -0.85f, -0.49f, -1.58f, -1.2f, -1.95f);
        a.verticalLineTo(15.0f);
        a.horizontalLineToRelative(3.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.verticalLineToRelative(-2.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.verticalLineTo(8.0f);
        a.curveTo(19.0f, 7.45f, 18.55f, 7.0f, 18.0f, 7.0f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _usb = build;
        build.getClass();
        return build;
    }
}
