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
import defpackage.j50;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FilterListOffKt {
    private static ImageVector _filterListOff;

    public static final ImageVector getFilterListOff(Icons.Sharp sharp) {
        ImageVector imageVector = _filterListOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FilterListOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = bv.c(10.83f, 8.0f, 21.0f, 6.0f, 8.83f);
        uo.l(c, 10.83f, 8.0f, 15.83f, 13.0f);
        af0.u(c, 18.0f, -2.0f, -4.17f);
        uo.l(c, 15.83f, 13.0f, 14.0f, 16.83f);
        uf.p(c, 18.0f, -4.0f, -2.0f, 3.17f);
        j50.x(c, -3.0f, -3.0f, 6.0f, -2.0f);
        r6.t(c, 2.17f, -3.0f, -3.0f, 3.0f);
        c.verticalLineTo(6.0f);
        c.horizontalLineToRelative(0.17f);
        c.lineTo(1.39f, 4.22f);
        c.lineToRelative(1.41f, -1.41f);
        c.lineToRelative(18.38f, 18.38f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(c, -1.41f, 1.41f, 14.0f, 16.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filterListOff = build;
        build.getClass();
        return build;
    }
}
