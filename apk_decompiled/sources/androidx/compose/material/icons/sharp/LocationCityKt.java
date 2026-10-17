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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocationCityKt {
    private static ImageVector _locationCity;

    public static final ImageVector getLocationCity(Icons.Sharp sharp) {
        ImageVector imageVector = _locationCity;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LocationCity", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.0f, 11.0f, 15.0f, 5.0f);
        i.lineToRelative(-3.0f, -3.0f);
        i.lineToRelative(-3.0f, 3.0f);
        bv.q(i, 2.0f, 3.0f, 7.0f, 14.0f);
        uf.C(i, 18.0f, 21.0f, 11.0f, -6.0f);
        i.moveTo(7.0f, 19.0f);
        af0.m(i, 5.0f, 19.0f, -2.0f, 2.0f);
        r6.l(i, 2.0f, 7.0f, 15.0f);
        af0.m(i, 5.0f, 15.0f, -2.0f, 2.0f);
        r6.l(i, 2.0f, 7.0f, 11.0f);
        i.lineTo(5.0f, 11.0f);
        r6.m(i, 5.0f, 9.0f, 2.0f, 2.0f);
        k4.C(i, 13.0f, 19.0f, -2.0f, -2.0f);
        fc.x(i, 2.0f, 2.0f, 13.0f, 15.0f);
        gy.D(i, -2.0f, -2.0f, 2.0f, 2.0f);
        i.moveTo(13.0f, 11.0f);
        uo.n(i, -2.0f, 11.0f, 9.0f, 2.0f);
        bv.m(i, 2.0f, 13.0f, 7.0f, -2.0f);
        r6.m(i, 11.0f, 5.0f, 2.0f, 2.0f);
        k4.C(i, 19.0f, 19.0f, -2.0f, -2.0f);
        fc.x(i, 2.0f, 2.0f, 19.0f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.k(i, -2.0f, -2.0f, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _locationCity = build;
        build.getClass();
        return build;
    }
}
