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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeVerticalKt {
    private static ImageVector _swipeVertical;

    public static final ImageVector getSwipeVertical(Icons.Rounded rounded) {
        ImageVector imageVector = _swipeVertical;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwipeVertical", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(0.0f, 12.0f);
        b.curveToRelative(0.0f, 3.22f, 1.13f, 6.18f, 3.02f, 8.5f);
        b.horizontalLineTo(1.75f);
        b.curveTo(1.34f, 20.5f, 1.0f, 20.84f, 1.0f, 21.25f);
        b.reflectiveCurveTo(1.34f, 22.0f, 1.75f, 22.0f);
        b.horizontalLineTo(5.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-3.25f);
        b.curveTo(6.0f, 17.34f, 5.66f, 17.0f, 5.25f, 17.0f);
        b.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        b.verticalLineToRelative(2.16f);
        b.curveToRelative(-1.86f, -2.11f, -3.0f, -4.88f, -3.0f, -7.91f);
        b.reflectiveCurveToRelative(1.14f, -5.79f, 3.0f, -7.91f);
        b.verticalLineToRelative(2.16f);
        b.curveTo(4.5f, 6.66f, 4.84f, 7.0f, 5.25f, 7.0f);
        b.curveTo(5.66f, 7.0f, 6.0f, 6.66f, 6.0f, 6.25f);
        b.verticalLineTo(3.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(1.75f);
        b.curveTo(1.34f, 2.0f, 1.0f, 2.34f, 1.0f, 2.75f);
        b.reflectiveCurveTo(1.34f, 3.5f, 1.75f, 3.5f);
        b.horizontalLineToRelative(1.27f);
        b.curveTo(1.13f, 5.82f, 0.0f, 8.78f, 0.0f, 12.0f);
        b.close();
        b.moveTo(8.83f, 19.1f);
        b.curveToRelative(-0.26f, -0.6f, 0.09f, -1.28f, 0.73f, -1.41f);
        b.lineToRelative(3.58f, -0.71f);
        b.lineTo(8.79f, 7.17f);
        b.curveToRelative(-0.34f, -0.76f, 0.0f, -1.64f, 0.76f, -1.98f);
        b.curveToRelative(0.76f, -0.34f, 1.64f, 0.0f, 1.98f, 0.76f);
        b.lineToRelative(2.43f, 5.49f);
        b.lineToRelative(0.84f, -0.37f);
        b.curveToRelative(0.28f, -0.13f, 0.59f, -0.18f, 0.9f, -0.17f);
        b.lineToRelative(4.56f, 0.21f);
        b.curveToRelative(0.86f, 0.04f, 1.6f, 0.63f, 1.83f, 1.45f);
        b.lineToRelative(1.23f, 4.33f);
        b.curveToRelative(0.27f, 0.96f, -0.2f, 1.97f, -1.11f, 2.37f);
        b.lineToRelative(-5.63f, 2.49f);
        b.curveToRelative(-0.48f, 0.21f, -1.26f, 0.33f, -1.76f, 0.14f);
        b.lineToRelative(-5.45f, -2.27f);
        b.curveTo(9.13f, 19.53f, 8.93f, 19.34f, 8.83f, 19.1f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeVertical = build;
        build.getClass();
        return build;
    }
}
