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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PanoramaVerticalKt {
    private static ImageVector _panoramaVertical;

    public static final ImageVector getPanoramaVertical(Icons.Outlined outlined) {
        ImageVector imageVector = _panoramaVertical;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PanoramaVertical", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.94f, 21.12f);
        b.curveToRelative(-1.1f, -2.94f, -1.64f, -6.03f, -1.64f, -9.12f);
        b.reflectiveCurveToRelative(0.55f, -6.18f, 1.64f, -9.12f);
        b.curveToRelative(0.04f, -0.11f, 0.06f, -0.22f, 0.06f, -0.31f);
        b.curveToRelative(0.0f, -0.34f, -0.23f, -0.57f, -0.63f, -0.57f);
        b.horizontalLineTo(4.63f);
        b.curveToRelative(-0.4f, 0.0f, -0.63f, 0.23f, -0.63f, 0.57f);
        b.curveToRelative(0.0f, 0.1f, 0.02f, 0.2f, 0.06f, 0.31f);
        b.curveTo(5.16f, 5.82f, 5.71f, 8.91f, 5.71f, 12.0f);
        b.reflectiveCurveToRelative(-0.55f, 6.18f, -1.64f, 9.12f);
        b.curveToRelative(-0.05f, 0.11f, -0.07f, 0.22f, -0.07f, 0.31f);
        b.curveToRelative(0.0f, 0.33f, 0.23f, 0.57f, 0.63f, 0.57f);
        b.horizontalLineToRelative(14.75f);
        b.curveToRelative(0.39f, 0.0f, 0.63f, -0.24f, 0.63f, -0.57f);
        b.curveToRelative(-0.01f, -0.1f, -0.03f, -0.2f, -0.07f, -0.31f);
        b.close();
        b.moveTo(6.54f, 20.0f);
        b.curveToRelative(0.77f, -2.6f, 1.16f, -5.28f, 1.16f, -8.0f);
        b.reflectiveCurveToRelative(-0.39f, -5.4f, -1.16f, -8.0f);
        b.horizontalLineToRelative(10.91f);
        b.curveToRelative(-0.77f, 2.6f, -1.16f, 5.28f, -1.16f, 8.0f);
        b.reflectiveCurveToRelative(0.39f, 5.4f, 1.16f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 6.54f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaVertical = build;
        build.getClass();
        return build;
    }
}
