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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoDrinksKt {
    private static ImageVector _noDrinks;

    public static final ImageVector getNoDrinks(Icons.TwoTone twoTone) {
        ImageVector imageVector = _noDrinks;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NoDrinks", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(k4.e(14.77f, 9.0f, -2.94f, 0.0f), 1.55f, 1.56f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.19f, 21.19f, 2.81f, 2.81f);
        i.lineTo(1.39f, 4.22f);
        i.lineToRelative(8.23f, 8.23f);
        kf0.u(i, 11.0f, 14.0f, 5.0f, 6.0f);
        kf0.z(i, 2.0f, 12.0f, -0.17f);
        gy.B(i, 1.78f, 1.78f, 21.19f, 21.19f);
        i.moveTo(13.0f, 19.0f);
        i.verticalLineToRelative(-3.17f);
        i.lineTo(16.17f, 19.0f);
        i.horizontalLineTo(13.0f);
        i.close();
        i.moveTo(7.83f, 5.0f);
        j50.x(i, -2.0f, -2.0f, 21.0f, 2.0f);
        i.lineToRelative(-6.2f, 6.97f);
        i.lineToRelative(-1.42f, -1.42f);
        i.lineTo(14.77f, 9.0f);
        kf0.B(i, -2.94f, -2.0f, -2.0f, 6.74f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(i, 1.78f, -2.0f, 7.83f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noDrinks = build;
        build.getClass();
        return build;
    }
}
