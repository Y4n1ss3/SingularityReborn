package androidx.compose.material.icons.outlined;

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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShoppingCartCheckoutKt {
    private static ImageVector _shoppingCartCheckout;

    public static final ImageVector getShoppingCartCheckout(Icons.Outlined outlined) {
        ImageVector imageVector = _shoppingCartCheckout;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ShoppingCartCheckout", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.0f, 18.0f);
        b.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        b.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveTo(8.1f, 18.0f, 7.0f, 18.0f);
        b.close();
        b.moveTo(17.0f, 18.0f);
        b.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        b.reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveTo(18.1f, 18.0f, 17.0f, 18.0f);
        af0.l(b, 8.1f, 13.0f, 7.45f);
        b.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        b.lineTo(21.0f, 4.96f);
        b.lineTo(19.25f, 4.0f);
        b.lineToRelative(-3.7f, 7.0f);
        bv.u(b, 8.53f, 4.27f, 2.0f, 1.0f);
        gy.C(b, 2.0f, 2.0f, 3.6f, 7.59f);
        b.lineToRelative(-1.35f, 2.44f);
        b.curveTo(4.52f, 15.37f, 5.48f, 17.0f, 7.0f, 17.0f);
        k4.k(b, 12.0f, -2.0f, 7.0f);
        uo.l(b, 8.1f, 13.0f, 12.0f, 2.0f);
        b.lineToRelative(4.0f, 4.0f);
        b.lineToRelative(-4.0f, 4.0f);
        b.lineToRelative(-1.41f, -1.41f);
        b.lineTo(12.17f, 7.0f);
        b.lineTo(8.0f, 7.0f);
        b.lineToRelative(0.0f, -2.0f);
        b.lineToRelative(4.17f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, -1.59f, -1.59f, 12.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shoppingCartCheckout = build;
        build.getClass();
        return build;
    }
}
