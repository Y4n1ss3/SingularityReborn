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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwitchAccountKt {
    private static ImageVector _switchAccount;

    public static final ImageVector getSwitchAccount(Icons.Rounded rounded) {
        ImageVector imageVector = _switchAccount;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwitchAccount", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(17.0f, 20.0f, 4.0f, 7.0f);
        c.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        c.reflectiveCurveTo(2.0f, 6.45f, 2.0f, 7.0f);
        c.verticalLineToRelative(13.0f);
        c.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c.horizontalLineToRelative(13.0f);
        c.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        c.reflectiveCurveTo(17.55f, 20.0f, 17.0f, 20.0f);
        r6.g(c, 20.0f, 2.0f, 8.0f);
        c.curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f);
        c.verticalLineToRelative(12.0f);
        c.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c.horizontalLineToRelative(12.0f);
        c.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c.verticalLineTo(4.0f);
        c.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        c.close();
        c.moveTo(14.0f, 5.0f);
        c.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        c.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        c.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        c.curveTo(11.0f, 6.34f, 12.34f, 5.0f, 14.0f, 5.0f);
        c.close();
        c.moveTo(7.76f, 16.0f);
        c.curveToRelative(1.47f, -1.83f, 3.71f, -3.0f, 6.24f, -3.0f);
        c.reflectiveCurveToRelative(4.77f, 1.17f, 6.24f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(c, 7.76f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchAccount = build;
        build.getClass();
        return build;
    }
}
