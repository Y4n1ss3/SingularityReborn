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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RemoveShoppingCartKt {
    private static ImageVector _removeShoppingCart;

    public static final ImageVector getRemoveShoppingCart(Icons.Sharp sharp) {
        ImageVector imageVector = _removeShoppingCart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RemoveShoppingCart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(1.41f, 1.13f, 0.0f, 2.54f);
        i.lineToRelative(4.39f, 4.39f);
        i.lineToRelative(2.21f, 4.66f);
        i.lineTo(3.62f, 17.0f);
        i.horizontalLineToRelative(10.84f);
        i.lineToRelative(1.38f, 1.38f);
        i.curveToRelative(-0.5f, 0.36f, -0.83f, 0.95f, -0.83f, 1.62f);
        i.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        i.curveToRelative(0.67f, 0.0f, 1.26f, -0.33f, 1.62f, -0.84f);
        i.lineTo(21.46f, 24.0f);
        gy.B(i, 1.41f, -1.41f, 1.41f, 1.13f);
        i.moveTo(7.0f, 15.0f);
        i.lineToRelative(1.1f, -2.0f);
        i.horizontalLineToRelative(2.36f);
        gy.B(i, 2.0f, 2.0f, 7.0f, 15.0f);
        i.moveTo(16.05f, 12.94f);
        i.horizontalLineToRelative(0.73f);
        i.lineTo(21.7f, 4.0f);
        bv.o(i, 7.12f, 4.0f, 8.93f, 8.94f);
        i.moveTo(7.0f, 18.0f);
        i.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        i.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        i.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -0.9f, -2.0f, -2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeShoppingCart = build;
        build.getClass();
        return build;
    }
}
