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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalDrinkKt {
    private static ImageVector _localDrink;

    public static final ImageVector getLocalDrink(Icons.TwoTone twoTone) {
        ImageVector imageVector = _localDrink;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LocalDrink", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.0f, 20.01f, 17.0f, 20.0f);
        i.lineToRelative(1.1f, -10.0f);
        r6.C(i, 5.89f, 10.0f, 7.0f, 20.01f);
        i.moveTo(12.0f, 10.6f);
        i.reflectiveCurveToRelative(3.0f, 3.4f, 3.0f, 5.4f);
        i.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        i.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        i.curveToRelative(0.0f, -2.0f, 3.0f, -5.4f, 3.0f, -5.4f);
        i.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(5.01f, 20.23f);
        b.curveTo(5.13f, 21.23f, 5.97f, 22.0f, 7.0f, 22.0f);
        b.horizontalLineToRelative(10.0f);
        b.curveToRelative(1.03f, 0.0f, 1.87f, -0.77f, 1.99f, -1.77f);
        b.lineTo(21.0f, 2.0f);
        bv.o(b, 3.0f, 2.0f, 2.01f, 18.23f);
        b.moveTo(17.0f, 20.0f);
        b.lineToRelative(-10.0f, 0.01f);
        b.lineTo(5.89f, 10.0f);
        r6.C(b, 18.1f, 10.0f, 17.0f, 20.0f);
        b.moveTo(18.76f, 4.0f);
        b.lineToRelative(-0.43f, 4.0f);
        b.lineTo(5.67f, 8.0f);
        uf.r(b, -0.44f, -4.0f, 13.53f);
        b.moveTo(12.0f, 19.0f);
        b.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        b.curveToRelative(0.0f, -2.0f, -3.0f, -5.4f, -3.0f, -5.4f);
        b.reflectiveCurveTo(9.0f, 14.0f, 9.0f, 16.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.close();
        b.moveTo(12.0f, 13.91f);
        b.curveToRelative(0.59f, 0.91f, 1.0f, 1.73f, 1.0f, 2.09f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.37f, 0.41f, -1.19f, 1.0f, -2.09f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localDrink = build;
        build.getClass();
        return build;
    }
}
