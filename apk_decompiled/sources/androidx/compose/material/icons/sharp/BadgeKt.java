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
import defpackage.bv;
import defpackage.c21;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BadgeKt {
    private static ImageVector _badge;

    public static final ImageVector getBadge(Icons.Sharp sharp) {
        ImageVector imageVector = _badge;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Badge", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(22.0f, 7.0f, -7.0f, 2.0f, 9.0f);
        af0.B(v, 5.0f, 2.0f, 15.0f, 20.0f);
        bv.t(v, 7.0f, 9.0f, 12.0f);
        v.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        v.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        v.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        v.curveTo(7.5f, 12.67f, 8.17f, 12.0f, 9.0f, 12.0f);
        uo.q(v, 12.0f, 18.0f, 6.0f, -0.43f);
        v.curveToRelative(0.0f, -0.6f, 0.36f, -1.15f, 0.92f, -1.39f);
        v.curveTo(7.56f, 15.9f, 8.26f, 15.75f, 9.0f, 15.75f);
        v.reflectiveCurveToRelative(1.44f, 0.15f, 2.08f, 0.43f);
        v.curveToRelative(0.55f, 0.24f, 0.92f, 0.78f, 0.92f, 1.39f);
        k4.D(v, 18.0f, 13.0f, 9.0f, -2.0f);
        c21.c(v, 4.0f, 2.0f, 9.0f);
        j50.y(v, 18.0f, 16.5f, -4.0f, 15.0f);
        uo.r(v, 4.0f, 16.5f, 18.0f, 13.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.h(v, -4.0f, 12.0f, 4.0f, 13.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _badge = build;
        build.getClass();
        return build;
    }
}
