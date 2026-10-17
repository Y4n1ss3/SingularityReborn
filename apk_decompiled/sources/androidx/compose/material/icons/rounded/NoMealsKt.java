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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoMealsKt {
    private static ImageVector _noMeals;

    public static final ImageVector getNoMeals(Icons.Rounded rounded) {
        ImageVector imageVector = _noMeals;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoMeals", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(21.0f, 18.17f, -2.0f, -2.0f, 14.0f);
        j.horizontalLineToRelative(-1.0f);
        j.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        j.verticalLineTo(6.0f);
        j.curveToRelative(0.0f, -1.49f, 1.6f, -3.32f, 3.76f, -3.85f);
        j.curveTo(20.39f, 2.0f, 21.0f, 2.48f, 21.0f, 3.13f);
        bv.t(j, 18.17f, 21.19f, 22.61f);
        j.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        j.lineToRelative(-9.76f, -9.76f);
        j.curveTo(9.69f, 12.94f, 9.36f, 13.0f, 9.0f, 13.0f);
        j.verticalLineToRelative(8.0f);
        j.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        j.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        j.verticalLineToRelative(-8.0f);
        j.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        j.verticalLineTo(5.83f);
        j.lineTo(1.39f, 4.22f);
        j.curveTo(1.0f, 3.83f, 1.0f, 3.2f, 1.39f, 2.81f);
        j.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        j.lineToRelative(18.38f, 18.38f);
        j.curveTo(21.58f, 21.58f, 21.58f, 22.22f, 21.19f, 22.61f);
        k4.r(j, 6.17f, 9.0f, 5.0f, 7.83f);
        bv.z(j, 9.0f, 6.17f, 13.0f, 9.0f);
        j.verticalLineTo(3.0f);
        j.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        j.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        j.verticalLineToRelative(5.17f);
        j.lineToRelative(1.85f, 1.85f);
        j.curveTo(12.94f, 9.69f, 13.0f, 9.36f, 13.0f, 9.0f);
        j.close();
        j.moveTo(9.0f, 3.0f);
        j.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        j.reflectiveCurveTo(7.0f, 2.45f, 7.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.n(j, 1.17f, 2.0f, 2.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noMeals = build;
        build.getClass();
        return build;
    }
}
