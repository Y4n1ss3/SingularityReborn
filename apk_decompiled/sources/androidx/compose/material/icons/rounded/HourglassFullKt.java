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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HourglassFullKt {
    private static ImageVector _hourglassFull;

    public static final ImageVector getHourglassFull(Icons.Rounded rounded) {
        ImageVector imageVector = _hourglassFull;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HourglassFull", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(6.0f, 4.0f, 3.17f);
        h.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.42f);
        h.lineTo(10.0f, 12.0f);
        h.lineToRelative(-3.42f, 3.42f);
        h.curveToRelative(-0.37f, 0.38f, -0.58f, 0.89f, -0.58f, 1.42f);
        h.verticalLineTo(20.0f);
        h.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        h.horizontalLineToRelative(8.0f);
        h.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.verticalLineToRelative(-3.16f);
        h.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.58f, -1.41f);
        h.lineTo(14.0f, 12.0f);
        h.lineToRelative(3.41f, -3.4f);
        h.curveToRelative(0.38f, -0.38f, 0.59f, -0.89f, 0.59f, -1.42f);
        h.verticalLineTo(4.0f);
        h.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        h.horizontalLineTo(8.0f);
        h.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hourglassFull = build;
        build.getClass();
        return build;
    }
}
