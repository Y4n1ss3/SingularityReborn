package androidx.compose.material.icons.twotone;

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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FactoryKt {
    private static ImageVector _factory;

    public static final ImageVector getFactory(Icons.TwoTone twoTone) {
        ImageVector imageVector = _factory;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Factory", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 12.0f, 0.0f, -2.05f);
        e.lineToRelative(-5.0f, 2.0f);
        e.verticalLineTo(10.0f);
        e.lineToRelative(-3.0f, 1.32f);
        e.verticalLineTo(20.0f);
        kp0.j(e, 16.0f, -8.0f, 12.0f);
        k4.A(e, 9.0f, 18.0f, 7.0f, -4.0f);
        uo.r(e, 2.0f, 18.0f, 13.0f, 18.0f);
        bv.l(e, -2.0f, -4.0f, 2.0f, 18.0f);
        k4.C(e, 17.0f, 18.0f, -2.0f, -4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(e, 2.0f, 18.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(22.0f, 22.0f, 2.0f, 10.0f);
        c.lineToRelative(7.0f, -3.0f);
        c.verticalLineToRelative(2.0f);
        c.lineToRelative(5.0f, -2.0f);
        c.lineToRelative(0.0f, 3.0f);
        kf0.B(c, 3.0f, 1.0f, -8.0f, 3.0f);
        uf.x(c, 1.0f, 8.0f, 22.0f);
        c.moveTo(12.0f, 9.95f);
        c.lineToRelative(-5.0f, 2.0f);
        c.verticalLineTo(10.0f);
        c.lineToRelative(-3.0f, 1.32f);
        c.verticalLineTo(20.0f);
        kf0.x(c, 16.0f, -8.0f, -8.0f);
        uo.l(c, 12.0f, 9.95f, 11.0f, 18.0f);
        bv.l(c, 2.0f, -4.0f, -2.0f, 18.0f);
        k4.C(c, 7.0f, 18.0f, 2.0f, -4.0f);
        bv.s(c, 7.0f, 18.0f, 17.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(c, -2.0f, 4.0f, 2.0f, 14.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _factory = build;
        build.getClass();
        return build;
    }
}
