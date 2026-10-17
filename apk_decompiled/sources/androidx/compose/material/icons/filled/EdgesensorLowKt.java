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
import defpackage.c21;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EdgesensorLowKt {
    private static ImageVector _edgesensorLow;

    public static final ImageVector getEdgesensorLow(Icons.Filled filled) {
        ImageVector imageVector = _edgesensorLow;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.EdgesensorLow", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(2.0f, 7.0f, 2.0f, 7.0f, 2.0f);
        k4.D(d, 7.0f, 20.0f, 10.0f, 2.0f);
        k4.p(d, 7.0f, -2.0f, 10.0f);
        d.moveTo(16.0f, 2.01f);
        d.lineTo(8.0f, 2.0f);
        d.curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(8.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(4.0f);
        d.curveTo(18.0f, 2.9f, 17.1f, 2.01f, 16.0f, 2.01f);
        c21.d(d, 16.0f, 17.0f, 8.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 8.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _edgesensorLow = build;
        build.getClass();
        return build;
    }
}
