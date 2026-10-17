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
import defpackage.af0;
import defpackage.c21;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShoppingBagKt {
    private static ImageVector _shoppingBag;

    public static final ImageVector getShoppingBag(Icons.Rounded rounded) {
        ImageVector imageVector = _shoppingBag;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ShoppingBag", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(18.0f, 6.0f, -2.0f);
        a.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        a.reflectiveCurveTo(8.0f, 3.79f, 8.0f, 6.0f);
        a.horizontalLineTo(6.0f);
        a.curveTo(4.9f, 6.0f, 4.0f, 6.9f, 4.0f, 8.0f);
        a.verticalLineToRelative(12.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.horizontalLineToRelative(12.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.verticalLineTo(8.0f);
        a.curveTo(20.0f, 6.9f, 19.1f, 6.0f, 18.0f, 6.0f);
        a.close();
        a.moveTo(10.0f, 10.0f);
        a.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        a.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        c21.c(a, 8.0f, 2.0f, 10.0f);
        a.moveTo(12.0f, 4.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        a.horizontalLineToRelative(-4.0f);
        a.curveTo(10.0f, 4.9f, 10.9f, 4.0f, 12.0f, 4.0f);
        a.close();
        a.moveTo(16.0f, 10.0f);
        a.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        a.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.r(a, 8.0f, 2.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shoppingBag = build;
        build.getClass();
        return build;
    }
}
