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
import defpackage.fc;
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PortableWifiOffKt {
    private static ImageVector _portableWifiOff;

    public static final ImageVector getPortableWifiOff(Icons.Outlined outlined) {
        ImageVector imageVector = _portableWifiOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PortableWifiOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(3.42f, 2.36f, 2.01f, 3.78f);
        i.lineTo(4.1f, 5.87f);
        i.curveTo(2.79f, 7.57f, 2.0f, 9.69f, 2.0f, 12.0f);
        i.curveToRelative(0.0f, 3.7f, 2.01f, 6.92f, 4.99f, 8.65f);
        i.lineToRelative(1.0f, -1.73f);
        i.curveTo(5.61f, 17.53f, 4.0f, 14.96f, 4.0f, 12.0f);
        i.curveToRelative(0.0f, -1.76f, 0.57f, -3.38f, 1.53f, -4.69f);
        i.lineToRelative(1.43f, 1.44f);
        i.curveTo(6.36f, 9.68f, 6.0f, 10.8f, 6.0f, 12.0f);
        i.curveToRelative(0.0f, 2.22f, 1.21f, 4.15f, 3.0f, 5.19f);
        i.lineToRelative(1.0f, -1.74f);
        i.curveToRelative(-1.19f, -0.7f, -2.0f, -1.97f, -2.0f, -3.45f);
        i.curveToRelative(0.0f, -0.65f, 0.17f, -1.25f, 0.44f, -1.79f);
        i.lineToRelative(1.58f, 1.58f);
        i.lineTo(10.0f, 12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.lineToRelative(0.21f, -0.02f);
        i.lineToRelative(7.52f, 7.52f);
        gy.B(i, 1.41f, -1.41f, 3.42f, 2.36f);
        i.moveTo(17.71f, 13.82f);
        i.curveToRelative(0.18f, -0.57f, 0.29f, -1.19f, 0.29f, -1.82f);
        i.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        i.curveToRelative(-0.63f, 0.0f, -1.25f, 0.11f, -1.82f, 0.29f);
        i.lineToRelative(1.72f, 1.72f);
        i.curveToRelative(0.03f, 0.0f, 0.06f, -0.01f, 0.1f, -0.01f);
        i.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        i.curveToRelative(0.0f, 0.04f, -0.01f, 0.07f, -0.01f, 0.11f);
        fc.B(i, 1.72f, 1.71f, 12.0f, 4.0f);
        i.curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f);
        i.curveToRelative(0.0f, 1.2f, -0.29f, 2.32f, -0.77f, 3.35f);
        i.lineToRelative(1.49f, 1.49f);
        i.curveTo(21.53f, 15.4f, 22.0f, 13.76f, 22.0f, 12.0f);
        i.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        i.curveToRelative(-1.76f, 0.0f, -3.4f, 0.48f, -4.84f, 1.28f);
        i.lineToRelative(1.48f, 1.48f);
        i.curveTo(9.66f, 4.28f, 10.8f, 4.0f, 12.0f, 4.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _portableWifiOff = build;
        build.getClass();
        return build;
    }
}
