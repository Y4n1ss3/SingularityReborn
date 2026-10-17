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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeLeftKt {
    private static ImageVector _swipeLeft;

    public static final ImageVector getSwipeLeft(Icons.Rounded rounded) {
        ImageVector imageVector = _swipeLeft;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwipeLeft", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(3.5f, 4.02f, 2.75f);
        d.curveTo(3.5f, 2.34f, 3.16f, 2.0f, 2.75f, 2.0f);
        d.reflectiveCurveTo(2.0f, 2.34f, 2.0f, 2.75f);
        d.verticalLineTo(6.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(3.25f);
        d.curveTo(6.66f, 7.0f, 7.0f, 6.66f, 7.0f, 6.25f);
        d.reflectiveCurveTo(6.66f, 5.5f, 6.25f, 5.5f);
        d.horizontalLineTo(4.09f);
        d.curveToRelative(2.11f, -1.86f, 4.88f, -3.0f, 7.91f, -3.0f);
        d.curveToRelative(4.42f, 0.0f, 7.27f, 2.19f, 8.25f, 4.1f);
        d.curveTo(20.37f, 6.85f, 20.63f, 7.0f, 20.91f, 7.0f);
        d.curveToRelative(0.56f, 0.0f, 0.93f, -0.59f, 0.67f, -1.08f);
        d.curveTo(20.3f, 3.39f, 16.81f, 1.0f, 12.0f, 1.0f);
        d.curveTo(8.78f, 1.0f, 5.82f, 2.13f, 3.5f, 4.02f);
        d.close();
        d.moveTo(5.2f, 17.43f);
        d.curveToRelative(0.0f, -0.65f, 0.6f, -1.13f, 1.24f, -0.99f);
        d.lineTo(10.0f, 17.24f);
        d.verticalLineTo(6.5f);
        d.curveTo(10.0f, 5.67f, 10.67f, 5.0f, 11.5f, 5.0f);
        d.reflectiveCurveTo(13.0f, 5.67f, 13.0f, 6.5f);
        d.verticalLineToRelative(6.0f);
        d.horizontalLineToRelative(0.91f);
        d.curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f);
        d.lineToRelative(4.09f, 2.04f);
        d.curveToRelative(0.77f, 0.38f, 1.21f, 1.22f, 1.09f, 2.07f);
        d.lineToRelative(-0.63f, 4.46f);
        d.curveTo(19.21f, 22.27f, 18.36f, 23.0f, 17.37f, 23.0f);
        d.horizontalLineToRelative(-6.16f);
        d.curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f);
        d.lineToRelative(-4.07f, -4.29f);
        d.curveTo(5.3f, 17.94f, 5.2f, 17.69f, 5.2f, 17.43f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeLeft = build;
        build.getClass();
        return build;
    }
}
