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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SatelliteKt {
    private static ImageVector _satellite;

    public static final ImageVector getSatellite(Icons.Rounded rounded) {
        ImageVector imageVector = _satellite;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Satellite", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 3.0f, 5.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        af0.l(i, 5.0f, 5.0f, 3.0f);
        i.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        uo.l(i, 5.0f, 5.0f, 5.0f, 10.91f);
        i.curveToRelative(0.0f, -0.49f, 0.36f, -0.9f, 0.85f, -0.98f);
        i.curveToRelative(2.08f, -0.36f, 3.72f, -2.0f, 4.08f, -4.08f);
        i.curveToRelative(0.08f, -0.49f, 0.49f, -0.85f, 0.98f, -0.85f);
        i.curveToRelative(0.61f, 0.0f, 1.09f, 0.53f, 1.0f, 1.13f);
        i.curveToRelative(-0.48f, 2.96f, -2.81f, 5.3f, -5.77f, 5.78f);
        i.curveToRelative(-0.6f, 0.1f, -1.14f, -0.39f, -1.14f, -1.0f);
        k4.x(i, 5.63f, 17.19f, 2.49f, -3.2f);
        i.curveToRelative(0.2f, -0.25f, 0.58f, -0.26f, 0.78f, -0.01f);
        i.lineToRelative(2.1f, 2.53f);
        i.lineToRelative(3.1f, -3.99f);
        i.curveToRelative(0.2f, -0.26f, 0.6f, -0.26f, 0.8f, 0.01f);
        i.lineToRelative(3.51f, 4.68f);
        i.curveToRelative(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f);
        i.lineTo(6.02f, 18.01f);
        i.curveToRelative(-0.41f, -0.01f, -0.65f, -0.49f, -0.39f, -0.82f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _satellite = build;
        build.getClass();
        return build;
    }
}
