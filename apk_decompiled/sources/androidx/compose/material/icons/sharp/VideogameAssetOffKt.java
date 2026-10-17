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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideogameAssetOffKt {
    private static ImageVector _videogameAssetOff;

    public static final ImageVector getVideogameAssetOff(Icons.Sharp sharp) {
        ImageVector imageVector = _videogameAssetOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.VideogameAssetOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = bv.c(20.83f, 18.0f, 22.0f, 6.0f, 8.83f);
        uo.l(c, 20.83f, 18.0f, 17.5f, 9.0f);
        c.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        c.reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f);
        c.reflectiveCurveTo(16.0f, 11.33f, 16.0f, 10.5f);
        c.reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f);
        k4.r(c, 21.19f, 21.19f, 2.81f, 2.81f);
        c.lineTo(1.39f, 4.22f);
        r6.w(c, 3.17f, 6.0f, 2.0f, 12.0f);
        c.horizontalLineToRelative(13.17f);
        gy.B(c, 4.61f, 4.61f, 21.19f, 21.19f);
        uf.D(c, 9.0f, 13.0f, 2.0f, 7.0f);
        af0.B(c, -2.0f, 5.0f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.b(c, 9.83f, 10.17f, 13.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videogameAssetOff = build;
        build.getClass();
        return build;
    }
}
