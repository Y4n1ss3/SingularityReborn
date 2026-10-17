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
import defpackage.bv;
import defpackage.c21;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SetMealKt {
    private static ImageVector _setMeal;

    public static final ImageVector getSetMeal(Icons.TwoTone twoTone) {
        ImageVector imageVector = _setMeal;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SetMeal", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(21.0f, 13.0f, 3.0f, 4.0f, 18.0f);
        bv.t(f, 13.0f, 20.0f, 6.0f);
        f.curveToRelative(-1.68f, 0.0f, -3.04f, 0.98f, -3.21f, 2.23f);
        f.curveTo(16.15f, 7.5f, 14.06f, 5.5f, 10.25f, 5.5f);
        f.curveToRelative(-4.67f, 0.0f, -6.75f, 3.0f, -6.75f, 3.0f);
        f.reflectiveCurveToRelative(2.08f, 3.0f, 6.75f, 3.0f);
        f.curveToRelative(3.81f, 0.0f, 5.9f, -2.0f, 6.54f, -2.73f);
        f.curveTo(16.96f, 10.02f, 18.32f, 11.0f, 20.0f, 11.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(f, 6.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.05f, 17.56f, 3.08f, 18.5f);
        i.lineTo(3.0f, 17.0f);
        gy.B(i, 17.98f, -0.94f, 21.05f, 17.56f);
        k4.A(i, 21.0f, 19.48f, 3.0f, 1.5f);
        uo.r(i, 18.0f, 19.48f, 23.0f, 13.0f);
        i.verticalLineTo(4.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.horizontalLineTo(3.0f);
        i.curveTo(1.9f, 2.0f, 1.0f, 2.9f, 1.0f, 4.0f);
        i.verticalLineToRelative(9.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(18.0f);
        i.curveTo(22.1f, 15.0f, 23.0f, 14.1f, 23.0f, 13.0f);
        c21.d(i, 21.0f, 13.0f, 3.0f, 4.0f);
        uo.r(i, 18.0f, 13.0f, 20.0f, 6.0f);
        i.curveToRelative(-1.68f, 0.0f, -3.04f, 0.98f, -3.21f, 2.23f);
        i.curveTo(16.15f, 7.5f, 14.06f, 5.5f, 10.25f, 5.5f);
        i.curveToRelative(-4.67f, 0.0f, -6.75f, 3.0f, -6.75f, 3.0f);
        i.reflectiveCurveToRelative(2.08f, 3.0f, 6.75f, 3.0f);
        i.curveToRelative(3.81f, 0.0f, 5.9f, -2.0f, 6.54f, -2.73f);
        i.curveTo(16.96f, 10.02f, 18.32f, 11.0f, 20.0f, 11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(i, 6.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _setMeal = build;
        build.getClass();
        return build;
    }
}
