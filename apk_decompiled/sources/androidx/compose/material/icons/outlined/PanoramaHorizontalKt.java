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
import defpackage.af0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PanoramaHorizontalKt {
    private static ImageVector _panoramaHorizontal;

    public static final ImageVector getPanoramaHorizontal(Icons.Outlined outlined) {
        ImageVector imageVector = _panoramaHorizontal;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PanoramaHorizontal", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(20.0f, 6.54f, 10.91f);
        h.curveToRelative(-2.6f, -0.77f, -5.28f, -1.16f, -8.0f, -1.16f);
        h.reflectiveCurveToRelative(-5.4f, 0.39f, -8.0f, 1.16f);
        h.verticalLineTo(6.54f);
        h.curveToRelative(2.6f, 0.77f, 5.28f, 1.16f, 8.0f, 1.16f);
        h.curveToRelative(2.72f, 0.01f, 5.4f, -0.38f, 8.0f, -1.16f);
        h.moveTo(21.43f, 4.0f);
        h.curveToRelative(-0.1f, 0.0f, -0.2f, 0.02f, -0.31f, 0.06f);
        h.curveTo(18.18f, 5.16f, 15.09f, 5.7f, 12.0f, 5.7f);
        h.reflectiveCurveToRelative(-6.18f, -0.55f, -9.12f, -1.64f);
        h.curveTo(2.77f, 4.02f, 2.66f, 4.0f, 2.57f, 4.0f);
        h.curveToRelative(-0.34f, 0.0f, -0.57f, 0.23f, -0.57f, 0.63f);
        h.verticalLineToRelative(14.75f);
        h.curveToRelative(0.0f, 0.39f, 0.23f, 0.62f, 0.57f, 0.62f);
        h.curveToRelative(0.1f, 0.0f, 0.2f, -0.02f, 0.31f, -0.06f);
        h.curveToRelative(2.94f, -1.1f, 6.03f, -1.64f, 9.12f, -1.64f);
        h.reflectiveCurveToRelative(6.18f, 0.55f, 9.12f, 1.64f);
        h.curveToRelative(0.11f, 0.04f, 0.21f, 0.06f, 0.31f, 0.06f);
        h.curveToRelative(0.33f, 0.0f, 0.57f, -0.23f, 0.57f, -0.63f);
        h.verticalLineTo(4.63f);
        h.curveToRelative(0.0f, -0.4f, -0.24f, -0.63f, -0.57f, -0.63f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaHorizontal = build;
        build.getClass();
        return build;
    }
}
