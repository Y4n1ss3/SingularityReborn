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
import defpackage.af0;
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RouteKt {
    private static ImageVector _route;

    public static final ImageVector getRoute(Icons.Sharp sharp) {
        ImageVector imageVector = _route;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Route", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(19.0f, 15.18f, 3.0f, -8.0f, 16.0f);
        c.horizontalLineTo(7.0f);
        c.verticalLineTo(8.82f);
        c.curveTo(8.16f, 8.4f, 9.0f, 7.3f, 9.0f, 6.0f);
        c.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        c.reflectiveCurveTo(3.0f, 4.34f, 3.0f, 6.0f);
        c.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        gy.z(c, 21.0f, 8.0f, 5.0f, 4.0f);
        c.verticalLineToRelative(10.18f);
        c.curveToRelative(-1.16f, 0.41f, -2.0f, 1.51f, -2.0f, 2.82f);
        c.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        c.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        c.curveTo(21.0f, 16.7f, 20.16f, 15.6f, 19.0f, 15.18f);
        c.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _route = build;
        build.getClass();
        return build;
    }
}
