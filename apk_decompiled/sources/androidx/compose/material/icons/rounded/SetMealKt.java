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
import defpackage.bv;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SetMealKt {
    private static ImageVector _setMeal;

    public static final ImageVector getSetMeal(Icons.Rounded rounded) {
        ImageVector imageVector = _setMeal;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SetMeal", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.3f, 17.6f, 3.83f, 18.46f);
        i.curveToRelative(-0.41f, 0.02f, -0.77f, -0.3f, -0.79f, -0.71f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(-0.02f, -0.41f, 0.3f, -0.77f, 0.71f, -0.79f);
        i.lineToRelative(16.48f, -0.86f);
        i.curveToRelative(0.41f, -0.02f, 0.77f, 0.3f, 0.79f, 0.71f);
        i.verticalLineToRelative(0.0f);
        i.curveTo(21.04f, 17.22f, 20.72f, 17.58f, 20.3f, 17.6f);
        r6.g(i, 20.25f, 19.48f, 3.75f);
        i.curveTo(3.34f, 19.48f, 3.0f, 19.82f, 3.0f, 20.23f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        i.horizontalLineToRelative(16.5f);
        i.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveTo(21.0f, 19.82f, 20.66f, 19.48f, 20.25f, 19.48f);
        bv.v(i, 22.0f, 5.0f, 7.0f);
        i.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        i.horizontalLineTo(4.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        i.verticalLineTo(5.0f);
        i.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveTo(21.1f, 3.0f, 22.0f, 3.9f, 22.0f, 5.0f);
        i.close();
        i.moveTo(19.12f, 6.09f);
        i.curveToRelative(-1.25f, 0.27f, -2.19f, 1.11f, -2.33f, 2.14f);
        i.curveTo(16.15f, 7.5f, 14.06f, 5.5f, 10.25f, 5.5f);
        i.curveToRelative(-3.44f, 0.0f, -5.48f, 1.63f, -6.31f, 2.49f);
        i.curveToRelative(-0.28f, 0.29f, -0.28f, 0.74f, 0.0f, 1.03f);
        i.curveToRelative(0.83f, 0.86f, 2.87f, 2.49f, 6.31f, 2.49f);
        i.curveToRelative(3.81f, 0.0f, 5.9f, -2.0f, 6.54f, -2.73f);
        i.curveToRelative(0.14f, 1.02f, 1.08f, 1.86f, 2.33f, 2.14f);
        i.curveToRelative(0.46f, 0.1f, 0.88f, -0.28f, 0.88f, -0.74f);
        i.verticalLineTo(6.84f);
        i.curveTo(20.0f, 6.37f, 19.57f, 5.99f, 19.12f, 6.09f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _setMeal = build;
        build.getClass();
        return build;
    }
}
