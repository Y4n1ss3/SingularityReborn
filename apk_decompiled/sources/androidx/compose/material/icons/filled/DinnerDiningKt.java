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
import defpackage.bv;
import defpackage.c21;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DinnerDiningKt {
    private static ImageVector _dinnerDining;

    public static final ImageVector getDinnerDining(Icons.Filled filled) {
        ImageVector imageVector = _dinnerDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DinnerDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(2.0f, 19.0f, 20.0f, -2.0f, 2.0f);
        kf0.m(i, 4.0f, 2.0f, 19.0f);
        k4.C(i, 5.0f, 6.0f, 1.0f, 1.0f);
        bv.s(i, 5.0f, 6.0f, 5.0f, 4.0f);
        gy.t(i, 1.0f, 1.0f, 5.0f, 4.0f);
        uf.D(i, 9.0f, 4.0f, 1.0f, 7.0f);
        bv.z(i, 4.0f, 9.0f, 9.0f, 7.0f);
        uo.o(i, 7.0f, 6.0f, 2.0f, 7.0f);
        i.moveTo(6.0f, 15.23f);
        i.curveToRelative(-0.36f, 0.11f, -0.69f, 0.28f, -1.0f, 0.47f);
        c21.c(i, 8.0f, 1.0f, 15.23f);
        i.moveTo(4.0f, 16.52f);
        i.curveTo(3.62f, 16.96f, 3.32f, 17.45f, 3.16f, 18.0f);
        i.horizontalLineToRelative(16.82f);
        i.curveToRelative(0.01f, -0.16f, 0.03f, -0.33f, 0.03f, -0.5f);
        i.curveToRelative(0.0f, -3.04f, -2.46f, -5.5f, -5.5f, -5.5f);
        i.curveToRelative(-2.29f, 0.0f, -4.25f, 1.4f, -5.08f, 3.4f);
        i.curveTo(8.84f, 15.15f, 8.19f, 15.0f, 7.5f, 15.0f);
        i.curveToRelative(-0.17f, 0.0f, -0.33f, 0.02f, -0.5f, 0.04f);
        i.verticalLineTo(8.0f);
        i.horizontalLineToRelative(2.0f);
        i.curveToRelative(1.03f, 0.06f, 1.9f, -0.96f, 2.0f, -2.0f);
        uo.f(i, 10.0f, 5.0f, 11.0f);
        i.curveToRelative(-0.1f, -1.05f, -0.97f, -1.97f, -2.0f, -2.0f);
        uf.k(i, 3.0f, 1.0f, 1.0f, 1.0f);
        uf.k(i, 3.0f, 1.0f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.e(i, 3.0f, 1.0f, 1.0f, 16.52f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dinnerDining = build;
        build.getClass();
        return build;
    }
}
