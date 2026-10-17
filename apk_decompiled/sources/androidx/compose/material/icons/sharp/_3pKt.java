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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _3pKt {
    private static ImageVector __3p;

    public static final ImageVector get_3p(Icons.Sharp sharp) {
        ImageVector imageVector = __3p;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._3p", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(2.0f, 2.0f, 20.0f, 4.0f, -4.0f);
        kf0.v(n, 16.0f, 2.0f, 2.0f);
        n.moveTo(12.0f, 6.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        n.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        n.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        n.reflectiveCurveTo(10.9f, 6.0f, 12.0f, 6.0f);
        uo.q(n, 16.0f, 14.0f, 8.0f, -0.57f);
        n.curveToRelative(0.0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f);
        n.curveTo(10.07f, 11.21f, 11.01f, 11.0f, 12.0f, 11.0f);
        n.curveToRelative(0.99f, 0.0f, 1.93f, 0.21f, 2.78f, 0.58f);
        n.curveTo(15.52f, 11.9f, 16.0f, 12.62f, 16.0f, 13.43f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(n, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __3p = build;
        build.getClass();
        return build;
    }
}
