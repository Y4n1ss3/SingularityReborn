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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationKt {
    private static ImageVector _navigation;

    public static final ImageVector getNavigation(Icons.TwoTone twoTone) {
        ImageVector imageVector = _navigation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Navigation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(7.72f, 17.7f, 3.47f, -1.53f);
        e.lineToRelative(0.81f, -0.36f);
        e.lineToRelative(0.81f, 0.36f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 3.47f, 1.53f, 12.0f, 7.27f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(4.5f, 20.29f, 0.71f, 0.71f);
        e2.lineTo(12.0f, 18.0f);
        e2.lineToRelative(6.79f, 3.0f);
        e2.lineToRelative(0.71f, -0.71f);
        r6.C(e2, 12.0f, 2.0f, 4.5f, 20.29f);
        e2.moveTo(12.81f, 16.17f);
        e2.lineToRelative(-0.81f, -0.36f);
        e2.lineToRelative(-0.81f, 0.36f);
        e2.lineToRelative(-3.47f, 1.53f);
        e2.lineTo(12.0f, 7.27f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e2, 4.28f, 10.43f, -3.47f, -1.53f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _navigation = build;
        build.getClass();
        return build;
    }
}
