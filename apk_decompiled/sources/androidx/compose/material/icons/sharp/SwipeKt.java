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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeKt {
    private static ImageVector _swipe;

    public static final ImageVector getSwipe(Icons.Sharp sharp) {
        ImageVector imageVector = _swipe;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Swipe", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.13f, 3.87f);
        b.curveTo(18.69f, 2.17f, 15.6f, 1.0f, 12.0f, 1.0f);
        b.reflectiveCurveTo(5.31f, 2.17f, 3.87f, 3.87f);
        af0.m(b, 2.0f, 2.0f, 5.0f, 5.0f);
        b.lineTo(4.93f, 4.93f);
        b.curveToRelative(1.0f, -1.29f, 3.7f, -2.43f, 7.07f, -2.43f);
        b.reflectiveCurveToRelative(6.07f, 1.14f, 7.07f, 2.43f);
        kf0.y(b, 17.0f, 7.0f, 5.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 20.13f, 3.87f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(13.0f, 12.5f, -6.0f);
        h.curveTo(13.0f, 5.67f, 12.33f, 5.0f, 11.5f, 5.0f);
        h.reflectiveCurveTo(10.0f, 5.67f, 10.0f, 6.5f);
        h.verticalLineToRelative(10.74f);
        h.lineToRelative(-4.04f, -0.85f);
        h.lineToRelative(-1.21f, 1.23f);
        h.lineTo(10.13f, 23.0f);
        h.horizontalLineToRelative(8.97f);
        h.lineToRelative(1.09f, -7.64f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(h, -6.11f, -2.86f, 13.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipe = build;
        build.getClass();
        return build;
    }
}
