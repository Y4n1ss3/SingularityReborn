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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoMealsKt {
    private static ImageVector _noMeals;

    public static final ImageVector getNoMeals(Icons.Filled filled) {
        ImageVector imageVector = _noMeals;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoMeals", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(16.0f, 14.0f, 6.0f);
        d.curveToRelative(0.0f, -1.76f, 2.24f, -4.0f, 5.0f, -4.0f);
        k4.z(d, 16.17f, -2.0f, -2.0f, 14.0f);
        k4.w(d, 16.0f, 20.49f, 23.31f);
        d.lineTo(10.02f, 12.85f);
        d.curveTo(9.69f, 12.94f, 9.36f, 13.0f, 9.0f, 13.0f);
        r6.s(d, 9.0f, 7.0f, -9.0f);
        d.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        d.verticalLineTo(5.83f);
        d.lineTo(0.69f, 3.51f);
        d.lineTo(2.1f, 2.1f);
        gy.B(d, 19.8f, 19.8f, 20.49f, 23.31f);
        d.moveTo(6.17f, 9.0f);
        j50.z(d, 5.0f, 7.83f, 9.0f, 6.17f);
        k4.A(d, 9.0f, 2.0f, 7.0f, 2.17f);
        uf.x(d, 2.0f, 2.0f, 2.0f);
        kp0.t(d, 13.0f, 9.0f, 2.0f, -2.0f);
        d.verticalLineToRelative(6.17f);
        d.lineToRelative(1.85f, 1.85f);
        d.curveTo(12.94f, 9.69f, 13.0f, 9.36f, 13.0f, 9.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noMeals = build;
        build.getClass();
        return build;
    }
}
