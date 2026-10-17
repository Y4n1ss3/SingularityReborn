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
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhpKt {
    private static ImageVector _php;

    public static final ImageVector getPhp(Icons.Rounded rounded) {
        ImageVector imageVector = _php;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Php", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(6.5f, 10.5f, -2.0f, 1.0f, 2.0f);
        k4.D(n, 10.5f, 20.0f, 10.5f, -2.0f);
        k4.p(n, 1.0f, 2.0f, 10.5f);
        k4.C(n, 13.0f, 12.5f, -2.0f, 1.75f);
        n.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        n.reflectiveCurveTo(9.5f, 14.66f, 9.5f, 14.25f);
        n.verticalLineToRelative(-4.5f);
        n.curveTo(9.5f, 9.34f, 9.84f, 9.0f, 10.25f, 9.0f);
        n.reflectiveCurveTo(11.0f, 9.34f, 11.0f, 9.75f);
        uf.z(n, 11.0f, 2.0f, 9.75f);
        n.curveTo(13.0f, 9.34f, 13.34f, 9.0f, 13.75f, 9.0f);
        n.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        n.verticalLineToRelative(4.5f);
        n.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        n.reflectiveCurveTo(13.0f, 14.66f, 13.0f, 14.25f);
        bv.t(n, 12.5f, 18.0f, 14.25f);
        n.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        n.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        n.verticalLineTo(10.0f);
        n.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        n.horizontalLineTo(20.0f);
        n.curveToRelative(0.83f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f);
        n.verticalLineToRelative(1.0f);
        n.curveToRelative(0.0f, 0.82f, -0.67f, 1.5f, -1.5f, 1.5f);
        uo.r(n, -2.0f, 14.25f, 3.0f, 10.0f);
        n.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        n.horizontalLineToRelative(2.5f);
        n.curveTo(7.33f, 9.0f, 8.0f, 9.68f, 8.0f, 10.5f);
        n.verticalLineToRelative(1.0f);
        n.curveTo(8.0f, 12.32f, 7.33f, 13.0f, 6.5f, 13.0f);
        n.horizontalLineToRelative(-2.0f);
        n.verticalLineToRelative(1.25f);
        n.curveTo(4.5f, 14.66f, 4.16f, 15.0f, 3.75f, 15.0f);
        n.reflectiveCurveTo(3.0f, 14.66f, 3.0f, 14.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(n, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _php = build;
        build.getClass();
        return build;
    }
}
