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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FoodBankKt {
    private static ImageVector _foodBank;

    public static final ImageVector getFoodBank(Icons.Rounded rounded) {
        ImageVector imageVector = _foodBank;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FoodBank", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.8f, 3.9f, -6.0f, 4.5f);
        e.curveTo(4.3f, 8.78f, 4.0f, 9.37f, 4.0f, 10.0f);
        e.verticalLineToRelative(9.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(12.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineToRelative(-9.0f);
        e.curveToRelative(0.0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f);
        e.lineToRelative(-6.0f, -4.5f);
        e.curveTo(12.49f, 3.37f, 11.51f, 3.37f, 10.8f, 3.9f);
        e.close();
        e.moveTo(12.5f, 12.5f);
        e.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        e.verticalLineToRelative(3.5f);
        e.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        e.verticalLineTo(14.0f);
        e.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        e.verticalLineTo(10.0f);
        e.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        gy.i(e, 2.5f, 10.0f, 10.0f);
        e.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        bv.x(e, 2.5f, 0.5f, 10.0f);
        e.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        bv.t(e, 12.5f, 14.5f, 18.0f);
        e.lineTo(14.5f, 18.0f);
        e.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        e.verticalLineToRelative(-3.0f);
        e.horizontalLineToRelative(-0.5f);
        e.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        e.verticalLineToRelative(-2.5f);
        e.curveToRelative(0.0f, -0.88f, 0.57f, -1.63f, 1.36f, -1.89f);
        e.curveTo(14.67f, 9.5f, 15.0f, 9.75f, 15.0f, 10.09f);
        e.verticalLineToRelative(7.41f);
        e.curveTo(15.0f, 17.78f, 14.78f, 18.0f, 14.5f, 18.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _foodBank = build;
        build.getClass();
        return build;
    }
}
