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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ElectricCarKt {
    private static ImageVector _electricCar;

    public static final ImageVector getElectricCar(Icons.Sharp sharp) {
        ImageVector imageVector = _electricCar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ElectricCar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder l = uf.l(18.58f, 1.0f, 5.43f, 3.0f, 8.0f);
        r6.D(l, 9.0f, 3.0f, -2.0f, 12.0f);
        bv.x(l, 2.0f, 3.0f, 8.0f);
        uo.l(l, 18.58f, 1.0f, 6.5f, 12.0f);
        l.curveTo(5.67f, 12.0f, 5.0f, 11.33f, 5.0f, 10.5f);
        l.reflectiveCurveTo(5.67f, 9.0f, 6.5f, 9.0f);
        l.reflectiveCurveTo(8.0f, 9.67f, 8.0f, 10.5f);
        l.reflectiveCurveTo(7.33f, 12.0f, 6.5f, 12.0f);
        l.close();
        l.moveTo(17.5f, 12.0f);
        l.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        l.reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f);
        l.reflectiveCurveTo(19.0f, 9.67f, 19.0f, 10.5f);
        l.reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f);
        k4.x(l, 5.0f, 7.0f, 1.5f, -4.5f);
        l.horizontalLineToRelative(11.0f);
        l.lineTo(19.0f, 7.0f);
        l.horizontalLineTo(5.0f);
        l.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, l.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(7.0f, 20.0f, 4.0f, 0.0f);
        e.lineToRelative(0.0f, -2.0f);
        e.lineToRelative(6.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -4.0f, 0.0f, 0.0f, 2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricCar = build;
        build.getClass();
        return build;
    }
}
