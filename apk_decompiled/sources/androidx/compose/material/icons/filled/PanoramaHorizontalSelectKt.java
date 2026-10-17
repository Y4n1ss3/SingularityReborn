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
public final class PanoramaHorizontalSelectKt {
    private static ImageVector _panoramaHorizontalSelect;

    public static final ImageVector getPanoramaHorizontalSelect(Icons.Filled filled) {
        ImageVector imageVector = _panoramaHorizontalSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PanoramaHorizontalSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
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
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaHorizontalSelect = build;
        build.getClass();
        return build;
    }
}
