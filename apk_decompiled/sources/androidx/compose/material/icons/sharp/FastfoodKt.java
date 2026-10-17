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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FastfoodKt {
    private static ImageVector _fastfood;

    public static final ImageVector getFastfood(Icons.Sharp sharp) {
        ImageVector imageVector = _fastfood;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Fastfood", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(18.0f, 5.0f, 1.0f, -2.0f, 4.0f);
        c.horizontalLineToRelative(-5.0f);
        c.lineToRelative(0.23f, 2.31f);
        c.curveTo(14.9f, 8.16f, 18.0f, 10.77f, 18.0f, 15.0f);
        c.lineToRelative(0.02f, 8.0f);
        uf.C(c, 3.18f, 23.0f, 5.0f, -5.0f);
        k4.C(c, 1.0f, 21.0f, 15.0f, 2.0f);
        k4.w(c, 1.0f, 8.5f, 8.99f);
        c.curveTo(4.75f, 8.99f, 1.0f, 11.0f, 1.0f, 15.0f);
        c.horizontalLineToRelative(15.0f);
        c.curveToRelative(0.0f, -4.0f, -3.75f, -6.01f, -7.5f, -6.01f);
        r6.B(c, 1.0f, 17.0f, 15.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(c, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastfood = build;
        build.getClass();
        return build;
    }
}
