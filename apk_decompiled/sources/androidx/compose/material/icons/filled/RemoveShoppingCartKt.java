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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RemoveShoppingCartKt {
    private static ImageVector _removeShoppingCart;

    public static final ImageVector getRemoveShoppingCart(Icons.Filled filled) {
        ImageVector imageVector = _removeShoppingCart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RemoveShoppingCart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.73f, 22.73f, 2.77f, 2.77f);
        i.lineTo(2.0f, 2.0f);
        i.lineToRelative(-0.73f, -0.73f);
        i.lineTo(0.0f, 2.54f);
        i.lineToRelative(4.39f, 4.39f);
        i.lineToRelative(2.21f, 4.66f);
        i.lineToRelative(-1.35f, 2.45f);
        i.curveToRelative(-0.16f, 0.28f, -0.25f, 0.61f, -0.25f, 0.96f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(7.46f);
        i.lineToRelative(1.38f, 1.38f);
        i.curveToRelative(-0.5f, 0.36f, -0.83f, 0.95f, -0.83f, 1.62f);
        i.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        i.curveToRelative(0.67f, 0.0f, 1.26f, -0.33f, 1.62f, -0.84f);
        bv.o(i, 21.46f, 24.0f, 1.27f, -1.27f);
        i.moveTo(7.42f, 15.0f);
        i.curveToRelative(-0.14f, 0.0f, -0.25f, -0.11f, -0.25f, -0.25f);
        i.lineToRelative(0.03f, -0.12f);
        i.lineToRelative(0.9f, -1.63f);
        i.horizontalLineToRelative(2.36f);
        gy.B(i, 2.0f, 2.0f, 7.42f, 15.0f);
        i.moveTo(15.55f, 13.0f);
        i.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        i.lineToRelative(3.58f, -6.49f);
        i.curveToRelative(0.08f, -0.14f, 0.12f, -0.31f, 0.12f, -0.48f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        bv.o(i, 6.54f, 4.0f, 9.01f, 9.0f);
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
