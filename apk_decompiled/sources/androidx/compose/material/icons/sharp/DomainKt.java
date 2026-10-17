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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DomainKt {
    private static ImageVector _domain;

    public static final ImageVector getDomain(Icons.Sharp sharp) {
        ImageVector imageVector = _domain;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Domain", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 7.0f, 12.0f, 3.0f);
        af0.m(i, 2.0f, 3.0f, 18.0f, 20.0f);
        r6.C(i, 22.0f, 7.0f, 12.0f, 7.0f);
        i.moveTo(6.0f, 19.0f);
        af0.m(i, 4.0f, 19.0f, -2.0f, 2.0f);
        r6.l(i, 2.0f, 6.0f, 15.0f);
        af0.m(i, 4.0f, 15.0f, -2.0f, 2.0f);
        r6.l(i, 2.0f, 6.0f, 11.0f);
        i.lineTo(4.0f, 11.0f);
        r6.m(i, 4.0f, 9.0f, 2.0f, 2.0f);
        i.moveTo(6.0f, 7.0f);
        i.lineTo(4.0f, 7.0f);
        r6.m(i, 4.0f, 5.0f, 2.0f, 2.0f);
        i.moveTo(10.0f, 19.0f);
        af0.m(i, 8.0f, 19.0f, -2.0f, 2.0f);
        r6.l(i, 2.0f, 10.0f, 15.0f);
        af0.m(i, 8.0f, 15.0f, -2.0f, 2.0f);
        r6.l(i, 2.0f, 10.0f, 11.0f);
        i.lineTo(8.0f, 11.0f);
        r6.m(i, 8.0f, 9.0f, 2.0f, 2.0f);
        i.moveTo(10.0f, 7.0f);
        i.lineTo(8.0f, 7.0f);
        r6.m(i, 8.0f, 5.0f, 2.0f, 2.0f);
        k4.C(i, 20.0f, 19.0f, -8.0f, -2.0f);
        af0.v(i, 2.0f, -2.0f, -2.0f, -2.0f);
        kf0.x(i, 2.0f, -2.0f, -2.0f);
        r6.m(i, 12.0f, 9.0f, 8.0f, 10.0f);
        k4.C(i, 18.0f, 11.0f, -2.0f, 2.0f);
        fc.x(i, 2.0f, -2.0f, 18.0f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.k(i, -2.0f, 2.0f, 2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _domain = build;
        build.getClass();
        return build;
    }
}
