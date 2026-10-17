package androidx.compose.material.icons.twotone;

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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScreenshotKt {
    private static ImageVector _screenshot;

    public static final ImageVector getScreenshot(Icons.TwoTone twoTone) {
        ImageVector imageVector = _screenshot;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Screenshot", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.0f, 1.01f, 7.0f, 1.0f);
        i.curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f);
        i.verticalLineToRelative(18.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(10.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(3.0f);
        i.curveTo(19.0f, 1.9f, 18.1f, 1.01f, 17.0f, 1.01f);
        uo.q(i, 17.0f, 21.0f, 7.0f, -1.0f);
        uo.r(i, 10.0f, 21.0f, 17.0f, 18.0f);
        uo.o(i, 7.0f, 6.0f, 10.0f, 18.0f);
        uo.p(i, 17.0f, 4.0f, 7.0f, 3.0f);
        uo.r(i, 10.0f, 4.0f, 9.5f, 8.5f);
        gy.x(i, 12.0f, 7.0f, 8.0f, 4.0f);
        uo.r(i, 1.5f, 8.5f, 12.0f, 17.0f);
        af0.v(i, 4.0f, -4.0f, -1.5f, 2.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(i, 12.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(7.0f, 3.0f, 10.0f, 1.0f, -10.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(7.0f, 20.0f, 10.0f, 1.0f, -10.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenshot = build;
        build.getClass();
        return build;
    }
}
