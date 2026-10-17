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
public final class AutoStoriesKt {
    private static ImageVector _autoStories;

    public static final ImageVector getAutoStories(Icons.Rounded rounded) {
        ImageVector imageVector = _autoStories;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AutoStories", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.15f, 1.35f, -4.0f, 4.0f);
        e.curveTo(14.05f, 5.45f, 14.0f, 5.57f, 14.0f, 5.71f);
        e.verticalLineToRelative(8.17f);
        e.curveToRelative(0.0f, 0.43f, 0.51f, 0.66f, 0.83f, 0.37f);
        e.lineToRelative(4.0f, -3.6f);
        e.curveToRelative(0.11f, -0.09f, 0.17f, -0.23f, 0.17f, -0.37f);
        e.verticalLineTo(1.71f);
        e.curveTo(19.0f, 1.26f, 18.46f, 1.04f, 18.15f, 1.35f);
        e.close();
        e.moveTo(22.47f, 5.2f);
        e.curveTo(22.0f, 4.96f, 21.51f, 4.76f, 21.0f, 4.59f);
        e.verticalLineToRelative(12.03f);
        e.curveTo(19.86f, 16.21f, 18.69f, 16.0f, 17.5f, 16.0f);
        e.curveToRelative(-1.9f, 0.0f, -3.78f, 0.54f, -5.5f, 1.58f);
        e.verticalLineTo(5.48f);
        e.curveTo(10.38f, 4.55f, 8.51f, 4.0f, 6.5f, 4.0f);
        e.curveTo(4.71f, 4.0f, 3.02f, 4.44f, 1.53f, 5.2f);
        e.curveTo(1.2f, 5.36f, 1.0f, 5.71f, 1.0f, 6.08f);
        e.verticalLineToRelative(12.08f);
        e.curveToRelative(0.0f, 0.76f, 0.81f, 1.23f, 1.48f, 0.87f);
        e.curveTo(3.69f, 18.4f, 5.05f, 18.0f, 6.5f, 18.0f);
        e.curveToRelative(2.07f, 0.0f, 3.98f, 0.82f, 5.5f, 2.0f);
        e.curveToRelative(1.52f, -1.18f, 3.43f, -2.0f, 5.5f, -2.0f);
        e.curveToRelative(1.45f, 0.0f, 2.81f, 0.4f, 4.02f, 1.04f);
        e.curveTo(22.19f, 19.4f, 23.0f, 18.93f, 23.0f, 18.17f);
        e.verticalLineTo(6.08f);
        e.curveTo(23.0f, 5.71f, 22.8f, 5.36f, 22.47f, 5.2f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoStories = build;
        build.getClass();
        return build;
    }
}
