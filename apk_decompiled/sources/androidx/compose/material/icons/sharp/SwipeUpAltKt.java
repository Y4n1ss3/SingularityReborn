package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeUpAltKt {
    private static ImageVector _swipeUpAlt;

    public static final ImageVector getSwipeUpAlt(Icons.Sharp sharp) {
        ImageVector imageVector = _swipeUpAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SwipeUpAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.0f, 5.83f, 1.59f, 1.59f);
        e.lineTo(16.0f, 6.0f);
        e.lineToRelative(-4.0f, -4.0f);
        e.lineTo(8.0f, 6.0f);
        e.lineToRelative(1.41f, 1.41f);
        e.lineTo(11.0f, 5.83f);
        e.verticalLineToRelative(4.27f);
        e.curveToRelative(-2.28f, 0.46f, -4.0f, 2.48f, -4.0f, 4.9f);
        e.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        e.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        e.curveToRelative(0.0f, -2.42f, -1.72f, -4.44f, -4.0f, -4.9f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(e, 5.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeUpAlt = build;
        build.getClass();
        return build;
    }
}
