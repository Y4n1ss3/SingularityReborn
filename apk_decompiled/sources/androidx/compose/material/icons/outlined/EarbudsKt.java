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
import defpackage.bv;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EarbudsKt {
    private static ImageVector _earbuds;

    public static final ImageVector getEarbuds(Icons.Outlined outlined) {
        ImageVector imageVector = _earbuds;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Earbuds", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.0f, 3.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.verticalLineToRelative(8.0f);
        b.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        b.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        b.verticalLineTo(9.0f);
        b.horizontalLineToRelative(0.83f);
        b.curveTo(7.44f, 9.0f, 8.89f, 7.82f, 9.0f, 6.21f);
        b.curveToRelative(0.12f, -1.69f, -1.16f, -3.1f, -2.8f, -3.21f);
        b.curveTo(4.44f, 2.89f, 3.0f, 4.42f, 3.0f, 6.19f);
        b.verticalLineTo(16.0f);
        b.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b.verticalLineTo(8.0f);
        b.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        b.verticalLineToRelative(7.0f);
        b.horizontalLineToRelative(-0.83f);
        b.curveToRelative(-1.61f, 0.0f, -3.06f, 1.18f, -3.17f, 2.79f);
        b.curveToRelative(-0.12f, 1.69f, 1.16f, 3.1f, 2.8f, 3.21f);
        b.curveToRelative(1.76f, 0.12f, 3.2f, -1.42f, 3.2f, -3.18f);
        b.verticalLineTo(8.0f);
        b.curveTo(21.0f, 5.24f, 18.76f, 3.0f, 16.0f, 3.0f);
        b.close();
        b.moveTo(5.0f, 6.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveTo(6.55f, 7.0f, 6.0f, 7.0f);
        bv.s(b, 5.0f, 6.0f, 19.0f, 18.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(b, 1.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _earbuds = build;
        build.getClass();
        return build;
    }
}
