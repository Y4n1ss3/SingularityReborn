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
public final class FastForwardKt {
    private static ImageVector _fastForward;

    public static final ImageVector getFastForward(Icons.Rounded rounded) {
        ImageVector imageVector = _fastForward;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FastForward", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(5.58f, 16.89f, 5.77f, -4.07f);
        e.curveToRelative(0.56f, -0.4f, 0.56f, -1.24f, 0.0f, -1.63f);
        e.lineTo(5.58f, 7.11f);
        e.curveTo(4.91f, 6.65f, 4.0f, 7.12f, 4.0f, 7.93f);
        e.verticalLineToRelative(8.14f);
        e.curveToRelative(0.0f, 0.81f, 0.91f, 1.28f, 1.58f, 0.82f);
        bv.v(e, 13.0f, 7.93f, 8.14f);
        e.curveToRelative(0.0f, 0.81f, 0.91f, 1.28f, 1.58f, 0.82f);
        e.lineToRelative(5.77f, -4.07f);
        e.curveToRelative(0.56f, -0.4f, 0.56f, -1.24f, 0.0f, -1.63f);
        e.lineToRelative(-5.77f, -4.07f);
        e.curveToRelative(-0.67f, -0.47f, -1.58f, 0.0f, -1.58f, 0.81f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastForward = build;
        build.getClass();
        return build;
    }
}
