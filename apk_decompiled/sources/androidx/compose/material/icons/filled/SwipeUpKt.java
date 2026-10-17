package androidx.compose.material.icons.filled;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeUpKt {
    private static ImageVector _swipeUp;

    public static final ImageVector getSwipeUp(Icons.Filled filled) {
        ImageVector imageVector = _swipeUp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SwipeUp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.06f, 5.56f, 1.0f, 4.5f);
        i.lineTo(4.5f, 1.0f);
        i.lineTo(8.0f, 4.5f);
        i.lineTo(6.94f, 5.56f);
        i.lineTo(5.32f, 3.94f);
        i.curveTo(5.11f, 4.76f, 5.0f, 5.62f, 5.0f, 6.5f);
        i.curveToRelative(0.0f, 2.42f, 0.82f, 4.65f, 2.2f, 6.43f);
        i.lineTo(6.13f, 14.0f);
        i.curveTo(4.49f, 11.95f, 3.5f, 9.34f, 3.5f, 6.5f);
        i.curveToRelative(0.0f, -0.92f, 0.1f, -1.82f, 0.3f, -2.68f);
        uo.l(i, 2.06f, 5.56f, 13.85f, 11.62f);
        i.lineToRelative(-2.68f, -5.37f);
        i.curveToRelative(-0.37f, -0.74f, -1.27f, -1.04f, -2.01f, -0.67f);
        i.curveTo(8.41f, 5.96f, 8.11f, 6.86f, 8.48f, 7.6f);
        i.lineToRelative(4.81f, 9.6f);
        i.lineTo(10.05f, 18.0f);
        i.curveToRelative(-0.33f, 0.09f, -0.59f, 0.33f, -0.7f, 0.66f);
        i.lineTo(9.0f, 19.78f);
        i.lineToRelative(6.19f, 2.25f);
        i.curveToRelative(0.5f, 0.17f, 1.28f, 0.02f, 1.75f, -0.22f);
        i.lineToRelative(5.51f, -2.75f);
        i.curveToRelative(0.89f, -0.45f, 1.32f, -1.48f, 1.0f, -2.42f);
        i.lineToRelative(-1.43f, -4.27f);
        i.curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f);
        i.horizontalLineToRelative(-4.56f);
        i.curveToRelative(-0.31f, 0.0f, -0.62f, 0.07f, -0.89f, 0.21f);
        i.lineTo(13.85f, 11.62f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeUp = build;
        build.getClass();
        return build;
    }
}
