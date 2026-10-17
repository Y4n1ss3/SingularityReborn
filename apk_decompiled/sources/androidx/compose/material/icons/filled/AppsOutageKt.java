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
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AppsOutageKt {
    private static ImageVector _appsOutage;

    public static final ImageVector getAppsOutage(Icons.Filled filled) {
        ImageVector imageVector = _appsOutage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AppsOutage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(4.0f, 8.0f, 4.0f, 4.0f, 4.0f);
        k4.D(v, 8.0f, 10.0f, 20.0f, 4.0f);
        k4.p(v, -4.0f, -4.0f, 20.0f);
        k4.C(v, 4.0f, 20.0f, 4.0f, -4.0f);
        bv.s(v, 4.0f, 20.0f, 4.0f, 14.0f);
        gy.t(v, 4.0f, -4.0f, 4.0f, 14.0f);
        k4.C(v, 10.0f, 14.0f, 4.0f, -4.0f);
        uo.r(v, -4.0f, 14.0f, 16.0f, 20.0f);
        bv.l(v, 4.0f, -4.0f, -4.0f, 20.0f);
        v.moveTo(19.0f, 0.0f);
        v.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        v.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        v.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        v.reflectiveCurveTo(21.76f, 0.0f, 19.0f, 0.0f);
        af0.r(v, 19.5f, 8.0f, -1.0f, 7.0f);
        uo.r(v, 1.0f, 8.0f, 19.5f, 6.0f);
        j50.D(v, -1.0f, 2.0f, 1.0f, 6.0f);
        k4.C(v, 16.0f, 14.0f, 4.0f, -2.07f);
        v.curveTo(19.67f, 11.98f, 19.34f, 12.0f, 19.0f, 12.0f);
        v.curveToRelative(-1.07f, 0.0f, -2.09f, -0.24f, -3.0f, -0.68f);
        kf0.D(v, 14.0f, 10.0f, 4.0f, 4.0f);
        v.horizontalLineToRelative(2.68f);
        v.curveTo(12.24f, 7.09f, 12.0f, 6.07f, 12.0f, 5.0f);
        v.curveToRelative(0.0f, -0.34f, 0.02f, -0.67f, 0.07f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(v, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _appsOutage = build;
        build.getClass();
        return build;
    }
}
