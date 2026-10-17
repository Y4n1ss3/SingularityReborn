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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BalconyKt {
    private static ImageVector _balcony;

    public static final ImageVector getBalcony(Icons.Rounded rounded) {
        ImageVector imageVector = _balcony;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Balcony", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(20.0f, 14.27f, 10.0f);
        d.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        d.reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f);
        d.verticalLineToRelative(4.27f);
        d.curveTo(3.4f, 14.61f, 3.0f, 15.26f, 3.0f, 16.0f);
        d.verticalLineToRelative(4.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineToRelative(-4.0f);
        d.curveTo(21.0f, 15.26f, 20.6f, 14.61f, 20.0f, 14.27f);
        uo.q(d, 7.0f, 20.0f, 5.0f, -4.0f);
        uo.r(d, 2.0f, 20.0f, 11.0f, 20.0f);
        bv.h(d, 9.0f, -4.0f, 2.0f, 20.0f);
        k4.A(d, 11.0f, 14.0f, 6.0f, -4.0f);
        d.curveToRelative(0.0f, -2.97f, 2.16f, -5.44f, 5.0f, -5.92f);
        bv.t(d, 14.0f, 13.0f, 4.08f);
        d.curveToRelative(2.84f, 0.48f, 5.0f, 2.94f, 5.0f, 5.92f);
        k4.p(d, 4.0f, -5.0f, 4.08f);
        k4.C(d, 15.0f, 20.0f, -2.0f, -4.0f);
        uo.r(d, 2.0f, 20.0f, 19.0f, 20.0f);
        bv.l(d, -2.0f, -4.0f, 2.0f, 20.0f);
        d.moveTo(8.0f, 11.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        d.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        d.reflectiveCurveTo(8.0f, 11.55f, 8.0f, 11.0f);
        d.close();
        d.moveTo(16.0f, 11.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        d.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(d, 16.0f, 10.45f, 16.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _balcony = build;
        build.getClass();
        return build;
    }
}
