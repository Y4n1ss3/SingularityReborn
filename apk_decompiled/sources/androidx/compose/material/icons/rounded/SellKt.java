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
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SellKt {
    private static ImageVector _sell;

    public static final ImageVector getSell(Icons.Rounded rounded) {
        ImageVector imageVector = _sell;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Sell", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.41f, 11.41f, -8.83f, -8.83f);
        e.curveTo(12.21f, 2.21f, 11.7f, 2.0f, 11.17f, 2.0f);
        e.horizontalLineTo(4.0f);
        e.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        e.verticalLineToRelative(7.17f);
        e.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f);
        e.lineToRelative(8.83f, 8.83f);
        e.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        e.lineToRelative(7.17f, -7.17f);
        e.curveTo(22.2f, 13.46f, 22.2f, 12.2f, 21.41f, 11.41f);
        e.close();
        e.moveTo(6.5f, 8.0f);
        e.curveTo(5.67f, 8.0f, 5.0f, 7.33f, 5.0f, 6.5f);
        e.reflectiveCurveTo(5.67f, 5.0f, 6.5f, 5.0f);
        e.reflectiveCurveTo(8.0f, 5.67f, 8.0f, 6.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(e, 7.33f, 8.0f, 6.5f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sell = build;
        build.getClass();
        return build;
    }
}
