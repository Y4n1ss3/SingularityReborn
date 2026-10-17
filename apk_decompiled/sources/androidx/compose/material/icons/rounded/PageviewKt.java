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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PageviewKt {
    private static ImageVector _pageview;

    public static final ImageVector getPageview(Icons.Rounded rounded) {
        ImageVector imageVector = _pageview;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Pageview", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.5f, 9.0f);
        b.curveTo(10.12f, 9.0f, 9.0f, 10.12f, 9.0f, 11.5f);
        b.reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f);
        b.reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f);
        b.reflectiveCurveTo(12.88f, 9.0f, 11.5f, 9.0f);
        k4.r(b, 20.0f, 4.0f, 4.0f, 4.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(12.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(16.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.lineTo(22.0f, 6.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(b, 16.08f, 17.5f, -2.2f, -2.2f);
        b.curveToRelative(-0.9f, 0.58f, -2.03f, 0.84f, -3.22f, 0.62f);
        b.curveToRelative(-1.88f, -0.35f, -3.38f, -1.93f, -3.62f, -3.83f);
        b.curveToRelative(-0.38f, -3.01f, 2.18f, -5.52f, 5.21f, -5.04f);
        b.curveToRelative(1.88f, 0.3f, 3.39f, 1.84f, 3.7f, 3.71f);
        b.curveToRelative(0.19f, 1.16f, -0.08f, 2.23f, -0.64f, 3.12f);
        b.lineToRelative(2.2f, 2.19f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.03f, 0.0f, 1.42f);
        b.curveToRelative(-0.4f, 0.4f, -1.04f, 0.4f, -1.43f, 0.01f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pageview = build;
        build.getClass();
        return build;
    }
}
