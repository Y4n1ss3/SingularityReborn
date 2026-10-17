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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VoiceOverOffKt {
    private static ImageVector _voiceOverOff;

    public static final ImageVector getVoiceOverOff(Icons.Filled filled) {
        ImageVector imageVector = _voiceOverOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.VoiceOverOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.99f, 9.18f);
        b.curveToRelative(0.0f, -0.06f, 0.01f, -0.12f, 0.01f, -0.18f);
        b.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        b.curveToRelative(-0.06f, 0.0f, -0.12f, 0.01f, -0.18f, 0.01f);
        fc.B(b, 4.17f, 4.17f, 6.89f, 5.62f);
        b.lineTo(4.27f, 3.0f);
        b.lineTo(3.0f, 4.27f);
        b.lineToRelative(2.62f, 2.62f);
        b.curveTo(5.23f, 7.5f, 5.0f, 8.22f, 5.0f, 9.0f);
        b.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        b.curveToRelative(0.78f, 0.0f, 1.5f, -0.23f, 2.11f, -0.62f);
        b.lineTo(19.73f, 21.0f);
        b.lineTo(21.0f, 19.73f);
        fc.C(b, -8.62f, -8.62f, -5.49f, -5.49f);
        b.moveTo(9.0f, 15.0f);
        b.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        kf0.z(b, 2.0f, 16.0f, -2.0f);
        b.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        k4.x(b, 16.76f, 5.36f, -1.68f, 1.69f);
        b.curveToRelative(0.84f, 1.18f, 0.84f, 2.71f, 0.0f, 3.89f);
        b.lineToRelative(1.68f, 1.69f);
        b.curveToRelative(2.02f, -2.02f, 2.02f, -5.07f, 0.0f, -7.27f);
        k4.x(b, 20.07f, 2.0f, -1.63f, 1.63f);
        b.curveToRelative(2.77f, 3.02f, 2.77f, 7.56f, 0.0f, 10.74f);
        b.lineTo(20.07f, 16.0f);
        b.curveToRelative(3.9f, -3.89f, 3.91f, -9.95f, 0.0f, -14.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _voiceOverOff = build;
        build.getClass();
        return build;
    }
}
