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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ControlPointDuplicateKt {
    private static ImageVector _controlPointDuplicate;

    public static final ImageVector getControlPointDuplicate(Icons.Sharp sharp) {
        ImageVector imageVector = _controlPointDuplicate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ControlPointDuplicate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(16.0f, 8.0f, -2.0f, 3.0f, -3.0f);
        r6.D(n, 2.0f, 3.0f, 3.0f, 2.0f);
        r6.D(n, -3.0f, 3.0f, -2.0f, -3.0f);
        uo.l(n, 16.0f, 8.0f, 2.0f, 12.0f);
        n.curveToRelative(0.0f, -2.79f, 1.64f, -5.2f, 4.01f, -6.32f);
        n.lineTo(6.01f, 3.52f);
        n.curveTo(2.52f, 4.76f, 0.0f, 8.09f, 0.0f, 12.0f);
        n.reflectiveCurveToRelative(2.52f, 7.24f, 6.01f, 8.48f);
        n.verticalLineToRelative(-2.16f);
        n.curveTo(3.64f, 17.2f, 2.0f, 14.79f, 2.0f, 12.0f);
        n.close();
        n.moveTo(15.0f, 3.0f);
        n.curveToRelative(-4.96f, 0.0f, -9.0f, 4.04f, -9.0f, 9.0f);
        n.reflectiveCurveToRelative(4.04f, 9.0f, 9.0f, 9.0f);
        n.reflectiveCurveToRelative(9.0f, -4.04f, 9.0f, -9.0f);
        n.reflectiveCurveToRelative(-4.04f, -9.0f, -9.0f, -9.0f);
        n.close();
        n.moveTo(15.0f, 19.0f);
        n.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        n.reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f);
        n.reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(n, -3.14f, 7.0f, -7.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _controlPointDuplicate = build;
        build.getClass();
        return build;
    }
}
