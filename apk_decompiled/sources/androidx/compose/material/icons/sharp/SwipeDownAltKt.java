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
import defpackage.j50;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeDownAltKt {
    private static ImageVector _swipeDownAlt;

    public static final ImageVector getSwipeDownAlt(Icons.Sharp sharp) {
        ImageVector imageVector = _swipeDownAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SwipeDownAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.0f, 13.9f);
        b.curveToRelative(2.28f, -0.46f, 4.0f, -2.48f, 4.0f, -4.9f);
        b.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        b.reflectiveCurveTo(7.0f, 6.24f, 7.0f, 9.0f);
        b.curveToRelative(0.0f, 2.42f, 1.72f, 4.44f, 4.0f, 4.9f);
        b.verticalLineToRelative(4.27f);
        b.lineToRelative(-1.59f, -1.59f);
        b.lineTo(8.0f, 18.0f);
        b.lineToRelative(4.0f, 4.0f);
        b.lineToRelative(4.0f, -4.0f);
        b.lineToRelative(-1.41f, -1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(b, 13.0f, 18.17f, 13.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeDownAlt = build;
        build.getClass();
        return build;
    }
}
