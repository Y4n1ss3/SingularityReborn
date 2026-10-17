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
public final class ShieldKt {
    private static ImageVector _shield;

    public static final ImageVector getShield(Icons.Rounded rounded) {
        ImageVector imageVector = _shield;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Shield", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(11.3f, 2.26f, -6.0f, 2.25f);
        e.curveTo(4.52f, 4.81f, 4.0f, 5.55f, 4.0f, 6.39f);
        e.verticalLineToRelative(4.7f);
        e.curveToRelative(0.0f, 4.83f, 3.13f, 9.37f, 7.43f, 10.75f);
        e.curveToRelative(0.37f, 0.12f, 0.77f, 0.12f, 1.14f, 0.0f);
        e.curveToRelative(4.3f, -1.38f, 7.43f, -5.91f, 7.43f, -10.75f);
        e.verticalLineToRelative(-4.7f);
        e.curveToRelative(0.0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f);
        e.lineToRelative(-6.0f, -2.25f);
        e.curveTo(12.25f, 2.09f, 11.75f, 2.09f, 11.3f, 2.26f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shield = build;
        build.getClass();
        return build;
    }
}
