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
import defpackage.bv;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SmartDisplayKt {
    private static ImageVector _smartDisplay;

    public static final ImageVector getSmartDisplay(Icons.Rounded rounded) {
        ImageVector imageVector = _smartDisplay;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SmartDisplay", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 4.0f, 4.0f);
        d.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(6.0f);
        d.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        bv.g(d, 9.5f, 14.67f, 9.33f);
        d.curveToRelative(0.0f, -0.79f, 0.88f, -1.27f, 1.54f, -0.84f);
        d.lineToRelative(4.15f, 2.67f);
        d.curveToRelative(0.61f, 0.39f, 0.61f, 1.29f, 0.0f, 1.68f);
        d.lineToRelative(-4.15f, 2.67f);
        d.curveTo(10.38f, 15.94f, 9.5f, 15.46f, 9.5f, 14.67f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smartDisplay = build;
        build.getClass();
        return build;
    }
}
