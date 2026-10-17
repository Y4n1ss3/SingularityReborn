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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HttpKt {
    private static ImageVector _http;

    public static final ImageVector getHttp(Icons.Rounded rounded) {
        ImageVector imageVector = _http;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Http", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(4.5f, 11.0f, -2.0f, 2.5f, 9.75f);
        p.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        p.reflectiveCurveTo(1.0f, 9.34f, 1.0f, 9.75f);
        p.verticalLineToRelative(4.5f);
        p.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        p.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        fc.w(p, 2.5f, 12.5f, 2.0f, 1.75f);
        p.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        p.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        p.verticalLineToRelative(-4.5f);
        p.curveTo(6.0f, 9.34f, 5.66f, 9.0f, 5.25f, 9.0f);
        p.reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f);
        uo.l(p, 4.5f, 11.0f, 7.75f, 10.5f);
        p.horizontalLineToRelative(0.75f);
        p.verticalLineToRelative(3.75f);
        p.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        p.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        p.lineTo(10.0f, 10.5f);
        p.horizontalLineToRelative(0.75f);
        p.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        p.reflectiveCurveTo(11.16f, 9.0f, 10.75f, 9.0f);
        p.horizontalLineToRelative(-3.0f);
        p.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        p.reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f);
        k4.r(p, 13.25f, 10.5f, 14.0f, 10.5f);
        p.verticalLineToRelative(3.75f);
        p.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        p.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        p.lineTo(15.5f, 10.5f);
        p.horizontalLineToRelative(0.75f);
        p.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        p.reflectiveCurveTo(16.66f, 9.0f, 16.25f, 9.0f);
        p.horizontalLineToRelative(-3.0f);
        p.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        p.reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f);
        k4.r(p, 21.5f, 9.0f, 19.0f, 9.0f);
        p.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        p.verticalLineToRelative(4.25f);
        p.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        p.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        p.lineTo(19.5f, 13.0f);
        p.horizontalLineToRelative(2.0f);
        p.curveToRelative(0.83f, 0.0f, 1.5f, -0.68f, 1.5f, -1.5f);
        p.verticalLineToRelative(-1.0f);
        p.curveToRelative(0.0f, -0.82f, -0.67f, -1.5f, -1.5f, -1.5f);
        r6.B(p, 21.5f, 11.5f, -2.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(p, 2.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _http = build;
        build.getClass();
        return build;
    }
}
