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
public final class SafetyDividerKt {
    private static ImageVector _safetyDivider;

    public static final ImageVector getSafetyDivider(Icons.Rounded rounded) {
        ImageVector imageVector = _safetyDivider;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SafetyDivider", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(11.0f, 5.0f, 2.0f, 14.0f, -2.0f);
        bv.t(n, 5.0f, 5.0f, 12.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        n.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        n.curveTo(3.0f, 11.1f, 3.9f, 12.0f, 5.0f, 12.0f);
        n.close();
        n.moveTo(7.78f, 13.58f);
        n.curveTo(6.93f, 13.21f, 5.99f, 13.0f, 5.0f, 13.0f);
        n.reflectiveCurveToRelative(-1.93f, 0.21f, -2.78f, 0.58f);
        n.curveTo(1.48f, 13.9f, 1.0f, 14.62f, 1.0f, 15.43f);
        n.lineTo(1.0f, 16.0f);
        n.horizontalLineToRelative(8.0f);
        n.lineToRelative(0.0f, -0.57f);
        n.curveTo(9.0f, 14.62f, 8.52f, 13.9f, 7.78f, 13.58f);
        n.close();
        n.moveTo(19.0f, 12.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        n.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        n.curveTo(17.0f, 11.1f, 17.9f, 12.0f, 19.0f, 12.0f);
        n.close();
        n.moveTo(21.78f, 13.58f);
        n.curveTo(20.93f, 13.21f, 19.99f, 13.0f, 19.0f, 13.0f);
        n.reflectiveCurveToRelative(-1.93f, 0.21f, -2.78f, 0.58f);
        n.curveTo(15.48f, 13.9f, 15.0f, 14.62f, 15.0f, 15.43f);
        n.lineTo(15.0f, 16.0f);
        n.horizontalLineToRelative(8.0f);
        n.lineToRelative(0.0f, -0.57f);
        n.curveTo(23.0f, 14.62f, 22.52f, 13.9f, 21.78f, 13.58f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _safetyDivider = build;
        build.getClass();
        return build;
    }
}
