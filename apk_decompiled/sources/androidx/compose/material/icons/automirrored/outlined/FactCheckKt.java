package androidx.compose.material.icons.automirrored.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import defpackage.c21;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FactCheckKt {
    private static ImageVector _factCheck;

    public static final ImageVector getFactCheck(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _factCheck;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.FactCheck", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        PathFillType.Companion companion = PathFillType.Companion;
        int m5057getEvenOddRgk1Os = companion.m5057getEvenOddRgk1Os();
        Color.Companion companion2 = Color.Companion;
        SolidColor solidColor = new SolidColor(companion2.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion3 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion3.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion4 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion4.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 3.0f, 4.0f);
        d.curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f);
        c21.d(d, 20.0f, 19.0f, 4.0f, 5.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 16.0f, 19.0f), m5057getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int m5057getEvenOddRgk1Os2 = companion.m5057getEvenOddRgk1Os();
        SolidColor solidColor2 = new SolidColor(companion2.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion3.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion4.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.41f, 10.42f, -1.42f, -1.42f);
        e.lineToRelative(-3.17f, 3.17f);
        e.lineToRelative(-1.41f, -1.42f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -1.41f, 1.41f, 2.82f, 2.84f), m5057getEvenOddRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(5.0f, 7.0f, 5.0f, 2.0f, -5.0f), companion.m5057getEvenOddRgk1Os(), "", new SolidColor(companion2.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion3.m5135getButtKaPHkGw(), companion4.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(5.0f, 11.0f, 5.0f, 2.0f, -5.0f), companion.m5057getEvenOddRgk1Os(), "", new SolidColor(companion2.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion3.m5135getButtKaPHkGw(), companion4.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(5.0f, 15.0f, 5.0f, 2.0f, -5.0f), companion.m5057getEvenOddRgk1Os(), "", new SolidColor(companion2.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion3.m5135getButtKaPHkGw(), companion4.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _factCheck = build;
        build.getClass();
        return build;
    }
}
