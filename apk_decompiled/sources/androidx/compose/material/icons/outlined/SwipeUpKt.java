package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeUpKt {
    private static ImageVector _swipeUp;

    public static final ImageVector getSwipeUp(Icons.Outlined outlined) {
        ImageVector imageVector = _swipeUp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SwipeUp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.22f, 10.0f, -4.15f, 0.01f);
        e.curveToRelative(-0.16f, -0.01f, -0.31f, 0.02f, -0.45f, 0.08f);
        e.lineToRelative(-0.59f, 0.26f);
        e.lineTo(13.2f, 6.25f);
        e.curveToRelative(-0.56f, -1.26f, -2.04f, -1.83f, -3.3f, -1.27f);
        e.reflectiveCurveToRelative(-1.83f, 2.04f, -1.27f, 3.3f);
        e.lineToRelative(3.3f, 7.45f);
        e.lineToRelative(-1.87f, 0.39f);
        e.curveToRelative(-0.19f, 0.05f, -0.99f, 0.27f, -1.36f, 1.21f);
        e.lineTo(8.0f, 19.19f);
        e.lineToRelative(6.78f, 2.67f);
        e.curveToRelative(0.49f, 0.19f, 1.05f, 0.18f, 1.53f, -0.04f);
        e.lineToRelative(5.99f, -2.65f);
        e.curveToRelative(0.89f, -0.4f, 1.37f, -1.38f, 1.13f, -2.32f);
        e.lineToRelative(-1.36f, -5.34f);
        e.curveTo(21.85f, 10.65f, 21.1f, 10.04f, 20.22f, 10.0f);
        k4.r(e, 21.49f, 17.34f, 15.5f, 20.0f);
        e.lineToRelative(-4.92f, -1.96f);
        e.lineToRelative(4.18f, -0.88f);
        e.lineToRelative(-4.3f, -9.7f);
        e.curveToRelative(-0.11f, -0.25f, 0.0f, -0.55f, 0.25f, -0.66f);
        e.curveToRelative(0.25f, -0.11f, 0.55f, 0.0f, 0.66f, 0.25f);
        e.lineToRelative(2.5f, 5.65f);
        e.lineToRelative(1.61f, -0.71f);
        r6.C(e, 20.13f, 12.0f, 21.49f, 17.34f);
        e.moveTo(2.06f, 5.56f);
        e.lineTo(1.0f, 4.5f);
        e.lineTo(4.5f, 1.0f);
        e.lineTo(8.0f, 4.5f);
        e.lineTo(6.94f, 5.56f);
        e.lineTo(5.32f, 3.94f);
        e.curveTo(5.11f, 4.76f, 5.0f, 5.62f, 5.0f, 6.5f);
        e.curveToRelative(0.0f, 2.42f, 0.82f, 4.65f, 2.2f, 6.43f);
        e.lineTo(6.13f, 14.0f);
        e.curveTo(4.49f, 11.95f, 3.5f, 9.34f, 3.5f, 6.5f);
        e.curveToRelative(0.0f, -0.92f, 0.1f, -1.82f, 0.3f, -2.68f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 2.06f, 5.56f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeUp = build;
        build.getClass();
        return build;
    }
}
