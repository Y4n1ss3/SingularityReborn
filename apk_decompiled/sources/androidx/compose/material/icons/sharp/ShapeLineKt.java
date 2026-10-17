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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShapeLineKt {
    private static ImageVector _shapeLine;

    public static final ImageVector getShapeLine(Icons.Sharp sharp) {
        ImageVector imageVector = _shapeLine;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ShapeLine", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.0f, 11.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveTo(8.76f, 1.0f, 6.0f, 1.0f);
        b.reflectiveCurveTo(1.0f, 3.24f, 1.0f, 6.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 3.24f, 11.0f, 6.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(k4.n(23.0f, 14.0f, -9.0f, 9.0f, 9.0f), 14.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(17.71f, 7.7f);
        b2.curveTo(18.11f, 7.89f, 18.54f, 8.0f, 19.0f, 8.0f);
        b2.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        b2.reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f);
        b2.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        b2.curveToRelative(0.0f, 0.46f, 0.11f, 0.89f, 0.3f, 1.29f);
        b2.lineTo(6.29f, 16.3f);
        b2.curveTo(5.89f, 16.11f, 5.46f, 16.0f, 5.0f, 16.0f);
        b2.curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f);
        b2.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        b2.reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f);
        b2.curveToRelative(0.0f, -0.46f, -0.11f, -0.89f, -0.3f, -1.29f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b2, 17.71f, 7.7f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shapeLine = build;
        build.getClass();
        return build;
    }
}
