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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RemoveShoppingCartKt {
    private static ImageVector _removeShoppingCart;

    public static final ImageVector getRemoveShoppingCart(Icons.TwoTone twoTone) {
        ImageVector imageVector = _removeShoppingCart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RemoveShoppingCart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(1.41f, 1.13f, 0.0f, 2.54f);
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
        i.lineTo(21.46f, 24.0f);
        gy.B(i, 1.41f, -1.41f, 1.41f, 1.13f);
        i.moveTo(7.0f, 15.0f);
        i.lineToRelative(1.1f, -2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(i, 2.36f, 2.0f, 2.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(r6.a(18.31f, 6.0f, 9.12f, 4.99f, 5.0f), 1.44f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = r6.a(20.0f, 4.0f, 7.12f, 2.0f, 2.0f);
        kf0.B(a, 9.19f, -2.76f, 5.0f, -1.44f);
        a.lineToRelative(1.94f, 1.94f);
        a.curveToRelative(0.54f, -0.14f, 0.99f, -0.49f, 1.25f, -0.97f);
        a.lineToRelative(3.58f, -6.49f);
        a.curveTo(21.25f, 4.82f, 20.76f, 4.0f, 20.0f, 4.0f);
        a.close();
        a.moveTo(7.0f, 18.0f);
        a.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        a.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        a.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(a, -0.9f, -2.0f, -2.0f, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeShoppingCart = build;
        build.getClass();
        return build;
    }
}
