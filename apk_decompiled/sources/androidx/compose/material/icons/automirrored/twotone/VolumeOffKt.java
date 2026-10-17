package androidx.compose.material.icons.automirrored.twotone;

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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VolumeOffKt {
    private static ImageVector _volumeOff;

    public static final ImageVector getVolumeOff(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _volumeOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.VolumeOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(7.83f, 11.0f, 5.0f, 2.0f, 2.83f);
        i.lineTo(10.0f, 15.17f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.o(i, -3.76f, -1.29f, -1.29f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i2 = af0.i(4.34f, 2.93f, 2.93f, 4.34f);
        i2.lineTo(7.29f, 8.7f);
        i2.lineTo(7.0f, 9.0f);
        af0.m(i2, 3.0f, 9.0f, 6.0f, 4.0f);
        i2.lineToRelative(5.0f, 5.0f);
        i2.verticalLineToRelative(-6.59f);
        i2.lineToRelative(4.18f, 4.18f);
        i2.curveToRelative(-0.65f, 0.49f, -1.38f, 0.88f, -2.18f, 1.11f);
        i2.verticalLineToRelative(2.06f);
        i2.curveToRelative(1.34f, -0.3f, 2.57f, -0.92f, 3.61f, -1.75f);
        i2.lineToRelative(2.05f, 2.05f);
        gy.B(i2, 1.41f, -1.41f, 4.34f, 2.93f);
        i2.moveTo(10.0f, 15.17f);
        i2.lineTo(7.83f, 13.0f);
        af0.m(i2, 5.0f, 13.0f, -2.0f, 2.83f);
        i2.lineToRelative(0.88f, -0.88f);
        bv.r(i2, 10.0f, 11.41f, 3.76f);
        i2.moveTo(19.0f, 12.0f);
        i2.curveToRelative(0.0f, 0.82f, -0.15f, 1.61f, -0.41f, 2.34f);
        i2.lineToRelative(1.53f, 1.53f);
        i2.curveToRelative(0.56f, -1.17f, 0.88f, -2.48f, 0.88f, -3.87f);
        i2.curveToRelative(0.0f, -4.28f, -2.99f, -7.86f, -7.0f, -8.77f);
        i2.verticalLineToRelative(2.06f);
        i2.curveToRelative(2.89f, 0.86f, 5.0f, 3.54f, 5.0f, 6.71f);
        k4.x(i2, 12.0f, 4.0f, -1.88f, 1.88f);
        uo.l(i2, 12.0f, 7.76f, 16.5f, 12.0f);
        i2.curveToRelative(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        i2.verticalLineToRelative(1.79f);
        i2.lineToRelative(2.48f, 2.48f);
        i2.curveToRelative(0.01f, -0.08f, 0.02f, -0.16f, 0.02f, -0.24f);
        i2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volumeOff = build;
        build.getClass();
        return build;
    }
}
