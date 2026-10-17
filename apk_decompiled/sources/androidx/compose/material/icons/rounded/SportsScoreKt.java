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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsScoreKt {
    private static ImageVector _sportsScore;

    public static final ImageVector getSportsScore(Icons.Rounded rounded) {
        ImageVector imageVector = _sportsScore;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SportsScore", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(11.0f, 6.0f, 9.0f, 4.0f, 2.0f);
        k4.D(f, 6.0f, 15.0f, 4.0f, -2.0f);
        k4.p(f, 2.0f, 2.0f, 4.0f);
        k4.C(f, 9.0f, 14.0f, 2.0f, -2.0f);
        bv.s(f, 9.0f, 14.0f, 19.0f, 10.0f);
        j50.C(f, 8.0f, -2.0f, 2.0f, 19.0f);
        bv.y(f, 19.0f, 14.0f, -2.0f, -2.0f);
        kf0.n(f, 2.0f, 19.0f, 13.0f, 14.0f);
        bv.l(f, 2.0f, -2.0f, -2.0f, 14.0f);
        k4.C(f, 19.0f, 4.0f, -2.0f, 2.0f);
        uo.r(f, 2.0f, 4.0f, 13.0f, 8.0f);
        j50.C(f, 6.0f, -2.0f, 2.0f, 13.0f);
        kp0.t(f, 7.0f, 10.0f, 8.0f, 2.0f);
        uo.j(f, 6.0f, 7.0f, 5.0f);
        f.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        f.horizontalLineToRelative(0.0f);
        f.curveTo(5.45f, 4.0f, 5.0f, 4.45f, 5.0f, 5.0f);
        f.verticalLineToRelative(14.0f);
        f.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        f.horizontalLineToRelative(0.0f);
        f.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        fc.y(f, -7.0f, 2.0f, -2.0f, 7.0f);
        k4.C(f, 15.0f, 12.0f, 2.0f, -2.0f);
        uo.r(f, -2.0f, 12.0f, 11.0f, 10.0f);
        fc.y(f, 2.0f, 2.0f, -2.0f, 11.0f);
        bv.y(f, 9.0f, 8.0f, 2.0f, 2.0f);
        bv.z(f, 8.0f, 9.0f, 13.0f, 10.0f);
        j50.D(f, 2.0f, 8.0f, -2.0f, 10.0f);
        bv.y(f, 15.0f, 6.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(f, 6.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsScore = build;
        build.getClass();
        return build;
    }
}
