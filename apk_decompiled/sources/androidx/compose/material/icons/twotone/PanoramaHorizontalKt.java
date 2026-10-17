package androidx.compose.material.icons.twotone;

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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PanoramaHorizontalKt {
    private static ImageVector _panoramaHorizontal;

    public static final ImageVector getPanoramaHorizontal(Icons.TwoTone twoTone) {
        ImageVector imageVector = _panoramaHorizontal;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PanoramaHorizontal", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(4.0f, 6.54f, 10.91f);
        h.curveToRelative(2.6f, -0.77f, 5.28f, -1.16f, 8.0f, -1.16f);
        h.reflectiveCurveToRelative(5.4f, 0.39f, 8.0f, 1.16f);
        h.verticalLineTo(6.54f);
        h.curveToRelative(-2.6f, 0.78f, -5.28f, 1.17f, -8.0f, 1.16f);
        h.curveToRelative(-2.72f, 0.0f, -5.4f, -0.39f, -8.0f, -1.16f);
        h.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.43f, 4.0f);
        b.curveToRelative(-0.1f, 0.0f, -0.2f, 0.02f, -0.31f, 0.06f);
        b.curveTo(18.18f, 5.16f, 15.09f, 5.7f, 12.0f, 5.7f);
        b.reflectiveCurveToRelative(-6.18f, -0.55f, -9.12f, -1.64f);
        b.curveTo(2.77f, 4.02f, 2.66f, 4.0f, 2.57f, 4.0f);
        b.curveToRelative(-0.34f, 0.0f, -0.57f, 0.23f, -0.57f, 0.63f);
        b.verticalLineToRelative(14.75f);
        b.curveToRelative(0.0f, 0.39f, 0.23f, 0.62f, 0.57f, 0.62f);
        b.curveToRelative(0.1f, 0.0f, 0.2f, -0.02f, 0.31f, -0.06f);
        b.curveToRelative(2.94f, -1.1f, 6.03f, -1.64f, 9.12f, -1.64f);
        b.reflectiveCurveToRelative(6.18f, 0.55f, 9.12f, 1.64f);
        b.curveToRelative(0.11f, 0.04f, 0.21f, 0.06f, 0.31f, 0.06f);
        b.curveToRelative(0.33f, 0.0f, 0.57f, -0.23f, 0.57f, -0.63f);
        b.verticalLineTo(4.63f);
        b.curveToRelative(0.0f, -0.4f, -0.24f, -0.63f, -0.57f, -0.63f);
        b.close();
        b.moveTo(20.0f, 17.45f);
        b.curveToRelative(-2.6f, -0.77f, -5.28f, -1.16f, -8.0f, -1.16f);
        b.reflectiveCurveToRelative(-5.4f, 0.39f, -8.0f, 1.16f);
        b.verticalLineTo(6.54f);
        b.curveToRelative(2.6f, 0.77f, 5.28f, 1.16f, 8.0f, 1.16f);
        b.curveToRelative(2.72f, 0.01f, 5.4f, -0.38f, 8.0f, -1.16f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(b, 10.91f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaHorizontal = build;
        build.getClass();
        return build;
    }
}
