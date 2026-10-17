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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShoppingBasketKt {
    private static ImageVector _shoppingBasket;

    public static final ImageVector getShoppingBasket(Icons.TwoTone twoTone) {
        ImageVector imageVector = _shoppingBasket;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ShoppingBasket", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(3.31f, 11.0f, 2.2f, 8.01f);
        e.lineTo(18.5f, 19.0f);
        gy.w(e, 2.2f, -8.0f, 3.31f);
        e.moveTo(12.0f, 17.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        e.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, -0.9f, 2.0f, -2.0f, 2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(22.0f, 9.0f, -4.79f, -4.38f, -6.56f);
        i.curveToRelative(-0.19f, -0.28f, -0.51f, -0.42f, -0.83f, -0.42f);
        i.reflectiveCurveToRelative(-0.64f, 0.14f, -0.83f, 0.43f);
        i.lineTo(6.79f, 9.0f);
        i.horizontalLineTo(2.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.curveToRelative(0.0f, 0.09f, 0.01f, 0.18f, 0.04f, 0.27f);
        i.lineToRelative(2.54f, 9.27f);
        i.curveToRelative(0.23f, 0.84f, 1.0f, 1.46f, 1.92f, 1.46f);
        i.horizontalLineToRelative(13.0f);
        i.curveToRelative(0.92f, 0.0f, 1.69f, -0.62f, 1.93f, -1.46f);
        i.lineToRelative(2.54f, -9.27f);
        i.lineTo(23.0f, 10.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        k4.r(i, 12.0f, 4.8f, 14.8f, 9.0f);
        kf0.m(i, 9.2f, 12.0f, 4.8f);
        i.moveTo(18.5f, 19.0f);
        i.lineToRelative(-12.99f, 0.01f);
        i.lineTo(3.31f, 11.0f);
        i.horizontalLineTo(20.7f);
        i.lineToRelative(-2.2f, 8.0f);
        i.close();
        i.moveTo(12.0f, 13.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        i.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -0.9f, -2.0f, -2.0f, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shoppingBasket = build;
        build.getClass();
        return build;
    }
}
