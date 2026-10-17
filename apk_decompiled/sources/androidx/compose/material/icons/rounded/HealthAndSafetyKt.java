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
import defpackage.af0;
import defpackage.bv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HealthAndSafetyKt {
    private static ImageVector _healthAndSafety;

    public static final ImageVector getHealthAndSafety(Icons.Rounded rounded) {
        ImageVector imageVector = _healthAndSafety;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HealthAndSafety", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(10.5f, 13.0f, -1.0f);
        a.curveTo(8.67f, 13.0f, 8.0f, 12.33f, 8.0f, 11.5f);
        a.verticalLineToRelative(0.0f);
        a.curveTo(8.0f, 10.67f, 8.67f, 10.0f, 9.5f, 10.0f);
        a.horizontalLineToRelative(1.0f);
        a.verticalLineTo(9.0f);
        a.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        a.horizontalLineToRelative(0.0f);
        a.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        a.verticalLineToRelative(1.0f);
        a.horizontalLineToRelative(1.0f);
        a.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        a.verticalLineToRelative(0.0f);
        a.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        a.horizontalLineToRelative(-1.0f);
        a.verticalLineToRelative(1.0f);
        a.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        a.horizontalLineToRelative(0.0f);
        a.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        bv.t(a, 13.0f, 11.3f, 2.26f);
        a.lineToRelative(-6.0f, 2.25f);
        a.curveTo(4.52f, 4.81f, 4.0f, 5.55f, 4.0f, 6.39f);
        a.verticalLineToRelative(4.7f);
        a.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        a.curveToRelative(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f);
        a.verticalLineToRelative(-4.7f);
        a.curveToRelative(0.0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f);
        a.lineToRelative(-6.0f, -2.25f);
        a.curveTo(12.25f, 2.09f, 11.75f, 2.09f, 11.3f, 2.26f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _healthAndSafety = build;
        build.getClass();
        return build;
    }
}
