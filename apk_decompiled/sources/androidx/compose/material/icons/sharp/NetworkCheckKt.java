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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NetworkCheckKt {
    private static ImageVector _networkCheck;

    public static final ImageVector getNetworkCheck(Icons.Sharp sharp) {
        ImageVector imageVector = _networkCheck;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NetworkCheck", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.9f, 5.0f);
        b.curveToRelative(-0.17f, 0.0f, -0.32f, 0.09f, -0.41f, 0.23f);
        b.lineToRelative(-0.07f, 0.15f);
        b.lineToRelative(-5.18f, 11.65f);
        b.curveToRelative(-0.16f, 0.29f, -0.26f, 0.61f, -0.26f, 0.96f);
        b.curveToRelative(0.0f, 1.11f, 0.9f, 2.01f, 2.01f, 2.01f);
        b.curveToRelative(0.96f, 0.0f, 1.77f, -0.68f, 1.96f, -1.59f);
        b.lineToRelative(0.01f, -0.03f);
        b.lineTo(16.4f, 5.5f);
        b.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        k4.x(b, 1.0f, 9.0f, 2.0f, 2.0f);
        b.curveToRelative(2.88f, -2.88f, 6.79f, -4.08f, 10.53f, -3.62f);
        b.lineToRelative(1.19f, -2.68f);
        b.curveTo(9.89f, 3.84f, 4.74f, 5.27f, 1.0f, 9.0f);
        k4.x(b, 21.0f, 11.0f, 2.0f, -2.0f);
        b.curveToRelative(-1.64f, -1.64f, -3.55f, -2.82f, -5.59f, -3.57f);
        b.lineToRelative(-0.53f, 2.82f);
        b.curveToRelative(1.5f, 0.62f, 2.9f, 1.53f, 4.12f, 2.75f);
        k4.x(b, 17.0f, 15.0f, 2.0f, -2.0f);
        b.curveToRelative(-0.8f, -0.8f, -1.7f, -1.42f, -2.66f, -1.89f);
        b.lineToRelative(-0.55f, 2.92f);
        b.curveToRelative(0.42f, 0.27f, 0.83f, 0.59f, 1.21f, 0.97f);
        k4.x(b, 5.0f, 13.0f, 2.0f, 2.0f);
        b.curveToRelative(1.13f, -1.13f, 2.56f, -1.79f, 4.03f, -2.0f);
        b.lineToRelative(1.28f, -2.88f);
        b.curveToRelative(-2.63f, -0.08f, -5.3f, 0.87f, -7.31f, 2.88f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _networkCheck = build;
        build.getClass();
        return build;
    }
}
