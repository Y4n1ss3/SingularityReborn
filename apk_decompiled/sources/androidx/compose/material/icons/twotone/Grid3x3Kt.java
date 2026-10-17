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
import defpackage.gy;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Grid3x3Kt {
    private static ImageVector _grid3x3;

    public static final ImageVector getGrid3x3(Icons.TwoTone twoTone) {
        ImageVector imageVector = _grid3x3;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Grid3x3", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = uf.c(20.0f, 10.0f, 8.0f, -4.0f, 4.0f);
        af0.w(c, -2.0f, 4.0f, -4.0f, 4.0f);
        af0.o(c, 8.0f, 4.0f, 4.0f, 2.0f);
        af0.z(c, 4.0f, 4.0f, 4.0f, 2.0f);
        af0.v(c, 4.0f, 4.0f, 2.0f, -4.0f);
        af0.v(c, 4.0f, 4.0f, 2.0f, -4.0f);
        af0.v(c, 4.0f, -2.0f, -4.0f, -4.0f);
        kp0.r(c, 20.0f, 14.0f, 14.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(c, -4.0f, 4.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _grid3x3 = build;
        build.getClass();
        return build;
    }
}
