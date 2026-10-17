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
public final class SwapCallsKt {
    private static ImageVector _swapCalls;

    public static final ImageVector getSwapCalls(Icons.Rounded rounded) {
        ImageVector imageVector = _swapCalls;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwapCalls", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.65f, 4.35f, -2.79f, 2.79f);
        e.curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.35f, 0.86f);
        e.horizontalLineTo(17.0f);
        e.verticalLineToRelative(6.88f);
        e.curveToRelative(0.0f, 1.0f, -0.67f, 1.93f, -1.66f, 2.09f);
        e.curveToRelative(-1.25f, 0.21f, -2.34f, -0.76f, -2.34f, -1.97f);
        e.verticalLineTo(8.17f);
        e.curveToRelative(0.0f, -2.09f, -1.53f, -3.95f, -3.61f, -4.15f);
        e.curveTo(7.01f, 3.79f, 5.0f, 5.66f, 5.0f, 8.0f);
        e.verticalLineToRelative(7.0f);
        e.horizontalLineTo(3.21f);
        e.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        e.lineToRelative(2.79f, 2.79f);
        e.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        e.lineToRelative(2.79f, -2.79f);
        e.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        e.horizontalLineTo(7.0f);
        e.verticalLineTo(8.12f);
        e.curveToRelative(0.0f, -1.0f, 0.67f, -1.93f, 1.66f, -2.09f);
        e.curveTo(9.91f, 5.82f, 11.0f, 6.79f, 11.0f, 8.0f);
        e.verticalLineToRelative(6.83f);
        e.curveToRelative(0.0f, 2.09f, 1.53f, 3.95f, 3.61f, 4.15f);
        e.curveTo(16.99f, 19.21f, 19.0f, 17.34f, 19.0f, 15.0f);
        e.verticalLineTo(8.0f);
        e.horizontalLineToRelative(1.79f);
        e.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        e.lineToRelative(-2.79f, -2.79f);
        e.curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.7f, -0.01f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swapCalls = build;
        build.getClass();
        return build;
    }
}
