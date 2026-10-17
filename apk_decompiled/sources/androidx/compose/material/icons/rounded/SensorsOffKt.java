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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SensorsOffKt {
    private static ImageVector _sensorsOff;

    public static final ImageVector getSensorsOff(Icons.Rounded rounded) {
        ImageVector imageVector = _sensorsOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SensorsOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(5.68f, 18.32f);
        b.curveToRelative(-0.42f, 0.42f, -1.12f, 0.39f, -1.5f, -0.08f);
        b.curveTo(2.82f, 16.53f, 2.0f, 14.36f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, -2.04f, 0.61f, -3.93f, 1.66f, -5.51f);
        b.lineTo(2.1f, 4.93f);
        b.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        b.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        b.lineToRelative(16.97f, 16.97f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        b.reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0.0f);
        b.lineTo(8.14f, 10.96f);
        b.curveTo(8.05f, 11.29f, 8.0f, 11.64f, 8.0f, 12.0f);
        b.curveToRelative(0.0f, 0.8f, 0.24f, 1.55f, 0.64f, 2.17f);
        b.curveToRelative(0.27f, 0.41f, 0.24f, 0.94f, -0.1f, 1.29f);
        b.curveToRelative(-0.43f, 0.43f, -1.17f, 0.4f, -1.51f, -0.11f);
        b.curveTo(6.38f, 14.4f, 6.0f, 13.24f, 6.0f, 12.0f);
        b.curveToRelative(0.0f, -0.93f, 0.21f, -1.8f, 0.58f, -2.59f);
        b.lineTo(5.11f, 7.94f);
        b.curveTo(4.4f, 9.13f, 4.0f, 10.52f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, 1.89f, 0.66f, 3.63f, 1.76f, 5.0f);
        b.curveTo(6.08f, 17.39f, 6.04f, 17.96f, 5.68f, 18.32f);
        b.close();
        b.moveTo(15.46f, 8.54f);
        b.curveToRelative(-0.35f, 0.35f, -0.37f, 0.88f, -0.11f, 1.29f);
        b.curveTo(15.76f, 10.45f, 16.0f, 11.2f, 16.0f, 12.0f);
        b.curveToRelative(0.0f, 0.36f, -0.05f, 0.71f, -0.14f, 1.04f);
        b.lineToRelative(1.55f, 1.55f);
        b.curveTo(17.79f, 13.8f, 18.0f, 12.93f, 18.0f, 12.0f);
        b.curveToRelative(0.0f, -1.24f, -0.38f, -2.4f, -1.03f, -3.36f);
        b.curveTo(16.63f, 8.14f, 15.9f, 8.1f, 15.46f, 8.54f);
        b.close();
        b.moveTo(18.32f, 5.68f);
        b.curveToRelative(-0.36f, 0.36f, -0.4f, 0.92f, -0.08f, 1.32f);
        b.curveToRelative(1.1f, 1.37f, 1.76f, 3.11f, 1.76f, 5.0f);
        b.curveToRelative(0.0f, 1.48f, -0.4f, 2.87f, -1.11f, 4.06f);
        b.lineToRelative(1.45f, 1.45f);
        b.curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f);
        b.curveToRelative(0.0f, -2.36f, -0.82f, -4.53f, -2.18f, -6.24f);
        b.curveTo(19.44f, 5.29f, 18.74f, 5.26f, 18.32f, 5.68f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sensorsOff = build;
        build.getClass();
        return build;
    }
}
