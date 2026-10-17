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
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WashKt {
    private static ImageVector _wash;

    public static final ImageVector getWash(Icons.Sharp sharp) {
        ImageVector imageVector = _wash;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Wash", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(9.12f, 5.0f, 1.0f, 12.68f, 23.0f);
        af0.v(u, 18.0f, -2.5f, -7.0f, -1.0f);
        af0.q(u, 9.0f, 17.0f, -9.0f, -1.0f);
        af0.z(u, 10.0f, -2.5f, 12.0f, -1.0f);
        uo.f(u, 8.0f, 10.0f, 8.86f);
        u.lineToRelative(1.88f, -3.3f);
        r6.C(u, 9.12f, 5.0f, 9.12f, 5.0f);
        u.moveTo(13.5f, 9.0f);
        u.curveTo(14.33f, 9.0f, 15.0f, 8.33f, 15.0f, 7.5f);
        u.curveTo(15.0f, 6.66f, 13.5f, 5.0f, 13.5f, 5.0f);
        u.reflectiveCurveTo(12.0f, 6.66f, 12.0f, 7.5f);
        u.curveTo(12.0f, 8.33f, 12.67f, 9.0f, 13.5f, 9.0f);
        u.close();
        u.moveTo(18.5f, 1.0f);
        u.curveToRelative(0.0f, 0.0f, -2.5f, 2.83f, -2.5f, 4.5f);
        u.curveTo(16.0f, 6.88f, 17.12f, 8.0f, 18.5f, 8.0f);
        u.reflectiveCurveTo(21.0f, 6.88f, 21.0f, 5.5f);
        u.curveTo(21.0f, 3.83f, 18.5f, 1.0f, 18.5f, 1.0f);
        u.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, u.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wash = build;
        build.getClass();
        return build;
    }
}
