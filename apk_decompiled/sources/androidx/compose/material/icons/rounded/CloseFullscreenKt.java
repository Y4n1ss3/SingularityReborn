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
public final class CloseFullscreenKt {
    private static ImageVector _closeFullscreen;

    public static final ImageVector getCloseFullscreen(Icons.Rounded rounded) {
        ImageVector imageVector = _closeFullscreen;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CloseFullscreen", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.29f, 4.12f, -4.59f, 4.59f);
        e.lineToRelative(1.59f, 1.59f);
        e.curveToRelative(0.63f, 0.63f, 0.18f, 1.71f, -0.71f, 1.71f);
        e.horizontalLineTo(13.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.verticalLineTo(6.41f);
        e.curveToRelative(0.0f, -0.89f, 1.08f, -1.34f, 1.71f, -0.71f);
        e.lineToRelative(1.59f, 1.59f);
        e.lineToRelative(4.59f, -4.59f);
        e.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        e.verticalLineToRelative(0.0f);
        e.curveTo(21.68f, 3.1f, 21.68f, 3.73f, 21.29f, 4.12f);
        k4.x(e, 4.12f, 21.29f, 4.59f, -4.59f);
        e.lineToRelative(1.59f, 1.59f);
        e.curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f);
        e.verticalLineTo(13.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineTo(6.41f);
        e.curveToRelative(-0.89f, 0.0f, -1.34f, 1.08f, -0.71f, 1.71f);
        e.lineToRelative(1.59f, 1.59f);
        e.lineToRelative(-4.59f, 4.59f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveTo(3.1f, 21.68f, 3.73f, 21.68f, 4.12f, 21.29f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _closeFullscreen = build;
        build.getClass();
        return build;
    }
}
