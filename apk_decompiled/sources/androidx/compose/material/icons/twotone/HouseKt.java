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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HouseKt {
    private static ImageVector _house;

    public static final ImageVector getHouse(Icons.TwoTone twoTone) {
        ImageVector imageVector = _house;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.House", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(7.0f, 10.19f, 18.0f, 2.0f, -6.0f);
        af0.v(c, 6.0f, 6.0f, 2.0f, -7.81f);
        gy.B(c, -5.0f, -4.5f, 7.0f, 10.19f);
        c.moveTo(14.0f, 10.0f);
        c.horizontalLineToRelative(-4.0f);
        c.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(c, 14.0f, 8.9f, 14.0f, 10.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c2 = af0.c(19.0f, 9.3f, 4.0f, -3.0f, 2.6f);
        c2.lineTo(12.0f, 3.0f);
        fc.w(c2, 2.0f, 12.0f, 3.0f, 8.0f);
        af0.v(c2, 6.0f, -6.0f, 2.0f, 6.0f);
        kf0.x(c2, 6.0f, -8.0f, 3.0f);
        uo.l(c2, 19.0f, 9.3f, 17.0f, 18.0f);
        af0.z(c2, -2.0f, -6.0f, 9.0f, 6.0f);
        k4.q(c2, 7.0f, -7.81f, 5.0f, -4.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(c2, 5.0f, 4.5f, 18.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(10.0f, 10.0f, 4.0f);
        a.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(a, 10.0f, 8.9f, 10.0f, 10.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _house = build;
        build.getClass();
        return build;
    }
}
