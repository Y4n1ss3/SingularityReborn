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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ToysKt {
    private static ImageVector _toys;

    public static final ImageVector getToys(Icons.Sharp sharp) {
        ImageVector imageVector = _toys;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Toys", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = gy.u(18.72f, 10.0f, -2.0f, -6.0f, 7.28f);
        u.lineTo(5.81f, 8.4f);
        u.lineTo(4.41f, 7.0f);
        u.lineToRelative(1.0f, -1.0f);
        u.lineTo(4.0f, 4.59f);
        u.lineTo(0.59f, 8.0f);
        u.lineTo(2.0f, 9.41f);
        u.lineToRelative(1.0f, -1.0f);
        r6.w(u, 4.59f, 10.0f, 2.0f, 8.0f);
        u.horizontalLineToRelative(2.18f);
        u.curveTo(4.59f, 19.16f, 5.7f, 20.0f, 7.0f, 20.0f);
        u.curveToRelative(1.3f, 0.0f, 2.4f, -0.84f, 2.82f, -2.0f);
        u.horizontalLineToRelative(4.37f);
        u.curveToRelative(0.41f, 1.16f, 1.51f, 2.0f, 2.82f, 2.0f);
        u.curveToRelative(1.3f, 0.0f, 2.41f, -0.84f, 2.82f, -2.0f);
        fc.j(u, 22.0f, -8.0f, 18.72f);
        u.moveTo(7.0f, 18.0f);
        u.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        u.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        u.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        u.reflectiveCurveTo(7.55f, 18.0f, 7.0f, 18.0f);
        r6.g(u, 11.0f, 10.0f, 7.41f);
        u.lineTo(7.39f, 9.98f);
        u.lineTo(8.72f, 6.0f);
        u.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        bv.s(u, 11.0f, 10.0f, 13.0f, 10.0f);
        uo.u(u, 6.0f, 2.28f, 1.33f, 4.0f);
        k4.w(u, 13.0f, 17.0f, 18.0f);
        u.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        u.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        u.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(u, 17.55f, 18.0f, 17.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _toys = build;
        build.getClass();
        return build;
    }
}
