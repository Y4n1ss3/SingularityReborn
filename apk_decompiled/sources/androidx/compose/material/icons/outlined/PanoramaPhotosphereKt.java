package androidx.compose.material.icons.outlined;

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
public final class PanoramaPhotosphereKt {
    private static ImageVector _panoramaPhotosphere;

    public static final ImageVector getPanoramaPhotosphere(Icons.Outlined outlined) {
        ImageVector imageVector = _panoramaPhotosphere;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PanoramaPhotosphere", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.95f, 8.15f);
        b.curveToRelative(-0.29f, -0.16f, -0.61f, -0.31f, -0.93f, -0.46f);
        b.curveTo(19.4f, 4.33f, 15.98f, 2.0f, 12.0f, 2.0f);
        b.curveTo(8.02f, 2.0f, 4.6f, 4.33f, 2.99f, 7.68f);
        b.curveToRelative(-0.33f, 0.15f, -0.64f, 0.3f, -0.93f, 0.46f);
        b.curveTo(1.41f, 8.5f, 1.0f, 9.17f, 1.0f, 9.91f);
        b.verticalLineToRelative(4.18f);
        b.curveToRelative(0.0f, 0.74f, 0.41f, 1.41f, 1.05f, 1.77f);
        b.curveToRelative(0.29f, 0.16f, 0.61f, 0.31f, 0.93f, 0.46f);
        b.curveTo(4.6f, 19.67f, 8.02f, 22.0f, 12.0f, 22.0f);
        b.curveToRelative(3.98f, 0.0f, 7.4f, -2.33f, 9.01f, -5.68f);
        b.curveToRelative(0.33f, -0.15f, 0.64f, -0.3f, 0.93f, -0.46f);
        b.curveTo(22.59f, 15.5f, 23.0f, 14.83f, 23.0f, 14.09f);
        b.verticalLineTo(9.91f);
        b.curveTo(23.0f, 9.17f, 22.59f, 8.5f, 21.95f, 8.15f);
        b.close();
        b.moveTo(21.0f, 9.91f);
        b.curveTo(21.0f, 9.91f, 21.0f, 9.91f, 21.0f, 9.91f);
        b.lineToRelative(0.0f, 4.19f);
        b.curveTo(18.81f, 15.31f, 15.53f, 16.0f, 12.0f, 16.0f);
        b.curveToRelative(-3.53f, 0.0f, -6.81f, -0.7f, -9.0f, -1.91f);
        b.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        b.lineToRelative(0.0f, -4.18f);
        b.curveTo(5.2f, 8.69f, 8.47f, 8.0f, 12.0f, 8.0f);
        b.curveTo(15.53f, 8.0f, 18.81f, 8.7f, 21.0f, 9.91f);
        b.close();
        b.moveTo(12.0f, 4.0f);
        b.curveToRelative(2.37f, 0.0f, 4.49f, 1.04f, 5.95f, 2.68f);
        b.curveTo(16.17f, 6.25f, 14.15f, 6.0f, 12.0f, 6.0f);
        b.curveTo(9.85f, 6.0f, 7.83f, 6.25f, 6.05f, 6.68f);
        b.curveTo(7.51f, 5.04f, 9.63f, 4.0f, 12.0f, 4.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-2.37f, 0.0f, -4.49f, -1.04f, -5.95f, -2.68f);
        b.curveTo(7.83f, 17.75f, 9.85f, 18.0f, 12.0f, 18.0f);
        b.reflectiveCurveToRelative(4.17f, -0.25f, 5.95f, -0.68f);
        b.curveTo(16.49f, 18.96f, 14.37f, 20.0f, 12.0f, 20.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaPhotosphere = build;
        build.getClass();
        return build;
    }
}
