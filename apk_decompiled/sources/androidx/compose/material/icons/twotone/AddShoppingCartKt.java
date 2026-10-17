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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddShoppingCartKt {
    private static ImageVector _addShoppingCart;

    public static final ImageVector getAddShoppingCart(Icons.TwoTone twoTone) {
        ImageVector imageVector = _addShoppingCart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AddShoppingCart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(11.0f, 9.0f, 2.0f, 13.0f, 6.0f);
        uo.n(p, 3.0f, 16.0f, 4.0f, -3.0f);
        fc.w(p, 13.0f, 1.0f, -2.0f, 3.0f);
        af0.m(p, 8.0f, 4.0f, 2.0f, 3.0f);
        r6.l(p, 3.0f, 7.0f, 18.0f);
        p.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        p.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        p.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        p.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        p.close();
        p.moveTo(17.0f, 18.0f);
        p.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        p.reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f);
        p.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        p.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        af0.l(p, 8.1f, 13.0f, 7.45f);
        p.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        p.lineToRelative(3.86f, -7.01f);
        p.lineTo(19.41f, 4.0f);
        p.lineToRelative(-3.86f, 7.0f);
        p.lineTo(8.53f, 11.0f);
        p.lineTo(4.27f, 2.0f);
        af0.m(p, 1.0f, 2.0f, 2.0f, 2.0f);
        p.lineToRelative(3.6f, 7.59f);
        p.lineToRelative(-1.35f, 2.44f);
        p.curveTo(4.52f, 15.37f, 5.48f, 17.0f, 7.0f, 17.0f);
        bv.C(p, 12.0f, -2.0f, 7.0f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(p, 1.1f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addShoppingCart = build;
        build.getClass();
        return build;
    }
}
