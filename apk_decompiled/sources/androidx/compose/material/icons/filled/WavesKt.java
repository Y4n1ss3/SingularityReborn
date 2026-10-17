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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WavesKt {
    private static ImageVector _waves;

    public static final ImageVector getWaves(Icons.Filled filled) {
        ImageVector imageVector = _waves;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Waves", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.0f, 16.99f);
        b.curveToRelative(-1.35f, 0.0f, -2.2f, 0.42f, -2.95f, 0.8f);
        b.curveToRelative(-0.65f, 0.33f, -1.18f, 0.6f, -2.05f, 0.6f);
        b.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        b.curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f);
        b.reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f);
        b.curveToRelative(-0.65f, 0.33f, -1.17f, 0.6f, -2.05f, 0.6f);
        b.verticalLineToRelative(1.95f);
        b.curveToRelative(1.35f, 0.0f, 2.2f, -0.42f, 2.95f, -0.8f);
        b.curveToRelative(0.65f, -0.33f, 1.17f, -0.6f, 2.05f, -0.6f);
        b.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        b.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        b.reflectiveCurveToRelative(2.2f, -0.42f, 2.95f, -0.8f);
        b.curveToRelative(0.65f, -0.33f, 1.18f, -0.6f, 2.05f, -0.6f);
        b.curveToRelative(0.9f, 0.0f, 1.4f, 0.25f, 2.05f, 0.6f);
        b.curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f);
        b.verticalLineToRelative(-1.95f);
        b.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        b.curveToRelative(-0.75f, -0.38f, -1.6f, -0.8f, -2.95f, -0.8f);
        b.close();
        b.moveTo(17.0f, 12.54f);
        b.curveToRelative(-1.35f, 0.0f, -2.2f, 0.43f, -2.95f, 0.8f);
        b.curveToRelative(-0.65f, 0.32f, -1.18f, 0.6f, -2.05f, 0.6f);
        b.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        b.curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f);
        b.reflectiveCurveToRelative(-2.2f, 0.43f, -2.95f, 0.8f);
        b.curveToRelative(-0.65f, 0.32f, -1.17f, 0.6f, -2.05f, 0.6f);
        b.verticalLineToRelative(1.95f);
        b.curveToRelative(1.35f, 0.0f, 2.2f, -0.43f, 2.95f, -0.8f);
        b.curveToRelative(0.65f, -0.35f, 1.15f, -0.6f, 2.05f, -0.6f);
        b.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        b.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        b.reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f);
        b.curveToRelative(0.65f, -0.35f, 1.15f, -0.6f, 2.05f, -0.6f);
        b.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        b.curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f);
        b.verticalLineToRelative(-1.95f);
        b.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        b.curveToRelative(-0.75f, -0.38f, -1.6f, -0.8f, -2.95f, -0.8f);
        b.close();
        b.moveTo(19.95f, 4.46f);
        b.curveToRelative(-0.75f, -0.38f, -1.58f, -0.8f, -2.95f, -0.8f);
        b.reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f);
        b.curveToRelative(-0.65f, 0.32f, -1.18f, 0.6f, -2.05f, 0.6f);
        b.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        b.curveToRelative(-0.75f, -0.37f, -1.57f, -0.8f, -2.95f, -0.8f);
        b.reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f);
        b.curveToRelative(-0.65f, 0.33f, -1.17f, 0.6f, -2.05f, 0.6f);
        b.verticalLineToRelative(1.93f);
        b.curveToRelative(1.35f, 0.0f, 2.2f, -0.43f, 2.95f, -0.8f);
        b.curveToRelative(0.65f, -0.33f, 1.17f, -0.6f, 2.05f, -0.6f);
        b.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        b.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        b.reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f);
        b.curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f);
        b.curveToRelative(0.9f, 0.0f, 1.4f, 0.25f, 2.05f, 0.6f);
        b.curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f);
        b.lineTo(22.0f, 5.04f);
        b.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.58f);
        b.close();
        b.moveTo(17.0f, 8.09f);
        b.curveToRelative(-1.35f, 0.0f, -2.2f, 0.43f, -2.95f, 0.8f);
        b.curveToRelative(-0.65f, 0.35f, -1.15f, 0.6f, -2.05f, 0.6f);
        b.reflectiveCurveToRelative(-1.4f, -0.25f, -2.05f, -0.6f);
        b.curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f);
        b.reflectiveCurveToRelative(-2.2f, 0.43f, -2.95f, 0.8f);
        b.curveToRelative(-0.65f, 0.35f, -1.15f, 0.6f, -2.05f, 0.6f);
        b.verticalLineToRelative(1.95f);
        b.curveToRelative(1.35f, 0.0f, 2.2f, -0.43f, 2.95f, -0.8f);
        b.curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f);
        b.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        b.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        b.reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f);
        b.curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f);
        b.curveToRelative(0.9f, 0.0f, 1.4f, 0.25f, 2.05f, 0.6f);
        b.curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f);
        b.lineTo(22.0f, 9.49f);
        b.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        b.curveToRelative(-0.75f, -0.38f, -1.6f, -0.8f, -2.95f, -0.8f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _waves = build;
        build.getClass();
        return build;
    }
}
