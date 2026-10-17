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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WindowKt {
    private static ImageVector _window;

    public static final ImageVector getWindow(Icons.TwoTone twoTone) {
        ImageVector imageVector = _window;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Window", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(13.0f, 13.0f, 6.0f, 6.0f, -6.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(5.0f, 13.0f, 6.0f, 6.0f, -6.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(5.0f, 5.0f, 6.0f, 6.0f, -6.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(13.0f, 5.0f, 6.0f, 6.0f, -6.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        uo.q(d, 11.0f, 19.0f, 5.0f, -6.0f);
        uo.r(d, 6.0f, 19.0f, 11.0f, 11.0f);
        uo.o(d, 5.0f, 5.0f, 6.0f, 11.0f);
        k4.C(d, 19.0f, 19.0f, -6.0f, -6.0f);
        uo.r(d, 6.0f, 19.0f, 19.0f, 11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.h(d, -6.0f, 5.0f, 6.0f, 11.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _window = build;
        build.getClass();
        return build;
    }
}
