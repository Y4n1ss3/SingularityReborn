package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShoppingBasketKt {
    private static ImageVector _shoppingBasket;

    public static final ImageVector getShoppingBasket(Icons.Filled filled) {
        ImageVector imageVector = _shoppingBasket;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ShoppingBasket", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.21f, 9.0f, -4.38f, -6.56f);
        e.curveToRelative(-0.19f, -0.28f, -0.51f, -0.42f, -0.83f, -0.42f);
        e.curveToRelative(-0.32f, 0.0f, -0.64f, 0.14f, -0.83f, 0.43f);
        e.lineTo(6.79f, 9.0f);
        e.lineTo(2.0f, 9.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.curveToRelative(0.0f, 0.09f, 0.01f, 0.18f, 0.04f, 0.27f);
        e.lineToRelative(2.54f, 9.27f);
        e.curveToRelative(0.23f, 0.84f, 1.0f, 1.46f, 1.92f, 1.46f);
        e.horizontalLineToRelative(13.0f);
        e.curveToRelative(0.92f, 0.0f, 1.69f, -0.62f, 1.93f, -1.46f);
        e.lineToRelative(2.54f, -9.27f);
        e.lineTo(23.0f, 10.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        j50.t(e, -4.79f, 9.0f, 9.0f);
        e.lineToRelative(3.0f, -4.4f);
        r6.C(e, 15.0f, 9.0f, 9.0f, 9.0f);
        e.moveTo(12.0f, 17.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        e.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, -0.9f, 2.0f, -2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shoppingBasket = build;
        build.getClass();
        return build;
    }
}
