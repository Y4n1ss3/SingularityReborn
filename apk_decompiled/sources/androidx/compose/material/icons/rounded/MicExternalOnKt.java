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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MicExternalOnKt {
    private static ImageVector _micExternalOn;

    public static final ImageVector getMicExternalOn(Icons.Rounded rounded) {
        ImageVector imageVector = _micExternalOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MicExternalOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(9.22f, 7.0f, 4.78f);
        d.curveTo(4.3f, 6.47f, 4.0f, 5.77f, 4.0f, 5.0f);
        d.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        d.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        d.curveTo(10.0f, 5.77f, 9.7f, 6.47f, 9.22f, 7.0f);
        d.close();
        d.moveTo(16.24f, 2.01f);
        d.curveTo(18.32f, 2.13f, 20.0f, 4.08f, 20.0f, 6.16f);
        d.lineTo(20.0f, 21.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.lineToRelative(0.0f, -14.91f);
        d.curveToRelative(0.0f, -0.96f, -0.64f, -1.86f, -1.58f, -2.05f);
        d.curveTo(15.14f, 3.78f, 14.0f, 4.76f, 14.0f, 6.0f);
        d.lineToRelative(0.0f, 11.84f);
        d.curveToRelative(0.0f, 2.08f, -1.68f, 4.03f, -3.76f, 4.15f);
        d.curveTo(7.92f, 22.13f, 6.0f, 20.29f, 6.0f, 18.0f);
        d.horizontalLineTo(5.45f);
        d.curveToRelative(-0.26f, 0.0f, -0.47f, -0.19f, -0.5f, -0.45f);
        d.lineTo(4.11f, 9.1f);
        d.curveTo(4.05f, 8.51f, 4.51f, 8.0f, 5.1f, 8.0f);
        d.horizontalLineTo(8.9f);
        d.curveToRelative(0.59f, 0.0f, 1.05f, 0.51f, 1.0f, 1.1f);
        d.lineToRelative(-0.85f, 8.45f);
        d.curveTo(9.02f, 17.81f, 8.8f, 18.0f, 8.55f, 18.0f);
        d.horizontalLineTo(8.0f);
        d.curveToRelative(0.0f, 1.24f, 1.14f, 2.22f, 2.42f, 1.96f);
        d.curveToRelative(0.94f, -0.19f, 1.58f, -1.09f, 1.58f, -2.05f);
        d.lineTo(12.0f, 6.0f);
        d.curveTo(12.0f, 3.71f, 13.92f, 1.87f, 16.24f, 2.01f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _micExternalOn = build;
        build.getClass();
        return build;
    }
}
