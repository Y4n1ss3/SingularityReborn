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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RingVolumeKt {
    private static ImageVector _ringVolume;

    public static final ImageVector getRingVolume(Icons.Filled filled) {
        ImageVector imageVector = _ringVolume;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RingVolume", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(23.71f, 16.67f);
        b.curveTo(20.66f, 13.78f, 16.54f, 12.0f, 12.0f, 12.0f);
        b.curveTo(7.46f, 12.0f, 3.34f, 13.78f, 0.29f, 16.67f);
        b.curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f);
        b.curveToRelative(0.0f, 0.28f, 0.11f, 0.53f, 0.29f, 0.71f);
        b.lineToRelative(2.48f, 2.48f);
        b.curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f);
        b.curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.7f, -0.28f);
        b.curveToRelative(0.79f, -0.74f, 1.69f, -1.36f, 2.66f, -1.85f);
        b.curveToRelative(0.33f, -0.16f, 0.56f, -0.5f, 0.56f, -0.9f);
        b.verticalLineToRelative(-3.1f);
        b.curveToRelative(1.45f, -0.48f, 3.0f, -0.73f, 4.6f, -0.73f);
        b.reflectiveCurveToRelative(3.15f, 0.25f, 4.6f, 0.72f);
        b.verticalLineToRelative(3.1f);
        b.curveToRelative(0.0f, 0.39f, 0.23f, 0.74f, 0.56f, 0.9f);
        b.curveToRelative(0.98f, 0.49f, 1.87f, 1.12f, 2.66f, 1.85f);
        b.curveToRelative(0.18f, 0.18f, 0.43f, 0.28f, 0.7f, 0.28f);
        b.curveToRelative(0.28f, 0.0f, 0.53f, -0.11f, 0.71f, -0.29f);
        b.lineToRelative(2.48f, -2.48f);
        b.curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f);
        b.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.7f);
        k4.x(b, 21.16f, 6.26f, -1.41f, -1.41f);
        b.lineToRelative(-3.56f, 3.55f);
        b.lineToRelative(1.41f, 1.41f);
        b.reflectiveCurveToRelative(3.45f, -3.52f, 3.56f, -3.55f);
        r6.B(b, 13.0f, 2.0f, -2.0f, 5.0f);
        uo.r(b, 2.0f, 2.0f, 6.4f, 9.81f);
        b.lineTo(7.81f, 8.4f);
        b.lineTo(4.26f, 4.84f);
        b.lineTo(2.84f, 6.26f);
        b.curveToRelative(0.11f, 0.03f, 3.56f, 3.55f, 3.56f, 3.55f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ringVolume = build;
        build.getClass();
        return build;
    }
}
