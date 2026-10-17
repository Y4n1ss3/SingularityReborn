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
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SavingsKt {
    private static ImageVector _savings;

    public static final ImageVector getSavings(Icons.Filled filled) {
        ImageVector imageVector = _savings;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Savings", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.83f, 7.5f, -2.27f, -2.27f);
        e.curveToRelative(0.07f, -0.42f, 0.18f, -0.81f, 0.32f, -1.15f);
        e.curveTo(17.96f, 3.9f, 18.0f, 3.71f, 18.0f, 3.5f);
        e.curveTo(18.0f, 2.67f, 17.33f, 2.0f, 16.5f, 2.0f);
        e.curveToRelative(-1.64f, 0.0f, -3.09f, 0.79f, -4.0f, 2.0f);
        e.lineToRelative(-5.0f, 0.0f);
        e.curveTo(4.46f, 4.0f, 2.0f, 6.46f, 2.0f, 9.5f);
        e.reflectiveCurveTo(4.5f, 21.0f, 4.5f, 21.0f);
        r6.A(e, 5.5f, 0.0f, -2.0f, 2.0f);
        e.verticalLineToRelative(2.0f);
        e.lineToRelative(5.5f, 0.0f);
        e.lineToRelative(1.68f, -5.59f);
        j50.z(e, 22.0f, 14.47f, 7.5f, 19.83f);
        uo.p(e, 13.0f, 9.0f, 8.0f, 7.0f);
        uo.r(e, 5.0f, 9.0f, 16.0f, 11.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.curveTo(17.0f, 10.55f, 16.55f, 11.0f, 16.0f, 11.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _savings = build;
        build.getClass();
        return build;
    }
}
