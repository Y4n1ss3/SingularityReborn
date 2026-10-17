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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Grid4x4Kt {
    private static ImageVector _grid4x4;

    public static final ImageVector getGrid4x4(Icons.TwoTone twoTone) {
        ImageVector imageVector = _grid4x4;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Grid4x4", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = uf.c(22.0f, 7.0f, 5.0f, -3.0f, 2.0f);
        af0.w(c, -2.0f, 3.0f, -4.0f, 2.0f);
        gy.o(c, -2.0f, 3.0f, 7.0f, 2.0f);
        af0.o(c, 5.0f, 3.0f, 2.0f, 2.0f);
        af0.z(c, 3.0f, 4.0f, 2.0f, 2.0f);
        af0.z(c, 3.0f, 4.0f, 2.0f, 2.0f);
        af0.v(c, 3.0f, 3.0f, 2.0f, -3.0f);
        af0.v(c, 4.0f, 3.0f, 2.0f, -3.0f);
        af0.v(c, 4.0f, 3.0f, 2.0f, -3.0f);
        af0.v(c, 3.0f, -2.0f, -3.0f, -4.0f);
        af0.w(c, 3.0f, -2.0f, -3.0f, 7.0f);
        kp0.r(c, 22.0f, 7.0f, 7.0f, 4.0f);
        gy.s(c, 4.0f, 7.0f, 7.0f);
        bv.y(c, 7.0f, 17.0f, -4.0f, 4.0f);
        kf0.n(c, 4.0f, 7.0f, 17.0f, 17.0f);
        bv.l(c, -4.0f, -4.0f, 4.0f, 17.0f);
        j50.y(c, 17.0f, 11.0f, -4.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(c, 4.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _grid4x4 = build;
        build.getClass();
        return build;
    }
}
