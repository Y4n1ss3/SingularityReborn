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
public final class VoiceOverOffKt {
    private static ImageVector _voiceOverOff;

    public static final ImageVector getVoiceOverOff(Icons.Rounded rounded) {
        ImageVector imageVector = _voiceOverOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VoiceOverOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.72f, 6.41f);
        b.curveToRelative(-0.35f, 0.35f, -0.44f, 0.88f, -0.25f, 1.35f);
        b.curveToRelative(0.3f, 0.75f, 0.32f, 1.58f, 0.05f, 2.34f);
        b.curveToRelative(-0.16f, 0.46f, -0.06f, 0.98f, 0.29f, 1.32f);
        b.curveToRelative(0.6f, 0.6f, 1.66f, 0.47f, 2.02f, -0.31f);
        b.curveToRelative(0.64f, -1.39f, 0.6f, -2.99f, -0.12f, -4.41f);
        b.curveToRelative(-0.4f, -0.75f, -1.41f, -0.88f, -1.99f, -0.29f);
        b.close();
        b.moveTo(19.18f, 2.89f);
        b.curveToRelative(-0.4f, 0.4f, -0.46f, 1.02f, -0.13f, 1.48f);
        b.curveToRelative(1.93f, 2.68f, 1.95f, 6.25f, 0.09f, 9.07f);
        b.curveToRelative(-0.31f, 0.46f, -0.23f, 1.08f, 0.16f, 1.47f);
        b.curveToRelative(0.51f, 0.51f, 1.38f, 0.46f, 1.81f, -0.13f);
        b.curveToRelative(2.57f, -3.51f, 2.52f, -8.2f, -0.17f, -11.77f);
        b.curveToRelative(-0.43f, -0.56f, -1.26f, -0.62f, -1.76f, -0.12f);
        k4.x(b, 9.43f, 5.04f, 3.53f, 3.53f);
        b.curveToRelative(-0.2f, -1.86f, -1.67f, -3.33f, -3.53f, -3.53f);
        b.close();
        b.moveTo(3.71f, 3.56f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(1.91f, 1.91f);
        b.curveToRelative(-0.56f, 0.89f, -0.79f, 2.01f, -0.47f, 3.2f);
        b.curveToRelative(0.36f, 1.33f, 1.44f, 2.4f, 2.77f, 2.77f);
        b.curveToRelative(1.19f, 0.33f, 2.31f, 0.09f, 3.2f, -0.47f);
        b.lineToRelative(4.4f, 4.4f);
        b.curveTo(13.74f, 15.6f, 10.78f, 15.0f, 9.0f, 15.0f);
        b.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        b.verticalLineToRelative(1.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(14.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.0f);
        b.curveToRelative(0.0f, -0.37f, -0.11f, -0.7f, -0.29f, -1.02f);
        b.lineToRelative(2.31f, 2.31f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(5.12f, 3.56f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _voiceOverOff = build;
        build.getClass();
        return build;
    }
}
