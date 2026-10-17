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
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeDownKt {
    private static ImageVector _swipeDown;

    public static final ImageVector getSwipeDown(Icons.Filled filled) {
        ImageVector imageVector = _swipeDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SwipeDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
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
        gy.B(b, 1.06f, -1.06f, 3.8f, 12.18f);
        b.moveTo(13.85f, 11.62f);
        b.lineToRelative(-2.68f, -5.37f);
        b.curveToRelative(-0.37f, -0.74f, -1.27f, -1.04f, -2.01f, -0.67f);
        b.curveTo(8.41f, 5.96f, 8.11f, 6.86f, 8.48f, 7.6f);
        b.lineToRelative(4.81f, 9.6f);
        b.lineTo(10.05f, 18.0f);
        b.curveToRelative(-0.33f, 0.09f, -0.59f, 0.33f, -0.7f, 0.66f);
        b.lineTo(9.0f, 19.78f);
        b.lineToRelative(6.19f, 2.25f);
        b.curveToRelative(0.5f, 0.17f, 1.28f, 0.02f, 1.75f, -0.22f);
        b.lineToRelative(5.51f, -2.75f);
        b.curveToRelative(0.89f, -0.45f, 1.32f, -1.48f, 1.0f, -2.42f);
        b.lineToRelative(-1.43f, -4.27f);
        b.curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f);
        b.horizontalLineToRelative(-4.56f);
        b.curveToRelative(-0.31f, 0.0f, -0.62f, 0.07f, -0.89f, 0.21f);
        b.lineTo(13.85f, 11.62f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeDown = build;
        build.getClass();
        return build;
    }
}
