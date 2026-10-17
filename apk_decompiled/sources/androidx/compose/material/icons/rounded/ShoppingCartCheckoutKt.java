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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShoppingCartCheckoutKt {
    private static ImageVector _shoppingCartCheckout;

    public static final ImageVector getShoppingCartCheckout(Icons.Rounded rounded) {
        ImageVector imageVector = _shoppingCartCheckout;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ShoppingCartCheckout", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        b.close();
        b.moveTo(19.0f, 16.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        uo.g(b, 7.0f, 1.1f, -2.0f, 7.45f);
        b.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        b.lineToRelative(3.24f, -6.14f);
        b.curveToRelative(0.25f, -0.48f, 0.08f, -1.08f, -0.4f, -1.34f);
        b.curveToRelative(-0.49f, -0.27f, -1.1f, -0.08f, -1.36f, 0.41f);
        b.lineTo(15.55f, 11.0f);
        b.horizontalLineTo(8.53f);
        b.lineTo(4.54f, 2.57f);
        b.curveTo(4.38f, 2.22f, 4.02f, 2.0f, 3.64f, 2.0f);
        b.horizontalLineTo(2.0f);
        b.curveTo(1.45f, 2.0f, 1.0f, 2.45f, 1.0f, 3.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.0f);
        b.lineToRelative(3.6f, 7.59f);
        b.lineToRelative(-1.35f, 2.44f);
        b.curveTo(4.52f, 15.37f, 5.48f, 17.0f, 7.0f, 17.0f);
        b.horizontalLineToRelative(11.0f);
        b.curveTo(18.55f, 17.0f, 19.0f, 16.55f, 19.0f, 16.0f);
        b.close();
        b.moveTo(11.29f, 2.71f);
        b.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        b.lineToRelative(2.59f, 2.59f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(-2.59f, 2.59f);
        b.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(12.17f, 7.0f);
        b.lineTo(9.0f, 7.0f);
        b.curveTo(8.45f, 7.0f, 8.0f, 6.55f, 8.0f, 6.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.lineToRelative(3.17f, 0.0f);
        b.lineToRelative(-0.88f, -0.88f);
        b.curveTo(10.9f, 3.73f, 10.9f, 3.1f, 11.29f, 2.71f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shoppingCartCheckout = build;
        build.getClass();
        return build;
    }
}
