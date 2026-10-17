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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NetworkCheckKt {
    private static ImageVector _networkCheck;

    public static final ImageVector getNetworkCheck(Icons.Rounded rounded) {
        ImageVector imageVector = _networkCheck;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NetworkCheck", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        b.close();
        b.moveTo(2.06f, 10.06f);
        b.curveToRelative(0.51f, 0.51f, 1.33f, 0.55f, 1.89f, 0.09f);
        b.curveToRelative(2.76f, -2.26f, 6.24f, -3.18f, 9.58f, -2.76f);
        b.lineToRelative(1.19f, -2.68f);
        b.curveToRelative(-4.35f, -0.78f, -8.96f, 0.3f, -12.57f, 3.25f);
        b.curveToRelative(-0.64f, 0.53f, -0.68f, 1.51f, -0.09f, 2.1f);
        b.close();
        b.moveTo(21.94f, 10.06f);
        b.curveToRelative(0.59f, -0.59f, 0.55f, -1.57f, -0.1f, -2.1f);
        b.curveToRelative(-1.36f, -1.11f, -2.86f, -1.95f, -4.44f, -2.53f);
        b.lineToRelative(-0.53f, 2.82f);
        b.curveToRelative(1.13f, 0.47f, 2.19f, 1.09f, 3.17f, 1.89f);
        b.curveToRelative(0.58f, 0.46f, 1.39f, 0.43f, 1.9f, -0.08f);
        b.close();
        b.moveTo(17.91f, 14.09f);
        b.curveToRelative(0.6f, -0.6f, 0.56f, -1.63f, -0.14f, -2.12f);
        b.curveToRelative(-0.46f, -0.33f, -0.94f, -0.61f, -1.44f, -0.86f);
        b.lineToRelative(-0.55f, 2.92f);
        b.curveToRelative(0.11f, 0.07f, 0.22f, 0.14f, 0.32f, 0.22f);
        b.curveToRelative(0.57f, 0.4f, 1.33f, 0.32f, 1.81f, -0.16f);
        b.close();
        b.moveTo(6.08f, 14.08f);
        b.curveToRelative(0.5f, 0.5f, 1.27f, 0.54f, 1.85f, 0.13f);
        b.curveToRelative(0.94f, -0.66f, 2.01f, -1.06f, 3.1f, -1.22f);
        b.lineToRelative(1.28f, -2.88f);
        b.curveToRelative(-2.13f, -0.06f, -4.28f, 0.54f, -6.09f, 1.84f);
        b.curveToRelative(-0.69f, 0.51f, -0.74f, 1.53f, -0.14f, 2.13f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _networkCheck = build;
        build.getClass();
        return build;
    }
}
