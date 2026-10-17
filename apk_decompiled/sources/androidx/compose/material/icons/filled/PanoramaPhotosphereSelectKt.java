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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PanoramaPhotosphereSelectKt {
    private static ImageVector _panoramaPhotosphereSelect;

    public static final ImageVector getPanoramaPhotosphereSelect(Icons.Filled filled) {
        ImageVector imageVector = _panoramaPhotosphereSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PanoramaPhotosphereSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.49f, 8.51f);
        b.curveToRelative(-0.47f, -0.23f, -0.93f, -0.44f, -1.4f, -0.64f);
        b.curveTo(19.52f, 4.41f, 16.05f, 2.0f, 12.0f, 2.0f);
        b.reflectiveCurveTo(4.47f, 4.41f, 2.9f, 7.88f);
        b.curveToRelative(-0.47f, 0.2f, -0.93f, 0.41f, -1.4f, 0.63f);
        b.curveToRelative(-0.31f, 0.15f, -0.5f, 0.48f, -0.5f, 0.83f);
        b.verticalLineToRelative(5.32f);
        b.curveToRelative(0.0f, 0.35f, 0.19f, 0.68f, 0.51f, 0.83f);
        b.curveToRelative(0.47f, 0.23f, 0.93f, 0.44f, 1.39f, 0.64f);
        b.curveToRelative(3.55f, 7.83f, 14.65f, 7.82f, 18.2f, 0.0f);
        b.curveToRelative(0.47f, -0.2f, 0.93f, -0.41f, 1.39f, -0.63f);
        b.curveToRelative(0.31f, -0.17f, 0.51f, -0.49f, 0.51f, -0.84f);
        b.verticalLineTo(9.34f);
        b.curveToRelative(0.0f, -0.35f, -0.19f, -0.68f, -0.51f, -0.83f);
        b.close();
        b.moveTo(12.0f, 3.8f);
        b.curveToRelative(2.6f, 0.0f, 4.91f, 1.23f, 6.41f, 3.12f);
        b.curveToRelative(-4.1f, -1.19f, -8.48f, -1.26f, -12.83f, 0.01f);
        b.curveTo(7.08f, 5.03f, 9.4f, 3.8f, 12.0f, 3.8f);
        b.close();
        b.moveTo(5.6f, 17.08f);
        b.curveToRelative(4.19f, 1.22f, 8.57f, 1.23f, 12.82f, -0.01f);
        b.curveToRelative(-1.54f, 1.97f, -3.9f, 3.13f, -6.41f, 3.13f);
        b.curveToRelative(-2.5f, 0.0f, -4.87f, -1.15f, -6.41f, -3.12f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaPhotosphereSelect = build;
        build.getClass();
        return build;
    }
}
