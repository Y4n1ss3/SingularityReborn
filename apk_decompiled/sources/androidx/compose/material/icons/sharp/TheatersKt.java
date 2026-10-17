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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TheatersKt {
    private static ImageVector _theaters;

    public static final ImageVector getTheaters(Icons.Sharp sharp) {
        ImageVector imageVector = _theaters;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Theaters", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(18.0f, 3.0f, 2.0f, -2.0f);
        m.lineTo(16.0f, 3.0f);
        m.lineTo(8.0f, 3.0f);
        m.verticalLineToRelative(2.0f);
        m.lineTo(6.0f, 5.0f);
        m.lineTo(6.0f, 3.0f);
        af0.m(m, 4.0f, 3.0f, 18.0f, 2.0f);
        r6.D(m, -2.0f, 2.0f, 2.0f, 8.0f);
        r6.D(m, -2.0f, 2.0f, 2.0f, 2.0f);
        uf.j(m, 20.0f, 3.0f, -2.0f);
        m.moveTo(8.0f, 17.0f);
        af0.m(m, 6.0f, 17.0f, -2.0f, 2.0f);
        r6.l(m, 2.0f, 8.0f, 13.0f);
        af0.m(m, 6.0f, 13.0f, -2.0f, 2.0f);
        r6.l(m, 2.0f, 8.0f, 9.0f);
        m.lineTo(6.0f, 9.0f);
        r6.m(m, 6.0f, 7.0f, 2.0f, 2.0f);
        k4.C(m, 18.0f, 17.0f, -2.0f, -2.0f);
        fc.x(m, 2.0f, 2.0f, 18.0f, 13.0f);
        gy.D(m, -2.0f, -2.0f, 2.0f, 2.0f);
        m.moveTo(18.0f, 9.0f);
        uo.n(m, -2.0f, 16.0f, 7.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(m, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _theaters = build;
        build.getClass();
        return build;
    }
}
