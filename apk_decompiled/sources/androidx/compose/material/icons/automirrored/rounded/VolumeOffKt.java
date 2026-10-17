package androidx.compose.material.icons.automirrored.rounded;

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
public final class VolumeOffKt {
    private static ImageVector _volumeOff;

    public static final ImageVector getVolumeOff(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _volumeOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.VolumeOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.63f, 3.63f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineTo(7.29f, 8.7f);
        b.lineTo(7.0f, 9.0f);
        b.lineTo(4.0f, 9.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(3.0f);
        b.lineToRelative(3.29f, 3.29f);
        b.curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f);
        b.verticalLineToRelative(-4.17f);
        b.lineToRelative(4.18f, 4.18f);
        b.curveToRelative(-0.49f, 0.37f, -1.02f, 0.68f, -1.6f, 0.91f);
        b.curveToRelative(-0.36f, 0.15f, -0.58f, 0.53f, -0.58f, 0.92f);
        b.curveToRelative(0.0f, 0.72f, 0.73f, 1.18f, 1.39f, 0.91f);
        b.curveToRelative(0.8f, -0.33f, 1.55f, -0.77f, 2.22f, -1.31f);
        b.lineToRelative(1.34f, 1.34f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(5.05f, 3.63f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, 0.0f);
        b.close();
        b.moveTo(19.0f, 12.0f);
        b.curveToRelative(0.0f, 0.82f, -0.15f, 1.61f, -0.41f, 2.34f);
        b.lineToRelative(1.53f, 1.53f);
        b.curveToRelative(0.56f, -1.17f, 0.88f, -2.48f, 0.88f, -3.87f);
        b.curveToRelative(0.0f, -3.83f, -2.4f, -7.11f, -5.78f, -8.4f);
        b.curveToRelative(-0.59f, -0.23f, -1.22f, 0.23f, -1.22f, 0.86f);
        b.verticalLineToRelative(0.19f);
        b.curveToRelative(0.0f, 0.38f, 0.25f, 0.71f, 0.61f, 0.85f);
        b.curveTo(17.18f, 6.54f, 19.0f, 9.06f, 19.0f, 12.0f);
        k4.x(b, 10.29f, 5.71f, -0.17f, 0.17f);
        b.lineTo(12.0f, 7.76f);
        b.lineTo(12.0f, 6.41f);
        b.curveToRelative(0.0f, -0.89f, -1.08f, -1.33f, -1.71f, -0.7f);
        b.close();
        b.moveTo(16.5f, 12.0f);
        b.curveToRelative(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        b.verticalLineToRelative(1.79f);
        b.lineToRelative(2.48f, 2.48f);
        b.curveToRelative(0.01f, -0.08f, 0.02f, -0.16f, 0.02f, -0.24f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volumeOff = build;
        build.getClass();
        return build;
    }
}
