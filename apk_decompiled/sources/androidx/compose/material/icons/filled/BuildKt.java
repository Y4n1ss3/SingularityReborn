package androidx.compose.material.icons.filled;

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
public final class BuildKt {
    private static ImageVector _build;

    public static final ImageVector getBuild(Icons.Filled filled) {
        ImageVector imageVector = _build;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Build", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.7f, 19.0f, -9.1f, -9.1f);
        e.curveToRelative(0.9f, -2.3f, 0.4f, -5.0f, -1.5f, -6.9f);
        e.curveToRelative(-2.0f, -2.0f, -5.0f, -2.4f, -7.4f, -1.3f);
        e.lineTo(9.0f, 6.0f);
        e.lineTo(6.0f, 9.0f);
        e.lineTo(1.6f, 4.7f);
        e.curveTo(0.4f, 7.1f, 0.9f, 10.1f, 2.9f, 12.1f);
        e.curveToRelative(1.9f, 1.9f, 4.6f, 2.4f, 6.9f, 1.5f);
        e.lineToRelative(9.1f, 9.1f);
        e.curveToRelative(0.4f, 0.4f, 1.0f, 0.4f, 1.4f, 0.0f);
        e.lineToRelative(2.3f, -2.3f);
        e.curveToRelative(0.5f, -0.4f, 0.5f, -1.1f, 0.1f, -1.4f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _build = build;
        build.getClass();
        return build;
    }
}
