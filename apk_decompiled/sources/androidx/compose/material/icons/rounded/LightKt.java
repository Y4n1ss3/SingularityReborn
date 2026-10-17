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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LightKt {
    private static ImageVector _light;

    public static final ImageVector getLight(Icons.Rounded rounded) {
        ImageVector imageVector = _light;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Light", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(13.0f, 6.06f, 4.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(2.06f);
        d.curveToRelative(-4.5f, 0.5f, -8.0f, 4.31f, -8.0f, 8.93f);
        d.curveTo(3.0f, 16.1f, 3.9f, 17.0f, 5.01f, 17.0f);
        d.lineTo(8.0f, 17.0f);
        d.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        d.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        d.lineToRelative(2.99f, 0.0f);
        d.curveTo(20.1f, 17.0f, 21.0f, 16.1f, 21.0f, 14.99f);
        d.curveTo(21.0f, 10.37f, 17.5f, 6.56f, 13.0f, 6.06f);
        k4.x(d, 12.0f, 15.0f, -7.0f, 0.0f);
        d.curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f);
        d.reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(d, 12.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _light = build;
        build.getClass();
        return build;
    }
}
