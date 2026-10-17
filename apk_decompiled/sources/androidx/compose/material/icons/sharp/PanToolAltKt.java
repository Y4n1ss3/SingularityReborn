package androidx.compose.material.icons.sharp;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PanToolAltKt {
    private static ImageVector _panToolAlt;

    public static final ImageVector getPanToolAlt(Icons.Sharp sharp) {
        ImageVector imageVector = _panToolAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PanToolAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(20.18f, 13.4f, 19.1f, 21.0f, -9.0f);
        k.lineTo(5.0f, 15.62f);
        k.lineToRelative(1.22f, -1.23f);
        k.lineTo(10.0f, 15.24f);
        k.verticalLineTo(4.5f);
        k.curveTo(10.0f, 3.67f, 10.67f, 3.0f, 11.5f, 3.0f);
        k.reflectiveCurveTo(13.0f, 3.67f, 13.0f, 4.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.e(k, 6.0f, 1.38f, 20.18f, 13.4f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panToolAlt = build;
        build.getClass();
        return build;
    }
}
