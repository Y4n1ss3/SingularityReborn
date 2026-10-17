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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiKt {
    private static ImageVector _wifi;

    public static final ImageVector getWifi(Icons.Rounded rounded) {
        ImageVector imageVector = _wifi;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Wifi", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(2.06f, 10.06f);
        b.curveToRelative(0.51f, 0.51f, 1.32f, 0.56f, 1.87f, 0.1f);
        b.curveToRelative(4.67f, -3.84f, 11.45f, -3.84f, 16.13f, -0.01f);
        b.curveToRelative(0.56f, 0.46f, 1.38f, 0.42f, 1.89f, -0.09f);
        b.curveToRelative(0.59f, -0.59f, 0.55f, -1.57f, -0.1f, -2.1f);
        b.curveToRelative(-5.71f, -4.67f, -13.97f, -4.67f, -19.69f, 0.0f);
        b.curveToRelative(-0.65f, 0.52f, -0.7f, 1.5f, -0.1f, 2.1f);
        k4.x(b, 9.82f, 17.82f, 1.47f, 1.47f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(1.47f, -1.47f);
        b.curveToRelative(0.47f, -0.47f, 0.37f, -1.28f, -0.23f, -1.59f);
        b.curveToRelative(-1.22f, -0.63f, -2.68f, -0.63f, -3.91f, 0.0f);
        b.curveToRelative(-0.57f, 0.31f, -0.68f, 1.12f, -0.21f, 1.59f);
        b.close();
        b.moveTo(6.09f, 14.09f);
        b.curveToRelative(0.49f, 0.49f, 1.26f, 0.54f, 1.83f, 0.13f);
        b.curveToRelative(2.44f, -1.73f, 5.72f, -1.73f, 8.16f, 0.0f);
        b.curveToRelative(0.57f, 0.4f, 1.34f, 0.36f, 1.83f, -0.13f);
        b.lineToRelative(0.01f, -0.01f);
        b.curveToRelative(0.6f, -0.6f, 0.56f, -1.62f, -0.13f, -2.11f);
        b.curveToRelative(-3.44f, -2.49f, -8.13f, -2.49f, -11.58f, 0.0f);
        b.curveToRelative(-0.69f, 0.5f, -0.73f, 1.51f, -0.12f, 2.12f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifi = build;
        build.getClass();
        return build;
    }
}
