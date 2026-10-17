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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoLuggageKt {
    private static ImageVector _noLuggage;

    public static final ImageVector getNoLuggage(Icons.Filled filled) {
        ImageVector imageVector = _noLuggage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoLuggage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(12.75f, 9.0f, 0.92f, 1.75f, 1.75f);
        r6.v(n, 9.0f, 16.0f, 4.17f);
        n.lineToRelative(3.0f, 3.0f);
        n.verticalLineTo(8.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        n.horizontalLineToRelative(-2.0f);
        n.verticalLineTo(3.0f);
        n.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        n.horizontalLineToRelative(-4.0f);
        n.curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f);
        fc.k(n, 3.0f, 8.83f, 3.0f, 3.0f);
        kp0.r(n, 12.75f, 10.5f, 3.5f, 3.0f);
        c21.c(n, 6.0f, -3.0f, 3.5f);
        n.moveTo(21.19f, 21.19f);
        n.lineTo(2.81f, 2.81f);
        n.lineTo(1.39f, 4.22f);
        n.lineToRelative(3.63f, 3.63f);
        n.curveTo(5.02f, 7.9f, 5.0f, 7.95f, 5.0f, 8.0f);
        n.verticalLineToRelative(11.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        n.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        n.horizontalLineToRelative(6.0f);
        n.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        n.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        n.curveToRelative(0.34f, 0.0f, 0.65f, -0.09f, 0.93f, -0.24f);
        gy.B(n, 1.85f, 1.85f, 21.19f, 21.19f);
        n.moveTo(8.0f, 18.0f);
        k4.z(n, -7.17f, 1.5f, 1.5f, 18.0f);
        kp0.r(n, 8.0f, 12.75f, 18.0f, -1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.n(n, -3.92f, 1.5f, 1.5f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noLuggage = build;
        build.getClass();
        return build;
    }
}
