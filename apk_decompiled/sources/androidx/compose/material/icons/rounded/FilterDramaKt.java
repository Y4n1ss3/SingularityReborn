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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FilterDramaKt {
    private static ImageVector _filterDrama;

    public static final ImageVector getFilterDrama(Icons.Rounded rounded) {
        ImageVector imageVector = _filterDrama;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FilterDrama", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.35f, 10.04f);
        b.curveTo(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        b.curveTo(9.11f, 4.0f, 6.61f, 5.64f, 5.36f, 8.04f);
        b.curveTo(2.35f, 8.36f, 0.0f, 10.9f, 0.0f, 14.0f);
        b.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        b.horizontalLineToRelative(13.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        b.curveToRelative(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        r6.g(b, 19.0f, 18.0f, 6.17f);
        b.curveToRelative(-2.09f, 0.0f, -3.95f, -1.53f, -4.15f, -3.61f);
        b.curveTo(1.79f, 12.01f, 3.66f, 10.0f, 6.0f, 10.0f);
        b.curveToRelative(1.92f, 0.0f, 3.53f, 1.36f, 3.91f, 3.17f);
        b.curveToRelative(0.1f, 0.48f, 0.5f, 0.83f, 0.98f, 0.83f);
        b.curveToRelative(0.61f, 0.0f, 1.11f, -0.55f, 0.99f, -1.15f);
        b.curveToRelative(-0.43f, -2.24f, -2.11f, -4.03f, -4.29f, -4.63f);
        b.curveToRelative(1.1f, -1.46f, 2.89f, -2.37f, 4.89f, -2.2f);
        b.curveToRelative(2.88f, 0.25f, 5.01f, 2.82f, 5.01f, 5.71f);
        b.verticalLineTo(12.0f);
        b.horizontalLineToRelative(1.37f);
        b.curveToRelative(1.45f, 0.0f, 2.79f, 0.97f, 3.07f, 2.4f);
        b.curveToRelative(0.39f, 1.91f, -1.08f, 3.6f, -2.93f, 3.6f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filterDrama = build;
        build.getClass();
        return build;
    }
}
