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
import defpackage.c21;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MonitorKt {
    private static ImageVector _monitor;

    public static final ImageVector getMonitor(Icons.Rounded rounded) {
        ImageVector imageVector = _monitor;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Monitor", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 3.0f, 4.0f);
        d.curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        d.verticalLineToRelative(11.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(3.0f);
        d.curveToRelative(-0.55f, 0.55f, -1.0f, 0.87f, -1.0f, 1.59f);
        d.verticalLineToRelative(0.0f);
        d.curveTo(6.0f, 20.37f, 6.63f, 21.0f, 7.41f, 21.0f);
        d.horizontalLineToRelative(9.17f);
        d.curveToRelative(0.78f, 0.0f, 1.41f, -0.63f, 1.41f, -1.41f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.72f, -0.44f, -1.03f, -1.0f, -1.59f);
        d.horizontalLineToRelative(3.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f);
        c21.d(d, 20.0f, 16.0f, 4.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 16.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monitor = build;
        build.getClass();
        return build;
    }
}
