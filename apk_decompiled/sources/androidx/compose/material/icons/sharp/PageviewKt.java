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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PageviewKt {
    private static ImageVector _pageview;

    public static final ImageVector getPageview(Icons.Sharp sharp) {
        ImageVector imageVector = _pageview;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Pageview", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.5f, 9.0f);
        b.curveTo(10.12f, 9.0f, 9.0f, 10.12f, 9.0f, 11.5f);
        b.reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f);
        b.reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f);
        b.reflectiveCurveTo(12.88f, 9.0f, 11.5f, 9.0f);
        k4.r(b, 22.0f, 4.0f, 2.0f, 4.0f);
        uo.D(b, 16.0f, 20.0f, 22.0f, 4.0f);
        b.moveTo(16.79f, 18.21f);
        b.lineToRelative(-2.91f, -2.91f);
        b.curveToRelative(-0.69f, 0.44f, -1.51f, 0.7f, -2.39f, 0.7f);
        b.curveTo(9.01f, 16.0f, 7.0f, 13.99f, 7.0f, 11.5f);
        b.reflectiveCurveTo(9.01f, 7.0f, 11.5f, 7.0f);
        b.reflectiveCurveTo(16.0f, 9.01f, 16.0f, 11.5f);
        b.curveToRelative(0.0f, 0.88f, -0.26f, 1.69f, -0.7f, 2.39f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 2.91f, 2.9f, -1.42f, 1.42f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pageview = build;
        build.getClass();
        return build;
    }
}
