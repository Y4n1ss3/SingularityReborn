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
import defpackage.gy;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UpdateKt {
    private static ImageVector _update;

    public static final ImageVector getUpdate(Icons.Sharp sharp) {
        ImageVector imageVector = _update;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Update", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(11.0f, 8.0f, 5.0f, 4.25f, 2.52f);
        n.lineToRelative(0.77f, -1.28f);
        kp0.k(n, -3.52f, -2.09f, 8.0f, 11.0f);
        n.moveTo(21.0f, 10.0f);
        n.verticalLineTo(3.0f);
        n.lineToRelative(-2.64f, 2.64f);
        n.curveTo(16.74f, 4.01f, 14.49f, 3.0f, 12.0f, 3.0f);
        n.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        n.reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f);
        n.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        n.horizontalLineToRelative(-2.0f);
        n.curveToRelative(0.0f, 3.86f, -3.14f, 7.0f, -7.0f, 7.0f);
        n.reflectiveCurveToRelative(-7.0f, -3.14f, -7.0f, -7.0f);
        n.reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f);
        n.curveToRelative(1.93f, 0.0f, 3.68f, 0.79f, 4.95f, 2.05f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(n, 14.0f, 10.0f, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _update = build;
        build.getClass();
        return build;
    }
}
