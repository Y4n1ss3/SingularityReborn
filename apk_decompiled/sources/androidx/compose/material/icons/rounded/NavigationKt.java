package androidx.compose.material.icons.rounded;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationKt {
    private static ImageVector _navigation;

    public static final ImageVector getNavigation(Icons.Rounded rounded) {
        ImageVector imageVector = _navigation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Navigation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.93f, 4.26f, 6.15f, 14.99f);
        e.curveToRelative(0.34f, 0.83f, -0.51f, 1.66f, -1.33f, 1.29f);
        e.lineToRelative(-5.34f, -2.36f);
        e.curveToRelative(-0.26f, -0.11f, -0.55f, -0.11f, -0.81f, 0.0f);
        e.lineToRelative(-5.34f, 2.36f);
        e.curveToRelative(-0.82f, 0.36f, -1.67f, -0.46f, -1.33f, -1.29f);
        e.lineToRelative(6.15f, -14.99f);
        e.curveToRelative(0.33f, -0.83f, 1.51f, -0.83f, 1.85f, 0.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _navigation = build;
        build.getClass();
        return build;
    }
}
