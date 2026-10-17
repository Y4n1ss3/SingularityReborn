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
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShopKt {
    private static ImageVector _shop;

    public static final ImageVector getShop(Icons.TwoTone twoTone) {
        ImageVector imageVector = _shop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Shop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(4.0f, 19.0f, 16.0f, 8.0f, 4.0f);
        r6.l(v, 11.0f, 9.0f, 9.0f);
        v.lineToRelative(7.5f, 4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(v, 9.0f, 18.0f, 9.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(16.0f, 6.0f, 16.0f, 4.0f);
        i.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        i.horizontalLineToRelative(-4.0f);
        i.curveToRelative(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        bv.q(i, 2.0f, 2.0f, 6.0f, 13.0f);
        i.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        uf.j(i, 22.0f, 6.0f, -6.0f);
        k4.C(i, 10.0f, 4.0f, 4.0f, 2.0f);
        gy.n(i, -4.0f, 10.0f, 4.0f);
        i.moveTo(20.0f, 19.0f);
        i.lineTo(4.0f, 19.0f);
        r6.m(i, 4.0f, 8.0f, 16.0f, 11.0f);
        i.moveTo(9.0f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.o(i, 9.0f, 7.5f, -5.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shop = build;
        build.getClass();
        return build;
    }
}
