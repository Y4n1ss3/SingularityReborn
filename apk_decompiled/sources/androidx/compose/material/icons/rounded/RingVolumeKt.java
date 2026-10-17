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
import defpackage.af0;
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RingVolumeKt {
    private static ImageVector _ringVolume;

    public static final ImageVector getRingVolume(Icons.Rounded rounded) {
        ImageVector imageVector = _ringVolume;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RingVolume", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(11.98f, 7.0f, 0.03f);
        a.curveToRelative(0.55f, 0.0f, 0.99f, -0.44f, 0.99f, -0.98f);
        a.lineTo(13.0f, 2.98f);
        a.curveToRelative(0.0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f);
        a.horizontalLineToRelative(-0.03f);
        a.curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.98f);
        a.verticalLineToRelative(3.03f);
        a.curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.98f, 0.99f);
        a.close();
        a.moveTo(16.9f, 9.11f);
        a.curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f);
        a.curveToRelative(0.62f, -0.63f, 1.52f, -1.54f, 2.15f, -2.17f);
        a.curveToRelative(0.39f, -0.38f, 0.39f, -1.01f, 0.0f, -1.39f);
        a.curveToRelative(-0.38f, -0.38f, -1.01f, -0.38f, -1.39f, 0.0f);
        a.lineTo(16.89f, 7.7f);
        a.curveToRelative(-0.39f, 0.38f, -0.39f, 1.01f, 0.0f, 1.39f);
        fc.B(a, 0.01f, 0.02f, 5.71f, 9.1f);
        a.curveToRelative(0.38f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f);
        a.curveToRelative(0.38f, -0.38f, 0.38f, -1.01f, 0.0f, -1.39f);
        a.lineTo(4.96f, 5.54f);
        a.curveToRelative(-0.38f, -0.39f, -1.01f, -0.39f, -1.39f, 0.0f);
        a.lineToRelative(-0.02f, 0.01f);
        a.curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.39f);
        a.curveToRelative(0.63f, 0.62f, 1.54f, 1.53f, 2.16f, 2.16f);
        a.close();
        a.moveTo(23.29f, 16.23f);
        a.curveToRelative(-6.41f, -5.66f, -16.07f, -5.66f, -22.48f, 0.0f);
        a.curveToRelative(-0.85f, 0.75f, -0.85f, 2.08f, -0.05f, 2.88f);
        a.lineToRelative(1.22f, 1.22f);
        a.curveToRelative(0.72f, 0.72f, 1.86f, 0.78f, 2.66f, 0.15f);
        a.lineToRelative(2.0f, -1.59f);
        a.curveToRelative(0.48f, -0.38f, 0.76f, -0.96f, 0.76f, -1.57f);
        a.verticalLineToRelative(-2.6f);
        a.curveToRelative(3.02f, -0.98f, 6.29f, -0.99f, 9.32f, 0.0f);
        a.verticalLineToRelative(2.61f);
        a.curveToRelative(0.0f, 0.61f, 0.28f, 1.19f, 0.76f, 1.57f);
        a.lineToRelative(1.99f, 1.58f);
        a.curveToRelative(0.8f, 0.63f, 1.94f, 0.57f, 2.66f, -0.15f);
        a.lineToRelative(1.22f, -1.22f);
        a.curveToRelative(0.79f, -0.8f, 0.79f, -2.13f, -0.06f, -2.88f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ringVolume = build;
        build.getClass();
        return build;
    }
}
