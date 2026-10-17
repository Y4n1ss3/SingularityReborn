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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FilterVintageKt {
    private static ImageVector _filterVintage;

    public static final ImageVector getFilterVintage(Icons.Filled filled) {
        ImageVector imageVector = _filterVintage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FilterVintage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.7f, 12.4f);
        b.curveToRelative(-0.28f, -0.16f, -0.57f, -0.29f, -0.86f, -0.4f);
        b.curveToRelative(0.29f, -0.11f, 0.58f, -0.24f, 0.86f, -0.4f);
        b.curveToRelative(1.92f, -1.11f, 2.99f, -3.12f, 3.0f, -5.19f);
        b.curveToRelative(-1.79f, -1.03f, -4.07f, -1.11f, -6.0f, 0.0f);
        b.curveToRelative(-0.28f, 0.16f, -0.54f, 0.35f, -0.78f, 0.54f);
        b.curveToRelative(0.05f, -0.31f, 0.08f, -0.63f, 0.08f, -0.95f);
        b.curveToRelative(0.0f, -2.22f, -1.21f, -4.15f, -3.0f, -5.19f);
        b.curveTo(10.21f, 1.85f, 9.0f, 3.78f, 9.0f, 6.0f);
        b.curveToRelative(0.0f, 0.32f, 0.03f, 0.64f, 0.08f, 0.95f);
        b.curveToRelative(-0.24f, -0.2f, -0.5f, -0.39f, -0.78f, -0.55f);
        b.curveToRelative(-1.92f, -1.11f, -4.2f, -1.03f, -6.0f, 0.0f);
        b.curveToRelative(0.0f, 2.07f, 1.07f, 4.08f, 3.0f, 5.19f);
        b.curveToRelative(0.28f, 0.16f, 0.57f, 0.29f, 0.86f, 0.4f);
        b.curveToRelative(-0.29f, 0.11f, -0.58f, 0.24f, -0.86f, 0.4f);
        b.curveToRelative(-1.92f, 1.11f, -2.99f, 3.12f, -3.0f, 5.19f);
        b.curveToRelative(1.79f, 1.03f, 4.07f, 1.11f, 6.0f, 0.0f);
        b.curveToRelative(0.28f, -0.16f, 0.54f, -0.35f, 0.78f, -0.54f);
        b.curveToRelative(-0.05f, 0.32f, -0.08f, 0.64f, -0.08f, 0.96f);
        b.curveToRelative(0.0f, 2.22f, 1.21f, 4.15f, 3.0f, 5.19f);
        b.curveToRelative(1.79f, -1.04f, 3.0f, -2.97f, 3.0f, -5.19f);
        b.curveToRelative(0.0f, -0.32f, -0.03f, -0.64f, -0.08f, -0.95f);
        b.curveToRelative(0.24f, 0.2f, 0.5f, 0.38f, 0.78f, 0.54f);
        b.curveToRelative(1.92f, 1.11f, 4.2f, 1.03f, 6.0f, 0.0f);
        b.curveToRelative(-0.01f, -2.07f, -1.08f, -4.08f, -3.0f, -5.19f);
        b.close();
        b.moveTo(12.0f, 16.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        b.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        b.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -1.79f, 4.0f, -4.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filterVintage = build;
        build.getClass();
        return build;
    }
}
