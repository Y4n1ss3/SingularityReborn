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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LockOpenKt {
    private static ImageVector _lockOpen;

    public static final ImageVector getLockOpen(Icons.Sharp sharp) {
        ImageVector imageVector = _lockOpen;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LockOpen", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(20.0f, 8.0f, -3.0f, 17.0f, 6.21f);
        p.curveToRelative(0.0f, -2.61f, -1.91f, -4.94f, -4.51f, -5.19f);
        p.curveTo(9.51f, 0.74f, 7.0f, 3.08f, 7.0f, 6.0f);
        p.horizontalLineToRelative(2.0f);
        p.curveToRelative(0.0f, -1.13f, 0.6f, -2.24f, 1.64f, -2.7f);
        p.curveTo(12.85f, 2.31f, 15.0f, 3.9f, 15.0f, 6.0f);
        bv.q(p, 2.0f, 4.0f, 8.0f, 14.0f);
        gy.n(p, 16.0f, 20.0f, 8.0f);
        p.moveTo(18.0f, 20.0f);
        p.lineTo(6.0f, 20.0f);
        r6.m(p, 6.0f, 10.0f, 12.0f, 10.0f);
        p.moveTo(12.0f, 17.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        p.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(p, 0.9f, 2.0f, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lockOpen = build;
        build.getClass();
        return build;
    }
}
