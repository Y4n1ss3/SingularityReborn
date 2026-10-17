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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WifiCallingKt {
    private static ImageVector _wifiCalling;

    public static final ImageVector getWifiCalling(Icons.Outlined outlined) {
        ImageVector imageVector = _wifiCalling;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WifiCalling", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.0f, 15.51f);
        b.curveToRelative(-1.24f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f);
        b.curveToRelative(-0.1f, -0.04f, -0.21f, -0.05f, -0.31f, -0.05f);
        b.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        b.lineToRelative(-2.2f, 2.2f);
        b.curveToRelative(-2.83f, -1.45f, -5.15f, -3.76f, -6.59f, -6.59f);
        b.lineToRelative(2.2f, -2.2f);
        b.curveTo(9.1f, 8.31f, 9.18f, 7.92f, 9.07f, 7.57f);
        b.curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(4.0f);
        b.curveTo(3.45f, 3.0f, 3.0f, 3.45f, 3.0f, 4.0f);
        b.curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-3.49f);
        b.curveTo(21.0f, 15.96f, 20.55f, 15.51f, 20.0f, 15.51f);
        af0.l(b, 5.03f, 5.0f, 1.5f);
        b.curveTo(6.6f, 5.89f, 6.75f, 6.76f, 6.99f, 7.59f);
        b.lineToRelative(-1.2f, 1.2f);
        b.curveTo(5.38f, 7.59f, 5.12f, 6.32f, 5.03f, 5.0f);
        b.close();
        b.moveTo(19.0f, 18.97f);
        b.curveToRelative(-1.32f, -0.09f, -2.59f, -0.35f, -3.8f, -0.75f);
        b.lineToRelative(1.19f, -1.19f);
        b.curveToRelative(0.85f, 0.24f, 1.72f, 0.39f, 2.6f, 0.45f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 18.97f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(22.0f, 4.95f);
        b2.curveTo(21.79f, 4.78f, 19.67f, 3.0f, 16.5f, 3.0f);
        b2.curveToRelative(-3.18f, 0.0f, -5.29f, 1.78f, -5.5f, 1.95f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b2, 16.5f, 12.0f, 22.0f, 4.95f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiCalling = build;
        build.getClass();
        return build;
    }
}
