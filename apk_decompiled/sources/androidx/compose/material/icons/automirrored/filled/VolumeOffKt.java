package androidx.compose.material.icons.automirrored.filled;

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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VolumeOffKt {
    private static ImageVector _volumeOff;

    public static final ImageVector getVolumeOff(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _volumeOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.VolumeOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.5f, 12.0f);
        b.curveToRelative(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        b.verticalLineToRelative(2.21f);
        b.lineToRelative(2.45f, 2.45f);
        b.curveToRelative(0.03f, -0.2f, 0.05f, -0.41f, 0.05f, -0.63f);
        b.close();
        b.moveTo(19.0f, 12.0f);
        b.curveToRelative(0.0f, 0.94f, -0.2f, 1.82f, -0.54f, 2.64f);
        b.lineToRelative(1.51f, 1.51f);
        b.curveTo(20.63f, 14.91f, 21.0f, 13.5f, 21.0f, 12.0f);
        b.curveToRelative(0.0f, -4.28f, -2.99f, -7.86f, -7.0f, -8.77f);
        b.verticalLineToRelative(2.06f);
        b.curveToRelative(2.89f, 0.86f, 5.0f, 3.54f, 5.0f, 6.71f);
        k4.r(b, 4.27f, 3.0f, 3.0f, 4.27f);
        b.lineTo(7.73f, 9.0f);
        af0.m(b, 3.0f, 9.0f, 6.0f, 4.0f);
        b.lineToRelative(5.0f, 5.0f);
        b.verticalLineToRelative(-6.73f);
        b.lineToRelative(4.25f, 4.25f);
        b.curveToRelative(-0.67f, 0.52f, -1.42f, 0.93f, -2.25f, 1.18f);
        b.verticalLineToRelative(2.06f);
        b.curveToRelative(1.38f, -0.31f, 2.63f, -0.95f, 3.69f, -1.81f);
        b.lineTo(19.73f, 21.0f);
        b.lineTo(21.0f, 19.73f);
        gy.B(b, -9.0f, -9.0f, 4.27f, 3.0f);
        b.moveTo(12.0f, 4.0f);
        b.lineTo(9.91f, 6.09f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 12.0f, 8.18f, 12.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volumeOff = build;
        build.getClass();
        return build;
    }
}
