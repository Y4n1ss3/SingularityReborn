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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VoiceOverOffKt {
    private static ImageVector _voiceOverOff;

    public static final ImageVector getVoiceOverOff(Icons.Sharp sharp) {
        ImageVector imageVector = _voiceOverOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.VoiceOverOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.76f, 5.36f, -1.68f, 1.69f);
        e.curveToRelative(0.8f, 1.13f, 0.83f, 2.58f, 0.09f, 3.74f);
        e.lineToRelative(1.7f, 1.7f);
        e.curveToRelative(1.9f, -2.02f, 1.87f, -4.98f, -0.11f, -7.13f);
        k4.x(e, 20.07f, 2.0f, -1.63f, 1.63f);
        e.curveToRelative(2.72f, 2.97f, 2.76f, 7.39f, 0.14f, 10.56f);
        e.lineToRelative(1.64f, 1.64f);
        e.curveToRelative(3.74f, -3.89f, 3.71f, -9.84f, -0.15f, -13.83f);
        k4.x(e, 9.43f, 5.04f, 3.53f, 3.53f);
        e.curveToRelative(-0.2f, -1.86f, -1.67f, -3.33f, -3.53f, -3.53f);
        k4.r(e, 4.41f, 2.86f, 3.0f, 4.27f);
        e.lineToRelative(2.62f, 2.62f);
        e.curveTo(5.23f, 7.5f, 5.0f, 8.22f, 5.0f, 9.0f);
        e.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        e.curveToRelative(0.78f, 0.0f, 1.5f, -0.23f, 2.11f, -0.62f);
        e.lineToRelative(4.4f, 4.4f);
        e.curveTo(13.74f, 15.6f, 10.78f, 15.0f, 9.0f, 15.0f);
        e.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        kf0.z(e, 2.0f, 16.0f, -2.0f);
        e.curveToRelative(0.0f, -0.37f, -0.11f, -0.7f, -0.29f, -1.02f);
        e.lineTo(19.73f, 21.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 1.41f, -1.41f, 4.41f, 2.86f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _voiceOverOff = build;
        build.getClass();
        return build;
    }
}
