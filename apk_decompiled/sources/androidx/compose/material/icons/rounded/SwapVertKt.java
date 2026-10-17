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
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwapVertKt {
    private static ImageVector _swapVert;

    public static final ImageVector getSwapVert(Icons.Rounded rounded) {
        ImageVector imageVector = _swapVert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwapVert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(16.0f, 17.01f, 11.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(6.01f);
        d.horizontalLineToRelative(-1.79f);
        d.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        d.lineToRelative(2.79f, 2.78f);
        d.curveToRelative(0.2f, 0.19f, 0.51f, 0.19f, 0.71f, 0.0f);
        d.lineToRelative(2.79f, -2.78f);
        d.curveToRelative(0.32f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        k4.w(d, 16.0f, 8.65f, 3.35f);
        d.lineTo(5.86f, 6.14f);
        d.curveToRelative(-0.32f, 0.31f, -0.1f, 0.85f, 0.35f, 0.85f);
        d.horizontalLineTo(8.0f);
        d.verticalLineTo(13.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineTo(6.99f);
        d.horizontalLineToRelative(1.79f);
        d.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        d.lineTo(9.35f, 3.35f);
        d.curveToRelative(-0.19f, -0.19f, -0.51f, -0.19f, -0.7f, 0.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swapVert = build;
        build.getClass();
        return build;
    }
}
