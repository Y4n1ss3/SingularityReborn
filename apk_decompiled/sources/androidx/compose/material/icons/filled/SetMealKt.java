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
import defpackage.af0;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SetMealKt {
    private static ImageVector _setMeal;

    public static final ImageVector getSetMeal(Icons.Filled filled) {
        ImageVector imageVector = _setMeal;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SetMeal", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.05f, 17.56f, 3.08f, 18.5f);
        i.lineTo(3.0f, 17.0f);
        gy.B(i, 17.98f, -0.94f, 21.05f, 17.56f);
        k4.A(i, 21.0f, 19.48f, 3.0f, 1.5f);
        uo.r(i, 18.0f, 19.48f, 22.0f, 5.0f);
        i.verticalLineToRelative(7.0f);
        i.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        i.horizontalLineTo(4.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        i.verticalLineTo(5.0f);
        i.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveTo(21.1f, 3.0f, 22.0f, 3.9f, 22.0f, 5.0f);
        i.close();
        i.moveTo(20.0f, 6.0f);
        i.curveToRelative(-1.68f, 0.0f, -3.04f, 0.98f, -3.21f, 2.23f);
        i.curveTo(16.15f, 7.5f, 14.06f, 5.5f, 10.25f, 5.5f);
        i.curveToRelative(-4.67f, 0.0f, -6.75f, 3.0f, -6.75f, 3.0f);
        i.reflectiveCurveToRelative(2.08f, 3.0f, 6.75f, 3.0f);
        i.curveToRelative(3.81f, 0.0f, 5.9f, -2.0f, 6.54f, -2.73f);
        i.curveTo(16.96f, 10.02f, 18.32f, 11.0f, 20.0f, 11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(i, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _setMeal = build;
        build.getClass();
        return build;
    }
}
