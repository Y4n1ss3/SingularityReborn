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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeDownKt {
    private static ImageVector _swipeDown;

    public static final ImageVector getSwipeDown(Icons.Sharp sharp) {
        ImageVector imageVector = _swipeDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SwipeDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.8f, 12.18f);
        b.curveToRelative(-0.2f, -0.86f, -0.3f, -1.76f, -0.3f, -2.68f);
        b.curveToRelative(0.0f, -2.84f, 0.99f, -5.45f, 2.63f, -7.5f);
        b.lineTo(7.2f, 3.07f);
        b.curveTo(5.82f, 4.85f, 5.0f, 7.08f, 5.0f, 9.5f);
        b.curveToRelative(0.0f, 0.88f, 0.11f, 1.74f, 0.32f, 2.56f);
        b.lineToRelative(1.62f, -1.62f);
        b.lineTo(8.0f, 11.5f);
        b.lineTo(4.5f, 15.0f);
        b.lineTo(1.0f, 11.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.06f, -1.06f, 3.8f, 12.18f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.71f, 11.18f, 2.09f, 7.39f);
        e.lineToRelative(-8.23f, 3.65f);
        e.lineToRelative(-6.84f, -2.85f);
        e.lineToRelative(0.61f, -1.62f);
        e.lineToRelative(3.8f, -0.75f);
        e.lineTo(8.79f, 7.17f);
        e.curveToRelative(-0.34f, -0.76f, 0.0f, -1.64f, 0.76f, -1.98f);
        e.curveToRelative(0.76f, -0.34f, 1.64f, 0.0f, 1.98f, 0.76f);
        e.lineToRelative(2.43f, 5.49f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 1.26f, -0.56f, 21.71f, 11.18f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeDown = build;
        build.getClass();
        return build;
    }
}
