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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwapHorizKt {
    private static ImageVector _swapHoriz;

    public static final ImageVector getSwapHoriz(Icons.Rounded rounded) {
        ImageVector imageVector = _swapHoriz;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwapHoriz", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(6.14f, 11.86f, -2.78f, 2.79f);
        e.curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.0f, 0.71f);
        e.lineToRelative(2.78f, 2.79f);
        e.curveToRelative(0.31f, 0.32f, 0.85f, 0.09f, 0.85f, -0.35f);
        e.lineTo(6.99f, 16.0f);
        e.lineTo(13.0f, 16.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        e.lineTo(6.99f, 14.0f);
        e.verticalLineToRelative(-1.79f);
        e.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        k4.x(e, 20.65f, 8.65f, -2.78f, -2.79f);
        e.curveToRelative(-0.31f, -0.32f, -0.85f, -0.09f, -0.85f, 0.35f);
        e.lineTo(17.02f, 8.0f);
        e.lineTo(11.0f, 8.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(6.01f);
        e.verticalLineToRelative(1.79f);
        e.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        e.lineToRelative(2.78f, -2.79f);
        e.curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.7f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swapHoriz = build;
        build.getClass();
        return build;
    }
}
