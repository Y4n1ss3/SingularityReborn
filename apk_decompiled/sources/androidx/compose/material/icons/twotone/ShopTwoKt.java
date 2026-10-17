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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShopTwoKt {
    private static ImageVector _shopTwo;

    public static final ImageVector getShopTwo(Icons.TwoTone twoTone) {
        ImageVector imageVector = _shopTwo;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ShopTwo", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(7.0f, 7.0f, 9.0f, 14.0f);
        r6.C(m, 21.0f, 7.0f, 7.0f, 7.0f);
        m.moveTo(12.0f, 15.0f);
        m.lineTo(12.0f, 8.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(m, 5.5f, 3.0f, -5.5f, 4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(3.0f, 9.0f, 1.0f, 9.0f, 11.0f);
        s.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(14.0f);
        s.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        r6.C(s, 3.0f, 20.0f, 3.0f, 9.0f);
        s.moveTo(18.0f, 5.0f);
        s.lineTo(18.0f, 3.0f);
        s.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        s.horizontalLineToRelative(-4.0f);
        s.curveToRelative(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        bv.q(s, 2.0f, 5.0f, 5.0f, 11.0f);
        s.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(14.0f);
        s.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        uf.j(s, 23.0f, 5.0f, -5.0f);
        k4.C(s, 12.0f, 3.0f, 4.0f, 2.0f);
        gy.n(s, -4.0f, 12.0f, 3.0f);
        s.moveTo(21.0f, 16.0f);
        s.lineTo(7.0f, 16.0f);
        r6.m(s, 7.0f, 7.0f, 14.0f, 9.0f);
        s.moveTo(12.0f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(s, 5.5f, -4.0f, 12.0f, 8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shopTwo = build;
        build.getClass();
        return build;
    }
}
