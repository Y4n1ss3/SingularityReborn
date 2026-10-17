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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalDrinkKt {
    private static ImageVector _localDrink;

    public static final ImageVector getLocalDrink(Icons.Outlined outlined) {
        ImageVector imageVector = _localDrink;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocalDrink", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(3.0f, 2.0f, 2.01f, 18.23f);
        e.curveTo(5.13f, 21.23f, 5.97f, 22.0f, 7.0f, 22.0f);
        e.horizontalLineToRelative(10.0f);
        e.curveToRelative(1.03f, 0.0f, 1.87f, -0.77f, 1.99f, -1.77f);
        r6.C(e, 21.0f, 2.0f, 3.0f, 2.0f);
        e.moveTo(17.0f, 20.0f);
        e.lineToRelative(-10.0f, 0.01f);
        e.lineTo(5.89f, 10.0f);
        r6.C(e, 18.1f, 10.0f, 17.0f, 20.0f);
        e.moveTo(18.33f, 8.0f);
        e.lineTo(5.67f, 8.0f);
        e.lineToRelative(-0.44f, -4.0f);
        uo.w(e, 13.53f, -0.43f, 4.0f);
        e.moveTo(12.0f, 19.0f);
        e.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        e.curveToRelative(0.0f, -2.0f, -3.0f, -5.4f, -3.0f, -5.4f);
        e.reflectiveCurveTo(9.0f, 14.0f, 9.0f, 16.0f);
        e.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        e.close();
        e.moveTo(12.0f, 13.91f);
        e.curveToRelative(0.59f, 0.91f, 1.0f, 1.73f, 1.0f, 2.09f);
        e.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        e.curveToRelative(0.0f, -0.37f, 0.41f, -1.19f, 1.0f, -2.09f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localDrink = build;
        build.getClass();
        return build;
    }
}
