package androidx.compose.material.icons.rounded;

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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RemoveShoppingCartKt {
    private static ImageVector _removeShoppingCart;

    public static final ImageVector getRemoveShoppingCart(Icons.Rounded rounded) {
        ImageVector imageVector = _removeShoppingCart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RemoveShoppingCart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(0.71f, 1.83f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(3.68f, 3.68f);
        b.lineToRelative(2.21f, 4.66f);
        b.lineToRelative(-1.35f, 2.45f);
        b.curveToRelative(-0.19f, 0.33f, -0.28f, 0.73f, -0.24f, 1.15f);
        b.curveToRelative(0.1f, 1.06f, 1.06f, 1.82f, 2.12f, 1.82f);
        b.horizontalLineToRelative(7.33f);
        b.lineToRelative(1.38f, 1.38f);
        b.curveToRelative(-0.5f, 0.36f, -0.83f, 0.95f, -0.83f, 1.62f);
        b.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        b.curveToRelative(0.67f, 0.0f, 1.26f, -0.33f, 1.62f, -0.84f);
        b.lineToRelative(2.13f, 2.13f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(2.12f, 1.83f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        k4.x(b, 7.0f, 15.0f, 1.1f, -2.0f);
        b.horizontalLineToRelative(2.36f);
        gy.B(b, 2.0f, 2.0f, 7.0f, 15.0f);
        b.moveTo(16.05f, 12.94f);
        b.curveToRelative(0.54f, -0.14f, 0.99f, -0.49f, 1.25f, -0.97f);
        b.lineToRelative(3.58f, -6.49f);
        b.curveTo(21.25f, 4.82f, 20.76f, 4.0f, 20.0f, 4.0f);
        bv.o(b, 7.12f, 4.0f, 8.93f, 8.94f);
        b.moveTo(7.0f, 18.0f);
        b.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        b.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -0.9f, -2.0f, -2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeShoppingCart = build;
        build.getClass();
        return build;
    }
}
