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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PanoramaHorizontalKt {
    private static ImageVector _panoramaHorizontal;

    public static final ImageVector getPanoramaHorizontal(Icons.Sharp sharp) {
        ImageVector imageVector = _panoramaHorizontal;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PanoramaHorizontal", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.0f, 6.55f);
        b.curveToRelative(2.6f, 0.77f, 5.28f, 1.16f, 8.0f, 1.16f);
        b.curveToRelative(2.72f, 0.0f, 5.41f, -0.39f, 8.0f, -1.16f);
        b.verticalLineToRelative(10.91f);
        b.curveToRelative(-2.6f, -0.77f, -5.28f, -1.16f, -8.0f, -1.16f);
        b.curveToRelative(-2.72f, 0.0f, -5.41f, 0.39f, -8.0f, 1.16f);
        b.verticalLineTo(6.55f);
        b.moveTo(2.0f, 3.77f);
        b.verticalLineToRelative(16.47f);
        b.reflectiveCurveToRelative(0.77f, -0.26f, 0.88f, -0.3f);
        b.curveTo(5.82f, 18.85f, 8.91f, 18.3f, 12.0f, 18.3f);
        b.curveToRelative(3.09f, 0.0f, 6.18f, 0.55f, 9.12f, 1.64f);
        b.curveToRelative(0.11f, 0.04f, 0.88f, 0.3f, 0.88f, 0.3f);
        b.verticalLineTo(3.77f);
        b.reflectiveCurveToRelative(-0.77f, 0.26f, -0.88f, 0.3f);
        b.curveTo(18.18f, 5.15f, 15.09f, 5.71f, 12.0f, 5.71f);
        b.reflectiveCurveToRelative(-6.18f, -0.56f, -9.12f, -1.64f);
        b.curveToRelative(-0.11f, -0.05f, -0.88f, -0.3f, -0.88f, -0.3f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaHorizontal = build;
        build.getClass();
        return build;
    }
}
