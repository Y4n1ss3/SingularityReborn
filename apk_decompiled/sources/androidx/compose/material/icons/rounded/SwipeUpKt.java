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
public final class SwipeUpKt {
    private static ImageVector _swipeUp;

    public static final ImageVector getSwipeUp(Icons.Rounded rounded) {
        ImageVector imageVector = _swipeUp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwipeUp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        b.moveTo(6.75f, 13.38f);
        b.curveToRelative(0.26f, -0.26f, 0.29f, -0.66f, 0.09f, -0.95f);
        b.curveTo(5.68f, 10.74f, 5.0f, 8.7f, 5.0f, 6.5f);
        b.curveToRelative(0.0f, -0.88f, 0.11f, -1.74f, 0.32f, -2.56f);
        b.lineToRelative(1.09f, 1.09f);
        b.curveToRelative(0.3f, 0.3f, 0.79f, 0.29f, 1.08f, -0.02f);
        b.curveToRelative(0.28f, -0.3f, 0.25f, -0.78f, -0.04f, -1.07f);
        b.lineTo(5.21f, 1.71f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.lineTo(1.53f, 3.97f);
        b.curveToRelative(-0.3f, 0.3f, -0.29f, 0.79f, 0.02f, 1.08f);
        b.curveToRelative(0.3f, 0.28f, 0.78f, 0.25f, 1.07f, -0.04f);
        b.lineTo(3.8f, 3.82f);
        b.curveTo(3.6f, 4.68f, 3.5f, 5.58f, 3.5f, 6.5f);
        b.curveToRelative(0.0f, 2.51f, 0.77f, 4.85f, 2.09f, 6.77f);
        b.curveTo(5.86f, 13.66f, 6.41f, 13.72f, 6.75f, 13.38f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeUp = build;
        build.getClass();
        return build;
    }
}
