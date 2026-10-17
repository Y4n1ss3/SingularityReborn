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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalMoviesKt {
    private static ImageVector _localMovies;

    public static final ImageVector getLocalMovies(Icons.TwoTone twoTone) {
        ImageVector imageVector = _localMovies;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LocalMovies", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(10.0f, 5.0f, 4.0f, 14.0f, -4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(20.0f, 21.0f, 20.0f, 3.0f, -2.0f);
        uo.B(k, 2.0f, -2.0f, 16.0f, 3.0f);
        k.lineTo(8.0f, 3.0f);
        k.verticalLineToRelative(2.0f);
        k.lineTo(6.0f, 5.0f);
        k.lineTo(6.0f, 3.0f);
        af0.m(k, 4.0f, 3.0f, 18.0f, 2.0f);
        r6.D(k, -2.0f, 2.0f, 2.0f, 8.0f);
        af0.C(k, -2.0f, 2.0f, 2.0f, 2.0f);
        k.moveTo(8.0f, 17.0f);
        af0.m(k, 6.0f, 17.0f, -2.0f, 2.0f);
        r6.l(k, 2.0f, 8.0f, 13.0f);
        af0.m(k, 6.0f, 13.0f, -2.0f, 2.0f);
        r6.l(k, 2.0f, 8.0f, 9.0f);
        k.lineTo(6.0f, 9.0f);
        r6.m(k, 6.0f, 7.0f, 2.0f, 2.0f);
        k.moveTo(14.0f, 19.0f);
        uo.n(k, -4.0f, 10.0f, 5.0f, 4.0f);
        bv.m(k, 14.0f, 16.0f, 7.0f, 2.0f);
        uo.D(k, 2.0f, -2.0f, 16.0f, 7.0f);
        k4.C(k, 16.0f, 11.0f, 2.0f, 2.0f);
        fc.x(k, -2.0f, -2.0f, 16.0f, 17.0f);
        k.verticalLineToRelative(-2.0f);
        k.horizontalLineToRelative(2.0f);
        k.verticalLineToRelative(2.0f);
        k.horizontalLineToRelative(-2.0f);
        k.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localMovies = build;
        build.getClass();
        return build;
    }
}
