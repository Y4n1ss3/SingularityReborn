package androidx.compose.material.icons.automirrored.outlined;

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
public final class TrendingUpKt {
    private static ImageVector _trendingUp;

    public static final ImageVector getTrendingUp(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _trendingUp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.TrendingUp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.0f, 6.0f, 2.29f, 2.29f);
        e.lineToRelative(-4.88f, 4.88f);
        e.lineToRelative(-4.0f, -4.0f);
        e.lineTo(2.0f, 16.59f);
        e.lineTo(3.41f, 18.0f);
        e.lineToRelative(6.0f, -6.0f);
        e.lineToRelative(4.0f, 4.0f);
        e.lineToRelative(6.3f, -6.29f);
        e.lineTo(22.0f, 12.0f);
        e.verticalLineTo(6.0f);
        e.horizontalLineToRelative(-6.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _trendingUp = build;
        build.getClass();
        return build;
    }
}
