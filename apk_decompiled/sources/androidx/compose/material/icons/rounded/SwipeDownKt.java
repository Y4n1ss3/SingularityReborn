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
public final class SwipeDownKt {
    private static ImageVector _swipeDown;

    public static final ImageVector getSwipeDown(Icons.Rounded rounded) {
        ImageVector imageVector = _swipeDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwipeDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.83f, 19.1f);
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
        b.moveTo(5.59f, 2.73f);
        b.curveTo(4.27f, 4.65f, 3.5f, 6.99f, 3.5f, 9.5f);
        b.curveToRelative(0.0f, 0.92f, 0.1f, 1.82f, 0.3f, 2.68f);
        b.lineToRelative(-1.19f, -1.19f);
        b.curveToRelative(-0.29f, -0.29f, -0.77f, -0.32f, -1.07f, -0.04f);
        b.curveToRelative(-0.31f, 0.29f, -0.31f, 0.78f, -0.02f, 1.08f);
        b.lineToRelative(2.26f, 2.26f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(2.24f, -2.24f);
        b.curveToRelative(0.29f, -0.29f, 0.32f, -0.77f, 0.04f, -1.07f);
        b.curveToRelative(-0.29f, -0.31f, -0.78f, -0.31f, -1.08f, -0.02f);
        b.lineToRelative(-1.09f, 1.09f);
        b.curveTo(5.11f, 11.24f, 5.0f, 10.38f, 5.0f, 9.5f);
        b.curveToRelative(0.0f, -2.2f, 0.68f, -4.24f, 1.83f, -5.93f);
        b.curveToRelative(0.2f, -0.3f, 0.17f, -0.7f, -0.09f, -0.95f);
        b.curveTo(6.41f, 2.28f, 5.86f, 2.34f, 5.59f, 2.73f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeDown = build;
        build.getClass();
        return build;
    }
}
