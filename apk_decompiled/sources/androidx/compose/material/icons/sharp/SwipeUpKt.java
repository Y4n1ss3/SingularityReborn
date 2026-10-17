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
import defpackage.af0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeUpKt {
    private static ImageVector _swipeUp;

    public static final ImageVector getSwipeUp(Icons.Sharp sharp) {
        ImageVector imageVector = _swipeUp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SwipeUp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        uo.l(i, 2.06f, 5.56f, 21.71f, 11.18f);
        i.lineToRelative(2.09f, 7.39f);
        i.lineToRelative(-8.23f, 3.65f);
        i.lineToRelative(-6.84f, -2.85f);
        i.lineToRelative(0.61f, -1.62f);
        i.lineToRelative(3.8f, -0.75f);
        i.lineTo(8.79f, 7.17f);
        i.curveToRelative(-0.34f, -0.76f, 0.0f, -1.64f, 0.76f, -1.98f);
        i.curveToRelative(0.76f, -0.34f, 1.64f, 0.0f, 1.98f, 0.76f);
        i.lineToRelative(2.43f, 5.49f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 1.26f, -0.56f, 21.71f, 11.18f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeUp = build;
        build.getClass();
        return build;
    }
}
