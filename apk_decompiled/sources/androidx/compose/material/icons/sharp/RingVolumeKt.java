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
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RingVolumeKt {
    private static ImageVector _ringVolume;

    public static final ImageVector getRingVolume(Icons.Sharp sharp) {
        ImageVector imageVector = _ringVolume;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RingVolume", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.16f, 6.26f, -1.41f, -1.41f);
        e.lineToRelative(-3.56f, 3.55f);
        e.lineToRelative(1.41f, 1.41f);
        e.reflectiveCurveToRelative(3.45f, -3.52f, 3.56f, -3.55f);
        r6.B(e, 11.0f, 2.0f, 2.0f, 5.0f);
        j50.t(e, -2.0f, 6.4f, 9.81f);
        e.lineTo(7.81f, 8.4f);
        e.lineTo(4.26f, 4.84f);
        e.lineTo(2.84f, 6.26f);
        e.curveToRelative(0.11f, 0.03f, 3.56f, 3.55f, 3.56f, 3.55f);
        k4.x(e, 0.0f, 17.39f, 3.68f, 3.68f);
        e.lineToRelative(3.92f, -3.11f);
        e.verticalLineToRelative(-3.37f);
        e.curveToRelative(2.85f, -0.93f, 5.94f, -0.93f, 8.8f, 0.0f);
        e.verticalLineToRelative(3.38f);
        e.lineToRelative(3.91f, 3.1f);
        e.lineTo(24.0f, 17.39f);
        e.curveToRelative(-6.41f, -7.19f, -17.59f, -7.19f, -24.0f, 0.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ringVolume = build;
        build.getClass();
        return build;
    }
}
