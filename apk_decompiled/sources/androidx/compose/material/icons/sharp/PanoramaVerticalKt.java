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
public final class PanoramaVerticalKt {
    private static ImageVector _panoramaVertical;

    public static final ImageVector getPanoramaVertical(Icons.Sharp sharp) {
        ImageVector imageVector = _panoramaVertical;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PanoramaVertical", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.46f, 4.0f);
        b.curveToRelative(-0.77f, 2.6f, -1.16f, 5.28f, -1.16f, 8.0f);
        b.curveToRelative(0.0f, 2.72f, 0.39f, 5.41f, 1.16f, 8.0f);
        b.horizontalLineTo(6.55f);
        b.curveToRelative(0.77f, -2.6f, 1.16f, -5.28f, 1.16f, -8.0f);
        b.curveToRelative(0.0f, -2.72f, -0.39f, -5.41f, -1.16f, -8.0f);
        b.horizontalLineToRelative(10.91f);
        b.moveToRelative(2.78f, -2.0f);
        b.horizontalLineTo(3.77f);
        b.reflectiveCurveToRelative(0.26f, 0.77f, 0.3f, 0.88f);
        b.curveTo(5.16f, 5.82f, 5.71f, 8.91f, 5.71f, 12.0f);
        b.reflectiveCurveToRelative(-0.55f, 6.18f, -1.64f, 9.12f);
        b.curveToRelative(-0.04f, 0.11f, -0.3f, 0.88f, -0.3f, 0.88f);
        b.horizontalLineToRelative(16.47f);
        b.reflectiveCurveToRelative(-0.26f, -0.77f, -0.3f, -0.88f);
        b.curveToRelative(-1.09f, -2.94f, -1.64f, -6.03f, -1.64f, -9.12f);
        b.reflectiveCurveToRelative(0.55f, -6.18f, 1.64f, -9.12f);
        b.curveToRelative(0.04f, -0.11f, 0.3f, -0.88f, 0.3f, -0.88f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaVertical = build;
        build.getClass();
        return build;
    }
}
