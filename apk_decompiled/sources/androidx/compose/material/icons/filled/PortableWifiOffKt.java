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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PortableWifiOffKt {
    private static ImageVector _portableWifiOff;

    public static final ImageVector getPortableWifiOff(Icons.Filled filled) {
        ImageVector imageVector = _portableWifiOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PortableWifiOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.56f, 14.24f);
        b.curveToRelative(0.28f, -0.69f, 0.44f, -1.45f, 0.44f, -2.24f);
        b.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        b.curveToRelative(-0.79f, 0.0f, -1.55f, 0.16f, -2.24f, 0.44f);
        b.lineToRelative(1.62f, 1.62f);
        b.curveToRelative(0.2f, -0.03f, 0.41f, -0.06f, 0.62f, -0.06f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        b.curveToRelative(0.0f, 0.21f, -0.02f, 0.42f, -0.05f, 0.63f);
        fc.B(b, 1.61f, 1.61f, 12.0f, 4.0f);
        b.curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f);
        b.curveToRelative(0.0f, 1.35f, -0.35f, 2.62f, -0.95f, 3.74f);
        b.lineToRelative(1.47f, 1.47f);
        b.curveTo(21.46f, 15.69f, 22.0f, 13.91f, 22.0f, 12.0f);
        b.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        b.curveToRelative(-1.91f, 0.0f, -3.69f, 0.55f, -5.21f, 1.47f);
        b.lineToRelative(1.46f, 1.46f);
        b.curveTo(9.37f, 4.34f, 10.65f, 4.0f, 12.0f, 4.0f);
        k4.r(b, 3.27f, 2.5f, 2.0f, 3.77f);
        b.lineToRelative(2.1f, 2.1f);
        b.curveTo(2.79f, 7.57f, 2.0f, 9.69f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 3.7f, 2.01f, 6.92f, 4.99f, 8.65f);
        b.lineToRelative(1.0f, -1.73f);
        b.curveTo(5.61f, 17.53f, 4.0f, 14.96f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, -1.76f, 0.57f, -3.38f, 1.53f, -4.69f);
        b.lineToRelative(1.43f, 1.44f);
        b.curveTo(6.36f, 9.68f, 6.0f, 10.8f, 6.0f, 12.0f);
        b.curveToRelative(0.0f, 2.22f, 1.21f, 4.15f, 3.0f, 5.19f);
        b.lineToRelative(1.0f, -1.74f);
        b.curveToRelative(-1.19f, -0.7f, -2.0f, -1.97f, -2.0f, -3.45f);
        b.curveToRelative(0.0f, -0.65f, 0.17f, -1.25f, 0.44f, -1.79f);
        b.lineToRelative(1.58f, 1.58f);
        b.lineTo(10.0f, 12.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.lineToRelative(0.21f, -0.02f);
        b.lineToRelative(0.01f, 0.01f);
        b.lineToRelative(7.51f, 7.51f);
        b.lineTo(21.0f, 20.23f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(b, 4.27f, 3.5f, -1.0f, -1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _portableWifiOff = build;
        build.getClass();
        return build;
    }
}
